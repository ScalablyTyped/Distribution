package typings.numeric

import typings.numeric.numericMod.Matrix
import typings.numeric.numericMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S extends js.Object {
  var S: Vector
  var U: Matrix
  var V: Matrix
}

object Anon_S {
  @scala.inline
  def apply(S: Vector, U: Matrix, V: Matrix): Anon_S = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_S]
  }
}

