package typings.openui5.anon

import typings.openui5.sapMPlanningCalendarRowMod.PlanningCalendarRow
import typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentCalendarRow extends StObject {
  
  /**
    * The dropped appointment.
    */
  var appointment: js.UndefOr[default] = js.undefined
  
  /**
    * The row of the appointment.
    */
  var calendarRow: js.UndefOr[PlanningCalendarRow] = js.undefined
  
  /**
    * Dropped appointment end date as a JavaScript date object.
    */
  var endDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Start date of the dropped appointment, as a JavaScript date object.
    */
  var startDate: js.UndefOr[js.Object] = js.undefined
}
object AppointmentCalendarRow {
  
  inline def apply(): AppointmentCalendarRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentCalendarRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentCalendarRow] (val x: Self) extends AnyVal {
    
    inline def setAppointment(value: default): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setCalendarRow(value: PlanningCalendarRow): Self = StObject.set(x, "calendarRow", value.asInstanceOf[js.Any])
    
    inline def setCalendarRowUndefined: Self = StObject.set(x, "calendarRow", js.undefined)
    
    inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
