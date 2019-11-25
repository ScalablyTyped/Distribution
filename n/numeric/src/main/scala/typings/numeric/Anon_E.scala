package typings.numeric

import typings.numeric.numericMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_E extends js.Object {
  var E: Tensor
  var lambda: Tensor
}

object Anon_E {
  @scala.inline
  def apply(E: Tensor, lambda: Tensor): Anon_E = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_E]
  }
}

