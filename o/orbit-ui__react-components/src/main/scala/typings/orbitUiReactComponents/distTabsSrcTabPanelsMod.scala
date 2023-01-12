package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distTabsSrcUseTabsItemsMod.PanelType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabsSrcTabPanelsMod {
  
  object TabPanels {
    
    inline def apply(param0: TabPanelsProps): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/tabs/src/TabPanels", "TabPanels")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/tabs/src/TabPanels", "TabPanels.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait TabPanelsProps extends StObject {
    
    var panels: js.Array[PanelType]
  }
  object TabPanelsProps {
    
    inline def apply(panels: js.Array[PanelType]): TabPanelsProps = {
      val __obj = js.Dynamic.literal(panels = panels.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabPanelsProps] (val x: Self) extends AnyVal {
      
      inline def setPanels(value: js.Array[PanelType]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      inline def setPanelsVarargs(value: PanelType*): Self = StObject.set(x, "panels", js.Array(value*))
    }
  }
}
