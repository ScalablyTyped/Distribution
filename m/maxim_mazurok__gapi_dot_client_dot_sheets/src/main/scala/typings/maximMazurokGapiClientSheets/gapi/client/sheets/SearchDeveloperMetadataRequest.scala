package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchDeveloperMetadataRequest extends StObject {
  
  /**
    * The data filters describing the criteria used to determine which DeveloperMetadata entries to return. DeveloperMetadata matching any of the specified filters are included in the
    * response.
    */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
}
object SearchDeveloperMetadataRequest {
  
  @scala.inline
  def apply(): SearchDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDeveloperMetadataRequest]
  }
  
  @scala.inline
  implicit class SearchDeveloperMetadataRequestMutableBuilder[Self <: SearchDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
  }
}
