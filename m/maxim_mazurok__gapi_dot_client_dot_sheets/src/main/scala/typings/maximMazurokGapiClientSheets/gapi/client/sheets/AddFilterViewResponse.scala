package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFilterViewResponse extends StObject {
  
  /** The newly added filter view. */
  var filter: js.UndefOr[FilterView] = js.undefined
}
object AddFilterViewResponse {
  
  inline def apply(): AddFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFilterViewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddFilterViewResponse] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
