package typings.mdns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var protocol: String
  var subtypes: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(name: String, protocol: String, subtypes: js.Array[String] = null): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

