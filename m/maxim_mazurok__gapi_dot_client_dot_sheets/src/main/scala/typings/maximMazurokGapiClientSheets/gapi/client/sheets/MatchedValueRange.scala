package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchedValueRange extends StObject {
  
  /** The DataFilters from the request that matched the range of values. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  
  /** The values matched by the DataFilter. */
  var valueRange: js.UndefOr[ValueRange] = js.undefined
}
object MatchedValueRange {
  
  inline def apply(): MatchedValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedValueRange]
  }
  
  extension [Self <: MatchedValueRange](x: Self) {
    
    inline def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    inline def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    inline def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value*))
    
    inline def setValueRange(value: ValueRange): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
