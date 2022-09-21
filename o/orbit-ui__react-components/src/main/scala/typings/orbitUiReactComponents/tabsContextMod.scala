package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import typings.react.mod.Context
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabsContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabsContext", "TabsContext")
  @js.native
  val TabsContext: Context[TabsContextType] = js.native
  
  inline def useTabsContext(): TabsContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabsContext")().asInstanceOf[TabsContextType]
  
  trait TabsContextType extends StObject {
    
    var isManual: js.UndefOr[Boolean] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* event */ SyntheticEvent[Element, Event], /* key */ String, Unit]] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var selectedKey: js.UndefOr[String] = js.undefined
  }
  object TabsContextType {
    
    inline def apply(): TabsContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsContextType]
    }
    
    extension [Self <: TabsContextType](x: Self) {
      
      inline def setIsManual(value: Boolean): Self = StObject.set(x, "isManual", value.asInstanceOf[js.Any])
      
      inline def setIsManualUndefined: Self = StObject.set(x, "isManual", js.undefined)
      
      inline def setOnSelect(value: (/* event */ SyntheticEvent[Element, Event], /* key */ String) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setSelectedKey(value: String): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
