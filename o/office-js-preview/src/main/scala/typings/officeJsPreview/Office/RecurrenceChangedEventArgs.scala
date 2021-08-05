package typings.officeJsPreview.Office

import typings.officeJsPreview.officeJsPreviewStrings.olkRecurrenceChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurrenceChangedEventArgs extends StObject {
  
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
  
  inline def apply(recurrence: Recurrence): RecurrenceChangedEventArgs = {
    val __obj = js.Dynamic.literal(recurrence = recurrence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkRecurrenceChanged")
    __obj.asInstanceOf[RecurrenceChangedEventArgs]
  }
  
  extension [Self <: RecurrenceChangedEventArgs](x: Self) {
    
    inline def setRecurrence(value: Recurrence): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setType(value: olkRecurrenceChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
