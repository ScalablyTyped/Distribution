package typings.next

import typings.next.anon.ReactError
import typings.next.anon.State
import typings.next.distClientComponentsReactDevOverlayInternalContainerErrorsMod.SupportedErrorEvent
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalReactDevOverlayMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/ReactDevOverlay", JSImport.Default)
  @js.native
  open class default () extends ReactDevOverlay
  object default {
    
    @JSImport("next/dist/client/components/react-dev-overlay/internal/ReactDevOverlay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: js.Error): ReactDevOverlayState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[ReactDevOverlayState]
  }
  
  @js.native
  trait ReactDevOverlay extends PureComponent[State, ReactDevOverlayState, Any] {
    
    @JSName("state")
    var state_ReactDevOverlay: ReactError = js.native
  }
  
  trait ReactDevOverlayState extends StObject {
    
    var reactError: SupportedErrorEvent | Null
  }
  object ReactDevOverlayState {
    
    inline def apply(): ReactDevOverlayState = {
      val __obj = js.Dynamic.literal(reactError = null)
      __obj.asInstanceOf[ReactDevOverlayState]
    }
    
    extension [Self <: ReactDevOverlayState](x: Self) {
      
      inline def setReactError(value: SupportedErrorEvent): Self = StObject.set(x, "reactError", value.asInstanceOf[js.Any])
      
      inline def setReactErrorNull: Self = StObject.set(x, "reactError", null)
    }
  }
}
