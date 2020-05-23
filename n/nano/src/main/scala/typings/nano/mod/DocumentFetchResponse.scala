package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFetchResponse[D] extends js.Object {
  var offset: Double
  var rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure]
  var total_rows: Double
  var update_seq: js.UndefOr[Double] = js.undefined
}

object DocumentFetchResponse {
  @scala.inline
  def apply[D](
    offset: Double,
    rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure],
    total_rows: Double,
    update_seq: js.UndefOr[Double] = js.undefined
  ): DocumentFetchResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    if (!js.isUndefined(update_seq)) __obj.updateDynamic("update_seq")(update_seq.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFetchResponse[D]]
  }
}

