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
    ArchiveOldVersions: js.Function1[IArchiveOldVersionsJob, scala.Unit],
    ExportContent: js.Function1[IExportContentJob, scala.Unit],
    GetEventHandlers: js.Function0[IEventHandlers],
    GetVaultProperties: js.Function0[IVaultProperties],
    ImportContent: js.Function1[IImportContentJob, scala.Unit],
    ImportContentAsync: js.Function1[IImportContentJob, scala.Double],
    IsAsyncJobRunning: js.Function1[scala.Double, scala.Boolean],
    PreviewImportContent: js.Function2[IImportContentJob, java.lang.String, scala.Unit],
    RebuildFullTextSearchIndex: js.Function2[scala.Boolean, scala.Boolean, scala.Unit],
    SetEventHandlers: js.Function1[IEventHandlers, scala.Unit],
    UpdateVaultProperties: js.Function2[IVaultProperties, scala.Boolean, scala.Unit],
    VerifyVault: js.Function1[IVerifyVaultJob, IVerifyVaultJobOutput],
    WaitAsyncJob: js.Function1[scala.Double, scala.Unit]
  ): IVaultManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ArchiveOldVersions")(ArchiveOldVersions)
    __obj.updateDynamic("ExportContent")(ExportContent)
    __obj.updateDynamic("GetEventHandlers")(GetEventHandlers)
    __obj.updateDynamic("GetVaultProperties")(GetVaultProperties)
    __obj.updateDynamic("ImportContent")(ImportContent)
    __obj.updateDynamic("ImportContentAsync")(ImportContentAsync)
    __obj.updateDynamic("IsAsyncJobRunning")(IsAsyncJobRunning)
    __obj.updateDynamic("PreviewImportContent")(PreviewImportContent)
    __obj.updateDynamic("RebuildFullTextSearchIndex")(RebuildFullTextSearchIndex)
    __obj.updateDynamic("SetEventHandlers")(SetEventHandlers)
    __obj.updateDynamic("UpdateVaultProperties")(UpdateVaultProperties)
    __obj.updateDynamic("VerifyVault")(VerifyVault)
    __obj.updateDynamic("WaitAsyncJob")(WaitAsyncJob)
    __obj.asInstanceOf[IVaultManagementOperations]
  }
}

