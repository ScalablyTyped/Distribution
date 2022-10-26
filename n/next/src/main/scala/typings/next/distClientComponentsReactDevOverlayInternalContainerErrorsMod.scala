package typings.next

import typings.next.distClientComponentsReactDevOverlayInternalErrorOverlayReducerMod.UnhandledErrorAction
import typings.next.distClientComponentsReactDevOverlayInternalErrorOverlayReducerMod.UnhandledRejectionAction
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalContainerErrorsMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/container/Errors", "Errors")
  @js.native
  val Errors: FC[ErrorsProps] = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/container/Errors", "styles")
  @js.native
  val styles: String = js.native
  
  trait ErrorsProps extends StObject {
    
    var errors: js.Array[SupportedErrorEvent]
  }
  object ErrorsProps {
    
    inline def apply(errors: js.Array[SupportedErrorEvent]): ErrorsProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsProps]
    }
    
    extension [Self <: ErrorsProps](x: Self) {
      
      inline def setErrors(value: js.Array[SupportedErrorEvent]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: SupportedErrorEvent*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  trait SupportedErrorEvent extends StObject {
    
    var event: UnhandledErrorAction | UnhandledRejectionAction
    
    var id: Double
  }
  object SupportedErrorEvent {
    
    inline def apply(event: UnhandledErrorAction | UnhandledRejectionAction, id: Double): SupportedErrorEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SupportedErrorEvent]
    }
    
    extension [Self <: SupportedErrorEvent](x: Self) {
      
      inline def setEvent(value: UnhandledErrorAction | UnhandledRejectionAction): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
