package typings.numeric

import typings.numeric.numericMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_H extends js.Object {
  var H: Matrix
  var Q: Matrix
}

object Anon_H {
  @scala.inline
  def apply(H: Matrix, Q: Matrix): Anon_H = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], Q = Q.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_H]
  }
}

