package typings.onfidoActiveVideoCapture

import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.cpu
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.mediapipe
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.tfjs
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.wasm
import typings.onfidoActiveVideoCapture.onfidoActiveVideoCaptureStrings.webgl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersUseBackendMod {
  
  @JSImport("@onfido/active-video-capture/dist/helpers/useBackend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useBackend(): BackendHook = ^.asInstanceOf[js.Dynamic].applyDynamic("useBackend")().asInstanceOf[BackendHook]
  
  trait BackendHook extends StObject {
    
    var backend: cpu | wasm | webgl
    
    var runtime: tfjs | mediapipe
  }
  object BackendHook {
    
    inline def apply(backend: cpu | wasm | webgl, runtime: tfjs | mediapipe): BackendHook = {
      val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackendHook]
    }
    
    extension [Self <: BackendHook](x: Self) {
      
      inline def setBackend(value: cpu | wasm | webgl): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: tfjs | mediapipe): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
