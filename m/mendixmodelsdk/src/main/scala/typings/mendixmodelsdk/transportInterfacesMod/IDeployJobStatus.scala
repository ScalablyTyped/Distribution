package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.fast
import typings.mendixmodelsdk.mendixmodelsdkStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeployJobStatus extends js.Object {
  var appUrl: js.UndefOr[String] = js.native
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.native
  var buildstatus: String | Null = js.native
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.native
  var jobid: String = js.native
  var startTime: Double = js.native
  var status: IUpdateAppJobStatus = js.native
  /**
    * Used to keep track of which steps this app update went trough,
    * mainly for debugging
    *
    * @memberOf IGetUpdateAppStatusResponse
    */
  var trace: js.Array[String] = js.native
  var `type`: full | fast = js.native
}

object IDeployJobStatus {
  @scala.inline
  def apply(
    jobid: String,
    startTime: Double,
    status: IUpdateAppJobStatus,
    trace: js.Array[String],
    `type`: full | fast
  ): IDeployJobStatus = {
    val __obj = js.Dynamic.literal(jobid = jobid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeployJobStatus]
  }
  @scala.inline
  implicit class IDeployJobStatusOps[Self <: IDeployJobStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobid(value: String): Self = this.set("jobid", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: IUpdateAppJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraceVarargs(value: String*): Self = this.set("trace", js.Array(value :_*))
    @scala.inline
    def setTrace(value: js.Array[String]): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: full | fast): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppUrl(value: String): Self = this.set("appUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppUrl: Self = this.set("appUrl", js.undefined)
    @scala.inline
    def setBuildErrorsVarargs(value: IBuildError*): Self = this.set("buildErrors", js.Array(value :_*))
    @scala.inline
    def setBuildErrors(value: js.Array[IBuildError]): Self = this.set("buildErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildErrors: Self = this.set("buildErrors", js.undefined)
    @scala.inline
    def setBuildstatus(value: String): Self = this.set("buildstatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildstatusNull: Self = this.set("buildstatus", null)
    @scala.inline
    def setConsistencyErrorsVarargs(value: IProblem*): Self = this.set("consistencyErrors", js.Array(value :_*))
    @scala.inline
    def setConsistencyErrors(value: js.Array[IProblem]): Self = this.set("consistencyErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyErrors: Self = this.set("consistencyErrors", js.undefined)
  }
  
}

