package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPv6Range extends IpRange {
  // Lower address
  var lowerAddress: js.UndefOr[java.lang.String] = js.undefined
  // Upper address
  var upperAddress: js.UndefOr[java.lang.String] = js.undefined
}

object IPv6Range {
  @scala.inline
  def apply(lowerAddress: java.lang.String = null, upperAddress: java.lang.String = null): IPv6Range = {
    val __obj = js.Dynamic.literal()
    if (lowerAddress != null) __obj.updateDynamic("lowerAddress")(lowerAddress)
    if (upperAddress != null) __obj.updateDynamic("upperAddress")(upperAddress)
    __obj.asInstanceOf[IPv6Range]
  }
}

