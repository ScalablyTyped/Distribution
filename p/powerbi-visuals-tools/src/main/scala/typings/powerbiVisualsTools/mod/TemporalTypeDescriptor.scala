package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalTypeDescriptor extends StObject {
  
  val day: js.UndefOr[Boolean] = js.undefined
  
  val month: js.UndefOr[Boolean] = js.undefined
  
  val paddedDateTableDate: js.UndefOr[Boolean] = js.undefined
  
  val quarter: js.UndefOr[Boolean] = js.undefined
  
  val year: js.UndefOr[Boolean] = js.undefined
}
object TemporalTypeDescriptor {
  
  inline def apply(): TemporalTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalTypeDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemporalTypeDescriptor] (val x: Self) extends AnyVal {
    
    inline def setDay(value: Boolean): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: Boolean): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setPaddedDateTableDate(value: Boolean): Self = StObject.set(x, "paddedDateTableDate", value.asInstanceOf[js.Any])
    
    inline def setPaddedDateTableDateUndefined: Self = StObject.set(x, "paddedDateTableDate", js.undefined)
    
    inline def setQuarter(value: Boolean): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
    
    inline def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
    
    inline def setYear(value: Boolean): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
