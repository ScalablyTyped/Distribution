package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs

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
    val __obj = js.Dynamic.literal(business = business, calendar = calendar)
  
    __obj.asInstanceOf[MinutesObject]
  }
}

