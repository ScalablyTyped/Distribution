package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.typesMod.DomProps
import typings.orbitUiReactComponents.typesMod.InteractionStatesProps
import typings.orbitUiReactComponents.useCollectionMod.CollectionItem
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod {
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMenuItem(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest: InnerMenuItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuItem")(hasHasKeyTooltipIdDisabledActiveFocusHoverAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuItem", "MenuItem")
  @js.native
  val MenuItem: OrbitComponent[HTMLElement, InnerMenuItemProps] = js.native
  
  trait InnerMenuItemProps
    extends StObject
       with DomProps
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
      * Whether or not the item is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Matching collection item.
      */
    var item: CollectionItem
  }
  object InnerMenuItemProps {
    
    inline def apply(item: CollectionItem): InnerMenuItemProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerMenuItemProps]
    }
    
    extension [Self <: InnerMenuItemProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setItem(value: CollectionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type MenuItemProps = ComponentProps[OrbitComponent[HTMLElement, InnerMenuItemProps]]
}
