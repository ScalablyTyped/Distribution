package typings.openfin.systemMod

import typings.openfin.eventsBaseMod.BaseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var elapsedTime: Double
  var isIdle: Boolean
}

object IdleEvent {
  @scala.inline
  def apply[Topic, Type](elapsedTime: Double, isIdle: Boolean, topic: Topic, `type`: Type): IdleEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleEvent[Topic, Type]]
  }
}

