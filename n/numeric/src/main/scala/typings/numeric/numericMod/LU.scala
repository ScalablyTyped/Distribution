package typings.numeric.numericMod

import typings.numeric.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LU extends js.Object {
  var L: Matrix
  var U: Matrix
}

object LU {
  @scala.inline
  def apply(L: Matrix, U: Matrix): LU = {
    val __obj = js.Dynamic.literal(L = L, U = U)
  
    __obj.asInstanceOf[LU]
  }
}

