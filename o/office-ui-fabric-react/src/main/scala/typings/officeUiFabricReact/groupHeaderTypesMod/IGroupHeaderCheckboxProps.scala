package typings.officeUiFabricReact.groupHeaderTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupHeaderCheckboxProps extends js.Object {
  var checked: Boolean = js.native
  var theme: js.UndefOr[ITheme] = js.native
}

object IGroupHeaderCheckboxProps {
  @scala.inline
  def apply(checked: Boolean): IGroupHeaderCheckboxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupHeaderCheckboxProps]
  }
  @scala.inline
  implicit class IGroupHeaderCheckboxPropsOps[Self <: IGroupHeaderCheckboxProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

