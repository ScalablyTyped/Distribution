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

