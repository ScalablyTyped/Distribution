package typings.officeDashJsDashPreview.OfficeNs

import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.olkRecurrenceChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceChangedEventArgs extends js.Object {
  /** 
    * Gets the updated recurrence object. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var recurrence: Recurrence
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var `type`: olkRecurrenceChanged
}

object RecurrenceChangedEventArgs {
  @scala.inline
  def apply(recurrence: Recurrence, `type`: olkRecurrenceChanged): RecurrenceChangedEventArgs = {
    val __obj = js.Dynamic.literal(recurrence = recurrence)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RecurrenceChangedEventArgs]
  }
}

