package typings.pouchdbDashCore.PouchDB.Core

import typings.pouchdbDashCore.Anon_Docs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetResponse[Content /* <: js.Object */] extends js.Object {
  var results: js.Array[Anon_Docs[Content]]
}

object BulkGetResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](results: js.Array[Anon_Docs[Content]]): BulkGetResponse[Content] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BulkGetResponse[Content]]
  }
}

