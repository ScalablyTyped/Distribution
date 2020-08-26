package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Created extends js.Object {
  var created: js.Array[String] = js.native
  var deleted: js.Array[String] = js.native
  var updated: js.Array[String] = js.native
}

object Created {
  @scala.inline
  def apply(created: js.Array[String], deleted: js.Array[String], updated: js.Array[String]): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  @scala.inline
  implicit class CreatedOps[Self <: Created] (val x: Self) extends AnyVal {
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
    def setCreatedVarargs(value: String*): Self = this.set("created", js.Array(value :_*))
    @scala.inline
    def setCreated(value: js.Array[String]): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedVarargs(value: String*): Self = this.set("deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[String]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedVarargs(value: String*): Self = this.set("updated", js.Array(value :_*))
    @scala.inline
    def setUpdated(value: js.Array[String]): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}

