package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFilterViewRequest extends StObject {
  
  /** The filter to add. The filterViewId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a filter that already exists.) */
  var filter: js.UndefOr[FilterView] = js.undefined
}
object AddFilterViewRequest {
  
  @scala.inline
  def apply(): AddFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFilterViewRequest]
  }
  
  @scala.inline
  implicit class AddFilterViewRequestMutableBuilder[Self <: AddFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
