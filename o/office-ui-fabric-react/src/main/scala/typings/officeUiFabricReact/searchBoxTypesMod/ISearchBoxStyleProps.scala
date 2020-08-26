package typings.officeUiFabricReact.searchBoxTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchBoxStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disableAnimation: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var hasFocus: js.UndefOr[Boolean] = js.native
  var hasInput: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
  var underlined: js.UndefOr[Boolean] = js.native
}

object ISearchBoxStyleProps {
  @scala.inline
  def apply(theme: ITheme): ISearchBoxStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchBoxStyleProps]
  }
  @scala.inline
  implicit class ISearchBoxStylePropsOps[Self <: ISearchBoxStyleProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHasFocus(value: Boolean): Self = this.set("hasFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasFocus: Self = this.set("hasFocus", js.undefined)
    @scala.inline
    def setHasInput(value: Boolean): Self = this.set("hasInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasInput: Self = this.set("hasInput", js.undefined)
    @scala.inline
    def setUnderlined(value: Boolean): Self = this.set("underlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlined: Self = this.set("underlined", js.undefined)
  }
  
}

