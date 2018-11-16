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

