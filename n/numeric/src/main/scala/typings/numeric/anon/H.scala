package typings.numeric.anon

import typings.numeric.mod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H extends js.Object {
  var H: Matrix
  var Q: Matrix
}

object H {
  @scala.inline
  def apply(H: Matrix, Q: Matrix): H = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
}

