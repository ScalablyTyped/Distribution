package typings
package pouchdbDashFindLib.PouchDBNs.FindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexResponse[Content /* <: js.Object */] extends js.Object {
  var result: java.lang.String
}

object CreateIndexResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](result: java.lang.String): CreateIndexResponse[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[CreateIndexResponse[Content]]
  }
}

