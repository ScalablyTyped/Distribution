package typings.openfin.shapesMod

import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientIdentity extends Identity {
  var endpointId: js.UndefOr[String] = js.undefined
}

object ClientIdentity {
  @scala.inline
  def apply(uuid: String, endpointId: String = null, entityType: js.Any = null, name: String = null): ClientIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (endpointId != null) __obj.updateDynamic("endpointId")(endpointId.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientIdentity]
  }
}

