package typings.mendixmodelsdk

import typings.mendixmodelsdk.mendixmodelsdkStrings.Licensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.Sandbox
import typings.mendixmodelsdk.mendixmodelsdkStrings.Unlicensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.success
import typings.mendixmodelsdk.transportInterfacesMod.IBuildError
import typings.mendixmodelsdk.transportInterfacesMod.IEnvironmentStatus
import typings.mendixmodelsdk.transportInterfacesMod.IProblem
import typings.mendixmodelsdk.transportInterfacesMod.SuccessAppState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppType extends IEnvironmentStatus {
  var appType: js.UndefOr[Licensed | Unlicensed | Sandbox] = js.undefined
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.undefined
  var buildstatus: String | Null
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.undefined
  var disk: Double
  var endpoint: String
  var environmentId: String
  var instances: Double
  var memory: Double
  var message: js.UndefOr[String] = js.undefined
  var name: String
  var profile: String
  var state: SuccessAppState
  var `type`: success
  var url: String
}

object AnonAppType {
  @scala.inline
  def apply(
    disk: Double,
    endpoint: String,
    environmentId: String,
    instances: Double,
    memory: Double,
    name: String,
    profile: String,
    state: SuccessAppState,
    `type`: success,
    url: String,
    appType: Licensed | Unlicensed | Sandbox = null,
    buildErrors: js.Array[IBuildError] = null,
    buildstatus: String = null,
    consistencyErrors: js.Array[IProblem] = null,
    message: String = null
  ): AnonAppType = {
    val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appType != null) __obj.updateDynamic("appType")(appType.asInstanceOf[js.Any])
    if (buildErrors != null) __obj.updateDynamic("buildErrors")(buildErrors.asInstanceOf[js.Any])
    if (buildstatus != null) __obj.updateDynamic("buildstatus")(buildstatus.asInstanceOf[js.Any])
    if (consistencyErrors != null) __obj.updateDynamic("consistencyErrors")(consistencyErrors.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppType]
  }
}

