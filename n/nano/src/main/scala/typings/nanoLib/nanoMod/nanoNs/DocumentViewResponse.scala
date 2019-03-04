package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
trait DocumentViewResponse[V, D] extends js.Object {
  // Offset where the document list started.
  var offset: scala.Double
  //  Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[nanoLib.Anon_DocId[V, D]]
  // Number of documents in the database/view.
  var total_rows: scala.Double
  // Current update sequence for the database
  var update_seq: js.Any
}

object DocumentViewResponse {
  @scala.inline
  def apply[V, D](
    offset: scala.Double,
    rows: js.Array[nanoLib.Anon_DocId[V, D]],
    total_rows: scala.Double,
    update_seq: js.Any
  ): DocumentViewResponse[V, D] = {
    val __obj = js.Dynamic.literal(offset = offset, rows = rows, total_rows = total_rows, update_seq = update_seq)
  
    __obj.asInstanceOf[DocumentViewResponse[V, D]]
  }
}

