package typings.nano.mod

import typings.nano.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
trait DocumentViewResponse[V, D] extends js.Object {
  // Offset where the document list started.
  var offset: Double
  //  Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[AnonId[V, D]]
  // Number of documents in the database/view.
  var total_rows: Double
  // Current update sequence for the database
  var update_seq: js.Any
}

object DocumentViewResponse {
  @scala.inline
  def apply[V, D](offset: Double, rows: js.Array[AnonId[V, D]], total_rows: Double, update_seq: js.Any): DocumentViewResponse[V, D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DocumentViewResponse[V, D]]
  }
}

