package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnce extends js.Object {
  var once: Boolean
}

object AnonOnce {
  @scala.inline
  def apply(once: Boolean): AnonOnce = {
    val __obj = js.Dynamic.literal(once = once.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnce]
  }
}

