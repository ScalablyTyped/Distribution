package typings.openfin.runtimeInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuntimeInfo extends js.Object {
  var architecture: String = js.native
  var args: js.Object = js.native
  var chromeVersion: String = js.native
  var fdc3AppUuid: js.UndefOr[String] = js.native
  var fdc3ChannelName: js.UndefOr[String] = js.native
  var manifestUrl: String = js.native
  var port: Double = js.native
  var securityRealm: js.UndefOr[String] = js.native
  var version: String = js.native
}

object RuntimeInfo {
  @scala.inline
  def apply(
    architecture: String,
    args: js.Object,
    chromeVersion: String,
    manifestUrl: String,
    port: Double,
    version: String
  ): RuntimeInfo = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], chromeVersion = chromeVersion.asInstanceOf[js.Any], manifestUrl = manifestUrl.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeInfo]
  }
  @scala.inline
  implicit class RuntimeInfoOps[Self <: RuntimeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: js.Object): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setChromeVersion(value: String): Self = this.set("chromeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestUrl(value: String): Self = this.set("manifestUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setFdc3AppUuid(value: String): Self = this.set("fdc3AppUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFdc3AppUuid: Self = this.set("fdc3AppUuid", js.undefined)
    @scala.inline
    def setFdc3ChannelName(value: String): Self = this.set("fdc3ChannelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFdc3ChannelName: Self = this.set("fdc3ChannelName", js.undefined)
    @scala.inline
    def setSecurityRealm(value: String): Self = this.set("securityRealm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityRealm: Self = this.set("securityRealm", js.undefined)
  }
  
}

