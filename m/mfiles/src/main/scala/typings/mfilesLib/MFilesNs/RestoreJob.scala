package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.RestoreJob")
@js.native
class RestoreJob ()
  extends mfilesLib.IRestoreJob {
  /* CompleteClass */
  override var BackupFileDifferential: java.lang.String = js.native
  /* CompleteClass */
  override var BackupFileFull: java.lang.String = js.native
  /* CompleteClass */
  override var Impersonation: mfilesLib.IImpersonation = js.native
  /* CompleteClass */
  override var OverwriteExistingFiles: scala.Boolean = js.native
  /* CompleteClass */
  override var VaultProperties: mfilesLib.IVaultProperties = js.native
}

