package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisLine object, for use in "inkAnalysisLine.set({ ... })". */
trait InkAnalysisLineUpdateData extends js.Object {
  /**
    *
    * Reference to the parent InkAnalysisParagraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphUpdateData] = js.undefined
}

object InkAnalysisLineUpdateData {
  @scala.inline
  def apply(paragraph: InkAnalysisParagraphUpdateData = null): InkAnalysisLineUpdateData = {
    val __obj = js.Dynamic.literal()
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkAnalysisLineUpdateData]
  }
}

