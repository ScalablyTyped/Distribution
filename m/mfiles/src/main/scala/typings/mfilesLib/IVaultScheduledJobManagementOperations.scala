package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultScheduledJobManagementOperations extends js.Object {
  def AddScheduledJob(ScheduledJob: IScheduledJob): scala.Double
  def CancelScheduledJob(ID: scala.Double): scala.Unit
  def GetScheduledJob(ID: scala.Double): IScheduledJob
  def GetScheduledJobRunInfo(ID: scala.Double): IScheduledJobRunInfo
  def GetScheduledJobs(): IScheduledJobs
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): scala.Unit
  def RemoveScheduledJob(ID: scala.Double): scala.Unit
  def StartScheduledJob(ID: scala.Double): scala.Unit
}

object IVaultScheduledJobManagementOperations {
  @scala.inline
  def apply(
    AddScheduledJob: IScheduledJob => scala.Double,
    CancelScheduledJob: scala.Double => scala.Unit,
    GetScheduledJob: scala.Double => IScheduledJob,
    GetScheduledJobRunInfo: scala.Double => IScheduledJobRunInfo,
    GetScheduledJobs: () => IScheduledJobs,
    ModifyScheduledJob: IScheduledJob => scala.Unit,
    RemoveScheduledJob: scala.Double => scala.Unit,
    StartScheduledJob: scala.Double => scala.Unit
  ): IVaultScheduledJobManagementOperations = {
    val __obj = js.Dynamic.literal(AddScheduledJob = js.Any.fromFunction1(AddScheduledJob), CancelScheduledJob = js.Any.fromFunction1(CancelScheduledJob), GetScheduledJob = js.Any.fromFunction1(GetScheduledJob), GetScheduledJobRunInfo = js.Any.fromFunction1(GetScheduledJobRunInfo), GetScheduledJobs = js.Any.fromFunction0(GetScheduledJobs), ModifyScheduledJob = js.Any.fromFunction1(ModifyScheduledJob), RemoveScheduledJob = js.Any.fromFunction1(RemoveScheduledJob), StartScheduledJob = js.Any.fromFunction1(StartScheduledJob))
  
    __obj.asInstanceOf[IVaultScheduledJobManagementOperations]
  }
}

