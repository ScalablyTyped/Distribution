package typings.mfiles.global.MFiles

import typings.mfiles.IImpersonation
import typings.mfiles.IRestoreJob
import typings.mfiles.IVaultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.RestoreJob")
@js.native
open class RestoreJob ()
  extends StObject
     with IRestoreJob {
  
  /* CompleteClass */
  var BackupFileDifferential: String = js.native
  
  /* CompleteClass */
  var BackupFileFull: String = js.native
  
  /* CompleteClass */
  var Impersonation: IImpersonation = js.native
  
  /* CompleteClass */
  var OverwriteExistingFiles: Boolean = js.native
  
  /* CompleteClass */
  var VaultProperties: IVaultProperties = js.native
}
