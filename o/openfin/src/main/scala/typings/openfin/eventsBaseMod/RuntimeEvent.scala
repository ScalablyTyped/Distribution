package typings.openfin.eventsBaseMod

import typings.openfin.openfinStrings.frame
import typings.openfin.openfinStrings.iframe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.eventsBaseMod.BaseEvent[Topic, Type]
  - typings.openfin.eventsBaseMod.ApplicationEvent[Topic, Type]
  - typings.openfin.frameMod.FrameEvent[Type]
  - typings.openfin.eventsBaseMod.WindowEvent[Topic, Type]
*/
trait RuntimeEvent[Topic, Type] extends js.Object

object RuntimeEvent {
  @scala.inline
  def BaseEvent[Topic, Type](topic: Topic, `type`: Type): RuntimeEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEvent[Topic, Type]]
  }
  @scala.inline
  def ApplicationEvent[Topic, Type](topic: Topic, `type`: Type, uuid: String): RuntimeEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEvent[Topic, Type]]
  }
  @scala.inline
  def FrameEvent[Topic, Type](entityType: iframe, frameName: String, name: String, topic: frame, `type`: Type, uuid: String): RuntimeEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEvent[Topic, Type]]
  }
  @scala.inline
  def WindowEvent[Topic, Type](name: String, topic: Topic, `type`: Type, uuid: String): RuntimeEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEvent[Topic, Type]]
  }
}

