package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IBackupJob
import typings.mfiles.IImpersonation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.BackupJob")
@js.native
class BackupJob () extends IBackupJob {
  /* CompleteClass */
  override var BackupType: MFBackupType = js.native
  /* CompleteClass */
  override var FileSizeLimitInMB: Double = js.native
  /* CompleteClass */
  override var Impersonation: IImpersonation = js.native
  /* CompleteClass */
  override var OverwriteExistingFiles: Boolean = js.native
  /* CompleteClass */
  override var TargetFile: String = js.native
  /* CompleteClass */
  override var VaultGUID: String = js.native
  /* CompleteClass */
  override def Clone(): IBackupJob = js.native
}

@JSGlobal("MFiles.BackupJob")
@js.native
object BackupJob extends Instantiable0[IBackupJob]

