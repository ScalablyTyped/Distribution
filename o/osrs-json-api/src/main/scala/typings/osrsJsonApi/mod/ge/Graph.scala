package typings.osrsJsonApi.mod.ge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph extends js.Object {
  var average: TimestampPriceRecord
  var daily: TimestampPriceRecord
}

object Graph {
  @scala.inline
  def apply(average: TimestampPriceRecord, daily: TimestampPriceRecord): Graph = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], daily = daily.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

