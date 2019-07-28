package typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs

import typings.officeDashJsDashPreview.OneNoteNs.InkStrokePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkAnalysisWord.toJSON()". */
trait InkAnalysisWordData extends js.Object {
  /**
    *
    * Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.undefined
  /**
    *
    * Reference to the parent InkAnalysisLine. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineData] = js.undefined
  /**
    *
    * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[js.Array[InkStrokePointer]] = js.undefined
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[js.Array[String]] = js.undefined
}

object InkAnalysisWordData {
  @scala.inline
  def apply(
    id: String = null,
    languageId: String = null,
    line: InkAnalysisLineData = null,
    strokePointers: js.Array[InkStrokePointer] = null,
    wordAlternates: js.Array[String] = null
  ): InkAnalysisWordData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (languageId != null) __obj.updateDynamic("languageId")(languageId)
    if (line != null) __obj.updateDynamic("line")(line)
    if (strokePointers != null) __obj.updateDynamic("strokePointers")(strokePointers)
    if (wordAlternates != null) __obj.updateDynamic("wordAlternates")(wordAlternates)
    __obj.asInstanceOf[InkAnalysisWordData]
  }
}

