package typings.pouchdbDashFind.PouchDBNs.FindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexResponse[Content /* <: js.Object */] extends js.Object {
  var result: String
}

object CreateIndexResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](result: String): CreateIndexResponse[Content] = {
    val __obj = js.Dynamic.literal(result = result)
  
    __obj.asInstanceOf[CreateIndexResponse[Content]]
  }
}

