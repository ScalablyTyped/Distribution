package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEndLoadEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var documentName: String
  var isMain: Boolean
}

object WindowEndLoadEvent {
  @scala.inline
  def apply[Topic, Type](documentName: String, isMain: Boolean, name: String, topic: Topic, `type`: Type, uuid: String): WindowEndLoadEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndLoadEvent[Topic, Type]]
  }
}

