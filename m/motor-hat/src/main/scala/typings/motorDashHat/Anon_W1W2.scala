package typings.motorDashHat

import typings.motorDashHat.motorDashHatMod.Motor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_W1W2 extends js.Object {
  var W1: Motor
  var W2: Motor
}

object Anon_W1W2 {
  @scala.inline
  def apply(W1: Motor, W2: Motor): Anon_W1W2 = {
    val __obj = js.Dynamic.literal(W1 = W1.asInstanceOf[js.Any], W2 = W2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_W1W2]
  }
}

