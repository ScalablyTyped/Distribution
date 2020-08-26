package typings.pouchdbUpsert.PouchDB

import typings.pouchdbCore.PouchDB.Core.DocumentId
import typings.pouchdbCore.PouchDB.Core.RevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpsertResponse extends js.Object {
  var id: DocumentId = js.native
  var rev: RevisionId = js.native
  var updated: Boolean = js.native
}

object UpsertResponse {
  @scala.inline
  def apply(id: DocumentId, rev: RevisionId, updated: Boolean): UpsertResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertResponse]
  }
  @scala.inline
  implicit class UpsertResponseOps[Self <: UpsertResponse] (val x: Self) extends AnyVal {
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
    def setRev(value: RevisionId): Self = this.set("rev", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: Boolean): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}

