package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
import typings.officeUiFabricReact.tooltipTypesMod.ITooltipProps
import typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipHostTypesMod {
  
  @js.native
  sealed trait TooltipOverflowMode extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.types", "TooltipOverflowMode")
  @js.native
  object TooltipOverflowMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TooltipOverflowMode & Double] = js.native
    
    /** Only show tooltip if parent DOM element is overflowing */
    @js.native
    sealed trait Parent
      extends StObject
         with TooltipOverflowMode
    /* 0 */ val Parent: typings.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode.Parent & Double = js.native
    
    /**
      * Only show tooltip if tooltip host's content is overflowing.
      * Note that this does not check the children for overflow, only the TooltipHost root.
      */
    @js.native
    sealed trait Self
      extends StObject
         with TooltipOverflowMode
    /* 1 */ val Self: typings.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode.Self & Double = js.native
  }
  
  trait ITooltipHost extends StObject {
    
    /**
      * Dismisses the tooltip.
      */
    def dismiss(): Unit
    
    /**
      * Shows the tooltip.
      */
    def show(): Unit
  }
  object ITooltipHost {
    
    inline def apply(dismiss: () => Unit, show: () => Unit): ITooltipHost = {
      val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITooltipHost]
    }
    
    extension [Self <: ITooltipHost](x: Self) {
      
      inline def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ITooltipHostProps
    extends StObject
       with HTMLAttributes[HTMLDivElement | TooltipHostBase] {
    
    /**
      * Additional properties to pass through for Callout.
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
    
    /**
      * Number of milliseconds to delay closing the tooltip, so that the user has time to hover over
      * the tooltip and interact with it. Hovering over the tooltip will count as hovering over the
      * host, so that the tooltip will stay open if the user is actively interacting with it.
      */
    var closeDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional callback to access the ITooltipHost interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ITooltipHost]] = js.undefined
    
    /**
      * Content to display in the Tooltip.
      */
    var content: js.UndefOr[String | Element | js.Array[Element]] = js.undefined
    
    /**
      * Length of delay before showing the tooltip on hover.
      * @defaultvalue TooltipDelay.medium
      */
    var delay: js.UndefOr[TooltipDelay] = js.undefined
    
    /**
      * How the tooltip should be anchored to its `targetElement`.
      * @defaultvalue DirectionalHint.topCenter
      */
    var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * How the element should be positioned in RTL layouts.
      * If not specified, a mirror of `directionalHint` will be used.
      */
    var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
    
    /**
      * Class name to apply to tooltip host.
      */
    var hostClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Notifies when tooltip becomes visible or hidden, whatever the trigger was.
      */
    var onTooltipToggle: js.UndefOr[js.Function1[/* isTooltipVisible */ Boolean, Unit]] = js.undefined
    
    /**
      * If this is unset (the default), the tooltip is always shown even if there's no overflow.
      *
      * If set, only show the tooltip if the specified element (`Self` or `Parent`) has overflow.
      * When set to `Parent`, the parent element is also used as the tooltip's target element.
      *
      * Note that even with `Self` mode, the TooltipHost *does not* check whether any children have overflow.
      */
    var overflowMode: js.UndefOr[TooltipOverflowMode] = js.undefined
    
    /**
      * Whether or not to mark the TooltipHost root element as described by the tooltip.
      * If not specified, the caller should pass an `id` to the TooltipHost (to be passed through to
      * the Tooltip) and mark the appropriate element as `aria-describedby` the `id`.
      * @defaultvalue true
      */
    var setAriaDescribedBy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]] = js.undefined
    
    /**
      * Theme provided by higher-order component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Additional properties to pass through for Tooltip.
      */
    var tooltipProps: js.UndefOr[ITooltipProps] = js.undefined
  }
  object ITooltipHostProps {
    
    inline def apply(): ITooltipHostProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipHostProps]
    }
    
    extension [Self <: ITooltipHostProps](x: Self) {
      
      inline def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      inline def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      inline def setCloseDelay(value: Double): Self = StObject.set(x, "closeDelay", value.asInstanceOf[js.Any])
      
      inline def setCloseDelayUndefined: Self = StObject.set(x, "closeDelay", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ITooltipHost]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ITooltipHost | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setContent(value: String | Element | js.Array[Element]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: Element*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDelay(value: TooltipDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      inline def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      inline def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      inline def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      inline def setHostClassName(value: String): Self = StObject.set(x, "hostClassName", value.asInstanceOf[js.Any])
      
      inline def setHostClassNameUndefined: Self = StObject.set(x, "hostClassName", js.undefined)
      
      inline def setOnTooltipToggle(value: /* isTooltipVisible */ Boolean => Unit): Self = StObject.set(x, "onTooltipToggle", js.Any.fromFunction1(value))
      
      inline def setOnTooltipToggleUndefined: Self = StObject.set(x, "onTooltipToggle", js.undefined)
      
      inline def setOverflowMode(value: TooltipOverflowMode): Self = StObject.set(x, "overflowMode", value.asInstanceOf[js.Any])
      
      inline def setOverflowModeUndefined: Self = StObject.set(x, "overflowMode", js.undefined)
      
      inline def setSetAriaDescribedBy(value: Boolean): Self = StObject.set(x, "setAriaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setSetAriaDescribedByUndefined: Self = StObject.set(x, "setAriaDescribedBy", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ITooltipHostStyleProps => DeepPartial[ITooltipHostStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltipProps(value: ITooltipProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  trait ITooltipHostStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var theme: ITheme
  }
  object ITooltipHostStyleProps {
    
    inline def apply(theme: ITheme): ITooltipHostStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipHostStyleProps]
    }
    
    extension [Self <: ITooltipHostStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITooltipHostStyles extends StObject {
    
    /**
      * Style for the host wrapper element.
      */
    var root: IStyle
  }
  object ITooltipHostStyles {
    
    inline def apply(): ITooltipHostStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipHostStyles]
    }
    
    extension [Self <: ITooltipHostStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
