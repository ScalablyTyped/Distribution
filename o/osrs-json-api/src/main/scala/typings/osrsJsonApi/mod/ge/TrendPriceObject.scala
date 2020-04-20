package typings.osrsJsonApi.mod.ge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrendPriceObject extends js.Object {
  var price: Double
  var trend: String
}

object TrendPriceObject {
  @scala.inline
  def apply(price: Double, trend: String): TrendPriceObject = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], trend = trend.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendPriceObject]
  }
}

