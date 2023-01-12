package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.pluggableMapMod.FrameState
import typings.ol.webglHelperMod.UniformValue
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webglPostProcessingPassMod {
  
  @JSImport("ol/webgl/PostProcessingPass", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with WebGLPostProcessingPass {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var fragmentShader: js.UndefOr[String] = js.undefined
    
    var scaleRatio: js.UndefOr[Double] = js.undefined
    
    var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
    
    var vertexShader: js.UndefOr[String] = js.undefined
    
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
  
  @js.native
  trait WebGLPostProcessingPass extends StObject {
    
    /**
      * Render to the next postprocessing pass (or to the canvas if final pass).
      */
    @JSName("apply")
    def apply(frameState: FrameState): Unit = js.native
    @JSName("apply")
    def apply(frameState: FrameState, nextPass: WebGLPostProcessingPass): Unit = js.native
    
    def getFrameBuffer(): WebGLFramebuffer = js.native
    
    /**
      * Get the WebGL rendering context
      */
    def getGL(): WebGLRenderingContext = js.native
    
    /**
      * Initialize the render target texture of the post process, make sure it is at the
      * right size and bind it as a render target for the next draw calls.
      * The last step to be initialized will be the one where the primitives are rendered.
      */
    def init(frameState: FrameState): Unit = js.native
  }
}
