package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShiftPreferences extends ChangeTrackedEntity {
  
  // Availability of the user to be scheduled for work and its recurrence pattern.
  var availability: js.UndefOr[NullableOption[js.Array[ShiftAvailability]]] = js.native
}
object ShiftPreferences {
  
  @scala.inline
  def apply(): ShiftPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftPreferences]
  }
  
  @scala.inline
  implicit class ShiftPreferencesMutableBuilder[Self <: ShiftPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: NullableOption[js.Array[ShiftAvailability]]): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setAvailabilityVarargs(value: ShiftAvailability*): Self = StObject.set(x, "availability", js.Array(value :_*))
  }
}
