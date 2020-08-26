package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketConstructorOpts extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var fd: js.UndefOr[Double] = js.native
  var readable: js.UndefOr[Boolean] = js.native
  var writable: js.UndefOr[Boolean] = js.native
}

object SocketConstructorOpts {
  @scala.inline
  def apply(): SocketConstructorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketConstructorOpts]
  }
  @scala.inline
  implicit class SocketConstructorOptsOps[Self <: SocketConstructorOpts] (val x: Self) extends AnyVal {
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
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    @scala.inline
    def setFd(value: Double): Self = this.set("fd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFd: Self = this.set("fd", js.undefined)
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritable: Self = this.set("writable", js.undefined)
  }
  
}

