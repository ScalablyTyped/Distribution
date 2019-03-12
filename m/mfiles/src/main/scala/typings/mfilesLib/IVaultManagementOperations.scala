package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultManagementOperations extends js.Object {
  def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): scala.Unit
  def ExportContent(ExportContentJob: IExportContentJob): scala.Unit
  def GetEventHandlers(): IEventHandlers
  def GetVaultProperties(): IVaultProperties
  def ImportContent(ImportContentJob: IImportContentJob): scala.Unit
  def ImportContentAsync(ImportContentJob: IImportContentJob): scala.Double
  def IsAsyncJobRunning(JobID: scala.Double): scala.Boolean
  def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: java.lang.String): scala.Unit
  def RebuildFullTextSearchIndex(Metadata: scala.Boolean, FileContents: scala.Boolean): scala.Unit
  def SetEventHandlers(EventHandlers: IEventHandlers): scala.Unit
  def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: scala.Boolean): scala.Unit
  def VerifyVault(VerifyVaultJob: IVerifyVaultJob): IVerifyVaultJobOutput
  def WaitAsyncJob(JobID: scala.Double): scala.Unit
}

object IVaultManagementOperations {
  @scala.inline
  def apply(
    ArchiveOldVersions: IArchiveOldVersionsJob => scala.Unit,
    ExportContent: IExportContentJob => scala.Unit,
    GetEventHandlers: () => IEventHandlers,
    GetVaultProperties: () => IVaultProperties,
    ImportContent: IImportContentJob => scala.Unit,
    ImportContentAsync: IImportContentJob => scala.Double,
    IsAsyncJobRunning: scala.Double => scala.Boolean,
    PreviewImportContent: (IImportContentJob, java.lang.String) => scala.Unit,
    RebuildFullTextSearchIndex: (scala.Boolean, scala.Boolean) => scala.Unit,
    SetEventHandlers: IEventHandlers => scala.Unit,
    UpdateVaultProperties: (IVaultProperties, scala.Boolean) => scala.Unit,
    VerifyVault: IVerifyVaultJob => IVerifyVaultJobOutput,
    WaitAsyncJob: scala.Double => scala.Unit
  ): IVaultManagementOperations = {
    val __obj = js.Dynamic.literal(ArchiveOldVersions = js.Any.fromFunction1(ArchiveOldVersions), ExportContent = js.Any.fromFunction1(ExportContent), GetEventHandlers = js.Any.fromFunction0(GetEventHandlers), GetVaultProperties = js.Any.fromFunction0(GetVaultProperties), ImportContent = js.Any.fromFunction1(ImportContent), ImportContentAsync = js.Any.fromFunction1(ImportContentAsync), IsAsyncJobRunning = js.Any.fromFunction1(IsAsyncJobRunning), PreviewImportContent = js.Any.fromFunction2(PreviewImportContent), RebuildFullTextSearchIndex = js.Any.fromFunction2(RebuildFullTextSearchIndex), SetEventHandlers = js.Any.fromFunction1(SetEventHandlers), UpdateVaultProperties = js.Any.fromFunction2(UpdateVaultProperties), VerifyVault = js.Any.fromFunction1(VerifyVault), WaitAsyncJob = js.Any.fromFunction1(WaitAsyncJob))
  
    __obj.asInstanceOf[IVaultManagementOperations]
  }
}

