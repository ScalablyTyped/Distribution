package typings.officeUiFabricReact.dropdownTypesMod

import typings.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownOption extends ISelectableOption {
  /**
    * Deprecated at v.65.1, use `selected` instead.
    * @deprecated Use `selected` instead.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
}

object IDropdownOption {
  @scala.inline
  def apply(key: String | Double, text: String): IDropdownOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownOption]
  }
  @scala.inline
  implicit class IDropdownOptionOps[Self <: IDropdownOption] (val x: Self) extends AnyVal {
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
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
  }
  
}

