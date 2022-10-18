package typings.openui5.anon

import typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appointments extends StObject {
  
  /**
    * The appointment on which the event was triggered.
    */
  var appointment: js.UndefOr[default] = js.undefined
  
  /**
    * All appointments with changed selected state.
    */
  var appointments: js.UndefOr[js.Array[default]] = js.undefined
}
object Appointments {
  
  inline def apply(): Appointments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appointments]
  }
  
  extension [Self <: Appointments](x: Self) {
    
    inline def setAppointment(value: default): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setAppointments(value: js.Array[default]): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
    
    inline def setAppointmentsUndefined: Self = StObject.set(x, "appointments", js.undefined)
    
    inline def setAppointmentsVarargs(value: default*): Self = StObject.set(x, "appointments", js.Array(value*))
  }
}
