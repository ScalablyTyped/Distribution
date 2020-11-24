package typings.officeUiFabricReact.tooltipTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.tooltipBaseMod.TooltipBase
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipProps extends HTMLAttributes[HTMLDivElement | TooltipBase] {
  
  /**
    * Properties to pass through for Callout.
    * @defaultvalue `{ isBeakVisible: true, beakWidth: 16, gapSpace: 0, setInitialFocus: true, doNotLayer: false }`
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  
  /**
    * Optional callback to access the ITooltip interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITooltip]] = js.native
  
  /**
    * Content to be passed to the tooltip
    */
  var content: js.UndefOr[String | Element | js.Array[Element]] = js.native
  
  /**
    * Length of delay. Set to `TooltipDelay.zero` if you do not want a delay.
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
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  
  /**
    * Max width of tooltip
    * @defaultvalue 364px
    */
  var maxWidth: js.UndefOr[String | Null] = js.native
  
  /**
    * Render function to populate tooltip content.
    */
  var onRenderContent: js.UndefOr[IRenderFunction[ITooltipProps]] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITooltipStyleProps, ITooltipStyles]] = js.native
  
  /**
    * Element to anchor the Tooltip to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Theme provided by higher-order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object ITooltipProps {
  
  @scala.inline
  def apply(): ITooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipProps]
  }
  
  @scala.inline
  implicit class ITooltipPropsOps[Self <: ITooltipProps] (val x: Self) extends AnyVal {
    
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
    def setComponentRefFunction1(value: /* ref */ ITooltip | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ITooltip]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
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
    def setMaxWidth(value: String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMaxWidthNull: Self = this.set("maxWidth", null)
    
    @scala.inline
    def setOnRenderContent(
      value: (/* props */ js.UndefOr[ITooltipProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ITooltipProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderContent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderContent: Self = this.set("onRenderContent", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ITooltipStyleProps => DeepPartial[ITooltipStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ITooltipStyleProps, ITooltipStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTargetElement(value: HTMLElement): Self = this.set("targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetElement: Self = this.set("targetElement", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
