package typings.pouchdbDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Docs[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[Anon_Ok[Content] | Anon_Error]
  var id: String
}

object Anon_Docs {
  @scala.inline
  def apply[Content /* <: js.Object */](docs: js.Array[Anon_Ok[Content] | Anon_Error], id: String): Anon_Docs[Content] = {
    val __obj = js.Dynamic.literal(docs = docs, id = id)
  
    __obj.asInstanceOf[Anon_Docs[Content]]
  }
}

