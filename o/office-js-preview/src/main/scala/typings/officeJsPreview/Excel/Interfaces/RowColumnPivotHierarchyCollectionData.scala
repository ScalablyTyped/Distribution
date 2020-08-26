package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rowColumnPivotHierarchyCollection.toJSON()`. */
@js.native
trait RowColumnPivotHierarchyCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[RowColumnPivotHierarchyData]] = js.native
}

object RowColumnPivotHierarchyCollectionData {
  @scala.inline
  def apply(): RowColumnPivotHierarchyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumnPivotHierarchyCollectionData]
  }
  @scala.inline
  implicit class RowColumnPivotHierarchyCollectionDataOps[Self <: RowColumnPivotHierarchyCollectionData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: RowColumnPivotHierarchyData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[RowColumnPivotHierarchyData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

