package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableCellCollection object, for use in "tableCellCollection.set({ ... })". */
@js.native
trait TableCellCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableCellData]] = js.native
}

object TableCellCollectionUpdateData {
  @scala.inline
  def apply(): TableCellCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellCollectionUpdateData]
  }
  @scala.inline
  implicit class TableCellCollectionUpdateDataOps[Self <: TableCellCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: TableCellData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[TableCellData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

