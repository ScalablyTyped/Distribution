package typings.numeric.numericMod

import typings.numeric.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LUPP extends js.Object {
  var L: SparseMatrix
  var P: Vector
  var Pinv: Vector
  var U: SparseMatrix
}

object LUPP {
  @scala.inline
  def apply(L: SparseMatrix, P: Vector, Pinv: Vector, U: SparseMatrix): LUPP = {
    val __obj = js.Dynamic.literal(L = L, P = P, Pinv = Pinv, U = U)
  
    __obj.asInstanceOf[LUPP]
  }
}

