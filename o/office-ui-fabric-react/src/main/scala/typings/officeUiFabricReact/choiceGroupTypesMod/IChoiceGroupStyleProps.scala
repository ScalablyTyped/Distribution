package typings.officeUiFabricReact.choiceGroupTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var optionsContainIconOrImage: js.UndefOr[Boolean] = js.native
  var theme: ITheme = js.native
}

object IChoiceGroupStyleProps {
  @scala.inline
  def apply(theme: ITheme): IChoiceGroupStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupStyleProps]
  }
  @scala.inline
  implicit class IChoiceGroupStylePropsOps[Self <: IChoiceGroupStyleProps] (val x: Self) extends AnyVal {
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
    def setOptionsContainIconOrImage(value: Boolean): Self = this.set("optionsContainIconOrImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionsContainIconOrImage: Self = this.set("optionsContainIconOrImage", js.undefined)
  }
  
}

