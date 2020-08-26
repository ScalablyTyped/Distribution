package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataPivotHierarchyCollection object, for use in `dataPivotHierarchyCollection.set({ ... })`. */
@js.native
trait DataPivotHierarchyCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[DataPivotHierarchyData]] = js.native
}

object DataPivotHierarchyCollectionUpdateData {
  @scala.inline
  def apply(): DataPivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPivotHierarchyCollectionUpdateData]
  }
  @scala.inline
  implicit class DataPivotHierarchyCollectionUpdateDataOps[Self <: DataPivotHierarchyCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: DataPivotHierarchyData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[DataPivotHierarchyData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

