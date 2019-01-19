package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

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
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the strokes of the FloatingInk object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkStrokes: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}

