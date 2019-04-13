package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFetchResponse[D] extends js.Object {
  var offset: scala.Double
  var rows: js.Array[DocumentResponseRow[D]]
  var total_rows: scala.Double
  var update_seq: js.UndefOr[scala.Double] = js.undefined
}

object DocumentFetchResponse {
  @scala.inline
  def apply[D](
    offset: scala.Double,
    rows: js.Array[DocumentResponseRow[D]],
    total_rows: scala.Double,
    update_seq: scala.Int | scala.Double = null
  ): DocumentFetchResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset, rows = rows, total_rows = total_rows)
    if (update_seq != null) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFetchResponse[D]]
  }
}

