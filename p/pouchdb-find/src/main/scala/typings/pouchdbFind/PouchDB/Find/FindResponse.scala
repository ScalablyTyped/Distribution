package typings.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindResponse[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
  ]
  var warning: js.UndefOr[String] = js.undefined
}

object FindResponse {
  @scala.inline
  def apply[Content /* <: js.Object */](
    docs: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
    ],
    warning: String = null
  ): FindResponse[Content] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResponse[Content]]
  }
}

