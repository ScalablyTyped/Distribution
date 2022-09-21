package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.useTabsItemsMod.PanelType
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTabPanel(hasHasKeyTabIdPanelIdAsChildrenForwardedRefRest: InnerTabPanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabPanel")(hasHasKeyTabIdPanelIdAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabPanel", "TabPanel")
  @js.native
  val TabPanel: OrbitComponent[HTMLElement, InnerTabPanelProps] = js.native
  
  trait InnerTabPanelProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Matching panel item.
      */
    var panel: PanelType
  }
  object InnerTabPanelProps {
    
    inline def apply(panel: PanelType): InnerTabPanelProps = {
      val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerTabPanelProps]
    }
    
    extension [Self <: InnerTabPanelProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setPanel(value: PanelType): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    }
  }
  
  type TabPanelProps = ComponentProps[OrbitComponent[HTMLElement, InnerTabPanelProps]]
}
