package typings.openfin.identityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var entityType: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var uuid: String
}

object Identity {
  @scala.inline
  def apply(uuid: String, entityType: js.Any = null, name: String = null): Identity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

