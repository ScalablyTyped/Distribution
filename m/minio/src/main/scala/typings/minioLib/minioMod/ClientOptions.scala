package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var accessKey: java.lang.String
  var endPoint: java.lang.String
  var port: js.UndefOr[scala.Double] = js.undefined
  var region: js.UndefOr[Region] = js.undefined
  var secretKey: java.lang.String
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
  var transport: js.UndefOr[js.Any] = js.undefined
  var useSSL: js.UndefOr[scala.Boolean] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    accessKey: java.lang.String,
    endPoint: java.lang.String,
    secretKey: java.lang.String,
    port: scala.Int | scala.Double = null,
    region: Region = null,
    sessionToken: java.lang.String = null,
    transport: js.Any = null,
    useSSL: js.UndefOr[scala.Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessKey")(accessKey)
    __obj.updateDynamic("endPoint")(endPoint)
    __obj.updateDynamic("secretKey")(secretKey)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL)
    __obj.asInstanceOf[ClientOptions]
  }
}

