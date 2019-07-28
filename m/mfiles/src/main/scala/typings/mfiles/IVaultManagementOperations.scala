package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultManagementOperations extends js.Object {
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
  @scala.inline
  def apply(
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
}

