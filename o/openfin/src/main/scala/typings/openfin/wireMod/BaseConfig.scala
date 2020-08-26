package typings.openfin.wireMod

import typings.openfin.anon.Alias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConfig extends js.Object {
  var address: js.UndefOr[String] = js.native
  var appAssets: js.UndefOr[js.Array[Alias]] = js.native
  var assetsUrl: js.UndefOr[String] = js.native
  var client: js.UndefOr[js.Any] = js.native
  var customItems: js.UndefOr[js.Array[_]] = js.native
  var devToolsPort: js.UndefOr[Double] = js.native
  var installerUI: js.UndefOr[Boolean] = js.native
  var licenseKey: js.UndefOr[String] = js.native
  var lrsUrl: js.UndefOr[String] = js.native
  var manifestUrl: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var nonPersistent: js.UndefOr[Boolean] = js.native
  var runtime: js.UndefOr[RuntimeConfig] = js.native
  var runtimeClient: js.UndefOr[Boolean] = js.native
  var services: js.UndefOr[js.Array[ServiceConfig]] = js.native
  var startupApp: js.UndefOr[js.Any] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var uuid: js.UndefOr[String] = js.native
}

object BaseConfig {
  @scala.inline
  def apply(): BaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfig]
  }
  @scala.inline
  implicit class BaseConfigOps[Self <: BaseConfig] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAppAssetsVarargs(value: Alias*): Self = this.set("appAssets", js.Array(value :_*))
    @scala.inline
    def setAppAssets(value: js.Array[Alias]): Self = this.set("appAssets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppAssets: Self = this.set("appAssets", js.undefined)
    @scala.inline
    def setAssetsUrl(value: String): Self = this.set("assetsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetsUrl: Self = this.set("assetsUrl", js.undefined)
    @scala.inline
    def setClient(value: js.Any): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setCustomItemsVarargs(value: js.Any*): Self = this.set("customItems", js.Array(value :_*))
    @scala.inline
    def setCustomItems(value: js.Array[_]): Self = this.set("customItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomItems: Self = this.set("customItems", js.undefined)
    @scala.inline
    def setDevToolsPort(value: Double): Self = this.set("devToolsPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevToolsPort: Self = this.set("devToolsPort", js.undefined)
    @scala.inline
    def setInstallerUI(value: Boolean): Self = this.set("installerUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallerUI: Self = this.set("installerUI", js.undefined)
    @scala.inline
    def setLicenseKey(value: String): Self = this.set("licenseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseKey: Self = this.set("licenseKey", js.undefined)
    @scala.inline
    def setLrsUrl(value: String): Self = this.set("lrsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLrsUrl: Self = this.set("lrsUrl", js.undefined)
    @scala.inline
    def setManifestUrl(value: String): Self = this.set("manifestUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestUrl: Self = this.set("manifestUrl", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNonPersistent(value: Boolean): Self = this.set("nonPersistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonPersistent: Self = this.set("nonPersistent", js.undefined)
    @scala.inline
    def setRuntime(value: RuntimeConfig): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    @scala.inline
    def setRuntimeClient(value: Boolean): Self = this.set("runtimeClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeClient: Self = this.set("runtimeClient", js.undefined)
    @scala.inline
    def setServicesVarargs(value: ServiceConfig*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[ServiceConfig]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setStartupApp(value: js.Any): Self = this.set("startupApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartupApp: Self = this.set("startupApp", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

