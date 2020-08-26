package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisParagraphCollection.toJSON()". */
@js.native
trait InkAnalysisParagraphCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.native
}

object InkAnalysisParagraphCollectionData {
  @scala.inline
  def apply(): InkAnalysisParagraphCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionData]
  }
  @scala.inline
  implicit class InkAnalysisParagraphCollectionDataOps[Self <: InkAnalysisParagraphCollectionData] (val x: Self) extends AnyVal {
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

