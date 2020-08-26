package typings.osrsJsonApi.mod.ge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var average: TimestampPriceRecord = js.native
  var daily: TimestampPriceRecord = js.native
}

object Graph {
  @scala.inline
  def apply(average: TimestampPriceRecord, daily: TimestampPriceRecord): Graph = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], daily = daily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
  @scala.inline
  implicit class GraphOps[Self <: Graph] (val x: Self) extends AnyVal {
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
    def setAverage(value: TimestampPriceRecord): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaily(value: TimestampPriceRecord): Self = this.set("daily", value.asInstanceOf[js.Any])
  }
  
}

