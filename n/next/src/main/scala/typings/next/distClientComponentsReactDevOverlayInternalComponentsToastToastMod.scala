package typings.next

import typings.react.mod.FC
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalComponentsToastToastMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/components/Toast/Toast", "Toast")
  @js.native
  val Toast: FC[ToastProps] = js.native
  
  trait ToastProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[/* ev */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent], Unit]
      ] = js.undefined
  }
  object ToastProps {
    
    inline def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    extension [Self <: ToastProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnClick(value: /* ev */ typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
