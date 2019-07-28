package typings.officeDashJsDashPreview.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "richText.toJSON()". */
trait RichTextData extends js.Object {
  /**
    *
    * Gets the ID of the RichText object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * The language id of the text. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the text content of the RichText object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
}

object RichTextData {
  @scala.inline
  def apply(id: String = null, languageId: String = null, text: String = null): RichTextData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (languageId != null) __obj.updateDynamic("languageId")(languageId)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RichTextData]
  }
}

