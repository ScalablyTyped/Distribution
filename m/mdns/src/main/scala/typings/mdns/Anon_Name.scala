package typings.mdns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: String
  var protocol: String
  var subtypes: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Name {
  @scala.inline
  def apply(name: String, protocol: String, subtypes: js.Array[String] = null): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, protocol = protocol)
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes)
    __obj.asInstanceOf[Anon_Name]
  }
}

