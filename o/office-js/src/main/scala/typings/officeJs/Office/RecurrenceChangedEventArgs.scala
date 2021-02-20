package typings.officeJs.Office

import typings.officeJs.officeJsStrings.olkRecurrenceChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrenceChangedEventArgs extends StObject {
  
  /** 
    * Gets the updated recurrence object. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var recurrence: Recurrence = js.native
  
  /** 
    * Gets the type of the event. See `Office.EventType` for details. 
    * 
    * [Api set: Mailbox 1.7] 
    */ 
  var `type`: olkRecurrenceChanged = js.native
}
object RecurrenceChangedEventArgs {
  
  @scala.inline
  def apply(recurrence: Recurrence, `type`: olkRecurrenceChanged): RecurrenceChangedEventArgs = {
    val __obj = js.Dynamic.literal(recurrence = recurrence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceChangedEventArgs]
  }
  
  @scala.inline
  implicit class RecurrenceChangedEventArgsMutableBuilder[Self <: RecurrenceChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecurrence(value: Recurrence): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: olkRecurrenceChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
