package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerVaultManagementOperations extends js.Object {
  def AttachVault(VaultProperties: IVaultProperties, UpdateAttachmentGUID: scala.Boolean): IVaultProperties
  def AttachVaultWithOptions(VaultProperties: IVaultProperties, Options: IAttachVaultOptions): IVaultProperties
  def BackupVault(BackupJob: IBackupJob): scala.Unit
  def BringVaultOnline(VaultGUID: java.lang.String): scala.Unit
  def CopyVault(CopyVaultJob: ICopyVaultJob): ICopyVaultJobOutputInfo
  def CreateNewVault(VaultProperties: IVaultProperties): java.lang.String
  def DestroyVault(VaultGUID: java.lang.String): scala.Unit
  def DetachVault(VaultGUID: java.lang.String): scala.Unit
  def GetBackupFileContents(
    BackupFileFull: java.lang.String,
    BackupFileDifferential: java.lang.String,
    Impersonation: IImpersonation
  ): IVaultProperties
  def GetVaultProperties(VaultGUID: java.lang.String): IVaultProperties
  def OptimizeVault(OptimizeVaultJob: IOptimizeVaultJob): scala.Unit
  def RestoreVault(RestoreJob: IRestoreJob): scala.Unit
  def TakeVaultOffline(VaultGUID: java.lang.String, DisconnectUsers: scala.Boolean): scala.Unit
}

object IServerVaultManagementOperations {
  @scala.inline
  def apply(
    AttachVault: (IVaultProperties, scala.Boolean) => IVaultProperties,
    AttachVaultWithOptions: (IVaultProperties, IAttachVaultOptions) => IVaultProperties,
    BackupVault: IBackupJob => scala.Unit,
    BringVaultOnline: java.lang.String => scala.Unit,
    CopyVault: ICopyVaultJob => ICopyVaultJobOutputInfo,
    CreateNewVault: IVaultProperties => java.lang.String,
    DestroyVault: java.lang.String => scala.Unit,
    DetachVault: java.lang.String => scala.Unit,
    GetBackupFileContents: (java.lang.String, java.lang.String, IImpersonation) => IVaultProperties,
    GetVaultProperties: java.lang.String => IVaultProperties,
    OptimizeVault: IOptimizeVaultJob => scala.Unit,
    RestoreVault: IRestoreJob => scala.Unit,
    TakeVaultOffline: (java.lang.String, scala.Boolean) => scala.Unit
  ): IServerVaultManagementOperations = {
    val __obj = js.Dynamic.literal(AttachVault = js.Any.fromFunction2(AttachVault), AttachVaultWithOptions = js.Any.fromFunction2(AttachVaultWithOptions), BackupVault = js.Any.fromFunction1(BackupVault), BringVaultOnline = js.Any.fromFunction1(BringVaultOnline), CopyVault = js.Any.fromFunction1(CopyVault), CreateNewVault = js.Any.fromFunction1(CreateNewVault), DestroyVault = js.Any.fromFunction1(DestroyVault), DetachVault = js.Any.fromFunction1(DetachVault), GetBackupFileContents = js.Any.fromFunction3(GetBackupFileContents), GetVaultProperties = js.Any.fromFunction1(GetVaultProperties), OptimizeVault = js.Any.fromFunction1(OptimizeVault), RestoreVault = js.Any.fromFunction1(RestoreVault), TakeVaultOffline = js.Any.fromFunction2(TakeVaultOffline))
  
    __obj.asInstanceOf[IServerVaultManagementOperations]
  }
}

