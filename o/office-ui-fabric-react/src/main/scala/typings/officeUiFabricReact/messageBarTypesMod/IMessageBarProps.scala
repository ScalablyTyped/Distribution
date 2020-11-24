package typings.officeUiFabricReact.messageBarTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.libButtonMod.BaseButton
import typings.officeUiFabricReact.libButtonMod.Button
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessageBarProps extends HTMLAttributes[HTMLElement] {
  
  /**
    * The actions you want to show on the other side.
    */
  var actions: js.UndefOr[Element] = js.native
  
  /**
    * A description of the message bar for the benefit of screen readers.
    * @deprecated Use native prop `aria-label` instead.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the IMessageBar interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IMessageBar]] = js.native
  
  /**
    * Aria label on dismiss button if onDismiss is defined.
    */
  var dismissButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Custom icon prop to replace the dismiss icon.
    * If unset, default will be the Fabric Clear icon.
    */
  var dismissIconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * Determines if the message bar is multi lined.
    * If false, and the text overflows over buttons or to another line, it is clipped.
    * @defaultvalue true
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Custom icon prop to replace the message bar icon.
    * If unset, default will be the icon set by messageBarType.
    */
  var messageBarIconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * The type of MessageBar to render.
    * @defaultvalue MessageBarType.info
    */
  var messageBarType: js.UndefOr[MessageBarType] = js.native
  
  /**
    * Whether the message bar has a dismiss button and its callback.
    * If null, we don't show a dismiss button.
    * @defaultvalue null
    */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement | BaseButton | Button, NativeMouseEvent]], 
      _
    ]
  ] = js.native
  
  /**
    * Aria label on overflow button if truncated is defined.
    */
  var overflowButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]] = js.native
  
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Determines if the message bar text is truncated.
    * If true, a button will render to toggle between a single line view and multiline view.
    * This prop is for single line message bars with no buttons only in a limited space scenario.
    * @defaultvalue false
    */
  var truncated: js.UndefOr[Boolean] = js.native
}
object IMessageBarProps {
  
  @scala.inline
  def apply(): IMessageBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageBarProps]
  }
  
  @scala.inline
  implicit class IMessageBarPropsOps[Self <: IMessageBarProps] (val x: Self) extends AnyVal {
    
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
    def setActions(value: Element): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IMessageBar | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IMessageBar]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDismissButtonAriaLabel(value: String): Self = this.set("dismissButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissButtonAriaLabel: Self = this.set("dismissButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setDismissIconProps(value: IIconProps): Self = this.set("dismissIconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissIconProps: Self = this.set("dismissIconProps", js.undefined)
    
    @scala.inline
    def setIsMultiline(value: Boolean): Self = this.set("isMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMultiline: Self = this.set("isMultiline", js.undefined)
    
    @scala.inline
    def setMessageBarIconProps(value: IIconProps): Self = this.set("messageBarIconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageBarIconProps: Self = this.set("messageBarIconProps", js.undefined)
    
    @scala.inline
    def setMessageBarType(value: MessageBarType): Self = this.set("messageBarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageBarType: Self = this.set("messageBarType", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[MouseEvent[HTMLElement | BaseButton | Button, NativeMouseEvent]] => _): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOverflowButtonAriaLabel(value: String): Self = this.set("overflowButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowButtonAriaLabel: Self = this.set("overflowButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IMessageBarStyleProps => DeepPartial[IMessageBarStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncated: Self = this.set("truncated", js.undefined)
  }
}
