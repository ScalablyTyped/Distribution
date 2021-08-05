package typings.mfiles

import typings.mfiles.MFiles.MFScheduledJobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledJob extends StObject {
  
  val BackupVaultJob: IBackupJob
  
  var Enabled: Boolean
  
  val ExportContentJob: IExportContentJob
  
  var ID: Double
  
  val ImportContentJob: IImportContentJob
  
  var JobName: String
  
  var JobType: MFScheduledJobType
  
  val OptimizeVaultJob: IOptimizeVaultJob
  
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit
  
  def SetExportContentJob(ExportContentJob: IExportContentJob): Unit
  
  def SetImportContentJob(ImportContentJob: IImportContentJob): Unit
  
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit
  
  var Temporary: Boolean
  
  var Triggers: IScheduledJobTriggers
}
object IScheduledJob {
  
  inline def apply(
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
  
  extension [Self <: IScheduledJob](x: Self) {
    
    inline def setBackupVaultJob(value: IBackupJob): Self = StObject.set(x, "BackupVaultJob", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setExportContentJob(value: IExportContentJob): Self = StObject.set(x, "ExportContentJob", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setImportContentJob(value: IImportContentJob): Self = StObject.set(x, "ImportContentJob", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: String): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: MFScheduledJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setOptimizeVaultJob(value: IOptimizeVaultJob): Self = StObject.set(x, "OptimizeVaultJob", value.asInstanceOf[js.Any])
    
    inline def setSetBackupVaultJob(value: IBackupJob => Unit): Self = StObject.set(x, "SetBackupVaultJob", js.Any.fromFunction1(value))
    
    inline def setSetExportContentJob(value: IExportContentJob => Unit): Self = StObject.set(x, "SetExportContentJob", js.Any.fromFunction1(value))
    
    inline def setSetImportContentJob(value: IImportContentJob => Unit): Self = StObject.set(x, "SetImportContentJob", js.Any.fromFunction1(value))
    
    inline def setSetOptimizeVaultJob(value: IOptimizeVaultJob => Unit): Self = StObject.set(x, "SetOptimizeVaultJob", js.Any.fromFunction1(value))
    
    inline def setTemporary(value: Boolean): Self = StObject.set(x, "Temporary", value.asInstanceOf[js.Any])
    
    inline def setTriggers(value: IScheduledJobTriggers): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
  }
}
