package typings.pouchdbCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocs[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[AnonOk[Content] | AnonError]
  var id: String
}

object AnonDocs {
  @scala.inline
  def apply[Content /* <: js.Object */](docs: js.Array[AnonOk[Content] | AnonError], id: String): AnonDocs[Content] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDocs[Content]]
  }
}

