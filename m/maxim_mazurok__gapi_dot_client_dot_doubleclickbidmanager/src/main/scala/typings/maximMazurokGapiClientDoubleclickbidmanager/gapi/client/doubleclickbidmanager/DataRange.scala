package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRange extends StObject {
  
  /** The ending date for the data that is shown in the report. Note, `customEndDate` is required if `range` is `CUSTOM_DATES` and ignored otherwise. */
  var customEndDate: js.UndefOr[Date] = js.undefined
  
  /** The starting data for the data that is shown in the report. Note, `customStartDate` is required if `range` is `CUSTOM_DATES` and ignored otherwise. */
  var customStartDate: js.UndefOr[Date] = js.undefined
  
  /** Report data range used to generate the report. */
  var range: js.UndefOr[String] = js.undefined
}
object DataRange {
  
  inline def apply(): DataRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataRange] (val x: Self) extends AnyVal {
    
    inline def setCustomEndDate(value: Date): Self = StObject.set(x, "customEndDate", value.asInstanceOf[js.Any])
    
    inline def setCustomEndDateUndefined: Self = StObject.set(x, "customEndDate", js.undefined)
    
    inline def setCustomStartDate(value: Date): Self = StObject.set(x, "customStartDate", value.asInstanceOf[js.Any])
    
    inline def setCustomStartDateUndefined: Self = StObject.set(x, "customStartDate", js.undefined)
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
