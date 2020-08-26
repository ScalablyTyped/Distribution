package typings.pouchdbFind.PouchDB.Find

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResponse[Content /* <: js.Object */] extends js.Object {
  var docs: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
  ] = js.native
  var warning: js.UndefOr[String] = js.native
}

object FindResponse {
  @scala.inline
  def apply[/* <: js.Object */ Content](
    docs: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
    ]
  ): FindResponse[Content] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResponse[Content]]
  }
  @scala.inline
  implicit class FindResponseOps[Self <: FindResponse[_], /* <: js.Object */ Content] (val x: Self with FindResponse[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocsVarargs(value: js.Any*): Self = this.set("docs", js.Array(value :_*))
    @scala.inline
    def setDocs(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Core.ExistingDocument<Content> */ _
        ]
    ): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

