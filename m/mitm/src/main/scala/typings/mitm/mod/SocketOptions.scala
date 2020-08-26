package typings.mitm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var family: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var localPort: js.UndefOr[String] = js.native
  var port: Double = js.native
}

object SocketOptions {
  @scala.inline
  def apply(port: Double): SocketOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setLocalPort(value: String): Self = this.set("localPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPort: Self = this.set("localPort", js.undefined)
  }
  
}

