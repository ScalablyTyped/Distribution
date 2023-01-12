package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlInstancesVerifyExternalSyncSettingsResponse extends StObject {
  
  /** List of migration violations. */
  var errors: js.UndefOr[js.Array[SqlExternalSyncSettingError]] = js.undefined
  
  /** This is always `sql#migrationSettingErrorList`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** List of migration warnings. */
  var warnings: js.UndefOr[js.Array[SqlExternalSyncSettingError]] = js.undefined
}
object SqlInstancesVerifyExternalSyncSettingsResponse {
  
  inline def apply(): SqlInstancesVerifyExternalSyncSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlInstancesVerifyExternalSyncSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlInstancesVerifyExternalSyncSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[SqlExternalSyncSettingError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SqlExternalSyncSettingError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setWarnings(value: js.Array[SqlExternalSyncSettingError]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: SqlExternalSyncSettingError*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
