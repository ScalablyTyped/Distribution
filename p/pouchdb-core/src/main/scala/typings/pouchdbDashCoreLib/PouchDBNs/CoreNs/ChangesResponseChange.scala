package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResponseChange[Content /* <: js.Object */] extends js.Object {
  var changes: js.Array[pouchdbDashCoreLib.Anon_Rev]
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var doc: js.UndefOr[ExistingDocument[Content with ChangesMeta]] = js.undefined
  var id: java.lang.String
  var seq: scala.Double | java.lang.String
}

object ChangesResponseChange {
  @scala.inline
  def apply[Content /* <: js.Object */](
    changes: js.Array[pouchdbDashCoreLib.Anon_Rev],
    id: java.lang.String,
    seq: scala.Double | java.lang.String,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    doc: ExistingDocument[Content with ChangesMeta] = null
  ): ChangesResponseChange[Content] = {
    val __obj = js.Dynamic.literal(changes = changes, id = id, seq = seq.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponseChange[Content]]
  }
}

