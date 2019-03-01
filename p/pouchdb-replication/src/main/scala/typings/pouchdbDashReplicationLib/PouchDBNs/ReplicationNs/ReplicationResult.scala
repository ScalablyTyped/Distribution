package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationResult[Content /* <: js.Object */] extends js.Object {
  var doc_write_failures: scala.Double
  var docs: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content]]
  var docs_read: scala.Double
  var docs_written: scala.Double
  var errors: js.Array[_]
  var last_seq: scala.Double
  var ok: scala.Boolean
  var start_time: stdLib.Date
}

object ReplicationResult {
  @scala.inline
  def apply[Content /* <: js.Object */](
    doc_write_failures: scala.Double,
    docs: js.Array[pouchdbDashCoreLib.PouchDBNs.CoreNs.ExistingDocument[Content]],
    docs_read: scala.Double,
    docs_written: scala.Double,
    errors: js.Array[_],
    last_seq: scala.Double,
    ok: scala.Boolean,
    start_time: stdLib.Date
  ): ReplicationResult[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doc_write_failures")(doc_write_failures)
    __obj.updateDynamic("docs")(docs)
    __obj.updateDynamic("docs_read")(docs_read)
    __obj.updateDynamic("docs_written")(docs_written)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("last_seq")(last_seq)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("start_time")(start_time)
    __obj.asInstanceOf[ReplicationResult[Content]]
  }
}

