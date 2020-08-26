package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdMeta extends js.Object {
  var _id: DocumentId = js.native
}

object IdMeta {
  @scala.inline
  def apply(_id: DocumentId): IdMeta = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdMeta]
  }
  @scala.inline
  implicit class IdMetaOps[Self <: IdMeta] (val x: Self) extends AnyVal {
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
  }
  
}

