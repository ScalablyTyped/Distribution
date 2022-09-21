package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.forwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`auto-end`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`auto-start`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`bottom-end`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`bottom-start`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`left-end`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`left-start`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`right-end`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`right-start`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`top-end`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.`top-start`
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.auto
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.bottom
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.left
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.right
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.top
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src/TooltipTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerTooltipTrigger(
    hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest: InnerTooltipTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTooltipTrigger")(hasOpenDefaultOpenPositionPropOnOpenChangeDisabledAllowFlipAllowPreventOverflowContainerElementZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/tooltip/src/TooltipTrigger", "TooltipTrigger")
  @js.native
  val TooltipTrigger: OrbitComponent[HTMLElement, InnerTooltipTriggerProps] = js.native
  
  inline def parseTooltipTrigger(children: ReactNode): js.Tuple2[ReactElement, ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTooltipTrigger")(children.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ReactElement, ReactElement]]
  
  trait InnerTooltipTriggerProps extends StObject {
    
    /**
      * Whether or not the tooltip element can flip when it will overflow it's boundary area.
      */
    var allowFlip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the tooltip element position can change to prevent it from being cut off so that it stays visible within its boundary area.
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
      * @ignore
      */
    var containerElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * The initial value of `open` when in auto controlled mode.
      */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the tooltip should be disabled, independent from the trigger.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when the open state change.
      * @param {SyntheticEvent} event - React's original event.
      * @param {boolean} isOpen - Indicate if the tooltip is visible.
      * @returns {void}
      */
    var onOpenChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[typings.std.Element, Event], /* isOpen */ Boolean, Unit]
      ] = js.undefined
    
    /**
      * Whether or not to show the tooltip.
      */
    var open: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Position of the tooltip element related to the trigger.
      */
    var position: js.UndefOr[
        auto | `auto-start` | `auto-end` | top | `top-start` | `top-end` | bottom | `bottom-start` | `bottom-end` | right | `right-start` | `right-end` | left | `left-start` | `left-end`
      ] = js.undefined
    
    /**
      * The z-index of the popover element.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerTooltipTriggerProps {
    
    inline def apply(): InnerTooltipTriggerProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerTooltipTriggerProps]
    }
    
    extension [Self <: InnerTooltipTriggerProps](x: Self) {
      
      inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
      
      inline def setAllowFlipUndefined: Self = StObject.set(x, "allowFlip", js.undefined)
      
      inline def setAllowPreventOverflow(value: Boolean): Self = StObject.set(x, "allowPreventOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventOverflowUndefined: Self = StObject.set(x, "allowPreventOverflow", js.undefined)
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainerElement(value: HTMLElement): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnOpenChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* isOpen */ Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenNull: Self = StObject.set(x, "open", null)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(
        value: auto | `auto-start` | `auto-end` | top | `top-start` | `top-end` | bottom | `bottom-start` | `bottom-end` | right | `right-start` | `right-end` | left | `left-start` | `left-end`
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type TooltipTriggerProps = ComponentProps[OrbitComponent[HTMLElement, InnerTooltipTriggerProps]]
}
