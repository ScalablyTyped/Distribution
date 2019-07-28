package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerVaultManagementOperations extends js.Object {
  def AttachVault(VaultProperties: IVaultProperties, UpdateAttachmentGUID: Boolean): IVaultProperties
  def AttachVaultWithOptions(VaultProperties: IVaultProperties, Options: IAttachVaultOptions): IVaultProperties
  def BackupVault(BackupJob: IBackupJob): Unit
  def BringVaultOnline(VaultGUID: String): Unit
  def CopyVault(CopyVaultJob: ICopyVaultJob): ICopyVaultJobOutputInfo
  def CreateNewVault(VaultProperties: IVaultProperties): String
  def DestroyVault(VaultGUID: String): Unit
  def DetachVault(VaultGUID: String): Unit
  def GetBackupFileContents(BackupFileFull: String, BackupFileDifferential: String, Impersonation: IImpersonation): IVaultProperties
  def GetVaultProperties(VaultGUID: String): IVaultProperties
  def OptimizeVault(OptimizeVaultJob: IOptimizeVaultJob): Unit
  def RestoreVault(RestoreJob: IRestoreJob): Unit
  def TakeVaultOffline(VaultGUID: String, DisconnectUsers: Boolean): Unit
}

object IServerVaultManagementOperations {
  @scala.inline
  def apply(
    AttachVault: (IVaultProperties, Boolean) => IVaultProperties,
    AttachVaultWithOptions: (IVaultProperties, IAttachVaultOptions) => IVaultProperties,
    BackupVault: IBackupJob => Unit,
    BringVaultOnline: String => Unit,
    CopyVault: ICopyVaultJob => ICopyVaultJobOutputInfo,
    CreateNewVault: IVaultProperties => String,
    DestroyVault: String => Unit,
    DetachVault: String => Unit,
    GetBackupFileContents: (String, String, IImpersonation) => IVaultProperties,
    GetVaultProperties: String => IVaultProperties,
    OptimizeVault: IOptimizeVaultJob => Unit,
    RestoreVault: IRestoreJob => Unit,
    TakeVaultOffline: (String, Boolean) => Unit
  ): IServerVaultManagementOperations = {
    val __obj = js.Dynamic.literal(AttachVault = js.Any.fromFunction2(AttachVault), AttachVaultWithOptions = js.Any.fromFunction2(AttachVaultWithOptions), BackupVault = js.Any.fromFunction1(BackupVault), BringVaultOnline = js.Any.fromFunction1(BringVaultOnline), CopyVault = js.Any.fromFunction1(CopyVault), CreateNewVault = js.Any.fromFunction1(CreateNewVault), DestroyVault = js.Any.fromFunction1(DestroyVault), DetachVault = js.Any.fromFunction1(DetachVault), GetBackupFileContents = js.Any.fromFunction3(GetBackupFileContents), GetVaultProperties = js.Any.fromFunction1(GetVaultProperties), OptimizeVault = js.Any.fromFunction1(OptimizeVault), RestoreVault = js.Any.fromFunction1(RestoreVault), TakeVaultOffline = js.Any.fromFunction2(TakeVaultOffline))
  
    __obj.asInstanceOf[IServerVaultManagementOperations]
  }
}

