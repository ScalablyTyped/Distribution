package typings.numeric

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA extends js.Object {
  var A: Matrix
  var I: Matrix
  var P: Vector
}

object AnonA {
  @scala.inline
  def apply(A: Matrix, I: Matrix, P: Vector): AnonA = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonA]
  }
}

