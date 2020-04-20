package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerScheduledJobManagementOperations extends js.Object {
  def AddScheduledJob(ScheduledJob: IScheduledJob): Double
  def CancelScheduledJob(ID: Double): Unit
  def GetScheduledJob(ID: Double): IScheduledJob
  def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo
  def GetScheduledJobs(): IScheduledJobs
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit
  def RemoveScheduledJob(ID: Double): Unit
  def StartScheduledJob(ID: Double): Unit
}

object IServerScheduledJobManagementOperations {
  @scala.inline
  def apply(
    AddScheduledJob: IScheduledJob => Double,
    CancelScheduledJob: Double => Unit,
    GetScheduledJob: Double => IScheduledJob,
    GetScheduledJobRunInfo: Double => IScheduledJobRunInfo,
    GetScheduledJobs: () => IScheduledJobs,
    ModifyScheduledJob: IScheduledJob => Unit,
    RemoveScheduledJob: Double => Unit,
    StartScheduledJob: Double => Unit
  ): IServerScheduledJobManagementOperations = {
    val __obj = js.Dynamic.literal(AddScheduledJob = js.Any.fromFunction1(AddScheduledJob), CancelScheduledJob = js.Any.fromFunction1(CancelScheduledJob), GetScheduledJob = js.Any.fromFunction1(GetScheduledJob), GetScheduledJobRunInfo = js.Any.fromFunction1(GetScheduledJobRunInfo), GetScheduledJobs = js.Any.fromFunction0(GetScheduledJobs), ModifyScheduledJob = js.Any.fromFunction1(ModifyScheduledJob), RemoveScheduledJob = js.Any.fromFunction1(RemoveScheduledJob), StartScheduledJob = js.Any.fromFunction1(StartScheduledJob))
    __obj.asInstanceOf[IServerScheduledJobManagementOperations]
  }
}

