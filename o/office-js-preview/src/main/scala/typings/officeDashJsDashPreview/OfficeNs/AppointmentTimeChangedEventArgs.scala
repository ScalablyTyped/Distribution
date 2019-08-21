package typings.officeDashJsDashPreview.OfficeNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.olkAppointmentTimeChanged
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppointmentTimeChangedEventArgs extends js.Object {
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
  @scala.inline
  def apply(end: Date, start: Date, `type`: olkAppointmentTimeChanged): AppointmentTimeChangedEventArgs = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AppointmentTimeChangedEventArgs]
  }
}

