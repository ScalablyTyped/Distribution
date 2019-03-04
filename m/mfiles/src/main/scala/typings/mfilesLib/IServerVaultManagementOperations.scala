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
    AttachVault: js.Function2[IVaultProperties, scala.Boolean, IVaultProperties],
    AttachVaultWithOptions: js.Function2[IVaultProperties, IAttachVaultOptions, IVaultProperties],
    BackupVault: js.Function1[IBackupJob, scala.Unit],
    BringVaultOnline: js.Function1[java.lang.String, scala.Unit],
    CopyVault: js.Function1[ICopyVaultJob, ICopyVaultJobOutputInfo],
    CreateNewVault: js.Function1[IVaultProperties, java.lang.String],
    DestroyVault: js.Function1[java.lang.String, scala.Unit],
    DetachVault: js.Function1[java.lang.String, scala.Unit],
    GetBackupFileContents: js.Function3[java.lang.String, java.lang.String, IImpersonation, IVaultProperties],
    GetVaultProperties: js.Function1[java.lang.String, IVaultProperties],
    OptimizeVault: js.Function1[IOptimizeVaultJob, scala.Unit],
    RestoreVault: js.Function1[IRestoreJob, scala.Unit],
    TakeVaultOffline: js.Function2[java.lang.String, scala.Boolean, scala.Unit]
  ): IServerVaultManagementOperations = {
    val __obj = js.Dynamic.literal(AttachVault = AttachVault, AttachVaultWithOptions = AttachVaultWithOptions, BackupVault = BackupVault, BringVaultOnline = BringVaultOnline, CopyVault = CopyVault, CreateNewVault = CreateNewVault, DestroyVault = DestroyVault, DetachVault = DetachVault, GetBackupFileContents = GetBackupFileContents, GetVaultProperties = GetVaultProperties, OptimizeVault = OptimizeVault, RestoreVault = RestoreVault, TakeVaultOffline = TakeVaultOffline)
  
    __obj.asInstanceOf[IServerVaultManagementOperations]
  }
}

