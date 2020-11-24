package typings.officeUiFabricReact.textFieldTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TextField/TextField.types.ITextFieldProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TextField/TextField.types.ITextFieldProps, 'className' | 'disabled' | 'inputClassName' | 'required' | 'multiline' | 'borderless' | 'resizable' | 'underlined' | 'autoAdjustHeight'> & {  hasErrorMessage :boolean | undefined,   hasIcon :boolean | undefined,   hasLabel :boolean | undefined,   focused :boolean | undefined,   hasRevealButton :boolean | undefined} */
@js.native
trait ITextFieldStyleProps extends js.Object {
  
  var autoAdjustHeight: js.UndefOr[Boolean] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** Element has focus. */
  var focused: js.UndefOr[Boolean] = js.native
  
  /** Element has an error message. */
  var hasErrorMessage: js.UndefOr[Boolean] = js.native
  
  /** Element has an icon. */
  var hasIcon: js.UndefOr[Boolean] = js.native
  
  /** Element has a label. */
  var hasLabel: js.UndefOr[Boolean] = js.native
  
  /** Element has a peek button for passwords */
  var hasRevealButton: js.UndefOr[Boolean] = js.native
  
  var inputClassName: js.UndefOr[String] = js.native
  
  var multiline: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var resizable: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
  
  var underlined: js.UndefOr[Boolean] = js.native
}
object ITextFieldStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): ITextFieldStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldStyleProps]
  }
  
  @scala.inline
  implicit class ITextFieldStylePropsOps[Self <: ITextFieldStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAdjustHeight(value: Boolean): Self = this.set("autoAdjustHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdjustHeight: Self = this.set("autoAdjustHeight", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setHasErrorMessage(value: Boolean): Self = this.set("hasErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasErrorMessage: Self = this.set("hasErrorMessage", js.undefined)
    
    @scala.inline
    def setHasIcon(value: Boolean): Self = this.set("hasIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasIcon: Self = this.set("hasIcon", js.undefined)
    
    @scala.inline
    def setHasLabel(value: Boolean): Self = this.set("hasLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasLabel: Self = this.set("hasLabel", js.undefined)
    
    @scala.inline
    def setHasRevealButton(value: Boolean): Self = this.set("hasRevealButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasRevealButton: Self = this.set("hasRevealButton", js.undefined)
    
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setUnderlined(value: Boolean): Self = this.set("underlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlined: Self = this.set("underlined", js.undefined)
  }
}
