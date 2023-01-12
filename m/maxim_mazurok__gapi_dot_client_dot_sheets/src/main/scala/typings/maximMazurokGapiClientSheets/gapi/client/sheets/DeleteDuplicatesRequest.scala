package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDuplicatesRequest extends StObject {
  
  /** The columns in the range to analyze for duplicate values. If no columns are selected then all columns are analyzed for duplicates. */
  var comparisonColumns: js.UndefOr[js.Array[DimensionRange]] = js.undefined
  
  /** The range to remove duplicates rows from. */
  var range: js.UndefOr[GridRange] = js.undefined
}
object DeleteDuplicatesRequest {
  
  inline def apply(): DeleteDuplicatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDuplicatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDuplicatesRequest] (val x: Self) extends AnyVal {
    
    inline def setComparisonColumns(value: js.Array[DimensionRange]): Self = StObject.set(x, "comparisonColumns", value.asInstanceOf[js.Any])
    
    inline def setComparisonColumnsUndefined: Self = StObject.set(x, "comparisonColumns", js.undefined)
    
    inline def setComparisonColumnsVarargs(value: DimensionRange*): Self = StObject.set(x, "comparisonColumns", js.Array(value*))
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
