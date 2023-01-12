package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInstancesVerifyExternalSyncSettingsRequest extends StObject {
  
  /** Optional. MySQL-specific settings for start external sync. */
  var mysqlSyncConfig: js.UndefOr[MySqlSyncConfig] = js.undefined
  
  /** External sync mode */
  var syncMode: js.UndefOr[String] = js.undefined
  
  /** Flag to enable verifying connection only */
  var verifyConnectionOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Flag to verify settings required by replication setup only */
  var verifyReplicationOnly: js.UndefOr[Boolean] = js.undefined
}
object SqlInstancesVerifyExternalSyncSettingsRequest {
  
  inline def apply(): SqlInstancesVerifyExternalSyncSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInstancesVerifyExternalSyncSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlInstancesVerifyExternalSyncSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setMysqlSyncConfig(value: MySqlSyncConfig): Self = StObject.set(x, "mysqlSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setMysqlSyncConfigUndefined: Self = StObject.set(x, "mysqlSyncConfig", js.undefined)
    
    inline def setSyncMode(value: String): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
    
    inline def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
    
    inline def setVerifyConnectionOnly(value: Boolean): Self = StObject.set(x, "verifyConnectionOnly", value.asInstanceOf[js.Any])
    
    inline def setVerifyConnectionOnlyUndefined: Self = StObject.set(x, "verifyConnectionOnly", js.undefined)
    
    inline def setVerifyReplicationOnly(value: Boolean): Self = StObject.set(x, "verifyReplicationOnly", value.asInstanceOf[js.Any])
    
    inline def setVerifyReplicationOnlyUndefined: Self = StObject.set(x, "verifyReplicationOnly", js.undefined)
  }
}
