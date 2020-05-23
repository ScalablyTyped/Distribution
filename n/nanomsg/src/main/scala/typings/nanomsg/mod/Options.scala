package typings.nanomsg.mod

import typings.nanomsg.nanomsgStrings.binary
import typings.nanomsg.nanomsgStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chan: js.UndefOr[js.Array[String]] = js.undefined
  var ipv6: js.UndefOr[Boolean] = js.undefined
  var linger: js.UndefOr[Double] = js.undefined
  var maxreconn: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var rcvbuf: js.UndefOr[Double] = js.undefined
  var rcvmaxsize: js.UndefOr[Double] = js.undefined
  var rcvprio: js.UndefOr[Double] = js.undefined
  var rcvtimeo: js.UndefOr[Double] = js.undefined
  var reconn: js.UndefOr[Double] = js.undefined
  var sndbuf: js.UndefOr[Double] = js.undefined
  var sndprio: js.UndefOr[Double] = js.undefined
  var sndtimeo: js.UndefOr[Double] = js.undefined
  var tcpnodelay: js.UndefOr[Boolean] = js.undefined
  var wsopt: js.UndefOr[text | binary] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chan: js.Array[String] = null,
    ipv6: js.UndefOr[Boolean] = js.undefined,
    linger: js.UndefOr[Double] = js.undefined,
    maxreconn: js.UndefOr[Double] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    rcvbuf: js.UndefOr[Double] = js.undefined,
    rcvmaxsize: js.UndefOr[Double] = js.undefined,
    rcvprio: js.UndefOr[Double] = js.undefined,
    rcvtimeo: js.UndefOr[Double] = js.undefined,
    reconn: js.UndefOr[Double] = js.undefined,
    sndbuf: js.UndefOr[Double] = js.undefined,
    sndprio: js.UndefOr[Double] = js.undefined,
    sndtimeo: js.UndefOr[Double] = js.undefined,
    tcpnodelay: js.UndefOr[Boolean] = js.undefined,
    wsopt: text | binary = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chan != null) __obj.updateDynamic("chan")(chan.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv6)) __obj.updateDynamic("ipv6")(ipv6.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linger)) __obj.updateDynamic("linger")(linger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxreconn)) __obj.updateDynamic("maxreconn")(maxreconn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rcvbuf)) __obj.updateDynamic("rcvbuf")(rcvbuf.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rcvmaxsize)) __obj.updateDynamic("rcvmaxsize")(rcvmaxsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rcvprio)) __obj.updateDynamic("rcvprio")(rcvprio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rcvtimeo)) __obj.updateDynamic("rcvtimeo")(rcvtimeo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconn)) __obj.updateDynamic("reconn")(reconn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sndbuf)) __obj.updateDynamic("sndbuf")(sndbuf.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sndprio)) __obj.updateDynamic("sndprio")(sndprio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sndtimeo)) __obj.updateDynamic("sndtimeo")(sndtimeo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpnodelay)) __obj.updateDynamic("tcpnodelay")(tcpnodelay.get.asInstanceOf[js.Any])
    if (wsopt != null) __obj.updateDynamic("wsopt")(wsopt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

