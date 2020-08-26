package typings.nanomsg.mod

import typings.nanomsg.nanomsgStrings.binary
import typings.nanomsg.nanomsgStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var chan: js.UndefOr[js.Array[String]] = js.native
  var ipv6: js.UndefOr[Boolean] = js.native
  var linger: js.UndefOr[Double] = js.native
  var maxreconn: js.UndefOr[Double] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var rcvbuf: js.UndefOr[Double] = js.native
  var rcvmaxsize: js.UndefOr[Double] = js.native
  var rcvprio: js.UndefOr[Double] = js.native
  var rcvtimeo: js.UndefOr[Double] = js.native
  var reconn: js.UndefOr[Double] = js.native
  var sndbuf: js.UndefOr[Double] = js.native
  var sndprio: js.UndefOr[Double] = js.native
  var sndtimeo: js.UndefOr[Double] = js.native
  var tcpnodelay: js.UndefOr[Boolean] = js.native
  var wsopt: js.UndefOr[text | binary] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setChanVarargs(value: String*): Self = this.set("chan", js.Array(value :_*))
    @scala.inline
    def setChan(value: js.Array[String]): Self = this.set("chan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChan: Self = this.set("chan", js.undefined)
    @scala.inline
    def setIpv6(value: Boolean): Self = this.set("ipv6", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6: Self = this.set("ipv6", js.undefined)
    @scala.inline
    def setLinger(value: Double): Self = this.set("linger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinger: Self = this.set("linger", js.undefined)
    @scala.inline
    def setMaxreconn(value: Double): Self = this.set("maxreconn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxreconn: Self = this.set("maxreconn", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setRcvbuf(value: Double): Self = this.set("rcvbuf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRcvbuf: Self = this.set("rcvbuf", js.undefined)
    @scala.inline
    def setRcvmaxsize(value: Double): Self = this.set("rcvmaxsize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRcvmaxsize: Self = this.set("rcvmaxsize", js.undefined)
    @scala.inline
    def setRcvprio(value: Double): Self = this.set("rcvprio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRcvprio: Self = this.set("rcvprio", js.undefined)
    @scala.inline
    def setRcvtimeo(value: Double): Self = this.set("rcvtimeo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRcvtimeo: Self = this.set("rcvtimeo", js.undefined)
    @scala.inline
    def setReconn(value: Double): Self = this.set("reconn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconn: Self = this.set("reconn", js.undefined)
    @scala.inline
    def setSndbuf(value: Double): Self = this.set("sndbuf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSndbuf: Self = this.set("sndbuf", js.undefined)
    @scala.inline
    def setSndprio(value: Double): Self = this.set("sndprio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSndprio: Self = this.set("sndprio", js.undefined)
    @scala.inline
    def setSndtimeo(value: Double): Self = this.set("sndtimeo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSndtimeo: Self = this.set("sndtimeo", js.undefined)
    @scala.inline
    def setTcpnodelay(value: Boolean): Self = this.set("tcpnodelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpnodelay: Self = this.set("tcpnodelay", js.undefined)
    @scala.inline
    def setWsopt(value: text | binary): Self = this.set("wsopt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWsopt: Self = this.set("wsopt", js.undefined)
  }
  
}

