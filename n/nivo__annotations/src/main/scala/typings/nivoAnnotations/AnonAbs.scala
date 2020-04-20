package typings.nivoAnnotations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbs extends js.Object {
  var abs: Double | String
}

object AnonAbs {
  @scala.inline
  def apply(abs: Double | String): AnonAbs = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbs]
  }
}

