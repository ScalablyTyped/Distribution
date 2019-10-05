package typings.mfiles

import typings.mfiles.MFiles.MFBackupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackupJob extends js.Object {
  var BackupType: MFBackupType
  var FileSizeLimitInMB: Double
  var Impersonation: IImpersonation
  var OverwriteExistingFiles: Boolean
  var TargetFile: String
  var VaultGUID: String
  def Clone(): IBackupJob
}

object IBackupJob {
  @scala.inline
  def apply(
    BackupType: MFBackupType,
    Clone: () => IBackupJob,
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation,
    OverwriteExistingFiles: Boolean,
    TargetFile: String,
    VaultGUID: String
  ): IBackupJob = {
    val __obj = js.Dynamic.literal(BackupType = BackupType, Clone = js.Any.fromFunction0(Clone), FileSizeLimitInMB = FileSizeLimitInMB, Impersonation = Impersonation, OverwriteExistingFiles = OverwriteExistingFiles, TargetFile = TargetFile, VaultGUID = VaultGUID)
  
    __obj.asInstanceOf[IBackupJob]
  }
}

