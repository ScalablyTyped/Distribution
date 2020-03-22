package typings.openfin.eventsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent[Topic, Type] extends RuntimeEvent[Topic, Type] {
  var topic: Topic
  var `type`: Type
}

object BaseEvent {
  @scala.inline
  def apply[Topic, Type](topic: Topic, `type`: Type): BaseEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[Topic, Type]]
  }
}

