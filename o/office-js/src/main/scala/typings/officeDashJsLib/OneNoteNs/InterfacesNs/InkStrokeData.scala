package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

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
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object InkStrokeData {
  @scala.inline
  def apply(floatingInk: FloatingInkData = null, id: java.lang.String = null): InkStrokeData = {
    val __obj = js.Dynamic.literal()
    if (floatingInk != null) __obj.updateDynamic("floatingInk")(floatingInk)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[InkStrokeData]
  }
}

