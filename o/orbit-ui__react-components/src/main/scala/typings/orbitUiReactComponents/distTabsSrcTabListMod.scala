package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distTabsSrcUseTabsItemsMod.TabType
import typings.react.mod.ComponentProps
import typings.react.mod.ForwardedRef
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabsSrcTabListMod {
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTabList(param0: InnerTabListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTabList")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tabs/src/TabList", "TabList")
  @js.native
  val TabList: OrbitComponent[HTMLElement, InnerTabListProps] = js.native
  
  trait InnerTabListProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean | Double] = js.undefined
    
    var forwardedRef: ForwardedRef[Any]
    
    var tabs: js.UndefOr[js.Array[TabType]] = js.undefined
  }
  object InnerTabListProps {
    
    inline def apply(): InnerTabListProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTabListProps]
    }
    
    extension [Self <: InnerTabListProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean | Double): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setTabs(value: js.Array[TabType]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: TabType*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  type TabListProps = ComponentProps[OrbitComponent[HTMLElement, InnerTabListProps]]
}
