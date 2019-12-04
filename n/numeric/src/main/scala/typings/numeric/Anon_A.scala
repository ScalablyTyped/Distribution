package typings.numeric

import typings.numeric.numericMod.Matrix
import typings.numeric.numericMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  var A: Matrix
  var I: Matrix
  var P: Vector
}

object Anon_A {
  @scala.inline
  def apply(A: Matrix, I: Matrix, P: Vector): Anon_A = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], I = I.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_A]
  }
}

