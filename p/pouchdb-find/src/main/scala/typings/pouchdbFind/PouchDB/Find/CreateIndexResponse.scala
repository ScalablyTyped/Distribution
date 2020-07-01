package typings.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIndexResponse[Content /* <: js.Object */] extends js.Object {
  var result: String
}

object CreateIndexResponse {
  @scala.inline
  def apply[/* <: js.Object */ Content](result: String): CreateIndexResponse[Content] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexResponse[Content]]
  }
}

