package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesMeta extends js.Object {
  var _attachments: js.UndefOr[Attachments] = js.native
  var _conflicts: js.UndefOr[js.Array[RevisionId]] = js.native
  var _deleted: js.UndefOr[Boolean] = js.native
}

object ChangesMeta {
  @scala.inline
  def apply(): ChangesMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangesMeta]
  }
  @scala.inline
  implicit class ChangesMetaOps[Self <: ChangesMeta] (val x: Self) extends AnyVal {
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
    def set_attachments(value: Attachments): Self = this.set("_attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_attachments: Self = this.set("_attachments", js.undefined)
    @scala.inline
    def set_conflictsVarargs(value: RevisionId*): Self = this.set("_conflicts", js.Array(value :_*))
    @scala.inline
    def set_conflicts(value: js.Array[RevisionId]): Self = this.set("_conflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_conflicts: Self = this.set("_conflicts", js.undefined)
    @scala.inline
    def set_deleted(value: Boolean): Self = this.set("_deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_deleted: Self = this.set("_deleted", js.undefined)
  }
  
}

