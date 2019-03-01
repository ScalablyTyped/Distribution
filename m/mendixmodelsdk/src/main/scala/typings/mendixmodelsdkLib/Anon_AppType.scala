package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AppType
  extends mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IEnvironmentStatus {
  var appType: js.UndefOr[
    mendixmodelsdkLib.mendixmodelsdkLibStrings.Licensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Unlicensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Sandbox
  ] = js.undefined
  var buildErrors: js.UndefOr[
    js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IBuildError]
  ] = js.undefined
  var buildstatus: java.lang.String | scala.Null
  var consistencyErrors: js.UndefOr[js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IProblem]] = js.undefined
  var disk: scala.Double
  var endpoint: java.lang.String
  var environmentId: java.lang.String
  var instances: scala.Double
  var memory: scala.Double
  var message: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var profile: java.lang.String
  var state: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.SuccessAppState
  var `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.success
  var url: java.lang.String
}

object Anon_AppType {
  @scala.inline
  def apply(
    disk: scala.Double,
    endpoint: java.lang.String,
    environmentId: java.lang.String,
    instances: scala.Double,
    memory: scala.Double,
    name: java.lang.String,
    profile: java.lang.String,
    state: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.SuccessAppState,
    `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.success,
    url: java.lang.String,
    appType: mendixmodelsdkLib.mendixmodelsdkLibStrings.Licensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Unlicensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Sandbox = null,
    buildErrors: js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IBuildError] = null,
    buildstatus: java.lang.String = null,
    consistencyErrors: js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IProblem] = null,
    message: java.lang.String = null
  ): Anon_AppType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("disk")(disk)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("environmentId")(environmentId)
    __obj.updateDynamic("instances")(instances)
    __obj.updateDynamic("memory")(memory)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("profile")(profile)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("url")(url)
    if (appType != null) __obj.updateDynamic("appType")(appType.asInstanceOf[js.Any])
    if (buildErrors != null) __obj.updateDynamic("buildErrors")(buildErrors)
    if (buildstatus != null) __obj.updateDynamic("buildstatus")(buildstatus)
    if (consistencyErrors != null) __obj.updateDynamic("consistencyErrors")(consistencyErrors)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Anon_AppType]
  }
}

