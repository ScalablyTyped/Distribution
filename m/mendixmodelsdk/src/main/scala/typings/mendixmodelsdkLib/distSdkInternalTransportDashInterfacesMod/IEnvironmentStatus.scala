package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnvironmentStatus extends js.Object {
  var appType: js.UndefOr[
    mendixmodelsdkLib.mendixmodelsdkLibStrings.Licensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Unlicensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Sandbox
  ] = js.undefined
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.undefined
  var buildstatus: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var cause: js.UndefOr[java.lang.String] = js.undefined
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.undefined
  var disk: js.UndefOr[scala.Double] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var environmentId: js.UndefOr[java.lang.String] = js.undefined
  var instances: js.UndefOr[scala.Double] = js.undefined
  var memory: js.UndefOr[scala.Double] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[CannotFixAppState | SuccessAppState] = js.undefined
  var `type`: js.UndefOr[
    mendixmodelsdkLib.mendixmodelsdkLibStrings.fail | mendixmodelsdkLib.mendixmodelsdkLibStrings.success
  ] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IEnvironmentStatus {
  @scala.inline
  def apply(
    appType: mendixmodelsdkLib.mendixmodelsdkLibStrings.Licensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Unlicensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Sandbox = null,
    buildErrors: js.Array[IBuildError] = null,
    buildstatus: java.lang.String = null,
    cause: java.lang.String = null,
    consistencyErrors: js.Array[IProblem] = null,
    disk: scala.Int | scala.Double = null,
    endpoint: java.lang.String = null,
    environmentId: java.lang.String = null,
    instances: scala.Int | scala.Double = null,
    memory: scala.Int | scala.Double = null,
    message: java.lang.String = null,
    name: java.lang.String = null,
    profile: java.lang.String = null,
    state: SuccessAppState = null,
    `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.success = null,
    url: java.lang.String = null
  ): IEnvironmentStatus = {
    val __obj = js.Dynamic.literal()
    if (appType != null) __obj.updateDynamic("appType")(appType.asInstanceOf[js.Any])
    if (buildErrors != null) __obj.updateDynamic("buildErrors")(buildErrors)
    if (buildstatus != null) __obj.updateDynamic("buildstatus")(buildstatus)
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (consistencyErrors != null) __obj.updateDynamic("consistencyErrors")(consistencyErrors)
    if (disk != null) __obj.updateDynamic("disk")(disk.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId)
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (name != null) __obj.updateDynamic("name")(name)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (state != null) __obj.updateDynamic("state")(state)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IEnvironmentStatus]
  }
}

