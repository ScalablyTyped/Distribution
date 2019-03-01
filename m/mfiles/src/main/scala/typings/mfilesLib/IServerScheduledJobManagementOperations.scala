package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerScheduledJobManagementOperations extends js.Object {
  def AddScheduledJob(ScheduledJob: IScheduledJob): scala.Double
  def CancelScheduledJob(ID: scala.Double): scala.Unit
  def GetScheduledJob(ID: scala.Double): IScheduledJob
  def GetScheduledJobRunInfo(ID: scala.Double): IScheduledJobRunInfo
  def GetScheduledJobs(): IScheduledJobs
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): scala.Unit
  def RemoveScheduledJob(ID: scala.Double): scala.Unit
  def StartScheduledJob(ID: scala.Double): scala.Unit
}

object IServerScheduledJobManagementOperations {
  @scala.inline
  def apply(
    AddScheduledJob: js.Function1[IScheduledJob, scala.Double],
    CancelScheduledJob: js.Function1[scala.Double, scala.Unit],
    GetScheduledJob: js.Function1[scala.Double, IScheduledJob],
    GetScheduledJobRunInfo: js.Function1[scala.Double, IScheduledJobRunInfo],
    GetScheduledJobs: js.Function0[IScheduledJobs],
    ModifyScheduledJob: js.Function1[IScheduledJob, scala.Unit],
    RemoveScheduledJob: js.Function1[scala.Double, scala.Unit],
    StartScheduledJob: js.Function1[scala.Double, scala.Unit]
  ): IServerScheduledJobManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddScheduledJob")(AddScheduledJob)
    __obj.updateDynamic("CancelScheduledJob")(CancelScheduledJob)
    __obj.updateDynamic("GetScheduledJob")(GetScheduledJob)
    __obj.updateDynamic("GetScheduledJobRunInfo")(GetScheduledJobRunInfo)
    __obj.updateDynamic("GetScheduledJobs")(GetScheduledJobs)
    __obj.updateDynamic("ModifyScheduledJob")(ModifyScheduledJob)
    __obj.updateDynamic("RemoveScheduledJob")(RemoveScheduledJob)
    __obj.updateDynamic("StartScheduledJob")(StartScheduledJob)
    __obj.asInstanceOf[IServerScheduledJobManagementOperations]
  }
}

