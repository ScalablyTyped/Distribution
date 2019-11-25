package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPv6Range extends IpRange {
  // Lower address
  var lowerAddress: js.UndefOr[String] = js.undefined
  // Upper address
  var upperAddress: js.UndefOr[String] = js.undefined
}

object IPv6Range {
  @scala.inline
  def apply(lowerAddress: String = null, upperAddress: String = null): IPv6Range = {
    val __obj = js.Dynamic.literal()
    if (lowerAddress != null) __obj.updateDynamic("lowerAddress")(lowerAddress.asInstanceOf[js.Any])
    if (upperAddress != null) __obj.updateDynamic("upperAddress")(upperAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPv6Range]
  }
}

