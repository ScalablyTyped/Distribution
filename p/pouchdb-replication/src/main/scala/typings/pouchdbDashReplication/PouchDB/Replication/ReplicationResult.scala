package typings.pouchdbDashReplication.PouchDB.Replication

import typings.pouchdbDashCore.PouchDB.Core.ExistingDocument
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationResult[Content /* <: js.Object */] extends js.Object {
  var doc_write_failures: Double
  var docs: js.Array[ExistingDocument[Content]]
  var docs_read: Double
  var docs_written: Double
  var errors: js.Array[_]
  var last_seq: Double
  var ok: Boolean
  var start_time: Date
}

object ReplicationResult {
  @scala.inline
  def apply[Content /* <: js.Object */](
    doc_write_failures: Double,
    docs: js.Array[ExistingDocument[Content]],
    docs_read: Double,
    docs_written: Double,
    errors: js.Array[_],
    last_seq: Double,
    ok: Boolean,
    start_time: Date
  ): ReplicationResult[Content] = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures, docs = docs, docs_read = docs_read, docs_written = docs_written, errors = errors, last_seq = last_seq, ok = ok, start_time = start_time)
  
    __obj.asInstanceOf[ReplicationResult[Content]]
  }
}

