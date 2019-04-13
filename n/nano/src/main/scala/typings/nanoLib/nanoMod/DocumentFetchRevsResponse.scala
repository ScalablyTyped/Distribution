package typings
package nanoLib.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFetchRevsResponse extends js.Object {
  var offset: scala.Double
  var rows: js.Array[DocumentResponseRowMeta]
  var total_rows: scala.Double
  var update_seq: js.UndefOr[scala.Double] = js.undefined
}

object DocumentFetchRevsResponse {
  @scala.inline
  def apply(
    offset: scala.Double,
    rows: js.Array[DocumentResponseRowMeta],
    total_rows: scala.Double,
    update_seq: scala.Int | scala.Double = null
  ): DocumentFetchRevsResponse = {
    val __obj = js.Dynamic.literal(offset = offset, rows = rows, total_rows = total_rows)
    if (update_seq != null) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFetchRevsResponse]
  }
}

