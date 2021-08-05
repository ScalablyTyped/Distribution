package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateFilterViewRequest extends StObject {
  
  /** The ID of the filter being duplicated. */
  var filterId: js.UndefOr[Double] = js.undefined
}
object DuplicateFilterViewRequest {
  
  inline def apply(): DuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateFilterViewRequest]
  }
  
  extension [Self <: DuplicateFilterViewRequest](x: Self) {
    
    inline def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
