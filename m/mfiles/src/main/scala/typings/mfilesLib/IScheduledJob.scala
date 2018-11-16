package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IScheduledJob extends js.Object {
  val BackupVaultJob: IBackupJob
  var Enabled: scala.Boolean
  val ExportContentJob: IExportContentJob
  var ID: scala.Double
  val ImportContentJob: IImportContentJob
  var JobName: java.lang.String
  var JobType: mfilesLib.MFilesNs.MFScheduledJobType
  val OptimizeVaultJob: IOptimizeVaultJob
  var Temporary: scala.Boolean
  var Triggers: IScheduledJobTriggers
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): scala.Unit
  def SetExportContentJob(ExportContentJob: IExportContentJob): scala.Unit
  def SetImportContentJob(ImportContentJob: IImportContentJob): scala.Unit
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): scala.Unit
}

