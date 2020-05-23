package typings.numeric.anon

import typings.numeric.mod.Matrix
import typings.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S extends js.Object {
  var S: Vector
  var U: Matrix
  var V: Matrix
}

object S {
  @scala.inline
  def apply(S: Vector, U: Matrix, V: Matrix): S = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[S]
  }
}

