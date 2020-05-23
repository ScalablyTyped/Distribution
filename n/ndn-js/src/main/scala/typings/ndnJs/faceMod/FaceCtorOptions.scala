package typings.ndnJs.faceMod

import typings.ndnJs.transportMod.Transport
import typings.ndnJs.transportMod.TransportConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceCtorOptions extends js.Object {
  var connectionInfo: js.UndefOr[TransportConnectionInfo | Null] = js.undefined
  var getConnectionInfo: js.UndefOr[js.Function0[TransportConnectionInfo]] = js.undefined
  var getTransport: js.UndefOr[js.Function0[Transport]] = js.undefined
  var host: js.UndefOr[String | Null] = js.undefined
  var port: js.UndefOr[Double | Null] = js.undefined
}

object FaceCtorOptions {
  @scala.inline
  def apply(
    connectionInfo: js.UndefOr[Null | TransportConnectionInfo] = js.undefined,
    getConnectionInfo: () => TransportConnectionInfo = null,
    getTransport: () => Transport = null,
    host: js.UndefOr[Null | String] = js.undefined,
    port: js.UndefOr[Null | Double] = js.undefined
  ): FaceCtorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectionInfo)) __obj.updateDynamic("connectionInfo")(connectionInfo.asInstanceOf[js.Any])
    if (getConnectionInfo != null) __obj.updateDynamic("getConnectionInfo")(js.Any.fromFunction0(getConnectionInfo))
    if (getTransport != null) __obj.updateDynamic("getTransport")(js.Any.fromFunction0(getTransport))
    if (!js.isUndefined(host)) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceCtorOptions]
  }
}

