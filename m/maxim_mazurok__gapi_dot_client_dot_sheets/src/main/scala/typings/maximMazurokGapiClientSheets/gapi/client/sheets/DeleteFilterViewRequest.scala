package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFilterViewRequest extends StObject {
  
  /** The ID of the filter to delete. */
  var filterId: js.UndefOr[Double] = js.undefined
}
object DeleteFilterViewRequest {
  
  @scala.inline
  def apply(): DeleteFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFilterViewRequest]
  }
  
  @scala.inline
  implicit class DeleteFilterViewRequestMutableBuilder[Self <: DeleteFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
