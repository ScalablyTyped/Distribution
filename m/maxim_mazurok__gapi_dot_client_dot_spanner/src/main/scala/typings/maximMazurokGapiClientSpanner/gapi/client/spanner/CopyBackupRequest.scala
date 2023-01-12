package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyBackupRequest extends StObject {
  
  /** Required. The id of the backup copy. The `backup_id` appended to `parent` forms the full backup_uri of the form `projects//instances//backups/`. */
  var backupId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The encryption configuration used to encrypt the backup. If this field is not specified, the backup will use the same encryption configuration as the source backup by
    * default, namely encryption_type = `USE_CONFIG_DEFAULT_OR_BACKUP_ENCRYPTION`.
    */
  var encryptionConfig: js.UndefOr[CopyBackupEncryptionConfig] = js.undefined
  
  /**
    * Required. The expiration time of the backup in microsecond granularity. The expiration time must be at least 6 hours and at most 366 days from the `create_time` of the source
    * backup. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
    */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The source backup to be copied. The source backup needs to be in READY state for it to be copied. Once CopyBackup is in progress, the source backup cannot be deleted or
    * cleaned up on expiration until CopyBackup is finished. Values are of the form: `projects//instances//backups/`.
    */
  var sourceBackup: js.UndefOr[String] = js.undefined
}
object CopyBackupRequest {
  
  inline def apply(): CopyBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBackupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyBackupRequest] (val x: Self) extends AnyVal {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setEncryptionConfig(value: CopyBackupEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setSourceBackup(value: String): Self = StObject.set(x, "sourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "sourceBackup", js.undefined)
  }
}
