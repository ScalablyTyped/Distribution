package typings.pouchdbReplication.PouchDB.Replication

import typings.pouchdbCore.PouchDB.Core.ExistingDocument
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
  def apply[/* <: js.Object */ Content](
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
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationResultComplete[Content]]
  }
}

