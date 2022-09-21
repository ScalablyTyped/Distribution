package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.sharedMod.FocusManager
import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listboxContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/listbox/src/ListboxContext", "ListboxContext")
  @js.native
  val ListboxContext: Context[ListboxContextType] = js.native
  
  inline def useListboxContext(): ListboxContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useListboxContext")().asInstanceOf[ListboxContextType]
  
  trait ListboxContextType extends StObject {
    
    var focusManager: js.UndefOr[FocusManager] = js.undefined
    
    var focusOnHover: js.UndefOr[Boolean] = js.undefined
    
    var onFocus: js.UndefOr[
        js.Function3[
          /* event */ SyntheticEvent[Element, Event], 
          /* key */ String, 
          /* activeElement */ HTMLElement, 
          Unit
        ]
      ] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* event */ SyntheticEvent[Element, Event], /* key */ String, Unit]] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ListboxContextType {
    
    inline def apply(): ListboxContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListboxContextType]
    }
    
    extension [Self <: ListboxContextType](x: Self) {
      
      inline def setFocusManager(value: FocusManager): Self = StObject.set(x, "focusManager", value.asInstanceOf[js.Any])
      
      inline def setFocusManagerUndefined: Self = StObject.set(x, "focusManager", js.undefined)
      
      inline def setFocusOnHover(value: Boolean): Self = StObject.set(x, "focusOnHover", value.asInstanceOf[js.Any])
      
      inline def setFocusOnHoverUndefined: Self = StObject.set(x, "focusOnHover", js.undefined)
      
      inline def setOnFocus(
        value: (/* event */ SyntheticEvent[Element, Event], /* key */ String, /* activeElement */ HTMLElement) => Unit
      ): Self = StObject.set(x, "onFocus", js.Any.fromFunction3(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSelect(value: (/* event */ SyntheticEvent[Element, Event], /* key */ String) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
}
