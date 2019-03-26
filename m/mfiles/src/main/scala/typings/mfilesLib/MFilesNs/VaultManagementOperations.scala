package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultManagementOperations")
@js.native
class VaultManagementOperations ()
  extends mfilesLib.IVaultManagementOperations {
  /* CompleteClass */
  override def ArchiveOldVersions(ArchiveOldVersionsJob: mfilesLib.IArchiveOldVersionsJob): scala.Unit = js.native
  /* CompleteClass */
  override def ExportContent(ExportContentJob: mfilesLib.IExportContentJob): scala.Unit = js.native
  /* CompleteClass */
  override def GetEventHandlers(): mfilesLib.IEventHandlers = js.native
  /* CompleteClass */
  override def GetVaultProperties(): mfilesLib.IVaultProperties = js.native
  /* CompleteClass */
  override def ImportContent(ImportContentJob: mfilesLib.IImportContentJob): scala.Unit = js.native
  /* CompleteClass */
  override def ImportContentAsync(ImportContentJob: mfilesLib.IImportContentJob): scala.Double = js.native
  /* CompleteClass */
  override def IsAsyncJobRunning(JobID: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def PreviewImportContent(ImportContentJob: mfilesLib.IImportContentJob, SummaryFile: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def RebuildFullTextSearchIndex(Metadata: scala.Boolean, FileContents: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def SetEventHandlers(EventHandlers: mfilesLib.IEventHandlers): scala.Unit = js.native
  /* CompleteClass */
  override def UpdateVaultProperties(VaultProperties: mfilesLib.IVaultProperties, RegistrationDataOnly: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def VerifyVault(VerifyVaultJob: mfilesLib.IVerifyVaultJob): mfilesLib.IVerifyVaultJobOutput = js.native
  /* CompleteClass */
  override def WaitAsyncJob(JobID: scala.Double): scala.Unit = js.native
}

