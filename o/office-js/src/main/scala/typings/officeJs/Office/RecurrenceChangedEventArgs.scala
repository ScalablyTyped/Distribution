package typings.officeJs.Office

import typings.officeJs.officeJsStrings.olkRecurrenceChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrenceChangedEventArgs extends js.Object {
  
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
  implicit class RecurrenceChangedEventArgsOps[Self <: RecurrenceChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecurrence(value: Recurrence): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: olkRecurrenceChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
