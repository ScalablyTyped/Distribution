package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkAppointmentTimeChanged
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppointmentTimeChangedEventArgs extends StObject {
  
  /**
    * Gets the appointment end date and time.
    *
    * [Api set: Mailbox 1.7]
    */
  var end: Date
  
  /**
    * Gets the appointment start date and time.
    *
    * [Api set: Mailbox 1.7]
    */
  var start: Date
  
  /**
    * Gets the type of the event. See `Office.EventType` for details.
    *
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkAppointmentTimeChanged
}
object AppointmentTimeChangedEventArgs {
  
  inline def apply(end: Date, start: Date): AppointmentTimeChangedEventArgs = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkAppointmentTimeChanged")
    __obj.asInstanceOf[AppointmentTimeChangedEventArgs]
  }
  
  extension [Self <: AppointmentTimeChangedEventArgs](x: Self) {
    
    inline def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: olkAppointmentTimeChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
