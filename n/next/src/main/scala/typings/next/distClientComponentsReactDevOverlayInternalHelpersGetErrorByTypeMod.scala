package typings.next

import typings.next.distClientComponentsReactDevOverlayInternalContainerErrorsMod.SupportedErrorEvent
import typings.next.distClientComponentsReactDevOverlayInternalHelpersStackFrameMod.OriginalStackFrame
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalHelpersGetErrorByTypeMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/helpers/getErrorByType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getErrorByType(ev: SupportedErrorEvent): js.Promise[ReadyRuntimeError] = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorByType")(ev.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadyRuntimeError]]
  
  trait ReadyRuntimeError extends StObject {
    
    var error: js.Error
    
    var frames: js.Array[OriginalStackFrame]
    
    var id: Double
    
    var runtime: `true`
  }
  object ReadyRuntimeError {
    
    inline def apply(error: js.Error, frames: js.Array[OriginalStackFrame], id: Double): ReadyRuntimeError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], runtime = true)
      __obj.asInstanceOf[ReadyRuntimeError]
    }
    
    extension [Self <: ReadyRuntimeError](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFrames(value: js.Array[OriginalStackFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: OriginalStackFrame*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRuntime(value: `true`): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
