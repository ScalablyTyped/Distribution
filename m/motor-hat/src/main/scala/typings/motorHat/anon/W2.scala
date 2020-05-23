package typings.motorHat.anon

import typings.motorHat.mod.Motor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait W2 extends js.Object {
  var W1: Motor
  var W2: Motor
}

object W2 {
  @scala.inline
  def apply(W1: Motor, W2: Motor): W2 = {
    val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
    __obj.asInstanceOf[W2]
  }
}

