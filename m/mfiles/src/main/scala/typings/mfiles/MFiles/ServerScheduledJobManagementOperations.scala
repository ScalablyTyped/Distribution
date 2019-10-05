package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IScheduledJob
import typings.mfiles.IScheduledJobRunInfo
import typings.mfiles.IScheduledJobs
import typings.mfiles.IServerScheduledJobManagementOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerScheduledJobManagementOperations")
@js.native
class ServerScheduledJobManagementOperations () extends IServerScheduledJobManagementOperations {
  /* CompleteClass */
  override def AddScheduledJob(ScheduledJob: IScheduledJob): Double = js.native
  /* CompleteClass */
  override def CancelScheduledJob(ID: Double): Unit = js.native
  /* CompleteClass */
  override def GetScheduledJob(ID: Double): IScheduledJob = js.native
  /* CompleteClass */
  override def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo = js.native
  /* CompleteClass */
  override def GetScheduledJobs(): IScheduledJobs = js.native
  /* CompleteClass */
  override def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit = js.native
  /* CompleteClass */
  override def RemoveScheduledJob(ID: Double): Unit = js.native
  /* CompleteClass */
  override def StartScheduledJob(ID: Double): Unit = js.native
}

@JSGlobal("MFiles.ServerScheduledJobManagementOperations")
@js.native
object ServerScheduledJobManagementOperations extends Instantiable0[IServerScheduledJobManagementOperations]

