package typings.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupWindowIdentity extends Identity {
  var isExternalWindow: js.UndefOr[Boolean] = js.undefined
}

object GroupWindowIdentity {
  @scala.inline
  def apply(
    uuid: String,
    entityType: js.Any = null,
    isExternalWindow: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): GroupWindowIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternalWindow)) __obj.updateDynamic("isExternalWindow")(isExternalWindow.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupWindowIdentity]
  }
}

