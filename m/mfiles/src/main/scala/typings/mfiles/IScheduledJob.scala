package typings.mfiles

import typings.mfiles.MFiles.MFScheduledJobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScheduledJob extends StObject {
  
  val BackupVaultJob: IBackupJob = js.native
  
  var Enabled: Boolean = js.native
  
  val ExportContentJob: IExportContentJob = js.native
  
  var ID: Double = js.native
  
  val ImportContentJob: IImportContentJob = js.native
  
  var JobName: String = js.native
  
  var JobType: MFScheduledJobType = js.native
  
  val OptimizeVaultJob: IOptimizeVaultJob = js.native
  
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit = js.native
  
  def SetExportContentJob(ExportContentJob: IExportContentJob): Unit = js.native
  
  def SetImportContentJob(ImportContentJob: IImportContentJob): Unit = js.native
  
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
  
  var Temporary: Boolean = js.native
  
  var Triggers: IScheduledJobTriggers = js.native
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
  implicit class IScheduledJobMutableBuilder[Self <: IScheduledJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupVaultJob(value: IBackupJob): Self = StObject.set(x, "BackupVaultJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportContentJob(value: IExportContentJob): Self = StObject.set(x, "ExportContentJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportContentJob(value: IImportContentJob): Self = StObject.set(x, "ImportContentJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobType(value: MFScheduledJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeVaultJob(value: IOptimizeVaultJob): Self = StObject.set(x, "OptimizeVaultJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBackupVaultJob(value: IBackupJob => Unit): Self = StObject.set(x, "SetBackupVaultJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExportContentJob(value: IExportContentJob => Unit): Self = StObject.set(x, "SetExportContentJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetImportContentJob(value: IImportContentJob => Unit): Self = StObject.set(x, "SetImportContentJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptimizeVaultJob(value: IOptimizeVaultJob => Unit): Self = StObject.set(x, "SetOptimizeVaultJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemporary(value: Boolean): Self = StObject.set(x, "Temporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggers(value: IScheduledJobTriggers): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
  }
}
