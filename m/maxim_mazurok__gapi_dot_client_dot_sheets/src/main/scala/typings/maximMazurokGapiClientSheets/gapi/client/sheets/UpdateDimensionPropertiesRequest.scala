package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDimensionPropertiesRequest extends js.Object {
  
  /** The columns on a data source sheet to update. */
  var dataSourceSheetRange: js.UndefOr[DataSourceSheetDimensionRange] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `properties` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** Properties to update. */
  var properties: js.UndefOr[DimensionProperties] = js.native
  
  /** The rows or columns to update. */
  var range: js.UndefOr[DimensionRange] = js.native
}
object UpdateDimensionPropertiesRequest {
  
  @scala.inline
  def apply(): UpdateDimensionPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDimensionPropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateDimensionPropertiesRequestOps[Self <: UpdateDimensionPropertiesRequest] (val x: Self) extends AnyVal {
    
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
    def setDataSourceSheetRange(value: DataSourceSheetDimensionRange): Self = this.set("dataSourceSheetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceSheetRange: Self = this.set("dataSourceSheetRange", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setProperties(value: DimensionProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRange(value: DimensionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
