package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRestoreJob extends StObject {
  
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
    val __obj = js.Dynamic.literal(BackupFileDifferential = BackupFileDifferential.asInstanceOf[js.Any], BackupFileFull = BackupFileFull.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], OverwriteExistingFiles = OverwriteExistingFiles.asInstanceOf[js.Any], VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestoreJob]
  }
  
  @scala.inline
  implicit class IRestoreJobMutableBuilder[Self <: IRestoreJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupFileDifferential(value: String): Self = StObject.set(x, "BackupFileDifferential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupFileFull(value: String): Self = StObject.set(x, "BackupFileFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteExistingFiles(value: Boolean): Self = StObject.set(x, "OverwriteExistingFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultProperties(value: IVaultProperties): Self = StObject.set(x, "VaultProperties", value.asInstanceOf[js.Any])
  }
}
