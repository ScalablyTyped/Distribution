package typings.pouchdbDashReplication.PouchDBNs.ReplicationNs

import typings.pouchdbDashCore.PouchDBNs.CoreNs.ExistingDocument
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationResultComplete[Content /* <: js.Object */] extends ReplicationResult[Content] {
  var end_time: Date
  var status: String
}

object ReplicationResultComplete {
  @scala.inline
  def apply[Content /* <: js.Object */](
    doc_write_failures: Double,
    docs: js.Array[ExistingDocument[Content]],
    docs_read: Double,
    docs_written: Double,
    end_time: Date,
    errors: js.Array[_],
    last_seq: Double,
    ok: Boolean,
    start_time: Date,
    status: String
  ): ReplicationResultComplete[Content] = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures, docs = docs, docs_read = docs_read, docs_written = docs_written, end_time = end_time, errors = errors, last_seq = last_seq, ok = ok, start_time = start_time, status = status)
  
    __obj.asInstanceOf[ReplicationResultComplete[Content]]
  }
}

