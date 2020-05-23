package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A extends js.Object {
  var A: Matrix
  var I: Matrix
  var P: Vector
}

object A {
  @scala.inline
  def apply(A: Matrix, I: Matrix, P: Vector): A = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
}

