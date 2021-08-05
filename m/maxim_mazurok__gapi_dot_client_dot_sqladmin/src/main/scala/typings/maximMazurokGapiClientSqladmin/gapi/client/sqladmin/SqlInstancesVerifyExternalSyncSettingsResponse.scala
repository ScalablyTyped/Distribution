package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInstancesVerifyExternalSyncSettingsResponse extends StObject {
  
  /** List of migration violations. */
  var errors: js.UndefOr[js.Array[SqlExternalSyncSettingError]] = js.undefined
  
  /** This is always *sql#migrationSettingErrorList*. */
  var kind: js.UndefOr[String] = js.undefined
}
object SqlInstancesVerifyExternalSyncSettingsResponse {
  
  inline def apply(): SqlInstancesVerifyExternalSyncSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInstancesVerifyExternalSyncSettingsResponse]
  }
  
  extension [Self <: SqlInstancesVerifyExternalSyncSettingsResponse](x: Self) {
    
    inline def setErrors(value: js.Array[SqlExternalSyncSettingError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SqlExternalSyncSettingError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
