package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowEndLoadEvent extends WindowEvent {
  var documentName: String
  var isMain: Boolean
}

object WindowEndLoadEvent {
  @scala.inline
  def apply(
    documentName: String,
    isMain: Boolean,
    name: String,
    topic: String,
    `type`: OpenFinApplicationEventType,
    uuid: String
  ): WindowEndLoadEvent = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], isMain = isMain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEndLoadEvent]
  }
}

