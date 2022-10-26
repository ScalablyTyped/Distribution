package typings.next

import typings.next.distClientComponentsReactDevOverlayInternalHelpersGetErrorByTypeMod.ReadyRuntimeError
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalContainerRuntimeErrorMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/container/RuntimeError", "RuntimeError")
  @js.native
  val RuntimeError: FC[RuntimeErrorProps] = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/container/RuntimeError", "styles")
  @js.native
  val styles: String = js.native
  
  trait RuntimeErrorProps extends StObject {
    
    var error: ReadyRuntimeError
  }
  object RuntimeErrorProps {
    
    inline def apply(error: ReadyRuntimeError): RuntimeErrorProps = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeErrorProps]
    }
    
    extension [Self <: RuntimeErrorProps](x: Self) {
      
      inline def setError(value: ReadyRuntimeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
