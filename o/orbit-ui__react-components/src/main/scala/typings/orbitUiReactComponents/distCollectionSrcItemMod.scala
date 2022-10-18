package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.react.mod.ComponentProps
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcItemMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerItem(props: InnerItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/Item", "Item")
  @js.native
  val Item: OrbitComponent[HTMLElement, InnerItemProps] = js.native
  
  trait InnerItemProps extends StObject {
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the item is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A unique key to identify the item.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object InnerItemProps {
    
    inline def apply(): InnerItemProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerItemProps]
    }
    
    extension [Self <: InnerItemProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type ItemProps = ComponentProps[OrbitComponent[HTMLElement, InnerItemProps]]
}
