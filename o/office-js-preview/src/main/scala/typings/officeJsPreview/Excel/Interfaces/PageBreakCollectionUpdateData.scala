package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the PageBreakCollection object, for use in `pageBreakCollection.set({ ... })`. */
@js.native
trait PageBreakCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[PageBreakData]] = js.native
}

object PageBreakCollectionUpdateData {
  @scala.inline
  def apply(): PageBreakCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageBreakCollectionUpdateData]
  }
  @scala.inline
  implicit class PageBreakCollectionUpdateDataOps[Self <: PageBreakCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: PageBreakData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[PageBreakData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

