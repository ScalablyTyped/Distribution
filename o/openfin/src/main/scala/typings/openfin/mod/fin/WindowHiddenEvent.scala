package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`hide-on-close`
import typings.openfin.openfinStrings.hidden
import typings.openfin.openfinStrings.hide
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowHiddenEvent extends WindowBaseEvent {
  /**
    * What action prompted the close.
    * The reasons are: "hide", "hide-on-close"
    */
  var reason: hide | `hide-on-close`
  @JSName("type")
  var type_WindowHiddenEvent: hidden
}

object WindowHiddenEvent {
  @scala.inline
  def apply(name: String, reason: hide | `hide-on-close`, topic: window, `type`: hidden, uuid: String): WindowHiddenEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHiddenEvent]
  }
}

