package typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.fast
import typings.mendixmodelsdk.mendixmodelsdkStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeployJobStatus extends js.Object {
  var appUrl: js.UndefOr[String] = js.undefined
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.undefined
  var buildstatus: String | Null
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.undefined
  var jobid: String
  var startTime: Double
  var status: IUpdateAppJobStatus
  /**
    * Used to keep track of which steps this app update went trough,
    * mainly for debugging
    *
    * @memberOf IGetUpdateAppStatusResponse
    */
  var trace: js.Array[String]
  var `type`: full | fast
}

object IDeployJobStatus {
  @scala.inline
  def apply(
    jobid: String,
    startTime: Double,
    status: IUpdateAppJobStatus,
    trace: js.Array[String],
    `type`: full | fast,
    appUrl: String = null,
    buildErrors: js.Array[IBuildError] = null,
    buildstatus: String = null,
    consistencyErrors: js.Array[IProblem] = null
  ): IDeployJobStatus = {
    val __obj = js.Dynamic.literal(jobid = jobid, startTime = startTime, status = status, trace = trace)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl)
    if (buildErrors != null) __obj.updateDynamic("buildErrors")(buildErrors)
    if (buildstatus != null) __obj.updateDynamic("buildstatus")(buildstatus)
    if (consistencyErrors != null) __obj.updateDynamic("consistencyErrors")(consistencyErrors)
    __obj.asInstanceOf[IDeployJobStatus]
  }
}

