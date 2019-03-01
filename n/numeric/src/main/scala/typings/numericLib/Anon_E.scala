package typings
package numericLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var E: numericLib.numericMod.Tensor
  var lambda: numericLib.numericMod.Tensor
}

object Anon_E {
  @scala.inline
  def apply(E: numericLib.numericMod.Tensor, lambda: numericLib.numericMod.Tensor): Anon_E = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("E")(E)
    __obj.updateDynamic("lambda")(lambda)
    __obj.asInstanceOf[Anon_E]
  }
}

