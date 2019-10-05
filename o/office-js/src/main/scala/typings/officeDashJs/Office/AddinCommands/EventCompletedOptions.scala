package typings.officeDashJs.Office.AddinCommands

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the behavior for when the event is completed.
  */
trait EventCompletedOptions extends js.Object {
  /**
    * A boolean value. When the completed method is used to signal completion of an event handler, 
    * this value indicates of the handled event should continue execution or be canceled. 
    * For example, an add-in that handles the `ItemSend` event can set `allowEvent` to `false` to cancel sending of the message.
    */
  var allowEvent: Boolean
}

object EventCompletedOptions {
  @scala.inline
  def apply(allowEvent: Boolean): EventCompletedOptions = {
    val __obj = js.Dynamic.literal(allowEvent = allowEvent)
  
    __obj.asInstanceOf[EventCompletedOptions]
  }
}

