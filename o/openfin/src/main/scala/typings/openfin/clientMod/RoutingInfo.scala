package typings.openfin.clientMod

import typings.openfin.shapesMod.ProviderIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingInfo extends ProviderIdentity {
  var endpointId: String
}

object RoutingInfo {
  @scala.inline
  def apply(
    endpointId: String,
    uuid: String,
    channelId: String = null,
    channelName: String = null,
    entityType: js.Any = null,
    isExternal: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    runtimeUuid: String = null
  ): RoutingInfo = {
    val __obj = js.Dynamic.literal(endpointId = endpointId.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternal)) __obj.updateDynamic("isExternal")(isExternal.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (runtimeUuid != null) __obj.updateDynamic("runtimeUuid")(runtimeUuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingInfo]
  }
}

