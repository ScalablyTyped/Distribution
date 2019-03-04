package typings
package numericLib.numericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LUPP extends js.Object {
  var L: numericLib.SparseMatrix
  var P: numericLib.Vector
  var Pinv: numericLib.Vector
  var U: numericLib.SparseMatrix
}

object LUPP {
  @scala.inline
  def apply(
    L: numericLib.SparseMatrix,
    P: numericLib.Vector,
    Pinv: numericLib.Vector,
    U: numericLib.SparseMatrix
  ): LUPP = {
    val __obj = js.Dynamic.literal(L = L, P = P, Pinv = Pinv, U = U)
  
    __obj.asInstanceOf[LUPP]
  }
}

