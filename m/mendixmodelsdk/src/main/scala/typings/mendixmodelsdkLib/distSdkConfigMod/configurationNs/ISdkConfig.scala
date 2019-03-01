package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All the details of the connection that's been set up to the Model API Server.
  */
trait ISdkConfig extends js.Object {
  var client: js.UndefOr[mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod.IModelServerClient] = js.undefined
  var credentials: js.UndefOr[IBackendCredentials | ISdkCredentials] = js.undefined
  var endPoint: js.UndefOr[java.lang.String] = js.undefined
  var transportation: js.UndefOr[mendixmodelsdkLib.distSdkInternalTransportationMod.ITransportation] = js.undefined
}

object ISdkConfig {
  @scala.inline
  def apply(
    client: mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod.IModelServerClient = null,
    credentials: IBackendCredentials | ISdkCredentials = null,
    endPoint: java.lang.String = null,
    transportation: mendixmodelsdkLib.distSdkInternalTransportationMod.ITransportation = null
  ): ISdkConfig = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (endPoint != null) __obj.updateDynamic("endPoint")(endPoint)
    if (transportation != null) __obj.updateDynamic("transportation")(transportation)
    __obj.asInstanceOf[ISdkConfig]
  }
}

