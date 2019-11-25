package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
trait DocumentListResponse[D] extends js.Object {
  // Offset where the document list started.
  var offset: Double
  // Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[DocumentResponseRow[D]]
  // Number of documents in the database/view. Note that this is not the number of rows returned in the actual
  // query.
  var total_rows: Double
  // Current update sequence for the database.
  var update_seq: js.UndefOr[Double] = js.undefined
}

object DocumentListResponse {
  @scala.inline
  def apply[D](
    offset: Double,
    rows: js.Array[DocumentResponseRow[D]],
    total_rows: Double,
    update_seq: Int | Double = null
  ): DocumentListResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    if (update_seq != null) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentListResponse[D]]
  }
}

