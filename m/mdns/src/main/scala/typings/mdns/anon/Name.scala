package typings.mdns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var protocol: String
  var subtypes: js.UndefOr[js.Array[String]] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String, protocol: String, subtypes: js.Array[String] = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

