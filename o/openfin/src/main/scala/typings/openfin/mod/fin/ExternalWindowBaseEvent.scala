package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`external-window`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalWindowBaseEvent extends js.Object {
  /**
    * the name of the window
    */
  var name: String
  /**
    * always window
    */
  var topic: `external-window`
  /**
    * window event type
    */
  var `type`: OpenFinExternalWindowEventType
  /**
    * the UUID of the application the window belongs to
    */
  var uuid: String
}

object ExternalWindowBaseEvent {
  @scala.inline
  def apply(name: String, topic: `external-window`, `type`: OpenFinExternalWindowEventType, uuid: String): ExternalWindowBaseEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowBaseEvent]
  }
}

