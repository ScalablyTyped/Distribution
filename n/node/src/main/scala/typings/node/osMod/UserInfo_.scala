package typings.node.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInfo_[T] extends js.Object {
  var gid: Double = js.native
  var homedir: T = js.native
  var shell: T = js.native
  var uid: Double = js.native
  var username: T = js.native
}

object UserInfo_ {
  @scala.inline
  def apply[T](gid: Double, homedir: T, shell: T, uid: Double, username: T): UserInfo_[T] = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], homedir = homedir.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo_[T]]
  }
  @scala.inline
  implicit class UserInfo_Ops[Self <: UserInfo_[_], T] (val x: Self with UserInfo_[T]) extends AnyVal {
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
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setHomedir(value: T): Self = this.set("homedir", value.asInstanceOf[js.Any])
    @scala.inline
    def setShell(value: T): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: T): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

