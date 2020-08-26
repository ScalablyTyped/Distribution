package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisParagraphCollection object, for use in "inkAnalysisParagraphCollection.set({ ... })". */
@js.native
trait InkAnalysisParagraphCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.native
}

object InkAnalysisParagraphCollectionUpdateData {
  @scala.inline
  def apply(): InkAnalysisParagraphCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionUpdateData]
  }
  @scala.inline
  implicit class InkAnalysisParagraphCollectionUpdateDataOps[Self <: InkAnalysisParagraphCollectionUpdateData] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: InkAnalysisParagraphData*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[InkAnalysisParagraphData]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

