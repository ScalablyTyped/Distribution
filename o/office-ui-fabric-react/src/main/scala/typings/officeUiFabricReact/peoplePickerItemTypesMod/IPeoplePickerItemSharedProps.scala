package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemSharedProps extends js.Object {
  /** Additional CSS class(es) to apply to the PeoplePickerItem root element. */
  var className: js.UndefOr[String] = js.native
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.native
}

object IPeoplePickerItemSharedProps {
  @scala.inline
  def apply(): IPeoplePickerItemSharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeoplePickerItemSharedProps]
  }
  @scala.inline
  implicit class IPeoplePickerItemSharedPropsOps[Self <: IPeoplePickerItemSharedProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

