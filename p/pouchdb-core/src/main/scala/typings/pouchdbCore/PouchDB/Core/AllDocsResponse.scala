package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.AnonDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsResponse[Content /* <: js.Object */] extends js.Object {
  /** The `skip` if provided, or in CouchDB the actual offset */
  var offset: Double
  var rows: js.Array[AnonDoc[Content]]
  var total_rows: Double
  var update_seq: js.UndefOr[Double | String] = js.undefined
}

object AllDocsResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](
    offset: Double,
    rows: js.Array[AnonDoc[Content]],
    total_rows: Double,
    update_seq: Double | String = null
  ): AllDocsResponse[Content] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    if (update_seq != null) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsResponse[Content]]
  }
}

