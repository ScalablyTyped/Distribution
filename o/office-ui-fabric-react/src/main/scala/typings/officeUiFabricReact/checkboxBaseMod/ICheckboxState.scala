package typings.officeUiFabricReact.checkboxBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxState extends js.Object {
  /** Is true when Uncontrolled control is checked. */
  var isChecked: js.UndefOr[Boolean] = js.native
  var isIndeterminate: js.UndefOr[Boolean] = js.native
}

object ICheckboxState {
  @scala.inline
  def apply(): ICheckboxState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxState]
  }
  @scala.inline
  implicit class ICheckboxStateOps[Self <: ICheckboxState] (val x: Self) extends AnyVal {
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
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setIsIndeterminate(value: Boolean): Self = this.set("isIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIndeterminate: Self = this.set("isIndeterminate", js.undefined)
  }
  
}

