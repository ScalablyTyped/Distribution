package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplicateFilterViewResponse extends StObject {
  
  /** The newly created filter. */
  var filter: js.UndefOr[FilterView] = js.native
}
object DuplicateFilterViewResponse {
  
  @scala.inline
  def apply(): DuplicateFilterViewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplicateFilterViewResponse]
  }
  
  @scala.inline
  implicit class DuplicateFilterViewResponseMutableBuilder[Self <: DuplicateFilterViewResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
