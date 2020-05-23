package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.RevString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResponseChange[Content /* <: js.Object */] extends js.Object {
  var changes: js.Array[RevString]
  var deleted: js.UndefOr[Boolean] = js.undefined
  var doc: js.UndefOr[ExistingDocument[Content with ChangesMeta]] = js.undefined
  var id: String
  var seq: Double | String
}

object ChangesResponseChange {
  @scala.inline
  def apply[Content](
    changes: js.Array[RevString],
    id: String,
    seq: Double | String,
    deleted: js.UndefOr[Boolean] = js.undefined,
    doc: ExistingDocument[Content with ChangesMeta] = null
  ): ChangesResponseChange[Content] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponseChange[Content]]
  }
}

