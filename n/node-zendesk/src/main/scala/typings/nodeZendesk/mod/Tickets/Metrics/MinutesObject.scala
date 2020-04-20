package typings.nodeZendesk.mod.Tickets.Metrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinutesObject extends js.Object {
  var business: Double
  var calendar: Double
}

object MinutesObject {
  @scala.inline
  def apply(business: Double, calendar: Double): MinutesObject = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinutesObject]
  }
}

