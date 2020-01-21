package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisParagraph.toJSON()". */
trait InkAnalysisParagraphData extends js.Object {
  /**
    *
    * Gets the ID of the InkAnalysisParagraph object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Reference to the parent InkAnalysisPage. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisData] = js.undefined
  /**
    *
    * Gets the ink analysis lines in this ink analysis paragraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var lines: js.UndefOr[js.Array[InkAnalysisLineData]] = js.undefined
}

object InkAnalysisParagraphData {
  @scala.inline
  def apply(
    id: String = null,
    inkAnalysis: InkAnalysisData = null,
    lines: js.Array[InkAnalysisLineData] = null
  ): InkAnalysisParagraphData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inkAnalysis != null) __obj.updateDynamic("inkAnalysis")(inkAnalysis.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkAnalysisParagraphData]
  }
}

