package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchClearValuesByDataFilterRequest extends StObject {
  
  /** The DataFilters used to determine which ranges to clear. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
}
object BatchClearValuesByDataFilterRequest {
  
  @scala.inline
  def apply(): BatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesByDataFilterRequest]
  }
  
  @scala.inline
  implicit class BatchClearValuesByDataFilterRequestMutableBuilder[Self <: BatchClearValuesByDataFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
  }
}
