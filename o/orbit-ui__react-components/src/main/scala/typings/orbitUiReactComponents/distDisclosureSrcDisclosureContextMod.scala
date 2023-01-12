package typings.orbitUiReactComponents

import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisclosureSrcDisclosureContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureContext", "DisclosureContext")
  @js.native
  val DisclosureContext: Context[DisclosureContextType] = js.native
  
  inline def useDisclosureContext(): DisclosureContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisclosureContext")().asInstanceOf[DisclosureContextType]
  
  trait DisclosureContextType extends StObject {
    
    var close: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
  }
  object DisclosureContextType {
    
    inline def apply(): DisclosureContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisclosureContextType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisclosureContextType] (val x: Self) extends AnyVal {
      
      inline def setClose(value: /* event */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    }
  }
}
