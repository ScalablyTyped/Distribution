package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeployJobStatus extends js.Object {
  var appUrl: js.UndefOr[java.lang.String] = js.undefined
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.undefined
  var buildstatus: java.lang.String | scala.Null
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.undefined
  var jobid: java.lang.String
  var startTime: scala.Double
  var status: IUpdateAppJobStatus
  /**
    * Used to keep track of which steps this app update went trough,
    * mainly for debugging
    *
    * @memberOf IGetUpdateAppStatusResponse
    */
  var trace: js.Array[java.lang.String]
  var `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.full | mendixmodelsdkLib.mendixmodelsdkLibStrings.fast
}

object IDeployJobStatus {
  @scala.inline
  def apply(
    jobid: java.lang.String,
    startTime: scala.Double,
    status: IUpdateAppJobStatus,
    trace: js.Array[java.lang.String],
    `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.full | mendixmodelsdkLib.mendixmodelsdkLibStrings.fast,
    appUrl: java.lang.String = null,
    buildErrors: js.Array[IBuildError] = null,
    buildstatus: java.lang.String = null,
    consistencyErrors: js.Array[IProblem] = null
  ): IDeployJobStatus = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("jobid")(jobid)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("trace")(trace)
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl)
    if (buildErrors != null) __obj.updateDynamic("buildErrors")(buildErrors)
    if (buildstatus != null) __obj.updateDynamic("buildstatus")(buildstatus)
    if (consistencyErrors != null) __obj.updateDynamic("consistencyErrors")(consistencyErrors)
    __obj.asInstanceOf[IDeployJobStatus]
  }
}

