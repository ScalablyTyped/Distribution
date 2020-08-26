package typings.openfin.eventsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEvent[Topic, Type] extends RuntimeEvent[Topic, Type] {
  var topic: Topic = js.native
  var `type`: Type = js.native
}

object BaseEvent {
  @scala.inline
  def apply[Topic, Type](topic: Topic, `type`: Type): BaseEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEvent[Topic, Type]]
  }
  @scala.inline
  implicit class BaseEventOps[Self <: BaseEvent[_, _], Topic, Type] (val x: Self with (BaseEvent[Topic, Type])) extends AnyVal {
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
    def setTopic(value: Topic): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

