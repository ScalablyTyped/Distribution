package typings.osrsJsonApi.mod.ge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrendPriceObject extends js.Object {
  var price: Double = js.native
  var trend: String = js.native
}

object TrendPriceObject {
  @scala.inline
  def apply(price: Double, trend: String): TrendPriceObject = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], trend = trend.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrendPriceObject]
  }
  @scala.inline
  implicit class TrendPriceObjectOps[Self <: TrendPriceObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrend(value: String): Self = this.set("trend", value.asInstanceOf[js.Any])
  }
  
}

