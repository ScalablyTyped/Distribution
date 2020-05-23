package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LU extends js.Object {
  var LU: Matrix
  var P: Vector
}

object LU {
  @scala.inline
  def apply(LU: Matrix, P: Vector): LU = {
    val __obj = js.Dynamic.literal(LU = LU.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
    __obj.asInstanceOf[LU]
  }
}

