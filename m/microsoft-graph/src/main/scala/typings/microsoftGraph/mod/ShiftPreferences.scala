package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShiftPreferences
  extends StObject
     with ChangeTrackedEntity {
  
  // Availability of the user to be scheduled for work and its recurrence pattern.
  var availability: js.UndefOr[NullableOption[js.Array[ShiftAvailability]]] = js.undefined
}
object ShiftPreferences {
  
  inline def apply(): ShiftPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftPreferences]
  }
  
  extension [Self <: ShiftPreferences](x: Self) {
    
    inline def setAvailability(value: NullableOption[js.Array[ShiftAvailability]]): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setAvailabilityVarargs(value: ShiftAvailability*): Self = StObject.set(x, "availability", js.Array(value :_*))
  }
}
