package typings.openui5.anon

import typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appointment extends StObject {
  
  /**
    * The selected appointment.
    */
  var appointment: js.UndefOr[default] = js.undefined
  
  /**
    * The selected appointments in case a group appointment is selected.
    */
  var appointments: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * Gives the ID of the DOM element of the clicked appointment
    */
  var domRefId: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the appointment was selected using multiple selection (e.g. Shift + single mouse click), meaning
    * more than the current appointment could be selected.
    */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
}
object Appointment {
  
  inline def apply(): Appointment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appointment]
  }
  
  extension [Self <: Appointment](x: Self) {
    
    inline def setAppointment(value: default): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setAppointments(value: js.Array[default]): Self = StObject.set(x, "appointments", value.asInstanceOf[js.Any])
    
    inline def setAppointmentsUndefined: Self = StObject.set(x, "appointments", js.undefined)
    
    inline def setAppointmentsVarargs(value: default*): Self = StObject.set(x, "appointments", js.Array(value*))
    
    inline def setDomRefId(value: String): Self = StObject.set(x, "domRefId", value.asInstanceOf[js.Any])
    
    inline def setDomRefIdUndefined: Self = StObject.set(x, "domRefId", js.undefined)
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
    
    inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
  }
}
