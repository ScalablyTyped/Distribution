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
    linger: Int | Double = null,
    maxreconn: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    rcvbuf: Int | Double = null,
    rcvmaxsize: Int | Double = null,
    rcvprio: Int | Double = null,
    rcvtimeo: Int | Double = null,
    reconn: Int | Double = null,
    sndbuf: Int | Double = null,
    sndprio: Int | Double = null,
    sndtimeo: Int | Double = null,
    tcpnodelay: js.UndefOr[Boolean] = js.undefined,
    wsopt: text | binary = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chan != null) __obj.updateDynamic("chan")(chan.asInstanceOf[js.Any])
    if (!js.isUndefined(ipv6)) __obj.updateDynamic("ipv6")(ipv6.asInstanceOf[js.Any])
    if (linger != null) __obj.updateDynamic("linger")(linger.asInstanceOf[js.Any])
    if (maxreconn != null) __obj.updateDynamic("maxreconn")(maxreconn.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (rcvbuf != null) __obj.updateDynamic("rcvbuf")(rcvbuf.asInstanceOf[js.Any])
    if (rcvmaxsize != null) __obj.updateDynamic("rcvmaxsize")(rcvmaxsize.asInstanceOf[js.Any])
    if (rcvprio != null) __obj.updateDynamic("rcvprio")(rcvprio.asInstanceOf[js.Any])
    if (rcvtimeo != null) __obj.updateDynamic("rcvtimeo")(rcvtimeo.asInstanceOf[js.Any])
    if (reconn != null) __obj.updateDynamic("reconn")(reconn.asInstanceOf[js.Any])
    if (sndbuf != null) __obj.updateDynamic("sndbuf")(sndbuf.asInstanceOf[js.Any])
    if (sndprio != null) __obj.updateDynamic("sndprio")(sndprio.asInstanceOf[js.Any])
    if (sndtimeo != null) __obj.updateDynamic("sndtimeo")(sndtimeo.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpnodelay)) __obj.updateDynamic("tcpnodelay")(tcpnodelay.asInstanceOf[js.Any])
    if (wsopt != null) __obj.updateDynamic("wsopt")(wsopt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

