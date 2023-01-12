package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternedRecurrence extends StObject {
  
  /**
    * The frequency of an event. For access reviews: Do not specify this property for a one-time access review. Only
    * interval, dayOfMonth, and type (weekly, absoluteMonthly) properties of recurrencePattern are supported.
    */
  var pattern: js.UndefOr[NullableOption[RecurrencePattern]] = js.undefined
  
  // The duration of an event.
  var range: js.UndefOr[NullableOption[RecurrenceRange]] = js.undefined
}
object PatternedRecurrence {
  
  inline def apply(): PatternedRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternedRecurrence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatternedRecurrence] (val x: Self) extends AnyVal {
    
    inline def setPattern(value: NullableOption[RecurrencePattern]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setRange(value: NullableOption[RecurrenceRange]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
