package typings.pouchdbDashFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindResponse[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
  ]
}

object FindResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](
    docs: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
    ]
  ): FindResponse[Content] = {
    val __obj = js.Dynamic.literal(docs = docs)
  
    __obj.asInstanceOf[FindResponse[Content]]
  }
}

