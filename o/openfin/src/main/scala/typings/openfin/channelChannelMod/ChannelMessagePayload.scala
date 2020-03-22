package typings.openfin.channelChannelMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelMessagePayload extends Identity {
  var action: String
  var payload: js.Any
}

object ChannelMessagePayload {
  @scala.inline
  def apply(action: String, payload: js.Any, uuid: String, entityType: js.Any = null, name: String = null): ChannelMessagePayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMessagePayload]
  }
}

