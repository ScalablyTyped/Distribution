package typings.pouchdbUpsert.anon

import typings.pouchdbCore.PouchDB.Core.DocumentId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<pouchdb-core.PouchDB.Core.IdMeta> */
@js.native
trait PartialIdMeta extends js.Object {
  var _id: js.UndefOr[DocumentId] = js.native
}

object PartialIdMeta {
  @scala.inline
  def apply(): PartialIdMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIdMeta]
  }
  @scala.inline
  implicit class PartialIdMetaOps[Self <: PartialIdMeta] (val x: Self) extends AnyVal {
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
    def set_id(value: DocumentId): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
  }
  
}

