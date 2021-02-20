package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFilterViewRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `filter` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** The new properties of the filter view. */
  var filter: js.UndefOr[FilterView] = js.native
}
object UpdateFilterViewRequest {
  
  @scala.inline
  def apply(): UpdateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFilterViewRequest]
  }
  
  @scala.inline
  implicit class UpdateFilterViewRequestMutableBuilder[Self <: UpdateFilterViewRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterView): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
