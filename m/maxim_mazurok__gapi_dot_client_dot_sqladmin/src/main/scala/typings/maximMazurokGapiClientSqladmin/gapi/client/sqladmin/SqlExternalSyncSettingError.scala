package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlExternalSyncSettingError extends StObject {
  
  /** Additional information about the error encountered. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** This is always *sql#migrationSettingError*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Identifies the specific error that occurred. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SqlExternalSyncSettingError {
  
  @scala.inline
  def apply(): SqlExternalSyncSettingError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlExternalSyncSettingError]
  }
  
  @scala.inline
  implicit class SqlExternalSyncSettingErrorMutableBuilder[Self <: SqlExternalSyncSettingError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
