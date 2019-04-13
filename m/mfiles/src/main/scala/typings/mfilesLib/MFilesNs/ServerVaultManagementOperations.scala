package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerVaultManagementOperations")
@js.native
class ServerVaultManagementOperations ()
  extends mfilesLib.IServerVaultManagementOperations {
  /* CompleteClass */
  override def AttachVault(VaultProperties: mfilesLib.IVaultProperties, UpdateAttachmentGUID: scala.Boolean): mfilesLib.IVaultProperties = js.native
  /* CompleteClass */
  override def AttachVaultWithOptions(VaultProperties: mfilesLib.IVaultProperties, Options: mfilesLib.IAttachVaultOptions): mfilesLib.IVaultProperties = js.native
  /* CompleteClass */
  override def BackupVault(BackupJob: mfilesLib.IBackupJob): scala.Unit = js.native
  /* CompleteClass */
  override def BringVaultOnline(VaultGUID: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def CopyVault(CopyVaultJob: mfilesLib.ICopyVaultJob): mfilesLib.ICopyVaultJobOutputInfo = js.native
  /* CompleteClass */
  override def CreateNewVault(VaultProperties: mfilesLib.IVaultProperties): java.lang.String = js.native
  /* CompleteClass */
  override def DestroyVault(VaultGUID: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def DetachVault(VaultGUID: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def GetBackupFileContents(
    BackupFileFull: java.lang.String,
    BackupFileDifferential: java.lang.String,
    Impersonation: mfilesLib.IImpersonation
  ): mfilesLib.IVaultProperties = js.native
  /* CompleteClass */
  override def GetVaultProperties(VaultGUID: java.lang.String): mfilesLib.IVaultProperties = js.native
  /* CompleteClass */
  override def OptimizeVault(OptimizeVaultJob: mfilesLib.IOptimizeVaultJob): scala.Unit = js.native
  /* CompleteClass */
  override def RestoreVault(RestoreJob: mfilesLib.IRestoreJob): scala.Unit = js.native
  /* CompleteClass */
  override def TakeVaultOffline(VaultGUID: java.lang.String, DisconnectUsers: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("MFiles.ServerVaultManagementOperations")
@js.native
object ServerVaultManagementOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IServerVaultManagementOperations]

