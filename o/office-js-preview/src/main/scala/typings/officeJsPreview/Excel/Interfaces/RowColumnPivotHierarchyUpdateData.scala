package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the RowColumnPivotHierarchy object, for use in `rowColumnPivotHierarchy.set({ ... })`. */
@js.native
trait RowColumnPivotHierarchyUpdateData extends js.Object {
  /**
    *
    * Name of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Position of the RowColumnPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.native
}

object RowColumnPivotHierarchyUpdateData {
  @scala.inline
  def apply(): RowColumnPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumnPivotHierarchyUpdateData]
  }
  @scala.inline
  implicit class RowColumnPivotHierarchyUpdateDataOps[Self <: RowColumnPivotHierarchyUpdateData] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

