package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortRangeRequest extends StObject {
  
  /** The range to sort. */
  var range: js.UndefOr[GridRange] = js.undefined
  
  /** The sort order per column. Later specifications are used when values are equal in the earlier specifications. */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
}
object SortRangeRequest {
  
  inline def apply(): SortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortRangeRequest]
  }
  
  extension [Self <: SortRangeRequest](x: Self) {
    
    inline def setRange(value: GridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSortSpecs(value: js.Array[SortSpec]): Self = StObject.set(x, "sortSpecs", value.asInstanceOf[js.Any])
    
    inline def setSortSpecsUndefined: Self = StObject.set(x, "sortSpecs", js.undefined)
    
    inline def setSortSpecsVarargs(value: SortSpec*): Self = StObject.set(x, "sortSpecs", js.Array(value :_*))
  }
}
