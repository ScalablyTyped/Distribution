package typings.officeUiFabricReact.extendedSelectedItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemState extends js.Object {
  var contextualMenuVisible: Boolean = js.native
}

object IPeoplePickerItemState {
  @scala.inline
  def apply(contextualMenuVisible: Boolean): IPeoplePickerItemState = {
    val __obj = js.Dynamic.literal(contextualMenuVisible = contextualMenuVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemState]
  }
  @scala.inline
  implicit class IPeoplePickerItemStateOps[Self <: IPeoplePickerItemState] (val x: Self) extends AnyVal {
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
    def setContextualMenuVisible(value: Boolean): Self = this.set("contextualMenuVisible", value.asInstanceOf[js.Any])
  }
  
}

