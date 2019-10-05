package typings.officeDashJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "floatingInk.toJSON()". */
trait FloatingInkData extends js.Object {
  /**
    *
    * Gets the ID of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the strokes of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}

object FloatingInkData {
  @scala.inline
  def apply(id: String = null, inkStrokes: js.Array[InkStrokeData] = null): FloatingInkData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (inkStrokes != null) __obj.updateDynamic("inkStrokes")(inkStrokes)
    __obj.asInstanceOf[FloatingInkData]
  }
}

