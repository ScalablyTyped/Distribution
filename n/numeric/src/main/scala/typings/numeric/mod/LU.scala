package typings.numeric.mod

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
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LU]
  }
}

