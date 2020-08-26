package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uid extends js.Object {
  var id: js.Any = js.native
  var uid: js.Any = js.native
}

object Uid {
  @scala.inline
  def apply(id: js.Any, uid: js.Any): Uid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uid]
  }
  @scala.inline
  implicit class UidOps[Self <: Uid] (val x: Self) extends AnyVal {
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
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: js.Any): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

