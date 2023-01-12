package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDimensionPropertiesRequest extends StObject {
  
  /** The columns on a data source sheet to update. */
  var dataSourceSheetRange: js.UndefOr[DataSourceSheetDimensionRange] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `properties` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** Properties to update. */
  var properties: js.UndefOr[DimensionProperties] = js.undefined
  
  /** The rows or columns to update. */
  var range: js.UndefOr[DimensionRange] = js.undefined
}
object UpdateDimensionPropertiesRequest {
  
  inline def apply(): UpdateDimensionPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDimensionPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDimensionPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSourceSheetRange(value: DataSourceSheetDimensionRange): Self = StObject.set(x, "dataSourceSheetRange", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSheetRangeUndefined: Self = StObject.set(x, "dataSourceSheetRange", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setProperties(value: DimensionProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
