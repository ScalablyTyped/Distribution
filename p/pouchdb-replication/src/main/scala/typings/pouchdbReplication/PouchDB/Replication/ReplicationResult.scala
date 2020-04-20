package typings.pouchdbReplication.PouchDB.Replication

import typings.pouchdbCore.PouchDB.Core.ExistingDocument
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
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationResult[Content]]
  }
}

