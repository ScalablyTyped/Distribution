package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableStyleCollection object, for use in `tableStyleCollection.set({ ... })`. */
@js.native
trait TableStyleCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TableStyleData]] = js.native
}

object TableStyleCollectionUpdateData {
  @scala.inline
  def apply(): TableStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleCollectionUpdateData]
  }
  @scala.inline
  implicit class TableStyleCollectionUpdateDataOps[Self <: TableStyleCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: TableStyleData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[TableStyleData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

