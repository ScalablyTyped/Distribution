package typings.ndnDashJs.faceMod

import typings.ndnDashJs.transportMod.Transport
import typings.ndnDashJs.transportMod.TransportConnectionInfo
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
    connectionInfo: TransportConnectionInfo = null,
    getConnectionInfo: () => TransportConnectionInfo = null,
    getTransport: () => Transport = null,
    host: String = null,
    port: Int | Double = null
  ): FaceCtorOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionInfo != null) __obj.updateDynamic("connectionInfo")(connectionInfo)
    if (getConnectionInfo != null) __obj.updateDynamic("getConnectionInfo")(js.Any.fromFunction0(getConnectionInfo))
    if (getTransport != null) __obj.updateDynamic("getTransport")(js.Any.fromFunction0(getTransport))
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceCtorOptions]
  }
}

