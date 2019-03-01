package typings
package nanomsgLib.nanomsgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chan: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ipv6: js.UndefOr[scala.Boolean] = js.undefined
  var linger: js.UndefOr[scala.Double] = js.undefined
  var maxreconn: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var rcvbuf: js.UndefOr[scala.Double] = js.undefined
  var rcvmaxsize: js.UndefOr[scala.Double] = js.undefined
  var rcvprio: js.UndefOr[scala.Double] = js.undefined
  var rcvtimeo: js.UndefOr[scala.Double] = js.undefined
  var reconn: js.UndefOr[scala.Double] = js.undefined
  var sndbuf: js.UndefOr[scala.Double] = js.undefined
  var sndprio: js.UndefOr[scala.Double] = js.undefined
  var sndtimeo: js.UndefOr[scala.Double] = js.undefined
  var tcpnodelay: js.UndefOr[scala.Boolean] = js.undefined
  var wsopt: js.UndefOr[nanomsgLib.nanomsgLibStrings.text | nanomsgLib.nanomsgLibStrings.binary] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chan: js.Array[java.lang.String] = null,
    ipv6: js.UndefOr[scala.Boolean] = js.undefined,
    linger: scala.Int | scala.Double = null,
    maxreconn: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    rcvbuf: scala.Int | scala.Double = null,
    rcvmaxsize: scala.Int | scala.Double = null,
    rcvprio: scala.Int | scala.Double = null,
    rcvtimeo: scala.Int | scala.Double = null,
    reconn: scala.Int | scala.Double = null,
    sndbuf: scala.Int | scala.Double = null,
    sndprio: scala.Int | scala.Double = null,
    sndtimeo: scala.Int | scala.Double = null,
    tcpnodelay: js.UndefOr[scala.Boolean] = js.undefined,
    wsopt: nanomsgLib.nanomsgLibStrings.text | nanomsgLib.nanomsgLibStrings.binary = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chan != null) __obj.updateDynamic("chan")(chan)
    if (!js.isUndefined(ipv6)) __obj.updateDynamic("ipv6")(ipv6)
    if (linger != null) __obj.updateDynamic("linger")(linger.asInstanceOf[js.Any])
    if (maxreconn != null) __obj.updateDynamic("maxreconn")(maxreconn.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (rcvbuf != null) __obj.updateDynamic("rcvbuf")(rcvbuf.asInstanceOf[js.Any])
    if (rcvmaxsize != null) __obj.updateDynamic("rcvmaxsize")(rcvmaxsize.asInstanceOf[js.Any])
    if (rcvprio != null) __obj.updateDynamic("rcvprio")(rcvprio.asInstanceOf[js.Any])
    if (rcvtimeo != null) __obj.updateDynamic("rcvtimeo")(rcvtimeo.asInstanceOf[js.Any])
    if (reconn != null) __obj.updateDynamic("reconn")(reconn.asInstanceOf[js.Any])
    if (sndbuf != null) __obj.updateDynamic("sndbuf")(sndbuf.asInstanceOf[js.Any])
    if (sndprio != null) __obj.updateDynamic("sndprio")(sndprio.asInstanceOf[js.Any])
    if (sndtimeo != null) __obj.updateDynamic("sndtimeo")(sndtimeo.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpnodelay)) __obj.updateDynamic("tcpnodelay")(tcpnodelay)
    if (wsopt != null) __obj.updateDynamic("wsopt")(wsopt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

