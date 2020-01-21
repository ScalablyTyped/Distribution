package typings.numeric

import typings.numeric.mod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonE extends js.Object {
  var E: Tensor
  var lambda: Tensor
}

object AnonE {
  @scala.inline
  def apply(E: Tensor, lambda: Tensor): AnonE = {
    val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], lambda = lambda.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonE]
  }
}

