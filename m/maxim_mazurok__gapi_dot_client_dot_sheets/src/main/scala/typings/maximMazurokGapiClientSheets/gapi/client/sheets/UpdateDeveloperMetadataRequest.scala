package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeveloperMetadataRequest extends StObject {
  
  /** The filters matching the developer metadata entries to update. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  
  /** The value that all metadata matched by the data filters will be updated to. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `developerMetadata` is implied and should not be specified. A single `"*"` can be used as
    * short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
}
object UpdateDeveloperMetadataRequest {
  
  @scala.inline
  def apply(): UpdateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeveloperMetadataRequest]
  }
  
  @scala.inline
  implicit class UpdateDeveloperMetadataRequestMutableBuilder[Self <: UpdateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDeveloperMetadata(value: DeveloperMetadata): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
