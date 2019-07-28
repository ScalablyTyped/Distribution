package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPv4Range extends IpRange {
  // Lower address.
  var lowerAddress: js.UndefOr[String] = js.undefined
  // Upper address.
  var upperAddress: js.UndefOr[String] = js.undefined
}

object IPv4Range {
  @scala.inline
  def apply(lowerAddress: String = null, upperAddress: String = null): IPv4Range = {
    val __obj = js.Dynamic.literal()
    if (lowerAddress != null) __obj.updateDynamic("lowerAddress")(lowerAddress)
    if (upperAddress != null) __obj.updateDynamic("upperAddress")(upperAddress)
    __obj.asInstanceOf[IPv4Range]
  }
}

