package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Docs[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[Anon_Ok[Content] | Anon_Error]
  var id: java.lang.String
}

object Anon_Docs {
  @scala.inline
  def apply[Content /* <: js.Object */](docs: js.Array[Anon_Ok[Content] | Anon_Error], id: java.lang.String): Anon_Docs[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("docs")(docs)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Docs[Content]]
  }
}

