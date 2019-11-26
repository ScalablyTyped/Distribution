package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkStroke.toJSON()". */
trait InkStrokeData extends js.Object {
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var floatingInk: js.UndefOr[FloatingInkData] = js.undefined
  /**
    *
    * Gets the ID of the InkStroke object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
}

object InkStrokeData {
  @scala.inline
  def apply(floatingInk: FloatingInkData = null, id: String = null): InkStrokeData = {
    val __obj = js.Dynamic.literal()
    if (floatingInk != null) __obj.updateDynamic("floatingInk")(floatingInk.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokeData]
  }
}

