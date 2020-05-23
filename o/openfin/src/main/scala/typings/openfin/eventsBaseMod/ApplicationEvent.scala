package typings.openfin.eventsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ trait ApplicationEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var uuid: String
}

object ApplicationEvent {
  @scala.inline
  def apply[Topic, Type](topic: Topic, `type`: Type, uuid: String): ApplicationEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEvent[Topic, Type]]
  }
}

