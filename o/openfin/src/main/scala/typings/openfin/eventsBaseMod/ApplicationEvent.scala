package typings.openfin.eventsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ @js.native
trait ApplicationEvent[Topic, Type] extends BaseEvent[Topic, Type] {
  var uuid: String = js.native
}

object ApplicationEvent {
  @scala.inline
  def apply[Topic, Type](topic: Topic, `type`: Type, uuid: String): ApplicationEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEvent[Topic, Type]]
  }
  @scala.inline
  implicit class ApplicationEventOps[Self <: ApplicationEvent[_, _], Topic, Type] (val x: Self with (ApplicationEvent[Topic, Type])) extends AnyVal {
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
  
}

