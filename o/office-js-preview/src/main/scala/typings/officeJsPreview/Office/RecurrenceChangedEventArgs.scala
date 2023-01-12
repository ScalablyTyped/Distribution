package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkRecurrenceChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurrenceChangedEventArgs extends StObject {
  
  /**
    * Gets the updated recurrence object.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    */
  var recurrence: Recurrence
  
  /**
    * Gets the type of the event. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    *
    * @remarks
    * [Api set: Mailbox 1.7]
    */
  var `type`: olkRecurrenceChanged
}
object RecurrenceChangedEventArgs {
  
  inline def apply(recurrence: Recurrence): RecurrenceChangedEventArgs = {
    val __obj = js.Dynamic.literal(recurrence = recurrence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkRecurrenceChanged")
    __obj.asInstanceOf[RecurrenceChangedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecurrenceChangedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRecurrence(value: Recurrence): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setType(value: olkRecurrenceChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
