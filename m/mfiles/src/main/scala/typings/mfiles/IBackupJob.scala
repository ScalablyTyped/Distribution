package typings.mfiles

import typings.mfiles.MFiles.MFBackupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackupJob extends js.Object {
  var BackupType: MFBackupType = js.native
  var FileSizeLimitInMB: Double = js.native
  var Impersonation: IImpersonation = js.native
  var OverwriteExistingFiles: Boolean = js.native
  var TargetFile: String = js.native
  var VaultGUID: String = js.native
  def Clone(): IBackupJob = js.native
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
    val __obj = js.Dynamic.literal(BackupType = BackupType.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), FileSizeLimitInMB = FileSizeLimitInMB.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], OverwriteExistingFiles = OverwriteExistingFiles.asInstanceOf[js.Any], TargetFile = TargetFile.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackupJob]
  }
  @scala.inline
  implicit class IBackupJobOps[Self <: IBackupJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupType(value: MFBackupType): Self = this.set("BackupType", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IBackupJob): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setFileSizeLimitInMB(value: Double): Self = this.set("FileSizeLimitInMB", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = this.set("Impersonation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverwriteExistingFiles(value: Boolean): Self = this.set("OverwriteExistingFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetFile(value: String): Self = this.set("TargetFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultGUID(value: String): Self = this.set("VaultGUID", value.asInstanceOf[js.Any])
  }
  
}

