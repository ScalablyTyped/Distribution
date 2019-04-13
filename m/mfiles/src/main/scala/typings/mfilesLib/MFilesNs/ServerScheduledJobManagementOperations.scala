package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerScheduledJobManagementOperations")
@js.native
class ServerScheduledJobManagementOperations ()
  extends mfilesLib.IServerScheduledJobManagementOperations {
  /* CompleteClass */
  override def AddScheduledJob(ScheduledJob: mfilesLib.IScheduledJob): scala.Double = js.native
  /* CompleteClass */
  override def CancelScheduledJob(ID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def GetScheduledJob(ID: scala.Double): mfilesLib.IScheduledJob = js.native
  /* CompleteClass */
  override def GetScheduledJobRunInfo(ID: scala.Double): mfilesLib.IScheduledJobRunInfo = js.native
  /* CompleteClass */
  override def GetScheduledJobs(): mfilesLib.IScheduledJobs = js.native
  /* CompleteClass */
  override def ModifyScheduledJob(ScheduledJob: mfilesLib.IScheduledJob): scala.Unit = js.native
  /* CompleteClass */
  override def RemoveScheduledJob(ID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def StartScheduledJob(ID: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.ServerScheduledJobManagementOperations")
@js.native
object ServerScheduledJobManagementOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IServerScheduledJobManagementOperations]

