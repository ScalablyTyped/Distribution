package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.MetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinutesObject extends js.Object {
  var business: scala.Double
  var calendar: scala.Double
}

object MinutesObject {
  @scala.inline
  def apply(business: scala.Double, calendar: scala.Double): MinutesObject = {
    val __obj = js.Dynamic.literal(business = business, calendar = calendar)
  
    __obj.asInstanceOf[MinutesObject]
  }
}

