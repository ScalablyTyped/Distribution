package typings.officeUiFabricReact.selectionZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionZoneState extends js.Object {
  var isModal: js.UndefOr[Boolean] = js.native
}

object ISelectionZoneState {
  @scala.inline
  def apply(): ISelectionZoneState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectionZoneState]
  }
  @scala.inline
  implicit class ISelectionZoneStateOps[Self <: ISelectionZoneState] (val x: Self) extends AnyVal {
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
    def setIsModal(value: Boolean): Self = this.set("isModal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModal: Self = this.set("isModal", js.undefined)
  }
  
}

