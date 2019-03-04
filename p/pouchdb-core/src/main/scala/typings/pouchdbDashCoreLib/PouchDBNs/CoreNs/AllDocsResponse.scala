package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsResponse[Content /* <: js.Object */] extends js.Object {
  /** The `skip` if provided, or in CouchDB the actual offset */
  var offset: scala.Double
  var rows: js.Array[pouchdbDashCoreLib.Anon_Doc[Content]]
  var total_rows: scala.Double
}

object AllDocsResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](
    offset: scala.Double,
    rows: js.Array[pouchdbDashCoreLib.Anon_Doc[Content]],
    total_rows: scala.Double
  ): AllDocsResponse[Content] = {
    val __obj = js.Dynamic.literal(offset = offset, rows = rows, total_rows = total_rows)
  
    __obj.asInstanceOf[AllDocsResponse[Content]]
  }
}

