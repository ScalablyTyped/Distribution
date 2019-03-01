package typings
package peerjsLib.PeerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerJSOption extends js.Object {
  var config: js.UndefOr[webrtcLib.RTCPeerConnectionConfig] = js.undefined
  var debug: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object PeerJSOption {
  @scala.inline
  def apply(
    config: webrtcLib.RTCPeerConnectionConfig = null,
    debug: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    key: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): PeerJSOption = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[PeerJSOption]
  }
}

