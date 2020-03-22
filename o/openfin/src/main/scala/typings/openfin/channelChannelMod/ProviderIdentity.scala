package typings.openfin.channelChannelMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderIdentity extends Identity {
  var channelId: String
  var channelName: String
  var isExternal: js.UndefOr[Boolean] = js.undefined
}

object ProviderIdentity {
  @scala.inline
  def apply(
    channelId: String,
    channelName: String,
    uuid: String,
    entityType: js.Any = null,
    isExternal: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): ProviderIdentity = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelName = channelName.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternal)) __obj.updateDynamic("isExternal")(isExternal.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIdentity]
  }
}

