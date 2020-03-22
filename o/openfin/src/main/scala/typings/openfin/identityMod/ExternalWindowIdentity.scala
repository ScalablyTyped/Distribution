package typings.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.identityMod.NativeIdOptional
  - typings.openfin.identityMod.UuidOptional
*/
trait ExternalWindowIdentity extends js.Object

object ExternalWindowIdentity {
  @scala.inline
  def NativeIdOptional(uuid: String, entityType: js.Any = null, name: String = null, nativeId: String = null): ExternalWindowIdentity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nativeId != null) __obj.updateDynamic("nativeId")(nativeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowIdentity]
  }
  @scala.inline
  def UuidOptional(nativeId: String, name: String = null, uuid: String = null): ExternalWindowIdentity = {
    val __obj = js.Dynamic.literal(nativeId = nativeId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalWindowIdentity]
  }
}

