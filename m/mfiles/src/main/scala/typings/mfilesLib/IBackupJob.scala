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

