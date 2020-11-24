package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeveloperMetadataRequest extends js.Object {
  
  /** The filters matching the developer metadata entries to update. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  
  /** The value that all metadata matched by the data filters will be updated to. */
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `developerMetadata` is implied and should not be specified. A single `"*"` can be used as
    * short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.native
}
object UpdateDeveloperMetadataRequest {
  
  @scala.inline
  def apply(): UpdateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeveloperMetadataRequest]
  }
  
  @scala.inline
  implicit class UpdateDeveloperMetadataRequestOps[Self <: UpdateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
    
    @scala.inline
    def setDeveloperMetadata(value: DeveloperMetadata): Self = this.set("developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperMetadata: Self = this.set("developerMetadata", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
}
