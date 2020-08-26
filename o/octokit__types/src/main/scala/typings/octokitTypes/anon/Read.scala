package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Read extends js.Object {
  var admin: Boolean = js.native
  var read: Boolean = js.native
  var write: Boolean = js.native
}

object Read {
  @scala.inline
  def apply(admin: Boolean, read: Boolean, write: Boolean): Read = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Read]
  }
  @scala.inline
  implicit class ReadOps[Self <: Read] (val x: Self) extends AnyVal {
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
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
  }
  
}

