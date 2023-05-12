package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.mapMod.FrameState
import typings.ol.transformMod.Transform
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import typings.std.WebGLBuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLShader
import typings.std.WebGLTexture
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglHelperMod {
  
  @JSImport("ol/webgl/Helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * This class is intended to provide low-level functions related to WebGL rendering, so that accessing
    * directly the WebGL API should not be required anymore.
    *
    * Several operations are handled by the `WebGLHelper` class:
    *
    * ### Define custom shaders and uniforms
    *
    *   *Shaders* are low-level programs executed on the GPU and written in GLSL. There are two types of shaders:
    *
    *   Vertex shaders are used to manipulate the position and attribute of *vertices* of rendered primitives (ie. corners of a square).
    *   Outputs are:
    *
    *   * `gl_Position`: position of the vertex in screen space
    *
    *   * Varyings usually prefixed with `v_` are passed on to the fragment shader
    *
    *   Fragment shaders are used to control the actual color of the pixels drawn on screen. Their only output is `gl_FragColor`.
    *
    *   Both shaders can take *uniforms* or *attributes* as input. Attributes are explained later. Uniforms are common, read-only values that
    *   can be changed at every frame and can be of type float, arrays of float or images.
    *
    *   Shaders must be compiled and assembled into a program like so:
    *   ```js
    *   // here we simply create two shaders and assemble them in a program which is then used
    *   // for subsequent rendering calls; note how a frameState is required to set up a program,
    *   // as several default uniforms are computed from it (projection matrix, zoom level, etc.)
    *   const vertexShader = new WebGLVertex(VERTEX_SHADER);
    *   const fragmentShader = new WebGLFragment(FRAGMENT_SHADER);
    *   const program = this.context.getProgram(fragmentShader, vertexShader);
    *   helper.useProgram(this.program, frameState);
    *   ```
    *
    *   Uniforms are defined using the `uniforms` option and can either be explicit values or callbacks taking the frame state as argument.
    *   You can also change their value along the way like so:
    *   ```js
    *   helper.setUniformFloatValue('u_value', valueAsNumber);
    *   ```
    *
    * ### Defining post processing passes
    *
    *   *Post processing* describes the act of rendering primitives to a texture, and then rendering this texture to the final canvas
    *   while applying special effects in screen space.
    *   Typical uses are: blurring, color manipulation, depth of field, filtering...
    *
    *   The `WebGLHelper` class offers the possibility to define post processes at creation time using the `postProcesses` option.
    *   A post process step accepts the following options:
    *
    *   * `fragmentShader` and `vertexShader`: text literals in GLSL language that will be compiled and used in the post processing step.
    *   * `uniforms`: uniforms can be defined for the post processing steps just like for the main render.
    *   * `scaleRatio`: allows using an intermediate texture smaller or higher than the final canvas in the post processing step.
    *     This is typically used in blur steps to reduce the performance overhead by using an already downsampled texture as input.
    *
    *   The {@link module:ol/webgl/PostProcessingPass~WebGLPostProcessingPass} class is used internally, refer to its documentation for more info.
    *
    * ### Binding WebGL buffers and flushing data into them
    *
    *   Data that must be passed to the GPU has to be transferred using {@link module:ol/webgl/Buffer~WebGLArrayBuffer} objects.
    *   A buffer has to be created only once, but must be bound every time the buffer content will be used for rendering.
    *   This is done using {@link bindBuffer}.
    *   When the buffer's array content has changed, the new data has to be flushed to the GPU memory; this is done using
    *   {@link flushBufferData}. Note: this operation is expensive and should be done as infrequently as possible.
    *
    *   When binding an array buffer, a `target` parameter must be given: it should be either {@link module:ol/webgl.ARRAY_BUFFER}
    *   (if the buffer contains vertices data) or {@link module:ol/webgl.ELEMENT_ARRAY_BUFFER} (if the buffer contains indices data).
    *
    *   Examples below:
    *   ```js
    *   // at initialization phase
    *   const verticesBuffer = new WebGLArrayBuffer([], DYNAMIC_DRAW);
    *   const indicesBuffer = new WebGLArrayBuffer([], DYNAMIC_DRAW);
    *
    *   // when array values have changed
    *   helper.flushBufferData(ARRAY_BUFFER, this.verticesBuffer);
    *   helper.flushBufferData(ELEMENT_ARRAY_BUFFER, this.indicesBuffer);
    *
    *   // at rendering phase
    *   helper.bindBuffer(ARRAY_BUFFER, this.verticesBuffer);
    *   helper.bindBuffer(ELEMENT_ARRAY_BUFFER, this.indicesBuffer);
    *   ```
    *
    * ### Specifying attributes
    *
    *   The GPU only receives the data as arrays of numbers. These numbers must be handled differently depending on what it describes (position, texture coordinate...).
    *   Attributes are used to specify these uses. Specify the attribute names with
    *   {@link module:ol/webgl/Helper~WebGLHelper#enableAttributes} (see code snippet below).
    *
    *   Please note that you will have to specify the type and offset of the attributes in the data array. You can refer to the documentation of [WebGLRenderingContext.vertexAttribPointer](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer) for more explanation.
    *   ```js
    *   // here we indicate that the data array has the following structure:
    *   // [posX, posY, offsetX, offsetY, texCoordU, texCoordV, posX, posY, ...]
    *   helper.enableAttributes([
    *     {
    *        name: 'a_position',
    *        size: 2
    *     },
    *     {
    *       name: 'a_offset',
    *       size: 2
    *     },
    *     {
    *       name: 'a_texCoord',
    *       size: 2
    *     }
    *   ])
    *   ```
    *
    * ### Rendering primitives
    *
    *   Once all the steps above have been achieved, rendering primitives to the screen is done using {@link prepareDraw}, {@link drawElements} and {@link finalizeDraw}.
    *   ```js
    *   // frame preparation step
    *   helper.prepareDraw(frameState);
    *
    *   // call this for every data array that has to be rendered on screen
    *   helper.drawElements(0, this.indicesBuffer.getArray().length);
    *
    *   // finalize the rendering by applying post processes
    *   helper.finalizeDraw(frameState);
    *   ```
    *
    * For an example usage of this class, refer to {@link module:ol/renderer/webgl/PointsLayer~WebGLPointsLayerRenderer}.
    */
  @JSImport("ol/webgl/Helper", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends WebGLHelper {
    def this(options: Options) = this()
  }
  
  object DefaultUniform {
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.OFFSET_ROTATION_MATRIX")
    @js.native
    val OFFSET_ROTATION_MATRIX: String = js.native
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.OFFSET_SCALE_MATRIX")
    @js.native
    val OFFSET_SCALE_MATRIX: String = js.native
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.PIXEL_RATIO")
    @js.native
    val PIXEL_RATIO: String = js.native
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.PROJECTION_MATRIX")
    @js.native
    val PROJECTION_MATRIX: String = js.native
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.RESOLUTION")
    @js.native
    val RESOLUTION: String = js.native
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.SIZE_PX")
    @js.native
    val SIZE_PX: String = js.native
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.TIME")
    @js.native
    val TIME: String = js.native
    
    @JSImport("ol/webgl/Helper", "DefaultUniform.ZOOM")
    @js.native
    val ZOOM: String = js.native
  }
  type DefaultUniform = String
  
  object ShaderType {
    
    @JSImport("ol/webgl/Helper", "ShaderType.FRAGMENT_SHADER")
    @js.native
    val FRAGMENT_SHADER: Double = js.native
    
    @JSImport("ol/webgl/Helper", "ShaderType.VERTEX_SHADER")
    @js.native
    val VERTEX_SHADER: Double = js.native
  }
  type ShaderType = Double
  
  inline def computeAttributesStride(attributes: js.Array[AttributeDescription]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAttributesStride")(attributes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait AttributeDescription extends StObject {
    
    /**
      * Attribute name to use in shaders
      */
    var name: String
    
    /**
      * Number of components per attributes
      */
    var size: Double
    
    /**
      * Attribute type, i.e. number of bytes used to store the value. This is
      * determined by the class of typed array which the buffer uses (eg. `Float32Array` for a `FLOAT` attribute).
      * Default is `FLOAT`.
      */
    var `type`: js.UndefOr[Double] = js.undefined
  }
  object AttributeDescription {
    
    inline def apply(name: String, size: Double): AttributeDescription = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeDescription] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type AttributeType = Double
  
  trait BufferCacheEntry extends StObject {
    
    /**
      * Buffer.
      */
    var buffer: typings.ol.webglBufferMod.default
    
    /**
      * WebGlBuffer.
      */
    var webGlBuffer: WebGLBuffer
  }
  object BufferCacheEntry {
    
    inline def apply(buffer: typings.ol.webglBufferMod.default, webGlBuffer: WebGLBuffer): BufferCacheEntry = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], webGlBuffer = webGlBuffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferCacheEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferCacheEntry] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: typings.ol.webglBufferMod.default): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setWebGlBuffer(value: WebGLBuffer): Self = StObject.set(x, "webGlBuffer", value.asInstanceOf[js.Any])
    }
  }
  
  trait CanvasCacheItem extends StObject {
    
    /**
      * Canvas element.
      */
    var canvas: HTMLCanvasElement
    
    /**
      * The count of users of this canvas.
      */
    var users: Double
  }
  object CanvasCacheItem {
    
    inline def apply(canvas: HTMLCanvasElement, users: Double): CanvasCacheItem = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasCacheItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanvasCacheItem] (val x: Self) extends AnyVal {
      
      inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: Double): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * The cache key for the canvas.
      */
    var canvasCacheKey: js.UndefOr[String] = js.undefined
    
    /**
      * Post-processes definitions
      */
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
    /**
      * Uniform definitions; property names must match the uniform
      * names in the provided or default shaders.
      */
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCanvasCacheKey(value: String): Self = StObject.set(x, "canvasCacheKey", value.asInstanceOf[js.Any])
      
      inline def setCanvasCacheKeyUndefined: Self = StObject.set(x, "canvasCacheKey", js.undefined)
      
      inline def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      inline def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      inline def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
  
  trait PostProcessesOptions extends StObject {
    
    /**
      * Fragment shader source
      */
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    /**
      * Scale ratio; if < 1, the post process will render to a texture smaller than
      * the main canvas which will then be sampled up (useful for saving resource on blur steps).
      */
    var scaleRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Uniform definitions for the post process step
      */
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
    /**
      * Vertex shader source
      */
    var vertexShader: js.UndefOr[String] = js.undefined
  }
  object PostProcessesOptions {
    
    inline def apply(): PostProcessesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostProcessesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostProcessesOptions] (val x: Self) extends AnyVal {
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      inline def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      inline def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
    }
  }
  
  trait UniformInternalDescription extends StObject {
    
    /**
      * Name
      */
    var name: String
    
    /**
      * The previous value.
      */
    var prevValue: js.UndefOr[UniformValue] = js.undefined
    
    /**
      * Texture
      */
    var texture: js.UndefOr[WebGLTexture] = js.undefined
    
    /**
      * Value
      */
    var value: js.UndefOr[UniformValue] = js.undefined
  }
  object UniformInternalDescription {
    
    inline def apply(name: String): UniformInternalDescription = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UniformInternalDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UniformInternalDescription] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrevValue(value: UniformValue): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
      
      inline def setPrevValueFunction1(value: /* arg0 */ FrameState => UniformLiteralValue): Self = StObject.set(x, "prevValue", js.Any.fromFunction1(value))
      
      inline def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
      
      inline def setPrevValueVarargs(value: Double*): Self = StObject.set(x, "prevValue", js.Array(value*))
      
      inline def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
      
      inline def setValue(value: UniformValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction1(value: /* arg0 */ FrameState => UniformLiteralValue): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type UniformLiteralValue = Double | js.Array[Double] | HTMLCanvasElement | HTMLImageElement | ImageData | Transform
  
  type UniformValue = UniformLiteralValue | (js.Function1[/* arg0 */ FrameState, UniformLiteralValue])
  
  /**
    * @classdesc
    * This class is intended to provide low-level functions related to WebGL rendering, so that accessing
    * directly the WebGL API should not be required anymore.
    *
    * Several operations are handled by the `WebGLHelper` class:
    *
    * ### Define custom shaders and uniforms
    *
    *   *Shaders* are low-level programs executed on the GPU and written in GLSL. There are two types of shaders:
    *
    *   Vertex shaders are used to manipulate the position and attribute of *vertices* of rendered primitives (ie. corners of a square).
    *   Outputs are:
    *
    *   * `gl_Position`: position of the vertex in screen space
    *
    *   * Varyings usually prefixed with `v_` are passed on to the fragment shader
    *
    *   Fragment shaders are used to control the actual color of the pixels drawn on screen. Their only output is `gl_FragColor`.
    *
    *   Both shaders can take *uniforms* or *attributes* as input. Attributes are explained later. Uniforms are common, read-only values that
    *   can be changed at every frame and can be of type float, arrays of float or images.
    *
    *   Shaders must be compiled and assembled into a program like so:
    *   ```js
    *   // here we simply create two shaders and assemble them in a program which is then used
    *   // for subsequent rendering calls; note how a frameState is required to set up a program,
    *   // as several default uniforms are computed from it (projection matrix, zoom level, etc.)
    *   const vertexShader = new WebGLVertex(VERTEX_SHADER);
    *   const fragmentShader = new WebGLFragment(FRAGMENT_SHADER);
    *   const program = this.context.getProgram(fragmentShader, vertexShader);
    *   helper.useProgram(this.program, frameState);
    *   ```
    *
    *   Uniforms are defined using the `uniforms` option and can either be explicit values or callbacks taking the frame state as argument.
    *   You can also change their value along the way like so:
    *   ```js
    *   helper.setUniformFloatValue('u_value', valueAsNumber);
    *   ```
    *
    * ### Defining post processing passes
    *
    *   *Post processing* describes the act of rendering primitives to a texture, and then rendering this texture to the final canvas
    *   while applying special effects in screen space.
    *   Typical uses are: blurring, color manipulation, depth of field, filtering...
    *
    *   The `WebGLHelper` class offers the possibility to define post processes at creation time using the `postProcesses` option.
    *   A post process step accepts the following options:
    *
    *   * `fragmentShader` and `vertexShader`: text literals in GLSL language that will be compiled and used in the post processing step.
    *   * `uniforms`: uniforms can be defined for the post processing steps just like for the main render.
    *   * `scaleRatio`: allows using an intermediate texture smaller or higher than the final canvas in the post processing step.
    *     This is typically used in blur steps to reduce the performance overhead by using an already downsampled texture as input.
    *
    *   The {@link module:ol/webgl/PostProcessingPass~WebGLPostProcessingPass} class is used internally, refer to its documentation for more info.
    *
    * ### Binding WebGL buffers and flushing data into them
    *
    *   Data that must be passed to the GPU has to be transferred using {@link module:ol/webgl/Buffer~WebGLArrayBuffer} objects.
    *   A buffer has to be created only once, but must be bound every time the buffer content will be used for rendering.
    *   This is done using {@link bindBuffer}.
    *   When the buffer's array content has changed, the new data has to be flushed to the GPU memory; this is done using
    *   {@link flushBufferData}. Note: this operation is expensive and should be done as infrequently as possible.
    *
    *   When binding an array buffer, a `target` parameter must be given: it should be either {@link module:ol/webgl.ARRAY_BUFFER}
    *   (if the buffer contains vertices data) or {@link module:ol/webgl.ELEMENT_ARRAY_BUFFER} (if the buffer contains indices data).
    *
    *   Examples below:
    *   ```js
    *   // at initialization phase
    *   const verticesBuffer = new WebGLArrayBuffer([], DYNAMIC_DRAW);
    *   const indicesBuffer = new WebGLArrayBuffer([], DYNAMIC_DRAW);
    *
    *   // when array values have changed
    *   helper.flushBufferData(ARRAY_BUFFER, this.verticesBuffer);
    *   helper.flushBufferData(ELEMENT_ARRAY_BUFFER, this.indicesBuffer);
    *
    *   // at rendering phase
    *   helper.bindBuffer(ARRAY_BUFFER, this.verticesBuffer);
    *   helper.bindBuffer(ELEMENT_ARRAY_BUFFER, this.indicesBuffer);
    *   ```
    *
    * ### Specifying attributes
    *
    *   The GPU only receives the data as arrays of numbers. These numbers must be handled differently depending on what it describes (position, texture coordinate...).
    *   Attributes are used to specify these uses. Specify the attribute names with
    *   {@link module:ol/webgl/Helper~WebGLHelper#enableAttributes} (see code snippet below).
    *
    *   Please note that you will have to specify the type and offset of the attributes in the data array. You can refer to the documentation of [WebGLRenderingContext.vertexAttribPointer](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer) for more explanation.
    *   ```js
    *   // here we indicate that the data array has the following structure:
    *   // [posX, posY, offsetX, offsetY, texCoordU, texCoordV, posX, posY, ...]
    *   helper.enableAttributes([
    *     {
    *        name: 'a_position',
    *        size: 2
    *     },
    *     {
    *       name: 'a_offset',
    *       size: 2
    *     },
    *     {
    *       name: 'a_texCoord',
    *       size: 2
    *     }
    *   ])
    *   ```
    *
    * ### Rendering primitives
    *
    *   Once all the steps above have been achieved, rendering primitives to the screen is done using {@link prepareDraw}, {@link drawElements} and {@link finalizeDraw}.
    *   ```js
    *   // frame preparation step
    *   helper.prepareDraw(frameState);
    *
    *   // call this for every data array that has to be rendered on screen
    *   helper.drawElements(0, this.indicesBuffer.getArray().length);
    *
    *   // finalize the rendering by applying post processes
    *   helper.finalizeDraw(frameState);
    *   ```
    *
    * For an example usage of this class, refer to {@link module:ol/renderer/webgl/PointsLayer~WebGLPointsLayerRenderer}.
    */
  @js.native
  trait WebGLHelper
    extends typings.ol.disposableMod.default {
    
    /**
      * Sets the default matrix uniforms for a given frame state. This is called internally in `prepareDraw`.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      */
    def applyFrameState(frameState: FrameState): Unit = js.native
    
    /**
      * Sets the custom uniforms based on what was given in the constructor. This is called internally in `prepareDraw`.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      */
    def applyUniforms(frameState: FrameState): Unit = js.native
    
    /**
      * @private
      * @type {Object<string, number>}
      */
    /* private */ var attribLocations_ : Any = js.native
    
    /**
      * Just bind the buffer if it's in the cache. Otherwise create
      * the WebGL buffer, bind it, populate it, and add an entry to
      * the cache.
      * @param {import("./Buffer").default} buffer Buffer.
      */
    def bindBuffer(buffer: typings.ol.webglBufferMod.default): Unit = js.native
    
    /** @private */
    /* private */ var boundHandleWebGLContextLost_ : Any = js.native
    
    /** @private */
    /* private */ var boundHandleWebGLContextRestored_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<string, BufferCacheEntry>}
      */
    /* private */ var bufferCache_ : Any = js.native
    
    /**
      * @param {string} canvasCacheKey The canvas cache key.
      * @return {boolean} The provided key matches the one this helper was constructed with.
      */
    def canvasCacheKeyMatches(canvasCacheKey: String): Boolean = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var canvasCacheKey_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement}
      */
    /* private */ var canvas_ : Any = js.native
    
    /**
      * Will attempt to compile a vertex or fragment shader based on source
      * On error, the shader will be returned but
      * `gl.getShaderParameter(shader, gl.COMPILE_STATUS)` will return `true`
      * Use `gl.getShaderInfoLog(shader)` to have details
      * @param {string} source Shader source
      * @param {ShaderType} type VERTEX_SHADER or FRAGMENT_SHADER
      * @return {WebGLShader} Shader object
      */
    def compileShader(source: String, `type`: ShaderType): WebGLShader = js.native
    
    /**
      * Will create or reuse a given webgl texture and apply the given size. If no image data
      * specified, the texture will be empty, otherwise image data will be used and the `size`
      * parameter will be ignored.
      * Note: wrap parameters are set to clamp to edge, min filter is set to linear.
      * @param {Array<number>} size Expected size of the texture
      * @param {ImageData|HTMLImageElement|HTMLCanvasElement} [data] Image data/object to bind to the texture
      * @param {WebGLTexture} [texture] Existing texture to reuse
      * @return {WebGLTexture} The generated texture
      */
    def createTexture(size: js.Array[Double]): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], data: Unit, texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], data: HTMLCanvasElement): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], data: HTMLCanvasElement, texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], data: HTMLImageElement): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], data: HTMLImageElement, texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], data: ImageData): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], data: ImageData, texture: WebGLTexture): WebGLTexture = js.native
    
    /**
      * @private
      * @type {WebGLProgram}
      */
    /* private */ var currentProgram_ : Any = js.native
    
    /**
      * @param {import("./Buffer.js").default} buf Buffer.
      */
    def deleteBuffer(buf: typings.ol.webglBufferMod.default): Unit = js.native
    
    /**
      * Execute a draw call based on the currently bound program, texture, buffers, attributes.
      * @param {number} start Start index.
      * @param {number} end End index.
      */
    def drawElements(start: Double, end: Double): Unit = js.native
    
    /**
      * Will set the currently bound buffer to an attribute of the shader program. Used by `#enableAttributes`
      * internally.
      * @param {string} attribName Attribute name
      * @param {number} size Number of components per attributes
      * @param {number} type UNSIGNED_INT, UNSIGNED_BYTE, UNSIGNED_SHORT or FLOAT
      * @param {number} stride Stride in bytes (0 means attribs are packed)
      * @param {number} offset Offset in bytes
      * @private
      */
    /* private */ var enableAttributeArray_ : Any = js.native
    
    /**
      * Will enable the following attributes to be read from the currently bound buffer,
      * i.e. tell the GPU where to read the different attributes in the buffer. An error in the
      * size/type/order of attributes will most likely break the rendering and throw a WebGL exception.
      * @param {Array<AttributeDescription>} attributes Ordered list of attributes to read from the buffer
      */
    def enableAttributes(attributes: js.Array[AttributeDescription]): Unit = js.native
    
    /**
      * @private
      * @type {Object<string, Object>}
      */
    /* private */ var extensionCache_ : Any = js.native
    
    /**
      * Apply the successive post process passes which will eventually render to the actual canvas.
      * @param {import("../Map.js").FrameState} frameState current frame state
      * @param {function(WebGLRenderingContext, import("../Map.js").FrameState):void} [preCompose] Called before composing.
      * @param {function(WebGLRenderingContext, import("../Map.js").FrameState):void} [postCompose] Called before composing.
      */
    def finalizeDraw(frameState: FrameState): Unit = js.native
    def finalizeDraw(
      frameState: FrameState,
      preCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    def finalizeDraw(
      frameState: FrameState,
      preCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit],
      postCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    def finalizeDraw(
      frameState: FrameState,
      preCompose: Unit,
      postCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    
    /**
      * Update the data contained in the buffer array; this is required for the
      * new data to be rendered
      * @param {import("./Buffer").default} buffer Buffer.
      */
    def flushBufferData(buffer: typings.ol.webglBufferMod.default): Unit = js.native
    
    /**
      * Will get the location from the shader or the cache
      * @param {string} name Attribute name
      * @return {number} attribLocation
      */
    def getAttributeLocation(name: String): Double = js.native
    
    /**
      * @return {HTMLCanvasElement} Canvas.
      */
    def getCanvas(): HTMLCanvasElement = js.native
    
    /**
      * Get a WebGL extension.  If the extension is not supported, null is returned.
      * Extensions are cached after they are enabled for the first time.
      * @param {string} name The extension name.
      * @return {Object|null} The extension or null if not supported.
      */
    def getExtension(name: String): Any | Null = js.native
    
    /**
      * Get the WebGL rendering context
      * @return {WebGLRenderingContext} The rendering context.
      */
    def getGL(): WebGLRenderingContext = js.native
    
    /**
      * Create a program for a vertex and fragment shader.  Throws if shader compilation fails.
      * @param {string} fragmentShaderSource Fragment shader source.
      * @param {string} vertexShaderSource Vertex shader source.
      * @return {WebGLProgram} Program
      */
    def getProgram(fragmentShaderSource: String, vertexShaderSource: String): WebGLProgram = js.native
    
    /**
      * Will get the location from the shader or the cache
      * @param {string} name Uniform name
      * @return {WebGLUniformLocation} uniformLocation
      */
    def getUniformLocation(name: String): WebGLUniformLocation = js.native
    
    /**
      * @private
      * @type {WebGLRenderingContext}
      */
    /* private */ var gl_ : Any = js.native
    
    /**
      * WebGL context was lost
      * @private
      */
    /* private */ var handleWebGLContextLost: Any = js.native
    
    /**
      * WebGL context was restored
      * @private
      */
    /* private */ var handleWebGLContextRestored: Any = js.native
    
    /**
      * Modifies the given transform to apply the rotation/translation/scaling of the given frame state.
      * The resulting transform can be used to convert world space coordinates to view coordinates.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      * @param {import("../transform").Transform} transform Transform to update.
      * @return {import("../transform").Transform} The updated transform object.
      */
    def makeProjectionTransform(frameState: FrameState, transform: Transform): Transform = js.native
    
    /**
      * @private
      * @type {import("../transform.js").Transform}
      */
    /* private */ var offsetRotateMatrix_ : Any = js.native
    
    /**
      * @private
      * @type {import("../transform.js").Transform}
      */
    /* private */ var offsetScaleMatrix_ : Any = js.native
    
    /**
      * An array of PostProcessingPass objects is kept in this variable, built from the steps provided in the
      * options. If no post process was given, a default one is used (so as not to have to make an exception to
      * the frame buffer logic).
      * @type {Array<WebGLPostProcessingPass>}
      * @private
      */
    /* private */ var postProcessPasses_ : Any = js.native
    
    /**
      * Clear the buffer & set the viewport to draw.
      * Post process passes will be initialized here, the first one being bound as a render target for
      * subsequent draw calls.
      * @param {import("../Map.js").FrameState} frameState current frame state
      * @param {boolean} [disableAlphaBlend] If true, no alpha blending will happen.
      */
    def prepareDraw(frameState: FrameState): Unit = js.native
    def prepareDraw(frameState: FrameState, disableAlphaBlend: Boolean): Unit = js.native
    
    /**
      * Clear the render target & bind it for future draw operations.
      * This is similar to `prepareDraw`, only post processes will not be applied.
      * Note: the whole viewport will be drawn to the render target, regardless of its size.
      * @param {import("../Map.js").FrameState} frameState current frame state
      * @param {import("./RenderTarget.js").default} renderTarget Render target to draw to
      * @param {boolean} [disableAlphaBlend] If true, no alpha blending will happen.
      */
    def prepareDrawToRenderTarget(frameState: FrameState, renderTarget: typings.ol.webglRenderTargetMod.default): Unit = js.native
    def prepareDrawToRenderTarget(
      frameState: FrameState,
      renderTarget: typings.ol.webglRenderTargetMod.default,
      disableAlphaBlend: Boolean
    ): Unit = js.native
    
    /**
      * Give a value for a standard float uniform
      * @param {string} uniform Uniform name
      * @param {number} value Value
      */
    def setUniformFloatValue(uniform: String, value: Double): Unit = js.native
    
    /**
      * Give a value for a vec2 uniform
      * @param {string} uniform Uniform name
      * @param {Array<number>} value Array of length 4.
      */
    def setUniformFloatVec2(uniform: String, value: js.Array[Double]): Unit = js.native
    
    /**
      * Give a value for a vec4 uniform
      * @param {string} uniform Uniform name
      * @param {Array<number>} value Array of length 4.
      */
    def setUniformFloatVec4(uniform: String, value: js.Array[Double]): Unit = js.native
    
    /**
      * Give a value for a standard matrix4 uniform
      * @param {string} uniform Uniform name
      * @param {Array<number>} value Matrix value
      */
    def setUniformMatrixValue(uniform: String, value: js.Array[Double]): Unit = js.native
    
    /**
      * @param {Object<string, UniformValue>} uniforms Uniform definitions.
      */
    def setUniforms(uniforms: StringDictionary[UniformValue]): Unit = js.native
    
    /**
      * @type {string|null}
      * @private
      */
    /* private */ var shaderCompileErrors_ : Any = js.native
    
    /**
      * @type {number}
      * @private
      */
    /* private */ var startTime_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var tmpMat4_ : Any = js.native
    
    /**
      * @private
      * @type {Object<string, WebGLUniformLocation>}
      */
    /* private */ var uniformLocations_ : Any = js.native
    
    /**
      * Holds info about custom uniforms used in the post processing pass.
      * If the uniform is a texture, the WebGL Texture object will be stored here.
      * @type {Array<UniformInternalDescription>}
      * @private
      */
    /* private */ var uniforms_ : Any = js.native
    
    /**
      * Set up a program for use. The program will be set as the current one. Then, the uniforms used
      * in the program will be set based on the current frame state and the helper configuration.
      * @param {WebGLProgram} program Program.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      */
    def useProgram(program: WebGLProgram, frameState: FrameState): Unit = js.native
  }
}
