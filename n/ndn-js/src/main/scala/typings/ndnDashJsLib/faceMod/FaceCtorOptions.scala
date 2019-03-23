package typings
package ndnDashJsLib.faceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceCtorOptions extends js.Object {
  var connectionInfo: js.UndefOr[ndnDashJsLib.transportMod.TransportConnectionInfo | scala.Null] = js.undefined
  var getConnectionInfo: js.UndefOr[js.Function0[ndnDashJsLib.transportMod.TransportConnectionInfo]] = js.undefined
  var getTransport: js.UndefOr[js.Function0[ndnDashJsLib.transportMod.Transport]] = js.undefined
  var host: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var port: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object FaceCtorOptions {
  @scala.inline
  def apply(
    connectionInfo: ndnDashJsLib.transportMod.TransportConnectionInfo = null,
    getConnectionInfo: () => ndnDashJsLib.transportMod.TransportConnectionInfo = null,
    getTransport: () => ndnDashJsLib.transportMod.Transport = null,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null
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

