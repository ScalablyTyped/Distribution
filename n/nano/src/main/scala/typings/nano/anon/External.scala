package typings.nano.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait External extends js.Object {
  var active: Double
  var external: Double
}

object External {
  @scala.inline
  def apply(active: Double, external: Double): External = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any])
    __obj.asInstanceOf[External]
  }
}

