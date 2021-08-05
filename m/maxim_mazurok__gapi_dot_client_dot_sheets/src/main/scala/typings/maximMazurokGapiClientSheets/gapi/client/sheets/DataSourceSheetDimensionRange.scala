package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSheetDimensionRange extends StObject {
  
  /** The columns on the data source sheet. */
  var columnReferences: js.UndefOr[js.Array[DataSourceColumnReference]] = js.undefined
  
  /** The ID of the data source sheet the range is on. */
  var sheetId: js.UndefOr[Double] = js.undefined
}
object DataSourceSheetDimensionRange {
  
  inline def apply(): DataSourceSheetDimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSheetDimensionRange]
  }
  
  extension [Self <: DataSourceSheetDimensionRange](x: Self) {
    
    inline def setColumnReferences(value: js.Array[DataSourceColumnReference]): Self = StObject.set(x, "columnReferences", value.asInstanceOf[js.Any])
    
    inline def setColumnReferencesUndefined: Self = StObject.set(x, "columnReferences", js.undefined)
    
    inline def setColumnReferencesVarargs(value: DataSourceColumnReference*): Self = StObject.set(x, "columnReferences", js.Array(value :_*))
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
