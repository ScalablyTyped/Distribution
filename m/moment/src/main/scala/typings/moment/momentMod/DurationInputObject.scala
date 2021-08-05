package typings.moment.momentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationInputObject
  extends StObject
     with MomentInputObject
     with _DurationInputArg1 {
  
  var Q: js.UndefOr[Double] = js.undefined
  
  var quarter: js.UndefOr[Double] = js.undefined
  
  var quarters: js.UndefOr[Double] = js.undefined
  
  var w: js.UndefOr[Double] = js.undefined
  
  var week: js.UndefOr[Double] = js.undefined
  
  var weeks: js.UndefOr[Double] = js.undefined
}
object DurationInputObject {
  
  inline def apply(): DurationInputObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationInputObject]
  }
  
  extension [Self <: DurationInputObject](x: Self) {
    
    inline def setQ(value: Double): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
    
    inline def setQuarter(value: Double): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
    
    inline def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
    
    inline def setQuarters(value: Double): Self = StObject.set(x, "quarters", value.asInstanceOf[js.Any])
    
    inline def setQuartersUndefined: Self = StObject.set(x, "quarters", js.undefined)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    inline def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
  }
}
