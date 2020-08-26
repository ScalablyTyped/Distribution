package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.AllDocsMeta
import typings.pouchdbCore.PouchDB.Core.DocumentId
import typings.pouchdbCore.PouchDB.Core.DocumentKey
import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Doc[Content /* <: js.Object */] extends js.Object {
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.native
  var id: DocumentId = js.native
  var key: DocumentKey = js.native
  var value: Deleted = js.native
}

object Doc {
  @scala.inline
  def apply[/* <: js.Object */ Content](id: DocumentId, key: DocumentKey, value: Deleted): Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc[Content]]
  }
  @scala.inline
  implicit class DocOps[Self <: Doc[_], /* <: js.Object */ Content] (val x: Self with Doc[Content]) extends AnyVal {
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
    def setId(value: DocumentId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: DocumentKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Deleted): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoc(value: ExistingDocument[Content with AllDocsMeta]): Self = this.set("doc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
  }
  
}

