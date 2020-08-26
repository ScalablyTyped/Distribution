package typings.officeUiFabricReact.detailsRowBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsRowSelectionState extends js.Object {
  var isSelected: Boolean = js.native
  var isSelectionModal: Boolean = js.native
}

object IDetailsRowSelectionState {
  @scala.inline
  def apply(isSelected: Boolean, isSelectionModal: Boolean): IDetailsRowSelectionState = {
    val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], isSelectionModal = isSelectionModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowSelectionState]
  }
  @scala.inline
  implicit class IDetailsRowSelectionStateOps[Self <: IDetailsRowSelectionState] (val x: Self) extends AnyVal {
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
    def setIsSelectionModal(value: Boolean): Self = this.set("isSelectionModal", value.asInstanceOf[js.Any])
  }
  
}

