package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationResultComplete[Content /* <: js.Object */] extends ReplicationResult[Content] {
  var end_time: stdLib.Date
  var status: java.lang.String
}

object ReplicationResultComplete {
  @scala.inline
  def apply[Content /* <: js.Object */](
    doc_write_failures: scala.Double,
    docs: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content]],
    docs_read: scala.Double,
    docs_written: scala.Double,
    end_time: stdLib.Date,
    errors: js.Array[_],
    last_seq: scala.Double,
    ok: scala.Boolean,
    start_time: stdLib.Date,
    status: java.lang.String
  ): ReplicationResultComplete[Content] = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures, docs = docs, docs_read = docs_read, docs_written = docs_written, end_time = end_time, errors = errors, last_seq = last_seq, ok = ok, start_time = start_time, status = status)
  
    __obj.asInstanceOf[ReplicationResultComplete[Content]]
  }
}

