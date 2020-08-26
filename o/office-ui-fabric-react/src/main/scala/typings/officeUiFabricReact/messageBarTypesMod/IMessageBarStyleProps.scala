package typings.officeUiFabricReact.messageBarTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMessageBarStyleProps extends js.Object {
  /**
    * Whether the MessageBar contains any action elements.
    */
  var actions: js.UndefOr[Boolean] = js.native
  /**
    * Additional CSS class(es).
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Whether the single line MessageBar is being expanded.
    */
  var expandSingleLine: js.UndefOr[Boolean] = js.native
  /**
    * Whether the MessageBar is rendered in multi line (as opposed to single line) mode.
    */
  var isMultiline: js.UndefOr[Boolean] = js.native
  /**
    * Type of the MessageBar.
    */
  var messageBarType: js.UndefOr[MessageBarType] = js.native
  /**
    * Whether the MessageBar contains a dismiss button.
    */
  var onDismiss: js.UndefOr[Boolean] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: ITheme = js.native
  /**
    * Whether the text is truncated.
    */
  var truncated: js.UndefOr[Boolean] = js.native
}

object IMessageBarStyleProps {
  @scala.inline
  def apply(theme: ITheme): IMessageBarStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBarStyleProps]
  }
  @scala.inline
  implicit class IMessageBarStylePropsOps[Self <: IMessageBarStyleProps] (val x: Self) extends AnyVal {
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
    def setActions(value: Boolean): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setExpandSingleLine(value: Boolean): Self = this.set("expandSingleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandSingleLine: Self = this.set("expandSingleLine", js.undefined)
    @scala.inline
    def setIsMultiline(value: Boolean): Self = this.set("isMultiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMultiline: Self = this.set("isMultiline", js.undefined)
    @scala.inline
    def setMessageBarType(value: MessageBarType): Self = this.set("messageBarType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageBarType: Self = this.set("messageBarType", js.undefined)
    @scala.inline
    def setOnDismiss(value: Boolean): Self = this.set("onDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncated: Self = this.set("truncated", js.undefined)
  }
  
}

