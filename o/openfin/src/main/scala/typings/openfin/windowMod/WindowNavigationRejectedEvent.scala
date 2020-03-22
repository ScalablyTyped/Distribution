package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowNavigationRejectedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var sourceName: js.UndefOr[String] = js.undefined
  var url: String
}

object WindowNavigationRejectedEvent {
  @scala.inline
  def apply[Topic, Type](name: String, topic: Topic, `type`: Type, url: String, uuid: String, sourceName: String = null): WindowNavigationRejectedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowNavigationRejectedEvent[Topic, Type]]
  }
}

