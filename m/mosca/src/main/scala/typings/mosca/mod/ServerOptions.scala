package typings.mosca.mod

import typings.mosca.AnonCertPath
import typings.mosca.AnonPort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var allowNonSecure: js.UndefOr[Boolean] = js.undefined
  var ascoltatore: js.UndefOr[js.Any] = js.undefined
  var backend: js.UndefOr[js.Any] = js.undefined
  var bundle: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var http: js.UndefOr[AnonPort] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var maxInflightMessages: js.UndefOr[Double] = js.undefined
  var persistence: js.UndefOr[js.Any] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var secure: js.UndefOr[AnonCertPath] = js.undefined
  var static: js.UndefOr[js.Any] = js.undefined
  var stats: js.UndefOr[js.Any] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    allowNonSecure: js.UndefOr[Boolean] = js.undefined,
    ascoltatore: js.Any = null,
    backend: js.Any = null,
    bundle: js.Any = null,
    host: String = null,
    http: AnonPort = null,
    logger: js.Any = null,
    maxInflightMessages: Int | Double = null,
    persistence: js.Any = null,
    port: Int | Double = null,
    secure: AnonCertPath = null,
    static: js.Any = null,
    stats: js.Any = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNonSecure)) __obj.updateDynamic("allowNonSecure")(allowNonSecure.asInstanceOf[js.Any])
    if (ascoltatore != null) __obj.updateDynamic("ascoltatore")(ascoltatore.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (bundle != null) __obj.updateDynamic("bundle")(bundle.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maxInflightMessages != null) __obj.updateDynamic("maxInflightMessages")(maxInflightMessages.asInstanceOf[js.Any])
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

