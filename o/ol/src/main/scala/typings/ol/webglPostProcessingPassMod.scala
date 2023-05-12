package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.mapMod.FrameState
import typings.ol.webglHelperMod.UniformLiteralValue
import typings.ol.webglHelperMod.UniformValue
import typings.std.WebGLBuffer
import typings.std.WebGLFramebuffer
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglPostProcessingPassMod {
  
  /**
    * @typedef {Object} Options
    * @property {WebGLRenderingContext} webGlContext WebGL context; mandatory.
    * @property {number} [scaleRatio] Scale ratio; if < 1, the post process will render to a texture smaller than
    * the main canvas that will then be sampled up (useful for saving resource on blur steps).
    * @property {string} [vertexShader] Vertex shader source
    * @property {string} [fragmentShader] Fragment shader source
    * @property {Object<string,import("./Helper").UniformValue>} [uniforms] Uniform definitions for the post process step
    */
  /**
    * @typedef {Object} UniformInternalDescription
    * @property {import("./Helper").UniformValue} value Value
    * @property {WebGLUniformLocation} location Location
    * @property {WebGLTexture} [texture] Texture
    * @private
    */
  /**
    * @classdesc
    * This class is used to define Post Processing passes with custom shaders and uniforms.
    * This is used internally by {@link module:ol/webgl/Helper~WebGLHelper}.
    *
    * Please note that the final output on the DOM canvas is expected to have premultiplied alpha, which means that
    * a pixel which is 100% red with an opacity of 50% must have a color of (r=0.5, g=0, b=0, a=0.5).
    * Failing to provide pixel colors with premultiplied alpha will result in render anomalies.
    *
    * The default post-processing pass does *not* multiply color values with alpha value, it expects color values to be
    * premultiplied.
    *
    * Default shaders are shown hereafter:
    *
    * * Vertex shader:
    *
    *   ```
    *   precision mediump float;
    *
    *   attribute vec2 a_position;
    *   varying vec2 v_texCoord;
    *   varying vec2 v_screenCoord;
    *
    *   uniform vec2 u_screenSize;
    *
    *   void main() {
    *     v_texCoord = a_position * 0.5 + 0.5;
    *     v_screenCoord = v_texCoord * u_screenSize;
    *     gl_Position = vec4(a_position, 0.0, 1.0);
    *   }
    *   ```
    *
    * * Fragment shader:
    *
    *   ```
    *   precision mediump float;
    *
    *   uniform sampler2D u_image;
    *   uniform float u_opacity;
    *
    *   varying vec2 v_texCoord;
    *
    *   void main() {
    *     gl_FragColor = texture2D(u_image, v_texCoord) * u_opacity;
    *   }
    *   ```
    *
    * @api
    */
  @JSImport("ol/webgl/PostProcessingPass", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WebGLPostProcessingPass {
    /**
      * @param {Options} options Options.
      */
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Fragment shader source
      */
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    /**
      * Scale ratio; if < 1, the post process will render to a texture smaller than
      * the main canvas that will then be sampled up (useful for saving resource on blur steps).
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
    
    /**
      * WebGL context; mandatory.
      */
    var webGlContext: WebGLRenderingContext
  }
  object Options {
    
    inline def apply(webGlContext: WebGLRenderingContext): Options = {
      val __obj = js.Dynamic.literal(webGlContext = webGlContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
      
      inline def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
      
      inline def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      inline def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
      
      inline def setUniforms(value: StringDictionary[UniformValue]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
      
      inline def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
      
      inline def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
      
      inline def setWebGlContext(value: WebGLRenderingContext): Self = StObject.set(x, "webGlContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait UniformInternalDescription extends StObject {
    
    /**
      * Location
      */
    var location: WebGLUniformLocation
    
    /**
      * Texture
      */
    var texture: js.UndefOr[WebGLTexture] = js.undefined
    
    /**
      * Value
      */
    var value: UniformValue
  }
  object UniformInternalDescription {
    
    inline def apply(location: WebGLUniformLocation, value: UniformValue): UniformInternalDescription = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UniformInternalDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UniformInternalDescription] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: WebGLUniformLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
      
      inline def setValue(value: UniformValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFunction1(value: /* arg0 */ FrameState => UniformLiteralValue): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {WebGLRenderingContext} webGlContext WebGL context; mandatory.
    * @property {number} [scaleRatio] Scale ratio; if < 1, the post process will render to a texture smaller than
    * the main canvas that will then be sampled up (useful for saving resource on blur steps).
    * @property {string} [vertexShader] Vertex shader source
    * @property {string} [fragmentShader] Fragment shader source
    * @property {Object<string,import("./Helper").UniformValue>} [uniforms] Uniform definitions for the post process step
    */
  /**
    * @typedef {Object} UniformInternalDescription
    * @property {import("./Helper").UniformValue} value Value
    * @property {WebGLUniformLocation} location Location
    * @property {WebGLTexture} [texture] Texture
    * @private
    */
  /**
    * @classdesc
    * This class is used to define Post Processing passes with custom shaders and uniforms.
    * This is used internally by {@link module:ol/webgl/Helper~WebGLHelper}.
    *
    * Please note that the final output on the DOM canvas is expected to have premultiplied alpha, which means that
    * a pixel which is 100% red with an opacity of 50% must have a color of (r=0.5, g=0, b=0, a=0.5).
    * Failing to provide pixel colors with premultiplied alpha will result in render anomalies.
    *
    * The default post-processing pass does *not* multiply color values with alpha value, it expects color values to be
    * premultiplied.
    *
    * Default shaders are shown hereafter:
    *
    * * Vertex shader:
    *
    *   ```
    *   precision mediump float;
    *
    *   attribute vec2 a_position;
    *   varying vec2 v_texCoord;
    *   varying vec2 v_screenCoord;
    *
    *   uniform vec2 u_screenSize;
    *
    *   void main() {
    *     v_texCoord = a_position * 0.5 + 0.5;
    *     v_screenCoord = v_texCoord * u_screenSize;
    *     gl_Position = vec4(a_position, 0.0, 1.0);
    *   }
    *   ```
    *
    * * Fragment shader:
    *
    *   ```
    *   precision mediump float;
    *
    *   uniform sampler2D u_image;
    *   uniform float u_opacity;
    *
    *   varying vec2 v_texCoord;
    *
    *   void main() {
    *     gl_FragColor = texture2D(u_image, v_texCoord) * u_opacity;
    *   }
    *   ```
    *
    * @api
    */
  @js.native
  trait WebGLPostProcessingPass extends StObject {
    
    /**
      * Render to the next postprocessing pass (or to the canvas if final pass).
      * @param {import("../Map.js").FrameState} frameState current frame state
      * @param {WebGLPostProcessingPass} [nextPass] Next pass, optional
      * @param {function(WebGLRenderingContext, import("../Map.js").FrameState):void} [preCompose] Called before composing.
      * @param {function(WebGLRenderingContext, import("../Map.js").FrameState):void} [postCompose] Called before composing.
      * @api
      */
    @JSName("apply")
    def apply(frameState: FrameState): Unit = js.native
    @JSName("apply")
    def apply(
      frameState: FrameState,
      nextPass: Unit,
      preCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    @JSName("apply")
    def apply(
      frameState: FrameState,
      nextPass: Unit,
      preCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit],
      postCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    @JSName("apply")
    def apply(
      frameState: FrameState,
      nextPass: Unit,
      preCompose: Unit,
      postCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    @JSName("apply")
    def apply(frameState: FrameState, nextPass: WebGLPostProcessingPass): Unit = js.native
    @JSName("apply")
    def apply(
      frameState: FrameState,
      nextPass: WebGLPostProcessingPass,
      preCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    @JSName("apply")
    def apply(
      frameState: FrameState,
      nextPass: WebGLPostProcessingPass,
      preCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit],
      postCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    @JSName("apply")
    def apply(
      frameState: FrameState,
      nextPass: WebGLPostProcessingPass,
      preCompose: Unit,
      postCompose: js.Function2[/* arg0 */ WebGLRenderingContext, /* arg1 */ FrameState, Unit]
    ): Unit = js.native
    
    /**
      * Sets the custom uniforms based on what was given in the constructor.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      * @private
      */
    /* private */ var applyUniforms: Any = js.native
    
    var frameBuffer_ : WebGLFramebuffer | Null = js.native
    
    /**
      * @return {WebGLFramebuffer} Frame buffer
      * @api
      */
    def getFrameBuffer(): WebGLFramebuffer = js.native
    
    /**
      * Get the WebGL rendering context
      * @return {WebGLRenderingContext} The rendering context.
      * @api
      */
    def getGL(): WebGLRenderingContext = js.native
    
    var gl_ : WebGLRenderingContext = js.native
    
    /**
      * Initialize the render target texture of the post process, make sure it is at the
      * right size and bind it as a render target for the next draw calls.
      * The last step to be initialized will be the one where the primitives are rendered.
      * @param {import("../Map.js").FrameState} frameState current frame state
      * @api
      */
    def init(frameState: FrameState): Unit = js.native
    
    var renderTargetAttribLocation_ : Double = js.native
    
    var renderTargetOpacityLocation_ : WebGLUniformLocation | Null = js.native
    
    var renderTargetProgram_ : WebGLProgram | Null = js.native
    
    var renderTargetTextureLocation_ : WebGLUniformLocation | Null = js.native
    
    var renderTargetTextureSize_ : js.Array[Double] | Null = js.native
    
    var renderTargetTexture_ : WebGLTexture | Null = js.native
    
    var renderTargetUniformLocation_ : WebGLUniformLocation | Null = js.native
    
    var renderTargetVerticesBuffer_ : WebGLBuffer | Null = js.native
    
    var scaleRatio_ : Double = js.native
    
    /**
      * Holds info about custom uniforms used in the post processing pass
      * @type {Array<UniformInternalDescription>}
      * @private
      */
    /* private */ var uniforms_ : Any = js.native
  }
}
