package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestoreJob extends js.Object {
  var BackupFileDifferential: String
  var BackupFileFull: String
  var Impersonation: IImpersonation
  var OverwriteExistingFiles: Boolean
  var VaultProperties: IVaultProperties
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
    val __obj = js.Dynamic.literal(BackupFileDifferential = BackupFileDifferential, BackupFileFull = BackupFileFull, Impersonation = Impersonation, OverwriteExistingFiles = OverwriteExistingFiles, VaultProperties = VaultProperties)
  
    __obj.asInstanceOf[IRestoreJob]
  }
}

