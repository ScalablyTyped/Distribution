package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryStats extends js.Object {
  var Bounces: js.Array[BounceStats]
  var InactiveMails: scala.Double
}

object DeliveryStats {
  @scala.inline
  def apply(Bounces: js.Array[BounceStats], InactiveMails: scala.Double): DeliveryStats = {
    val __obj = js.Dynamic.literal(Bounces = Bounces, InactiveMails = InactiveMails)
  
    __obj.asInstanceOf[DeliveryStats]
  }
}

