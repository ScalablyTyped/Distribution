package typings.openfin.mod.fin

import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowBaseEvent extends js.Object {
  /**
    * the name of the window
    */
  var name: String
  /**
    * always window
    */
  var topic: window
  /**
    * window event type
    */
  var `type`: OpenFinWindowEventType
  /**
    * the UUID of the application the window belongs to
    */
  var uuid: String
}

object WindowBaseEvent {
  @scala.inline
  def apply(name: String, topic: window, `type`: OpenFinWindowEventType, uuid: String): WindowBaseEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBaseEvent]
  }
}

