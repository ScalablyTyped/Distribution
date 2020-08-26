package typings.officeUiFabricReact.checkboxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckbox extends js.Object {
  /** Gets the current checked state. */
  var checked: Boolean = js.native
  /** Gets the current indeterminate state. */
  var indeterminate: Boolean = js.native
  /** Sets focus to the checkbox. */
  def focus(): Unit = js.native
}

object ICheckbox {
  @scala.inline
  def apply(checked: Boolean, focus: () => Unit, indeterminate: Boolean): ICheckbox = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), indeterminate = indeterminate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckbox]
  }
  @scala.inline
  implicit class ICheckboxOps[Self <: ICheckbox] (val x: Self) extends AnyVal {
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
  }
  
}

