package typings.openfin.webcontentsMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTitleUpdatedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var title: String
}

object PageTitleUpdatedEvent {
  @scala.inline
  def apply[Topic, Type](name: String, title: String, topic: Topic, `type`: Type, uuid: String): PageTitleUpdatedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageTitleUpdatedEvent[Topic, Type]]
  }
}

