package typings.officeUiFabricReact.toggleTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToggleStyleProps extends js.Object {
  /**
    * Component is checked.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Root element class name.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Component is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether label should be positioned inline with the toggle.
    */
  var inlineLabel: js.UndefOr[Boolean] = js.native
  /**
    * Whether the user did not specify a on/off text. Influencing only when inlineLabel is used.
    */
  var onOffMissing: js.UndefOr[Boolean] = js.native
  /**
    * Theme values.
    */
  var theme: ITheme = js.native
}

object IToggleStyleProps {
  @scala.inline
  def apply(theme: ITheme): IToggleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToggleStyleProps]
  }
  @scala.inline
  implicit class IToggleStylePropsOps[Self <: IToggleStyleProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInlineLabel(value: Boolean): Self = this.set("inlineLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineLabel: Self = this.set("inlineLabel", js.undefined)
    @scala.inline
    def setOnOffMissing(value: Boolean): Self = this.set("onOffMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOffMissing: Self = this.set("onOffMissing", js.undefined)
  }
  
}

