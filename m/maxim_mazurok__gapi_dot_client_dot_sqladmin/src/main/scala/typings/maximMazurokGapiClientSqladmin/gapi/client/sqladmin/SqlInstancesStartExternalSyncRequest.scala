package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInstancesStartExternalSyncRequest extends StObject {
  
  /** MySQL-specific settings for start external sync. */
  var mysqlSyncConfig: js.UndefOr[MySqlSyncConfig] = js.undefined
  
  /** Whether to skip the verification step (VESS). */
  var skipVerification: js.UndefOr[Boolean] = js.undefined
  
  /** External sync mode. */
  var syncMode: js.UndefOr[String] = js.undefined
}
object SqlInstancesStartExternalSyncRequest {
  
  inline def apply(): SqlInstancesStartExternalSyncRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInstancesStartExternalSyncRequest]
  }
  
  extension [Self <: SqlInstancesStartExternalSyncRequest](x: Self) {
    
    inline def setMysqlSyncConfig(value: MySqlSyncConfig): Self = StObject.set(x, "mysqlSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setMysqlSyncConfigUndefined: Self = StObject.set(x, "mysqlSyncConfig", js.undefined)
    
    inline def setSkipVerification(value: Boolean): Self = StObject.set(x, "skipVerification", value.asInstanceOf[js.Any])
    
    inline def setSkipVerificationUndefined: Self = StObject.set(x, "skipVerification", js.undefined)
    
    inline def setSyncMode(value: String): Self = StObject.set(x, "syncMode", value.asInstanceOf[js.Any])
    
    inline def setSyncModeUndefined: Self = StObject.set(x, "syncMode", js.undefined)
  }
}
