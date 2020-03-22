package typings.openfin.mod.fin

import typings.openfin.AnonHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowAuthRequested extends WindowEvent {
  var authInfo: AnonHost
}

object WindowAuthRequested {
  @scala.inline
  def apply(authInfo: AnonHost, name: String, topic: String, `type`: OpenFinApplicationEventType, uuid: String): WindowAuthRequested = {
    val __obj = js.Dynamic.literal(authInfo = authInfo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowAuthRequested]
  }
}

