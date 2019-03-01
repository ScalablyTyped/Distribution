package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "outline.toJSON()". */
trait OutlineData extends js.Object {
  /**
    *
    * Gets the ID of the Outline object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the collection of Paragraph objects in the Outline. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}

object OutlineData {
  @scala.inline
  def apply(id: java.lang.String = null, paragraphs: js.Array[ParagraphData] = null): OutlineData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    __obj.asInstanceOf[OutlineData]
  }
}

