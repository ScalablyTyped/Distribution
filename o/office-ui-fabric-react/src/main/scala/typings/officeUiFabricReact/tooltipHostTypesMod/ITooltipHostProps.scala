package typings.officeUiFabricReact.tooltipHostTypesMod

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
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipHostProps extends HTMLAttributes[HTMLDivElement | TooltipHostBase] {
  
  /**
    * Additional properties to pass through for Callout.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  
  /**
    * Number of milliseconds to delay closing the tooltip, so that the user has time to hover over
    * the tooltip and interact with it. Hovering over the tooltip will count as hovering over the
    * host, so that the tooltip will stay open if the user is actively interacting with it.
    */
  var closeDelay: js.UndefOr[Double] = js.native
  
  /**
    * Optional callback to access the ITooltipHost interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITooltipHost]] = js.native
  
  /**
    * Content to display in the Tooltip.
    */
  var content: js.UndefOr[String | Element | js.Array[Element]] = js.native
  
  /**
    * Length of delay before showing the tooltip on hover.
    * @defaultvalue TooltipDelay.medium
    */
  var delay: js.UndefOr[TooltipDelay] = js.native
  
  /**
    * How the tooltip should be anchored to its `targetElement`.
    * @defaultvalue DirectionalHint.topCenter
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used.
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * Class name to apply to tooltip host.
    */
  var hostClassName: js.UndefOr[String] = js.native
  
  /**
    * Notifies when tooltip becomes visible or hidden, whatever the trigger was.
    */
  var onTooltipToggle: js.UndefOr[js.Function1[/* isTooltipVisible */ Boolean, Unit]] = js.native
  
  /**
    * If this is unset (the default), the tooltip is always shown even if there's no overflow.
    *
    * If set, only show the tooltip if the specified element (`Self` or `Parent`) has overflow.
    * When set to `Parent`, the parent element is also used as the tooltip's target element.
    *
    * Note that even with `Self` mode, the TooltipHost *does not* check whether any children have overflow.
    */
  var overflowMode: js.UndefOr[TooltipOverflowMode] = js.native
  
  /**
    * Whether or not to mark the TooltipHost root element as described by the tooltip.
    * If not specified, the caller should pass an `id` to the TooltipHost (to be passed through to
    * the Tooltip) and mark the appropriate element as `aria-describedby` the `id`.
    * @defaultvalue true
    */
  var setAriaDescribedBy: js.UndefOr[Boolean] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]] = js.native
  
  /**
    * Theme provided by higher-order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Additional properties to pass through for Tooltip.
    */
  var tooltipProps: js.UndefOr[ITooltipProps] = js.native
}
object ITooltipHostProps {
  
  @scala.inline
  def apply(): ITooltipHostProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipHostProps]
  }
  
  @scala.inline
  implicit class ITooltipHostPropsOps[Self <: ITooltipHostProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    
    @scala.inline
    def setCloseDelay(value: Double): Self = this.set("closeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseDelay: Self = this.set("closeDelay", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ITooltipHost | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ITooltipHost]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: Element*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: String | Element | js.Array[Element]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDelay(value: TooltipDelay): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDirectionalHint(value: DirectionalHint): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHint: Self = this.set("directionalHint", js.undefined)
    
    @scala.inline
    def setDirectionalHintForRTL(value: DirectionalHint): Self = this.set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintForRTL: Self = this.set("directionalHintForRTL", js.undefined)
    
    @scala.inline
    def setHostClassName(value: String): Self = this.set("hostClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostClassName: Self = this.set("hostClassName", js.undefined)
    
    @scala.inline
    def setOnTooltipToggle(value: /* isTooltipVisible */ Boolean => Unit): Self = this.set("onTooltipToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTooltipToggle: Self = this.set("onTooltipToggle", js.undefined)
    
    @scala.inline
    def setOverflowMode(value: TooltipOverflowMode): Self = this.set("overflowMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowMode: Self = this.set("overflowMode", js.undefined)
    
    @scala.inline
    def setSetAriaDescribedBy(value: Boolean): Self = this.set("setAriaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAriaDescribedBy: Self = this.set("setAriaDescribedBy", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ITooltipHostStyleProps => DeepPartial[ITooltipHostStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTooltipProps(value: ITooltipProps): Self = this.set("tooltipProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipProps: Self = this.set("tooltipProps", js.undefined)
  }
}
