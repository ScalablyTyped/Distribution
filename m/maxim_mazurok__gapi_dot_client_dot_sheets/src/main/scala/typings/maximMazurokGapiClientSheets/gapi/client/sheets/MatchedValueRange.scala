package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchedValueRange extends StObject {
  
  /** The DataFilters from the request that matched the range of values. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
  
  /** The values matched by the DataFilter. */
  var valueRange: js.UndefOr[ValueRange] = js.native
}
object MatchedValueRange {
  
  @scala.inline
  def apply(): MatchedValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchedValueRange]
  }
  
  @scala.inline
  implicit class MatchedValueRangeMutableBuilder[Self <: MatchedValueRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = StObject.set(x, "dataFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFiltersUndefined: Self = StObject.set(x, "dataFilters", js.undefined)
    
    @scala.inline
    def setDataFiltersVarargs(value: DataFilter*): Self = StObject.set(x, "dataFilters", js.Array(value :_*))
    
    @scala.inline
    def setValueRange(value: ValueRange): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
