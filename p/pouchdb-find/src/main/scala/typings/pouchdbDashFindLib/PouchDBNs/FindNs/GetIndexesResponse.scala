package typings
package pouchdbDashFindLib.PouchDBNs.FindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIndexesResponse[Content /* <: js.Object */] extends js.Object {
  var indexes: js.Array[Index]
}

object GetIndexesResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](indexes: js.Array[Index]): GetIndexesResponse[Content] = {
    val __obj = js.Dynamic.literal(indexes = indexes)
  
    __obj.asInstanceOf[GetIndexesResponse[Content]]
  }
}

