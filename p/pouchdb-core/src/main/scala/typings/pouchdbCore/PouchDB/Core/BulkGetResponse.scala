package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.AnonDocs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetResponse[Content /* <: js.Object */] extends js.Object {
  var results: js.Array[AnonDocs[Content]]
}

object BulkGetResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](results: js.Array[AnonDocs[Content]]): BulkGetResponse[Content] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BulkGetResponse[Content]]
  }
}

