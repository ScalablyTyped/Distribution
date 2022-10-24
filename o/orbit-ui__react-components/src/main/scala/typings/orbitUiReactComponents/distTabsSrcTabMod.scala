package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typings.orbitUiReactComponents.distTabsSrcUseTabsItemsMod.TabType
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabsSrcTabMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/Tab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTab(param0: InnerTabProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTab")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/Tab", "Tab")
  @js.native
  val Tab: OrbitComponent[HTMLElement, InnerTabProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/Tab", "TabKeyProp")
  @js.native
  val TabKeyProp: /* "data-o-ui-key" */ String = js.native
  
  trait InnerTabProps
    extends StObject
       with InteractionStatesProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the tab is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Whether or not the tab is selected.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Matching tab item.
      */
    var tab: TabType
  }
  object InnerTabProps {
    
    inline def apply(tab: TabType): InnerTabProps = {
      val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerTabProps]
    }
    
    extension [Self <: InnerTabProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTab(value: TabType): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
  
  type TabProps = ComponentProps[OrbitComponent[HTMLElement, InnerTabProps]]
}
