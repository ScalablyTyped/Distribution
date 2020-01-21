package typings.p2

import typings.p2.mod.Spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpring extends js.Object {
  var spring: Spring
  var `type`: String
}

object AnonSpring {
  @scala.inline
  def apply(spring: Spring, `type`: String): AnonSpring = {
    val __obj = js.Dynamic.literal(spring = spring.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpring]
  }
}

