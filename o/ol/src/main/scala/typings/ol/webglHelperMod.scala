package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.pluggableMapMod.FrameState
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
  
  @JSImport("ol/webgl/Helper", JSImport.Default)
  @js.native
  open class default () extends WebGLHelper {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  sealed trait AttributeType extends StObject
  @JSImport("ol/webgl/Helper", "AttributeType")
  @js.native
  object AttributeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AttributeType & Double] = js.native
    
    @js.native
    sealed trait FLOAT
      extends StObject
         with AttributeType
    /* 5126 */ val FLOAT: typings.ol.webglHelperMod.AttributeType.FLOAT & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_BYTE
      extends StObject
         with AttributeType
    /* 5121 */ val UNSIGNED_BYTE: typings.ol.webglHelperMod.AttributeType.UNSIGNED_BYTE & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_INT
      extends StObject
         with AttributeType
    /* 5125 */ val UNSIGNED_INT: typings.ol.webglHelperMod.AttributeType.UNSIGNED_INT & Double = js.native
    
    @js.native
    sealed trait UNSIGNED_SHORT
      extends StObject
         with AttributeType
    /* 5123 */ val UNSIGNED_SHORT: typings.ol.webglHelperMod.AttributeType.UNSIGNED_SHORT & Double = js.native
  }
  
  @js.native
  sealed trait DefaultUniform extends StObject
  @JSImport("ol/webgl/Helper", "DefaultUniform")
  @js.native
  object DefaultUniform extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DefaultUniform & String] = js.native
    
    @js.native
    sealed trait OFFSET_ROTATION_MATRIX
      extends StObject
         with DefaultUniform
    /* "u_offsetRotateMatrix" */ val OFFSET_ROTATION_MATRIX: typings.ol.webglHelperMod.DefaultUniform.OFFSET_ROTATION_MATRIX & String = js.native
    
    @js.native
    sealed trait OFFSET_SCALE_MATRIX
      extends StObject
         with DefaultUniform
    /* "u_offsetScaleMatrix" */ val OFFSET_SCALE_MATRIX: typings.ol.webglHelperMod.DefaultUniform.OFFSET_SCALE_MATRIX & String = js.native
    
    @js.native
    sealed trait PROJECTION_MATRIX
      extends StObject
         with DefaultUniform
    /* "u_projectionMatrix" */ val PROJECTION_MATRIX: typings.ol.webglHelperMod.DefaultUniform.PROJECTION_MATRIX & String = js.native
    
    @js.native
    sealed trait RESOLUTION
      extends StObject
         with DefaultUniform
    /* "u_resolution" */ val RESOLUTION: typings.ol.webglHelperMod.DefaultUniform.RESOLUTION & String = js.native
    
    @js.native
    sealed trait TIME
      extends StObject
         with DefaultUniform
    /* "u_time" */ val TIME: typings.ol.webglHelperMod.DefaultUniform.TIME & String = js.native
    
    @js.native
    sealed trait ZOOM
      extends StObject
         with DefaultUniform
    /* "u_zoom" */ val ZOOM: typings.ol.webglHelperMod.DefaultUniform.ZOOM & String = js.native
  }
  
  @js.native
  sealed trait ShaderType extends StObject
  @JSImport("ol/webgl/Helper", "ShaderType")
  @js.native
  object ShaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ShaderType & Double] = js.native
    
    @js.native
    sealed trait FRAGMENT_SHADER
      extends StObject
         with ShaderType
    /* 35632 */ val FRAGMENT_SHADER: typings.ol.webglHelperMod.ShaderType.FRAGMENT_SHADER & Double = js.native
    
    @js.native
    sealed trait VERTEX_SHADER
      extends StObject
         with ShaderType
    /* 35633 */ val VERTEX_SHADER: typings.ol.webglHelperMod.ShaderType.VERTEX_SHADER & Double = js.native
  }
  
  inline def computeAttributesStride(attributes: js.Array[AttributeDescription]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAttributesStride")(attributes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait AttributeDescription extends StObject {
    
    var name: String
    
    var size: Double
    
    var `type`: js.UndefOr[AttributeType] = js.undefined
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
      
      inline def setType(value: AttributeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BufferCacheEntry extends StObject {
    
    var buffer: typings.ol.webglBufferMod.default
    
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
  
  trait Options extends StObject {
    
    var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = StObject.set(x, "postProcesses", value.asInstanceOf[js.Any])
      
      inline def setPostProcessesUndefined: Self = StObject.set(x, "postProcesses", js.undefined)
      
      inline def setPostProcessesVarargs(value: PostProcessesOptions*): Self = StObject.set(x, "postProcesses", js.Array(value*))
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
  
  trait PostProcessesOptions extends StObject {
    
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    var scaleRatio: js.UndefOr[Double] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
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
  
  type UniformLiteralValue = Double | js.Array[Double] | HTMLCanvasElement | HTMLImageElement | ImageData | Transform
  
  type UniformValue = UniformLiteralValue | (js.Function1[/* p0 */ FrameState, UniformLiteralValue])
  
  @js.native
  trait WebGLHelper
    extends typings.ol.disposableMod.default {
    
    /**
      * Just bind the buffer if it's in the cache. Otherwise create
      * the WebGL buffer, bind it, populate it, and add an entry to
      * the cache.
      */
    def bindBuffer(buffer: typings.ol.webglBufferMod.default): Unit = js.native
    
    /**
      * Will attempt to compile a vertex or fragment shader based on source
      * On error, the shader will be returned but
      * gl.getShaderParameter(shader, gl.COMPILE_STATUS) will return true
      * Use gl.getShaderInfoLog(shader) to have details
      */
    def compileShader(source: String, `type`: ShaderType): WebGLShader = js.native
    
    /**
      * Will create or reuse a given webgl texture and apply the given size. If no image data
      * specified, the texture will be empty, otherwise image data will be used and the size
      * parameter will be ignored.
      * Note: wrap parameters are set to clamp to edge, min filter is set to linear.
      */
    def createTexture(size: js.Array[Double]): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: Unit, opt_texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLCanvasElement, opt_texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLImageElement): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: HTMLImageElement, opt_texture: WebGLTexture): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: ImageData): WebGLTexture = js.native
    def createTexture(size: js.Array[Double], opt_data: ImageData, opt_texture: WebGLTexture): WebGLTexture = js.native
    
    def deleteBuffer(buf: typings.ol.webglBufferMod.default): Unit = js.native
    
    /**
      * Execute a draw call based on the currently bound program, texture, buffers, attributes.
      */
    def drawElements(start: Double, end: Double): Unit = js.native
    
    /**
      * Will enable the following attributes to be read from the currently bound buffer,
      * i.e. tell the GPU where to read the different attributes in the buffer. An error in the
      * size/type/order of attributes will most likely break the rendering and throw a WebGL exception.
      */
    def enableAttributes(attributes: js.Array[AttributeDescription]): Unit = js.native
    
    /**
      * Apply the successive post process passes which will eventually render to the actual canvas.
      */
    def finalizeDraw(frameState: FrameState): Unit = js.native
    
    /**
      * Update the data contained in the buffer array; this is required for the
      * new data to be rendered
      */
    def flushBufferData(buffer: typings.ol.webglBufferMod.default): Unit = js.native
    
    /**
      * Will get the location from the shader or the cache
      */
    def getAttributeLocation(name: String): Double = js.native
    
    def getCanvas(): HTMLCanvasElement = js.native
    
    /**
      * Get the WebGL rendering context
      */
    def getGL(): WebGLRenderingContext = js.native
    
    /**
      * Create a program for a vertex and fragment shader. The shaders compilation may have failed:
      * use WebGLHelper.getShaderCompileErrors()to have details if any.
      */
    def getProgram(fragmentShaderSource: String, vertexShaderSource: String): WebGLProgram = js.native
    
    /**
      * Will return the last shader compilation errors. If no error happened, will return null;
      */
    def getShaderCompileErrors(): String | Null = js.native
    
    /**
      * Will get the location from the shader or the cache
      */
    def getUniformLocation(name: String): WebGLUniformLocation = js.native
    
    /**
      * Modifies the given transform to apply the rotation/translation/scaling of the given frame state.
      * The resulting transform can be used to convert world space coordinates to view coordinates.
      */
    def makeProjectionTransform(frameState: FrameState, transform: Transform): Transform = js.native
    
    /**
      * Clear the buffer & set the viewport to draw.
      * Post process passes will be initialized here, the first one being bound as a render target for
      * subsequent draw calls.
      */
    def prepareDraw(frameState: FrameState): Unit = js.native
    
    /**
      * Clear the render target & bind it for future draw operations.
      * This is similar to prepareDraw, only post processes will not be applied.
      * Note: the whole viewport will be drawn to the render target, regardless of its size.
      */
    def prepareDrawToRenderTarget(frameState: FrameState, renderTarget: typings.ol.webglRenderTargetMod.default): Unit = js.native
    def prepareDrawToRenderTarget(
      frameState: FrameState,
      renderTarget: typings.ol.webglRenderTargetMod.default,
      opt_disableAlphaBlend: Boolean
    ): Unit = js.native
    
    /**
      * Give a value for a standard float uniform
      */
    def setUniformFloatValue(uniform: String, value: Double): Unit = js.native
    
    /**
      * Give a value for a standard matrix4 uniform
      */
    def setUniformMatrixValue(uniform: String, value: js.Array[Double]): Unit = js.native
    
    /**
      * Use a program.  If the program is already in use, this will return false.
      */
    def useProgram(program: WebGLProgram): Boolean = js.native
  }
}
