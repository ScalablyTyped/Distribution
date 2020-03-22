package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExternal extends js.Object {
  var active: Double
  var external: Double
}

object AnonExternal {
  @scala.inline
  def apply(active: Double, external: Double): AnonExternal = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExternal]
  }
}

