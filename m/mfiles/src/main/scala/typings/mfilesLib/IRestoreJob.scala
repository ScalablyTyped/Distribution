package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRestoreJob extends js.Object {
  var BackupFileDifferential: java.lang.String
  var BackupFileFull: java.lang.String
  var Impersonation: IImpersonation
  var OverwriteExistingFiles: scala.Boolean
  var VaultProperties: IVaultProperties
}

object IRestoreJob {
  @scala.inline
  def apply(
    BackupFileDifferential: java.lang.String,
    BackupFileFull: java.lang.String,
    Impersonation: IImpersonation,
    OverwriteExistingFiles: scala.Boolean,
    VaultProperties: IVaultProperties
  ): IRestoreJob = {
    val __obj = js.Dynamic.literal(BackupFileDifferential = BackupFileDifferential, BackupFileFull = BackupFileFull, Impersonation = Impersonation, OverwriteExistingFiles = OverwriteExistingFiles, VaultProperties = VaultProperties)
  
    __obj.asInstanceOf[IRestoreJob]
  }
}

