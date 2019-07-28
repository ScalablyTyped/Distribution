package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryStats extends js.Object {
  var Bounces: js.Array[BounceStats]
  var InactiveMails: Double
}

object DeliveryStats {
  @scala.inline
  def apply(Bounces: js.Array[BounceStats], InactiveMails: Double): DeliveryStats = {
    val __obj = js.Dynamic.literal(Bounces = Bounces, InactiveMails = InactiveMails)
  
    __obj.asInstanceOf[DeliveryStats]
  }
}

