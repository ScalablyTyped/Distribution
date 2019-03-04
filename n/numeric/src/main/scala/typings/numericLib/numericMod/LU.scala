package typings
package numericLib.numericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LU extends js.Object {
  var L: numericLib.Matrix
  var U: numericLib.Matrix
}

object LU {
  @scala.inline
  def apply(L: numericLib.Matrix, U: numericLib.Matrix): LU = {
    val __obj = js.Dynamic.literal(L = L, U = U)
  
    __obj.asInstanceOf[LU]
  }
}

