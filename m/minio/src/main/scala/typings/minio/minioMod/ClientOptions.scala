package typings.minio.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var accessKey: String
  var endPoint: String
  var port: js.UndefOr[Double] = js.undefined
  var region: js.UndefOr[Region] = js.undefined
  var secretKey: String
  var sessionToken: js.UndefOr[String] = js.undefined
  var transport: js.UndefOr[js.Any] = js.undefined
  var useSSL: js.UndefOr[Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    accessKey: String,
    endPoint: String,
    secretKey: String,
    port: Int | Double = null,
    region: Region = null,
    sessionToken: String = null,
    transport: js.Any = null,
    useSSL: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(accessKey = accessKey, endPoint = endPoint, secretKey = secretKey)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL)
    __obj.asInstanceOf[ClientOptions]
  }
}

