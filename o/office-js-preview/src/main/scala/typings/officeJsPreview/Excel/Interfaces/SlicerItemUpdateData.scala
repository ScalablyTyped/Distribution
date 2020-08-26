package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SlicerItem object, for use in `slicerItem.set({ ... })`. */
@js.native
trait SlicerItemUpdateData extends js.Object {
  /**
    *
    * True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isSelected: js.UndefOr[Boolean] = js.native
}

object SlicerItemUpdateData {
  @scala.inline
  def apply(): SlicerItemUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemUpdateData]
  }
  @scala.inline
  implicit class SlicerItemUpdateDataOps[Self <: SlicerItemUpdateData] (val x: Self) extends AnyVal {
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

