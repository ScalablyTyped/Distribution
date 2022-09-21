package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.bottom
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.end
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.start
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.top
import typings.orbitUiReactComponents.typesMod.DomProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMenuTrigger(props: InnerMenuTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMenuTrigger")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/menu/src/MenuTrigger", "MenuTrigger")
  @js.native
  val MenuTrigger: OrbitComponent[HTMLElement, InnerMenuTriggerProps] = js.native
  
  trait InnerMenuTriggerProps
    extends StObject
       with DomProps {
    
    /**
      * The horizontal alignment of the menu relative to the trigger.
      */
    var align: js.UndefOr[start | end] = js.undefined
    
    /**
      * Whether or not the menu can flip when it will overflow it's boundary area.
      */
    var allowFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the menu position can change to prevent it from being cut off so that it stays visible within its boundary area.
      */
    var allowPreventOverflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * Whether or not the menu should close when an item is selected.
      */
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial value of open when in auto controlled mode.
      */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The direction the menu will open relative to the trigger.
      */
    var direction: js.UndefOr[bottom | top] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when the open state change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {boolean} isOpen - Indicate if the menu is visible.
      * @returns {void}
      */
    var onOpenChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* isOpen */ Boolean, Unit]
      ] = js.undefined
    
    /**
      * Whether or not to show the menu.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The z-index of the menu.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerMenuTriggerProps {
    
    inline def apply(): InnerMenuTriggerProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerMenuTriggerProps]
    }
    
    extension [Self <: InnerMenuTriggerProps](x: Self) {
      
      inline def setAlign(value: start | end): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
      
      inline def setAllowFlipUndefined: Self = StObject.set(x, "allowFlip", js.undefined)
      
      inline def setAllowPreventOverflow(value: Boolean): Self = StObject.set(x, "allowPreventOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventOverflowUndefined: Self = StObject.set(x, "allowPreventOverflow", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDirection(value: bottom | top): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnOpenChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* isOpen */ Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type MenuTriggerProps = ComponentProps[OrbitComponent[HTMLElement, InnerMenuTriggerProps]]
}
