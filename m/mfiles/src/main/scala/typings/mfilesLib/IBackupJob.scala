package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackupJob extends js.Object {
  var BackupType: mfilesLib.MFilesNs.MFBackupType
  var FileSizeLimitInMB: scala.Double
  var Impersonation: IImpersonation
  var OverwriteExistingFiles: scala.Boolean
  var TargetFile: java.lang.String
  var VaultGUID: java.lang.String
  def Clone(): IBackupJob
}

object IBackupJob {
  @scala.inline
  def apply(
    BackupType: mfilesLib.MFilesNs.MFBackupType,
    Clone: js.Function0[IBackupJob],
    FileSizeLimitInMB: scala.Double,
    Impersonation: IImpersonation,
    OverwriteExistingFiles: scala.Boolean,
    TargetFile: java.lang.String,
    VaultGUID: java.lang.String
  ): IBackupJob = {
    val __obj = js.Dynamic.literal(BackupType = BackupType, Clone = Clone, FileSizeLimitInMB = FileSizeLimitInMB, Impersonation = Impersonation, OverwriteExistingFiles = OverwriteExistingFiles, TargetFile = TargetFile, VaultGUID = VaultGUID)
  
    __obj.asInstanceOf[IBackupJob]
  }
}

