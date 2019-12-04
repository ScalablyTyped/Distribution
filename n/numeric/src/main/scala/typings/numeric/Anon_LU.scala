package typings.numeric

import typings.numeric.numericMod.Matrix
import typings.numeric.numericMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LU extends js.Object {
  var LU: Matrix
  var P: Vector
}

object Anon_LU {
  @scala.inline
  def apply(LU: Matrix, P: Vector): Anon_LU = {
    val __obj = js.Dynamic.literal(LU = LU.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LU]
  }
}

