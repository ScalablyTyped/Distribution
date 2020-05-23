package typings.openfin.shapesMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderIdentity extends Identity {
  var channelId: js.UndefOr[String] = js.undefined
  var channelName: js.UndefOr[String] = js.undefined
  var isExternal: js.UndefOr[Boolean] = js.undefined
  var runtimeUuid: js.UndefOr[String] = js.undefined
}

object ProviderIdentity {
  @scala.inline
  def apply(
    uuid: String,
    channelId: String = null,
    channelName: String = null,
    entityType: js.Any = null,
    isExternal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    runtimeUuid: String = null
  ): ProviderIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternal)) __obj.updateDynamic("isExternal")(isExternal.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (runtimeUuid != null) __obj.updateDynamic("runtimeUuid")(runtimeUuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIdentity]
  }
}

