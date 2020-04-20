package typings.mfiles

import typings.mfiles.MFiles.MFScheduledJobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJob extends js.Object {
  val BackupVaultJob: IBackupJob
  var Enabled: Boolean
  val ExportContentJob: IExportContentJob
  var ID: Double
  val ImportContentJob: IImportContentJob
  var JobName: String
  var JobType: MFScheduledJobType
  val OptimizeVaultJob: IOptimizeVaultJob
  var Temporary: Boolean
  var Triggers: IScheduledJobTriggers
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit
  def SetExportContentJob(ExportContentJob: IExportContentJob): Unit
  def SetImportContentJob(ImportContentJob: IImportContentJob): Unit
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit
}

object IScheduledJob {
  @scala.inline
  def apply(
    BackupVaultJob: IBackupJob,
    Enabled: Boolean,
    ExportContentJob: IExportContentJob,
    ID: Double,
    ImportContentJob: IImportContentJob,
    JobName: String,
    JobType: MFScheduledJobType,
    OptimizeVaultJob: IOptimizeVaultJob,
    SetBackupVaultJob: IBackupJob => Unit,
    SetExportContentJob: IExportContentJob => Unit,
    SetImportContentJob: IImportContentJob => Unit,
    SetOptimizeVaultJob: IOptimizeVaultJob => Unit,
    Temporary: Boolean,
    Triggers: IScheduledJobTriggers
  ): IScheduledJob = {
    val __obj = js.Dynamic.literal(BackupVaultJob = BackupVaultJob.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ExportContentJob = ExportContentJob.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], ImportContentJob = ImportContentJob.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], OptimizeVaultJob = OptimizeVaultJob.asInstanceOf[js.Any], SetBackupVaultJob = js.Any.fromFunction1(SetBackupVaultJob), SetExportContentJob = js.Any.fromFunction1(SetExportContentJob), SetImportContentJob = js.Any.fromFunction1(SetImportContentJob), SetOptimizeVaultJob = js.Any.fromFunction1(SetOptimizeVaultJob), Temporary = Temporary.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheduledJob]
  }
}

