package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataFilterValueRange extends StObject {
  
  /** The data filter describing the location of the values in the spreadsheet. */
  var dataFilter: js.UndefOr[DataFilter] = js.native
  
  /** The major dimension of the values. */
  var majorDimension: js.UndefOr[String] = js.native
  
  /**
    * The data to be written. If the provided values exceed any of the ranges matched by the data filter then the request fails. If the provided values are less than the matched ranges
    * only the specified values are written, existing values in the matched ranges remain unaffected.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}
object DataFilterValueRange {
  
  @scala.inline
  def apply(): DataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFilterValueRange]
  }
  
  @scala.inline
  implicit class DataFilterValueRangeMutableBuilder[Self <: DataFilterValueRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataFilter(value: DataFilter): Self = StObject.set(x, "dataFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFilterUndefined: Self = StObject.set(x, "dataFilter", js.undefined)
    
    @scala.inline
    def setMajorDimension(value: String): Self = StObject.set(x, "majorDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorDimensionUndefined: Self = StObject.set(x, "majorDimension", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.Array[_]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
