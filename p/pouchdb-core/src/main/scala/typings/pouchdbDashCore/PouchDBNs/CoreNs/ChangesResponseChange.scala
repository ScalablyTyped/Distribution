package typings.pouchdbDashCore.PouchDBNs.CoreNs

import typings.pouchdbDashCore.Anon_Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResponseChange[Content /* <: js.Object */] extends js.Object {
  var changes: js.Array[Anon_Rev]
  var deleted: js.UndefOr[Boolean] = js.undefined
  var doc: js.UndefOr[ExistingDocument[Content with ChangesMeta]] = js.undefined
  var id: String
  var seq: Double | String
}

object ChangesResponseChange {
  @scala.inline
  def apply[Content /* <: js.Object */](
    changes: js.Array[Anon_Rev],
    id: String,
    seq: Double | String,
    deleted: js.UndefOr[Boolean] = js.undefined,
    doc: ExistingDocument[Content with ChangesMeta] = null
  ): ChangesResponseChange[Content] = {
    val __obj = js.Dynamic.literal(changes = changes, id = id, seq = seq.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponseChange[Content]]
  }
}

