package typings.mfiles

import typings.mfiles.MFiles.MFScheduledJobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScheduledJob extends js.Object {
  val BackupVaultJob: IBackupJob = js.native
  var Enabled: Boolean = js.native
  val ExportContentJob: IExportContentJob = js.native
  var ID: Double = js.native
  val ImportContentJob: IImportContentJob = js.native
  var JobName: String = js.native
  var JobType: MFScheduledJobType = js.native
  val OptimizeVaultJob: IOptimizeVaultJob = js.native
  var Temporary: Boolean = js.native
  var Triggers: IScheduledJobTriggers = js.native
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit = js.native
  def SetExportContentJob(ExportContentJob: IExportContentJob): Unit = js.native
  def SetImportContentJob(ImportContentJob: IImportContentJob): Unit = js.native
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
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
  @scala.inline
  implicit class IScheduledJobOps[Self <: IScheduledJob] (val x: Self) extends AnyVal {
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
    def setBackupVaultJob(value: IBackupJob): Self = this.set("BackupVaultJob", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportContentJob(value: IExportContentJob): Self = this.set("ExportContentJob", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportContentJob(value: IImportContentJob): Self = this.set("ImportContentJob", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobName(value: String): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobType(value: MFScheduledJobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimizeVaultJob(value: IOptimizeVaultJob): Self = this.set("OptimizeVaultJob", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetBackupVaultJob(value: IBackupJob => Unit): Self = this.set("SetBackupVaultJob", js.Any.fromFunction1(value))
    @scala.inline
    def setSetExportContentJob(value: IExportContentJob => Unit): Self = this.set("SetExportContentJob", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImportContentJob(value: IImportContentJob => Unit): Self = this.set("SetImportContentJob", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOptimizeVaultJob(value: IOptimizeVaultJob => Unit): Self = this.set("SetOptimizeVaultJob", js.Any.fromFunction1(value))
    @scala.inline
    def setTemporary(value: Boolean): Self = this.set("Temporary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggers(value: IScheduledJobTriggers): Self = this.set("Triggers", value.asInstanceOf[js.Any])
  }
  
}

