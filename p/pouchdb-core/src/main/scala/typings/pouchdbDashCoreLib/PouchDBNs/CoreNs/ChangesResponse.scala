package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResponse[Content /* <: js.Object */] extends js.Object {
  var last_seq: scala.Double | java.lang.String
  var results: js.Array[ChangesResponseChange[Content]]
  var status: java.lang.String
}

object ChangesResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](
    last_seq: scala.Double | java.lang.String,
    results: js.Array[ChangesResponseChange[Content]],
    status: java.lang.String
  ): ChangesResponse[Content] = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], results = results, status = status)
  
    __obj.asInstanceOf[ChangesResponse[Content]]
  }
}

