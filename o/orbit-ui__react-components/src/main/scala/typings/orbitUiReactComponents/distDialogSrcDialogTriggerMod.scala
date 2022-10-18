package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
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

object distDialogSrcDialogTriggerMod {
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src/DialogTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src/DialogTrigger", "DialogTrigger")
  @js.native
  val DialogTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  inline def InnerDialogTrigger(
    hasOpenPropDefaultOpenOnOpenChangeDismissableZIndexAsChildrenForwardedRefRest: InnerDialogTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialogTrigger")(hasOpenPropDefaultOpenOnOpenChangeDismissableZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type DialogTriggerProps = ComponentProps[OrbitComponent[HTMLElement, InnerDialogTriggerProps]]
  
  trait InnerDialogTriggerProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * The initial value of open when in auto controlled mode.
      */
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not the dialog should close on outside interactions.
      */
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
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
      * Whether or not to show the dialog.
      */
    var open: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The z-index of of the dialog.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerDialogTriggerProps {
    
    inline def apply(): InnerDialogTriggerProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerDialogTriggerProps]
    }
    
    extension [Self <: InnerDialogTriggerProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnOpenChange(value: (/* event */ SyntheticEvent[typings.std.Element, Event], /* isOpen */ Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenNull: Self = StObject.set(x, "open", null)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
