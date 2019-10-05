package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisLine.toJSON()". */
trait InkAnalysisLineData extends js.Object {
  /**
    *
    * Gets the ID of the InkAnalysisLine object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Reference to the parent InkAnalysisParagraph. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphData] = js.undefined
  /**
    *
    * Gets the ink analysis words in this ink analysis line. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var words: js.UndefOr[js.Array[InkAnalysisWordData]] = js.undefined
}

object InkAnalysisLineData {
  @scala.inline
  def apply(
    id: String = null,
    paragraph: InkAnalysisParagraphData = null,
    words: js.Array[InkAnalysisWordData] = null
  ): InkAnalysisLineData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (paragraph != null) __obj.updateDynamic("paragraph")(paragraph)
    if (words != null) __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[InkAnalysisLineData]
  }
}

