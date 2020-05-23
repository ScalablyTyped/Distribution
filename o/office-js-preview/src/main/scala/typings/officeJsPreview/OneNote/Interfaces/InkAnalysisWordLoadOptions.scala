package typings.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents ink analysis data for an identified word formed by ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait InkAnalysisWordLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the ID of the InkAnalysisWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The id of the recognized language in this inkAnalysisWord. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Reference to the parent InkAnalysisLine.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineLoadOptions] = js.undefined
  /**
    *
    * Weak references to the ink strokes that were recognized as part of this ink analysis word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var strokePointers: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[Boolean] = js.undefined
}

object InkAnalysisWordLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    languageId: js.UndefOr[Boolean] = js.undefined,
    line: InkAnalysisLineLoadOptions = null,
    strokePointers: js.UndefOr[Boolean] = js.undefined,
    wordAlternates: js.UndefOr[Boolean] = js.undefined
  ): InkAnalysisWordLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(languageId)) __obj.updateDynamic("languageId")(languageId.get.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (!js.isUndefined(strokePointers)) __obj.updateDynamic("strokePointers")(strokePointers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordAlternates)) __obj.updateDynamic("wordAlternates")(wordAlternates.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkAnalysisWordLoadOptions]
  }
}

