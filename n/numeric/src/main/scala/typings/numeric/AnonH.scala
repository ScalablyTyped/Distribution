package typings.numeric

import typings.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonH extends js.Object {
  var H: Matrix
  var Q: Matrix
}

object AnonH {
  @scala.inline
  def apply(H: Matrix, Q: Matrix): AnonH = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonH]
  }
}

