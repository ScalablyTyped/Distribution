package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.Licensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.Sandbox
import typings.mendixmodelsdk.mendixmodelsdkStrings.Unlicensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.fail
import typings.mendixmodelsdk.mendixmodelsdkStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.AnonAppType
  - typings.mendixmodelsdk.AnonCause
*/
trait IEnvironmentStatus extends js.Object

object IEnvironmentStatus {
  @scala.inline
  def AnonAppType(
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
  ): IEnvironmentStatus = {
    val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appType != null) __obj.updateDynamic("appType")(appType.asInstanceOf[js.Any])
    if (buildErrors != null) __obj.updateDynamic("buildErrors")(buildErrors.asInstanceOf[js.Any])
    if (buildstatus != null) __obj.updateDynamic("buildstatus")(buildstatus.asInstanceOf[js.Any])
    if (consistencyErrors != null) __obj.updateDynamic("consistencyErrors")(consistencyErrors.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvironmentStatus]
  }
  @scala.inline
  def AnonCause(state: CannotFixAppState, `type`: fail, cause: String = null, message: String = null): IEnvironmentStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnvironmentStatus]
  }
}

