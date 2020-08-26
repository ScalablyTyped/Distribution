package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisLine object, for use in "inkAnalysisLine.set({ ... })". */
@js.native
trait InkAnalysisLineUpdateData extends js.Object {
  /**
    *
    * Reference to the parent InkAnalysisParagraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphUpdateData] = js.native
}

object InkAnalysisLineUpdateData {
  @scala.inline
  def apply(): InkAnalysisLineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineUpdateData]
  }
  @scala.inline
  implicit class InkAnalysisLineUpdateDataOps[Self <: InkAnalysisLineUpdateData] (val x: Self) extends AnyVal {
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
    def setParagraph(value: InkAnalysisParagraphUpdateData): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
  }
  
}

