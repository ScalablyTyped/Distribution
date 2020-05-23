package typings.motorHat.anon

import typings.motorHat.mod.PinDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W1 extends js.Object {
  /**
    * Pin definition for winding 1 of the stepper
    */
  var W1: PinDefinition
  /**
    * Pin definition for winding 2 of the stepper
    */
  var W2: PinDefinition
}

object W1 {
  @scala.inline
  def apply(W1: PinDefinition, W2: PinDefinition): W1 = {
    val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
    __obj.asInstanceOf[W1]
  }
}

