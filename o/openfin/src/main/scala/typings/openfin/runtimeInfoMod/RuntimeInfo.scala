package typings.openfin.runtimeInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeInfo extends js.Object {
  var architecture: String
  var args: js.Object
  var chromeVersion: String
  var fdc3AppUuid: js.UndefOr[String] = js.undefined
  var fdc3ChannelName: js.UndefOr[String] = js.undefined
  var manifestUrl: String
  var port: Double
  var securityRealm: js.UndefOr[String] = js.undefined
  var version: String
}

object RuntimeInfo {
  @scala.inline
  def apply(
    architecture: String,
    args: js.Object,
    chromeVersion: String,
    manifestUrl: String,
    port: Double,
    version: String,
    fdc3AppUuid: String = null,
    fdc3ChannelName: String = null,
    securityRealm: String = null
  ): RuntimeInfo = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], chromeVersion = chromeVersion.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (fdc3AppUuid != null) __obj.updateDynamic("fdc3AppUuid")(fdc3AppUuid.asInstanceOf[js.Any])
    if (fdc3ChannelName != null) __obj.updateDynamic("fdc3ChannelName")(fdc3ChannelName.asInstanceOf[js.Any])
    if (securityRealm != null) __obj.updateDynamic("securityRealm")(securityRealm.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeInfo]
  }
}

