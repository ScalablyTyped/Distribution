package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.Licensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.Sandbox
import typings.mendixmodelsdk.mendixmodelsdkStrings.Unlicensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.fail
import typings.mendixmodelsdk.mendixmodelsdkStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnvironmentStatus extends js.Object {
  var appType: js.UndefOr[Licensed | Unlicensed | Sandbox] = js.undefined
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.undefined
  var buildstatus: js.UndefOr[String | Null] = js.undefined
  var cause: js.UndefOr[String] = js.undefined
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.undefined
  var disk: js.UndefOr[Double] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var environmentId: js.UndefOr[String] = js.undefined
  var instances: js.UndefOr[Double] = js.undefined
  var memory: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[CannotFixAppState | SuccessAppState] = js.undefined
  var `type`: js.UndefOr[fail | success] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object IEnvironmentStatus {
  @scala.inline
  def apply(
    appType: Licensed | Unlicensed | Sandbox = null,
    buildErrors: js.Array[IBuildError] = null,
    buildstatus: String = null,
    cause: String = null,
    consistencyErrors: js.Array[IProblem] = null,
    disk: Int | Double = null,
    endpoint: String = null,
    environmentId: String = null,
    instances: Int | Double = null,
    memory: Int | Double = null,
    message: String = null,
    name: String = null,
    profile: String = null,
    state: SuccessAppState = null,
    `type`: success = null,
    url: String = null
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

