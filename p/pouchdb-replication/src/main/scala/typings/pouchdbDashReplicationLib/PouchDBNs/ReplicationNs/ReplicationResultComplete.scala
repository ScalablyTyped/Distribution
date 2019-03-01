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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doc_write_failures")(doc_write_failures)
    __obj.updateDynamic("docs")(docs)
    __obj.updateDynamic("docs_read")(docs_read)
    __obj.updateDynamic("docs_written")(docs_written)
    __obj.updateDynamic("end_time")(end_time)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("last_seq")(last_seq)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("start_time")(start_time)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ReplicationResultComplete[Content]]
  }
}

