package typings.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UuidOptional extends ExternalWindowIdentity {
  var name: js.UndefOr[String] = js.undefined
  var nativeId: String
  var uuid: js.UndefOr[String] = js.undefined
}

object UuidOptional {
  @scala.inline
  def apply(nativeId: String, name: String = null, uuid: String = null): UuidOptional = {
    val __obj = js.Dynamic.literal(nativeId = nativeId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidOptional]
  }
}

