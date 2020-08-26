package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionIdMeta extends js.Object {
  var _rev: RevisionId = js.native
}

object RevisionIdMeta {
  @scala.inline
  def apply(_rev: RevisionId): RevisionIdMeta = {
    val __obj = js.Dynamic.literal(_rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionIdMeta]
  }
  @scala.inline
  implicit class RevisionIdMetaOps[Self <: RevisionIdMeta] (val x: Self) extends AnyVal {
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
    def set_rev(value: RevisionId): Self = this.set("_rev", value.asInstanceOf[js.Any])
  }
  
}

