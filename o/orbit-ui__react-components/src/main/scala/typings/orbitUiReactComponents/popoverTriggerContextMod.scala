package typings.orbitUiReactComponents

import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverTriggerContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/popover/src/PopoverTriggerContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/popover/src/PopoverTriggerContext", "PopoverTriggerContext")
  @js.native
  val PopoverTriggerContext: Context[PopoverTriggerContextType] = js.native
  
  inline def usePopoverTriggerContext(): PopoverTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopoverTriggerContext")().asInstanceOf[PopoverTriggerContextType]
  
  trait PopoverTriggerContextType extends StObject {
    
    var close: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
  }
  object PopoverTriggerContextType {
    
    inline def apply(): PopoverTriggerContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverTriggerContextType]
    }
    
    extension [Self <: PopoverTriggerContextType](x: Self) {
      
      inline def setClose(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    }
  }
}
