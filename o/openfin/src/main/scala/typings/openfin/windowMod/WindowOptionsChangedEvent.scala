package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowOptionMod.WindowOption
import typings.openfin.windowOptionMod.WindowOptionDiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowOptionsChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var diff: WindowOptionDiff
  var options: WindowOption
}

object WindowOptionsChangedEvent {
  @scala.inline
  def apply[Topic, Type](
    diff: WindowOptionDiff,
    name: String,
    options: WindowOption,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowOptionsChangedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptionsChangedEvent[Topic, Type]]
  }
}

