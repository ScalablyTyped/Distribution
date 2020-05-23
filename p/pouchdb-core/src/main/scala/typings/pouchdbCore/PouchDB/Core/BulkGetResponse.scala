package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.anon.Docs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkGetResponse[Content /* <: js.Object */] extends js.Object {
  var results: js.Array[Docs[Content]]
}

object BulkGetResponse {
  @scala.inline
  def apply[Content](results: js.Array[Docs[Content]]): BulkGetResponse[Content] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkGetResponse[Content]]
  }
}

