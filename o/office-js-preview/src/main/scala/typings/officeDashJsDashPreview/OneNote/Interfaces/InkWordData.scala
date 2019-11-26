package typings.officeDashJsDashPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkWord.toJSON()". */
trait InkWordData extends js.Object {
  /**
    *
    * Gets the ID of the InkWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * The id of the recognized language in this ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.undefined
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[js.Array[String]] = js.undefined
}

object InkWordData {
  @scala.inline
  def apply(id: String = null, languageId: String = null, wordAlternates: js.Array[String] = null): InkWordData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (languageId != null) __obj.updateDynamic("languageId")(languageId.asInstanceOf[js.Any])
    if (wordAlternates != null) __obj.updateDynamic("wordAlternates")(wordAlternates.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkWordData]
  }
}

