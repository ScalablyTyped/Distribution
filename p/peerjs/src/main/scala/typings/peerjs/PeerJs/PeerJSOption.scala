package typings.peerjs.PeerJs

import typings.webrtc.RTCPeerConnectionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerJSOption extends js.Object {
  var config: js.UndefOr[RTCPeerConnectionConfig] = js.undefined
  var debug: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object PeerJSOption {
  @scala.inline
  def apply(
    config: RTCPeerConnectionConfig = null,
    debug: Int | Double = null,
    host: String = null,
    key: String = null,
    path: String = null,
    port: Int | Double = null,
    secure: js.UndefOr[Boolean] = js.undefined
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

