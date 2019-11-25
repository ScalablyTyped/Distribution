package typings.mendixmodelsdk.distSdkConfigurationMod.configuration

import typings.mendixmodelsdk.distSdkInternalIModelServerClientMod.IModelServerClient
import typings.mendixmodelsdk.distSdkInternalTransportationMod.ITransportation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISdkConfig extends js.Object {
  var client: js.UndefOr[IModelServerClient] = js.undefined
  var credentials: js.UndefOr[IBackendCredentials | ISdkCredentials] = js.undefined
  var endPoint: js.UndefOr[String] = js.undefined
  var transportation: js.UndefOr[ITransportation] = js.undefined
}

object ISdkConfig {
  @scala.inline
  def apply(
    client: IModelServerClient = null,
    credentials: IBackendCredentials | ISdkCredentials = null,
    endPoint: String = null,
    transportation: ITransportation = null
  ): ISdkConfig = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint.asInstanceOf[js.Any])
    if (transportation != null) __obj.updateDynamic("transportation")(transportation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISdkConfig]
  }
}

