package typings.officeJs.Office.AddinCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the behavior for when the event is completed.
  */
@js.native
trait EventCompletedOptions extends js.Object {
  
  /**
    * A boolean value. When the completed method is used to signal completion of an event handler, 
    * this value indicates of the handled event should continue execution or be canceled. 
    * For example, an add-in that handles the `ItemSend` event can set `allowEvent` to `false` to cancel sending of the message.
    */
  var allowEvent: Boolean = js.native
}
object EventCompletedOptions {
  
  @scala.inline
  def apply(allowEvent: Boolean): EventCompletedOptions = {
    val __obj = js.Dynamic.literal(allowEvent = allowEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCompletedOptions]
  }
  
  @scala.inline
  implicit class EventCompletedOptionsOps[Self <: EventCompletedOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowEvent(value: Boolean): Self = this.set("allowEvent", value.asInstanceOf[js.Any])
  }
}
