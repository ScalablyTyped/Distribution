package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSpreadsheetPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root 'properties' is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The properties to update. */
  var properties: js.UndefOr[SpreadsheetProperties] = js.undefined
}
object UpdateSpreadsheetPropertiesRequest {
  
  @scala.inline
  def apply(): UpdateSpreadsheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSpreadsheetPropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateSpreadsheetPropertiesRequestMutableBuilder[Self <: UpdateSpreadsheetPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setProperties(value: SpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
