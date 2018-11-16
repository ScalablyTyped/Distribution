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

