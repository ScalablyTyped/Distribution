package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplicateFilterViewResponse extends StObject {
  
  /** The newly created filter. */
  var filter: js.UndefOr[FilterView] = js.undefined
}
object DuplicateFilterViewResponse {
  
  inline def apply(): DuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateFilterViewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DuplicateFilterViewResponse] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
