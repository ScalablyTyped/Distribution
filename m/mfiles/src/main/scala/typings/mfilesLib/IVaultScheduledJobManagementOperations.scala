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

