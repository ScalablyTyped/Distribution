package typings.mfiles.global.MFiles

import typings.mfiles.IBackupJob
import typings.mfiles.IImpersonation
import typings.mfiles.MFiles.MFBackupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.BackupJob")
@js.native
class BackupJob ()
  extends StObject
     with IBackupJob {
  
  /* CompleteClass */
  var BackupType: MFBackupType = js.native
  
  /* CompleteClass */
  override def Clone(): IBackupJob = js.native
  
  /* CompleteClass */
  var FileSizeLimitInMB: Double = js.native
  
  /* CompleteClass */
  var Impersonation: IImpersonation = js.native
  
  /* CompleteClass */
  var OverwriteExistingFiles: Boolean = js.native
  
  /* CompleteClass */
  var TargetFile: String = js.native
  
  /* CompleteClass */
  var VaultGUID: String = js.native
}
