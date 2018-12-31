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

