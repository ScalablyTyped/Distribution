package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionIPRangeCollection extends js.Object {
  // Display name
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Collection of Internet protocol address ranges
  var ranges: js.UndefOr[js.Array[IpRange]] = js.undefined
}

object WindowsInformationProtectionIPRangeCollection {
  @scala.inline
  def apply(displayName: java.lang.String = null, ranges: js.Array[IpRange] = null): WindowsInformationProtectionIPRangeCollection = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    __obj.asInstanceOf[WindowsInformationProtectionIPRangeCollection]
  }
}

