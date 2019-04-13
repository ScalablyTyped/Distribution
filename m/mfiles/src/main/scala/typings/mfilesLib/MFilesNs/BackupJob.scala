package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.BackupJob")
@js.native
class BackupJob ()
  extends mfilesLib.IBackupJob {
  /* CompleteClass */
  override var BackupType: MFBackupType = js.native
  /* CompleteClass */
  override var FileSizeLimitInMB: scala.Double = js.native
  /* CompleteClass */
  override var Impersonation: mfilesLib.IImpersonation = js.native
  /* CompleteClass */
  override var OverwriteExistingFiles: scala.Boolean = js.native
  /* CompleteClass */
  override var TargetFile: java.lang.String = js.native
  /* CompleteClass */
  override var VaultGUID: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IBackupJob = js.native
}

@JSGlobal("MFiles.BackupJob")
@js.native
object BackupJob
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IBackupJob]

