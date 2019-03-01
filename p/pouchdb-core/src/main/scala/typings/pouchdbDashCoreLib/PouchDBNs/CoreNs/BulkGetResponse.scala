package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetResponse[Content /* <: js.Object */] extends js.Object {
  var results: js.Array[pouchdbDashCoreLib.Anon_Docs[Content]]
}

object BulkGetResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](results: js.Array[pouchdbDashCoreLib.Anon_Docs[Content]]): BulkGetResponse[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[BulkGetResponse[Content]]
  }
}

