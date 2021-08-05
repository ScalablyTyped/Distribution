package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultManagementOperations extends StObject {
  
  def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): Unit
  
  def ExportContent(ExportContentJob: IExportContentJob): Unit
  
  def GetEventHandlers(): IEventHandlers
  
  def GetVaultProperties(): IVaultProperties
  
  def ImportContent(ImportContentJob: IImportContentJob): Unit
  
  def ImportContentAsync(ImportContentJob: IImportContentJob): Double
  
  def IsAsyncJobRunning(JobID: Double): Boolean
  
  def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: String): Unit
  
  def RebuildFullTextSearchIndex(Metadata: Boolean, FileContents: Boolean): Unit
  
  def SetEventHandlers(EventHandlers: IEventHandlers): Unit
  
  def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: Boolean): Unit
  
  def VerifyVault(VerifyVaultJob: IVerifyVaultJob): IVerifyVaultJobOutput
  
  def WaitAsyncJob(JobID: Double): Unit
}
object IVaultManagementOperations {
  
  inline def apply(
    ArchiveOldVersions: IArchiveOldVersionsJob => Unit,
    ExportContent: IExportContentJob => Unit,
    GetEventHandlers: () => IEventHandlers,
    GetVaultProperties: () => IVaultProperties,
    ImportContent: IImportContentJob => Unit,
    ImportContentAsync: IImportContentJob => Double,
    IsAsyncJobRunning: Double => Boolean,
    PreviewImportContent: (IImportContentJob, String) => Unit,
    RebuildFullTextSearchIndex: (Boolean, Boolean) => Unit,
    SetEventHandlers: IEventHandlers => Unit,
    UpdateVaultProperties: (IVaultProperties, Boolean) => Unit,
    VerifyVault: IVerifyVaultJob => IVerifyVaultJobOutput,
    WaitAsyncJob: Double => Unit
  ): IVaultManagementOperations = {
    val __obj = js.Dynamic.literal(ArchiveOldVersions = js.Any.fromFunction1(ArchiveOldVersions), ExportContent = js.Any.fromFunction1(ExportContent), GetEventHandlers = js.Any.fromFunction0(GetEventHandlers), GetVaultProperties = js.Any.fromFunction0(GetVaultProperties), ImportContent = js.Any.fromFunction1(ImportContent), ImportContentAsync = js.Any.fromFunction1(ImportContentAsync), IsAsyncJobRunning = js.Any.fromFunction1(IsAsyncJobRunning), PreviewImportContent = js.Any.fromFunction2(PreviewImportContent), RebuildFullTextSearchIndex = js.Any.fromFunction2(RebuildFullTextSearchIndex), SetEventHandlers = js.Any.fromFunction1(SetEventHandlers), UpdateVaultProperties = js.Any.fromFunction2(UpdateVaultProperties), VerifyVault = js.Any.fromFunction1(VerifyVault), WaitAsyncJob = js.Any.fromFunction1(WaitAsyncJob))
    __obj.asInstanceOf[IVaultManagementOperations]
  }
  
  extension [Self <: IVaultManagementOperations](x: Self) {
    
    inline def setArchiveOldVersions(value: IArchiveOldVersionsJob => Unit): Self = StObject.set(x, "ArchiveOldVersions", js.Any.fromFunction1(value))
    
    inline def setExportContent(value: IExportContentJob => Unit): Self = StObject.set(x, "ExportContent", js.Any.fromFunction1(value))
    
    inline def setGetEventHandlers(value: () => IEventHandlers): Self = StObject.set(x, "GetEventHandlers", js.Any.fromFunction0(value))
    
    inline def setGetVaultProperties(value: () => IVaultProperties): Self = StObject.set(x, "GetVaultProperties", js.Any.fromFunction0(value))
    
    inline def setImportContent(value: IImportContentJob => Unit): Self = StObject.set(x, "ImportContent", js.Any.fromFunction1(value))
    
    inline def setImportContentAsync(value: IImportContentJob => Double): Self = StObject.set(x, "ImportContentAsync", js.Any.fromFunction1(value))
    
    inline def setIsAsyncJobRunning(value: Double => Boolean): Self = StObject.set(x, "IsAsyncJobRunning", js.Any.fromFunction1(value))
    
    inline def setPreviewImportContent(value: (IImportContentJob, String) => Unit): Self = StObject.set(x, "PreviewImportContent", js.Any.fromFunction2(value))
    
    inline def setRebuildFullTextSearchIndex(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "RebuildFullTextSearchIndex", js.Any.fromFunction2(value))
    
    inline def setSetEventHandlers(value: IEventHandlers => Unit): Self = StObject.set(x, "SetEventHandlers", js.Any.fromFunction1(value))
    
    inline def setUpdateVaultProperties(value: (IVaultProperties, Boolean) => Unit): Self = StObject.set(x, "UpdateVaultProperties", js.Any.fromFunction2(value))
    
    inline def setVerifyVault(value: IVerifyVaultJob => IVerifyVaultJobOutput): Self = StObject.set(x, "VerifyVault", js.Any.fromFunction1(value))
    
    inline def setWaitAsyncJob(value: Double => Unit): Self = StObject.set(x, "WaitAsyncJob", js.Any.fromFunction1(value))
  }
}
