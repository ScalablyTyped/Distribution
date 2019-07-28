package typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisParagraph object, for use in "inkAnalysisParagraph.set({ ... })". */
trait InkAnalysisParagraphUpdateData extends js.Object {
  /**
    *
    * Reference to the parent InkAnalysisPage.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisUpdateData] = js.undefined
}

object InkAnalysisParagraphUpdateData {
  @scala.inline
  def apply(inkAnalysis: InkAnalysisUpdateData = null): InkAnalysisParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    if (inkAnalysis != null) __obj.updateDynamic("inkAnalysis")(inkAnalysis)
    __obj.asInstanceOf[InkAnalysisParagraphUpdateData]
  }
}

