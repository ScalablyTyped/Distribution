package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupConfiguration extends StObject {
  
  /** Backup retention settings. */
  var backupRetentionSettings: js.UndefOr[BackupRetentionSettings] = js.undefined
  
  /** (MySQL only) Whether binary log is enabled. If backup configuration is disabled, binarylog must be disabled as well. */
  var binaryLogEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether this configuration is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** This is always `sql#backupConfiguration`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Location of the backup */
  var location: js.UndefOr[String] = js.undefined
  
  /** (Postgres only) Whether point in time recovery is enabled. */
  var pointInTimeRecoveryEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Reserved for future use. */
  var replicationLogArchivingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Start time for the daily backup configuration in UTC timezone in the 24 hour format - `HH:MM`. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The number of days of transaction logs we retain for point in time restore, from 1-7. */
  var transactionLogRetentionDays: js.UndefOr[Double] = js.undefined
}
object BackupConfiguration {
  
  inline def apply(): BackupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBackupRetentionSettings(value: BackupRetentionSettings): Self = StObject.set(x, "backupRetentionSettings", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionSettingsUndefined: Self = StObject.set(x, "backupRetentionSettings", js.undefined)
    
    inline def setBinaryLogEnabled(value: Boolean): Self = StObject.set(x, "binaryLogEnabled", value.asInstanceOf[js.Any])
    
    inline def setBinaryLogEnabledUndefined: Self = StObject.set(x, "binaryLogEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPointInTimeRecoveryEnabled(value: Boolean): Self = StObject.set(x, "pointInTimeRecoveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeRecoveryEnabledUndefined: Self = StObject.set(x, "pointInTimeRecoveryEnabled", js.undefined)
    
    inline def setReplicationLogArchivingEnabled(value: Boolean): Self = StObject.set(x, "replicationLogArchivingEnabled", value.asInstanceOf[js.Any])
    
    inline def setReplicationLogArchivingEnabledUndefined: Self = StObject.set(x, "replicationLogArchivingEnabled", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTransactionLogRetentionDays(value: Double): Self = StObject.set(x, "transactionLogRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setTransactionLogRetentionDaysUndefined: Self = StObject.set(x, "transactionLogRetentionDays", js.undefined)
  }
}
