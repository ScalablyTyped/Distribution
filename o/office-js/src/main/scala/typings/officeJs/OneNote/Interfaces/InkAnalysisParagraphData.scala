package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisParagraph.toJSON()". */
@js.native
trait InkAnalysisParagraphData extends js.Object {
  /**
    *
    * Gets the ID of the InkAnalysisParagraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Reference to the parent InkAnalysisPage. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisData] = js.native
  /**
    *
    * Gets the ink analysis lines in this ink analysis paragraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var lines: js.UndefOr[js.Array[InkAnalysisLineData]] = js.native
}

object InkAnalysisParagraphData {
  @scala.inline
  def apply(): InkAnalysisParagraphData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphData]
  }
  @scala.inline
  implicit class InkAnalysisParagraphDataOps[Self <: InkAnalysisParagraphData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInkAnalysis(value: InkAnalysisData): Self = this.set("inkAnalysis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInkAnalysis: Self = this.set("inkAnalysis", js.undefined)
    @scala.inline
    def setLinesVarargs(value: InkAnalysisLineData*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[InkAnalysisLineData]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
  }
  
}

