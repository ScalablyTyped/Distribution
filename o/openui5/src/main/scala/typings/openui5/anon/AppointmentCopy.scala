package typings.openui5.anon

import typings.openui5.sapUiUnifiedCalendarAppointmentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentCopy extends StObject {
  
  /**
    * The dropped appointment.
    */
  var appointment: js.UndefOr[default] = js.undefined
  
  /**
    * The drop type. If true - it's "Copy", if false - it's "Move".
    */
  var copy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dropped appointment end date as a JavaScript date object.
    */
  var endDate: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Start date of the dropped appointment, as a JavaScript date object.
    */
  var startDate: js.UndefOr[js.Object] = js.undefined
}
object AppointmentCopy {
  
  inline def apply(): AppointmentCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppointmentCopy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentCopy] (val x: Self) extends AnyVal {
    
    inline def setAppointment(value: default): Self = StObject.set(x, "appointment", value.asInstanceOf[js.Any])
    
    inline def setAppointmentUndefined: Self = StObject.set(x, "appointment", js.undefined)
    
    inline def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    inline def setEndDate(value: js.Object): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setStartDate(value: js.Object): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
