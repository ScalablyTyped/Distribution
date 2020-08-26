package typings.openfin.frameMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.frame
import typings.openfin.openfinStrings.iframe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.openfin.eventsBaseMod.RuntimeEvent because Already inherited */ @js.native
trait FrameEvent[Type] extends WindowEvent[frame, Type] {
  var entityType: iframe = js.native
  var frameName: String = js.native
}

object FrameEvent {
  @scala.inline
  def apply[Type](entityType: iframe, frameName: String, name: String, topic: frame, `type`: Type, uuid: String): FrameEvent[Type] = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], frameName = frameName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameEvent[Type]]
  }
  @scala.inline
  implicit class FrameEventOps[Self <: FrameEvent[_], Type] (val x: Self with FrameEvent[Type]) extends AnyVal {
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
    def setEntityType(value: iframe): Self = this.set("entityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameName(value: String): Self = this.set("frameName", value.asInstanceOf[js.Any])
  }
  
}

