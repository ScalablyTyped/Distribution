package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkAppointmentTimeChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentTimeChangedEventArgs extends StObject {
  
  /**
    * Gets the appointment end date and time.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    */
  var end: js.Date
  
  /**
    * Gets the appointment start date and time.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    */
  var start: js.Date
  
  /**
    * Gets the type of the event. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkAppointmentTimeChanged
}
object AppointmentTimeChangedEventArgs {
  
  inline def apply(end: js.Date, start: js.Date): AppointmentTimeChangedEventArgs = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkAppointmentTimeChanged")
    __obj.asInstanceOf[AppointmentTimeChangedEventArgs]
  }
  
  extension [Self <: AppointmentTimeChangedEventArgs](x: Self) {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: olkAppointmentTimeChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
