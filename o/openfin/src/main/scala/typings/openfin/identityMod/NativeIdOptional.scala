package typings.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeIdOptional
  extends Identity
     with ExternalWindowIdentity {
  var nativeId: js.UndefOr[String] = js.undefined
}

object NativeIdOptional {
  @scala.inline
  def apply(uuid: String, entityType: js.Any = null, name: String = null, nativeId: String = null): NativeIdOptional = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nativeId != null) __obj.updateDynamic("nativeId")(nativeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeIdOptional]
  }
}

