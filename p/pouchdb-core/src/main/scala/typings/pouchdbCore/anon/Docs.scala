package typings.pouchdbCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Docs[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[Ok[Content] | Error]
  var id: String
}

object Docs {
  @scala.inline
  def apply[Content](docs: js.Array[Ok[Content] | Error], id: String): Docs[Content] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Docs[Content]]
  }
}

