package typings.numeric

import typings.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonB extends js.Object {
  var B: Matrix
  var Q: Matrix
}

object AnonB {
  @scala.inline
  def apply(B: Matrix, Q: Matrix): AnonB = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonB]
  }
}

