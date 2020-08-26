package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestoreJob extends js.Object {
  var BackupFileDifferential: String = js.native
  var BackupFileFull: String = js.native
  var Impersonation: IImpersonation = js.native
  var OverwriteExistingFiles: Boolean = js.native
  var VaultProperties: IVaultProperties = js.native
}

object IRestoreJob {
  @scala.inline
  def apply(
    BackupFileDifferential: String,
    BackupFileFull: String,
    Impersonation: IImpersonation,
    OverwriteExistingFiles: Boolean,
    VaultProperties: IVaultProperties
  ): IRestoreJob = {
    val __obj = js.Dynamic.literal(BackupFileDifferential = BackupFileDifferential.asInstanceOf[js.Any], BackupFileFull = BackupFileFull.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], OverwriteExistingFiles = OverwriteExistingFiles.asInstanceOf[js.Any], VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestoreJob]
  }
  @scala.inline
  implicit class IRestoreJobOps[Self <: IRestoreJob] (val x: Self) extends AnyVal {
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
    def setBackupFileDifferential(value: String): Self = this.set("BackupFileDifferential", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupFileFull(value: String): Self = this.set("BackupFileFull", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = this.set("Impersonation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverwriteExistingFiles(value: Boolean): Self = this.set("OverwriteExistingFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultProperties(value: IVaultProperties): Self = this.set("VaultProperties", value.asInstanceOf[js.Any])
  }
  
}

