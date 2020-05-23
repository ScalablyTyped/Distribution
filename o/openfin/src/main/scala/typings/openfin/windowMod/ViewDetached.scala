package typings.openfin.windowMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDetached[Topic, Type] extends WindowEvent[Topic, Type] {
  var previousTarget: Identity
  var target: Identity
  var viewIdentity: Identity
}

object ViewDetached {
  @scala.inline
  def apply[Topic, Type](
    name: String,
    previousTarget: Identity,
    target: Identity,
    topic: Topic,
    `type`: Type,
    uuid: String,
    viewIdentity: Identity
  ): ViewDetached[Topic, Type] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], previousTarget = previousTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], viewIdentity = viewIdentity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDetached[Topic, Type]]
  }
}

