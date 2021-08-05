package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFilterViewRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `filter` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The new properties of the filter view. */
  var filter: js.UndefOr[FilterView] = js.undefined
}
object UpdateFilterViewRequest {
  
  inline def apply(): UpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFilterViewRequest]
  }
  
  extension [Self <: UpdateFilterViewRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
