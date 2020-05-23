package typings.openfin.eventsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ trait WindowEvent[Topic, Type] extends ApplicationEvent[Topic, Type] {
  var name: String
}

object WindowEvent {
  @scala.inline
  def apply[Topic, Type](name: String, topic: Topic, `type`: Type, uuid: String): WindowEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEvent[Topic, Type]]
  }
}

