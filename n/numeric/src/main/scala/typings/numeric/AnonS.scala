package typings.numeric

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonS extends js.Object {
  var S: Vector
  var U: Matrix
  var V: Matrix
}

object AnonS {
  @scala.inline
  def apply(S: Vector, U: Matrix, V: Matrix): AnonS = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonS]
  }
}

