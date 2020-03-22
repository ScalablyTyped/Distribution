package typings.openfin.wireMod

import typings.openfin.AnonAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigWithRuntime extends BaseConfig {
  @JSName("runtime")
  var runtime_ConfigWithRuntime: RuntimeConfig
}

object ConfigWithRuntime {
  @scala.inline
  def apply(
    runtime: RuntimeConfig,
    address: String = null,
    appAssets: js.Array[AnonAlias] = null,
    assetsUrl: String = null,
    client: js.Any = null,
    customItems: js.Array[_] = null,
    devToolsPort: Int | Double = null,
    installerUI: js.UndefOr[Boolean] = js.undefined,
    licenseKey: String = null,
    lrsUrl: String = null,
    manifestUrl: String = null,
    name: String = null,
    nonPersistent: js.UndefOr[Boolean] = js.undefined,
    runtimeClient: js.UndefOr[Boolean] = js.undefined,
    services: js.Array[ServiceConfig] = null,
    startupApp: js.Any = null,
    timeout: Int | Double = null,
    uuid: String = null
  ): ConfigWithRuntime = {
    val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (appAssets != null) __obj.updateDynamic("appAssets")(appAssets.asInstanceOf[js.Any])
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (customItems != null) __obj.updateDynamic("customItems")(customItems.asInstanceOf[js.Any])
    if (devToolsPort != null) __obj.updateDynamic("devToolsPort")(devToolsPort.asInstanceOf[js.Any])
    if (!js.isUndefined(installerUI)) __obj.updateDynamic("installerUI")(installerUI.asInstanceOf[js.Any])
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey.asInstanceOf[js.Any])
    if (lrsUrl != null) __obj.updateDynamic("lrsUrl")(lrsUrl.asInstanceOf[js.Any])
    if (manifestUrl != null) __obj.updateDynamic("manifestUrl")(manifestUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersistent)) __obj.updateDynamic("nonPersistent")(nonPersistent.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeClient)) __obj.updateDynamic("runtimeClient")(runtimeClient.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (startupApp != null) __obj.updateDynamic("startupApp")(startupApp.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigWithRuntime]
  }
}

