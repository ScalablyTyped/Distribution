package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowNavigationRejectedEvent extends WindowEvent {
  var sourceName: String
  var url: String
}

object WindowNavigationRejectedEvent {
  @scala.inline
  def apply(
    name: String,
    sourceName: String,
    topic: String,
    `type`: OpenFinApplicationEventType,
    url: String,
    uuid: String
  ): WindowNavigationRejectedEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowNavigationRejectedEvent]
  }
}

