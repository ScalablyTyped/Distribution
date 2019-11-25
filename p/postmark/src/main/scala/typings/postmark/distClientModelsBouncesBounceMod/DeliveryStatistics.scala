package typings.postmark.distClientModelsBouncesBounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryStatistics extends js.Object {
  var Bounces: js.Array[BounceMetric]
  var InactiveMails: Double
}

object DeliveryStatistics {
  @scala.inline
  def apply(Bounces: js.Array[BounceMetric], InactiveMails: Double): DeliveryStatistics = {
    val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], InactiveMails = InactiveMails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeliveryStatistics]
  }
}

