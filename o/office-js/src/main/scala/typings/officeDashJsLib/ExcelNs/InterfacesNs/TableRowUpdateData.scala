package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TableRow object, for use in "tableRow.set({ ... })". */

trait TableRowUpdateData extends js.Object {
  /**
               *
               * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
               *
               * [Api set: ExcelApi 1.1]
               */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

