package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typings.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
import typings.orbitUiReactComponents.distSharedSrcTypesMod.DomProps
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.cancel
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.confirmation
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.destructive
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.negative
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.primary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.secondary
import typings.orbitUiReactComponents.orbitUiReactComponentsStrings.warning
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.ForwardedRef
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAlertSrcAlertMod {
  
  @JSImport("@orbit-ui/react-components/dist/alert/src/Alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/alert/src/Alert", "Alert")
  @js.native
  val Alert: OrbitComponent[HTMLElement, InnerAlertProps] = js.native
  
  inline def InnerAlert(
    hasVariantPrimaryButtonLabelPrimaryButtonDisabledSecondaryButtonLabelSecondaryButtonDisabledCancelButtonLabelAutoFocusButtonOnPrimaryButtonClickOnSecondaryButtonClickOnCancelButtonClickZIndexChildrenForwardedRefRest: InnerAlertProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerAlert")(hasVariantPrimaryButtonLabelPrimaryButtonDisabledSecondaryButtonLabelSecondaryButtonDisabledCancelButtonLabelAutoFocusButtonOnPrimaryButtonClickOnSecondaryButtonClickOnCancelButtonClickZIndexChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type AlertProps = ComponentProps[OrbitComponent[HTMLElement, InnerAlertProps]]
  
  trait InnerAlertProps
    extends StObject
       with DomProps
       with AriaLabelingProps {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * The button to focus by default when the alert open.
      */
    var autoFocusButton: js.UndefOr[primary | secondary | cancel] = js.undefined
    
    /**
      * The cancel button label.
      */
    var cancelButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      * React children.
      */
    var children: ReactNode
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * Called when the cancel button is clicked.
      * @param {MouseEvent} event - React's original event.
      * @returns {void}
      */
    var onCancelButtonClick: js.UndefOr[
        js.Function1[/* event */ MouseEvent[typings.std.Element, NativeMouseEvent], Unit]
      ] = js.undefined
    
    /**
      * Called when the primary button is clicked.
      * @param {MouseEvent} event - React's original event.
      * @returns {void}
      */
    var onPrimaryButtonClick: js.UndefOr[
        js.Function1[/* event */ MouseEvent[typings.std.Element, NativeMouseEvent], Unit]
      ] = js.undefined
    
    /**
      * Called when the secondary button is clicked.
      * @param {MouseEvent} event - React's original event.
      * @returns {void}
      */
    var onSecondaryButtonClick: js.UndefOr[
        js.Function1[/* event */ MouseEvent[typings.std.Element, NativeMouseEvent], Unit]
      ] = js.undefined
    
    /**
      * Whether or not the primary button is disabled.
      */
    var primaryButtonDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The primary button label.
      */
    var primaryButtonLabel: String
    
    /**
      * Whether or not the secondary button is disabled.
      */
    var secondaryButtonDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The secondary button label.
      */
    var secondaryButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The style to use.
      */
    var variant: js.UndefOr[confirmation | destructive | warning | negative] = js.undefined
    
    /**
      * Additional props to render on the wrapper element.
      */
    var wrapperProps: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * The z-index of the alert.
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object InnerAlertProps {
    
    inline def apply(primaryButtonLabel: String): InnerAlertProps = {
      val __obj = js.Dynamic.literal(primaryButtonLabel = primaryButtonLabel.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerAlertProps]
    }
    
    extension [Self <: InnerAlertProps](x: Self) {
      
      inline def setAs(value: ElementType[Any]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocusButton(value: primary | secondary | cancel): Self = StObject.set(x, "autoFocusButton", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusButtonUndefined: Self = StObject.set(x, "autoFocusButton", js.undefined)
      
      inline def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOnCancelButtonClick(value: /* event */ MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancelButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnCancelButtonClickUndefined: Self = StObject.set(x, "onCancelButtonClick", js.undefined)
      
      inline def setOnPrimaryButtonClick(value: /* event */ MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onPrimaryButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnPrimaryButtonClickUndefined: Self = StObject.set(x, "onPrimaryButtonClick", js.undefined)
      
      inline def setOnSecondaryButtonClick(value: /* event */ MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onSecondaryButtonClick", js.Any.fromFunction1(value))
      
      inline def setOnSecondaryButtonClickUndefined: Self = StObject.set(x, "onSecondaryButtonClick", js.undefined)
      
      inline def setPrimaryButtonDisabled(value: Boolean): Self = StObject.set(x, "primaryButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonDisabledUndefined: Self = StObject.set(x, "primaryButtonDisabled", js.undefined)
      
      inline def setPrimaryButtonLabel(value: String): Self = StObject.set(x, "primaryButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonDisabled(value: Boolean): Self = StObject.set(x, "secondaryButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonDisabledUndefined: Self = StObject.set(x, "secondaryButtonDisabled", js.undefined)
      
      inline def setSecondaryButtonLabel(value: String): Self = StObject.set(x, "secondaryButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonLabelUndefined: Self = StObject.set(x, "secondaryButtonLabel", js.undefined)
      
      inline def setVariant(value: confirmation | destructive | warning | negative): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setWrapperProps(value: Record[String, Any]): Self = StObject.set(x, "wrapperProps", value.asInstanceOf[js.Any])
      
      inline def setWrapperPropsUndefined: Self = StObject.set(x, "wrapperProps", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
