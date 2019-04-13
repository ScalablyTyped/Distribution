package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ScheduledJob")
@js.native
class ScheduledJob ()
  extends mfilesLib.IScheduledJob {
  /* CompleteClass */
  override val BackupVaultJob: mfilesLib.IBackupJob = js.native
  /* CompleteClass */
  override var Enabled: scala.Boolean = js.native
  /* CompleteClass */
  override val ExportContentJob: mfilesLib.IExportContentJob = js.native
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override val ImportContentJob: mfilesLib.IImportContentJob = js.native
  /* CompleteClass */
  override var JobName: java.lang.String = js.native
  /* CompleteClass */
  override var JobType: MFScheduledJobType = js.native
  /* CompleteClass */
  override val OptimizeVaultJob: mfilesLib.IOptimizeVaultJob = js.native
  /* CompleteClass */
  override var Temporary: scala.Boolean = js.native
  /* CompleteClass */
  override var Triggers: mfilesLib.IScheduledJobTriggers = js.native
  /* CompleteClass */
  override def SetBackupVaultJob(BackupVaultJob: mfilesLib.IBackupJob): scala.Unit = js.native
  /* CompleteClass */
  override def SetExportContentJob(ExportContentJob: mfilesLib.IExportContentJob): scala.Unit = js.native
  /* CompleteClass */
  override def SetImportContentJob(ImportContentJob: mfilesLib.IImportContentJob): scala.Unit = js.native
  /* CompleteClass */
  override def SetOptimizeVaultJob(OptimizeVaultJob: mfilesLib.IOptimizeVaultJob): scala.Unit = js.native
}

@JSGlobal("MFiles.ScheduledJob")
@js.native
object ScheduledJob
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IScheduledJob]

