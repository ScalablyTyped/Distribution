package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoResizeDimensionsRequest extends StObject {
  
  /** The dimensions on a data source sheet to automatically resize. */
  var dataSourceSheetDimensions: js.UndefOr[DataSourceSheetDimensionRange] = js.undefined
  
  /** The dimensions to automatically resize. */
  var dimensions: js.UndefOr[DimensionRange] = js.undefined
}
object AutoResizeDimensionsRequest {
  
  inline def apply(): AutoResizeDimensionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResizeDimensionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoResizeDimensionsRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSourceSheetDimensions(value: DataSourceSheetDimensionRange): Self = StObject.set(x, "dataSourceSheetDimensions", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSheetDimensionsUndefined: Self = StObject.set(x, "dataSourceSheetDimensions", js.undefined)
    
    inline def setDimensions(value: DimensionRange): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
  }
}
