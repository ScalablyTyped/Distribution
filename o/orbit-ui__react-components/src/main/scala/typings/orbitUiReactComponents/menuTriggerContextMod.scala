package typings.orbitUiReactComponents

import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuTriggerContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuTriggerContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuTriggerContext", "MenuTriggerContext")
  @js.native
  val MenuTriggerContext: Context[MenuTriggerContextType] = js.native
  
  inline def useMenuTriggerContext(): MenuTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuTriggerContext")().asInstanceOf[MenuTriggerContextType]
  
  trait MenuTriggerContextType extends StObject {
    
    var close: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Element, Event], /* focusTarget */ String, Unit]
      ] = js.undefined
  }
  object MenuTriggerContextType {
    
    inline def apply(): MenuTriggerContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuTriggerContextType]
    }
    
    extension [Self <: MenuTriggerContextType](x: Self) {
      
      inline def setClose(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setOpen(value: (/* event */ SyntheticEvent[Element, Event], /* focusTarget */ String) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
}
