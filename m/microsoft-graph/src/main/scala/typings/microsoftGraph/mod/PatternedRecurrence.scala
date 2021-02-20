package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatternedRecurrence extends StObject {
  
  // The frequency of an event.
  var pattern: js.UndefOr[NullableOption[RecurrencePattern]] = js.native
  
  // The duration of an event.
  var range: js.UndefOr[NullableOption[RecurrenceRange]] = js.native
}
object PatternedRecurrence {
  
  @scala.inline
  def apply(): PatternedRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatternedRecurrence]
  }
  
  @scala.inline
  implicit class PatternedRecurrenceMutableBuilder[Self <: PatternedRecurrence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: NullableOption[RecurrencePattern]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setRange(value: NullableOption[RecurrenceRange]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeNull: Self = StObject.set(x, "range", null)
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
