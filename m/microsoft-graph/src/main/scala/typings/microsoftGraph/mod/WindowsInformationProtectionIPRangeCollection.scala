package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionIPRangeCollection extends js.Object {
  // Display name
  var displayName: js.UndefOr[String] = js.undefined
  // Collection of Internet protocol address ranges
  var ranges: js.UndefOr[js.Array[IpRange]] = js.undefined
}

object WindowsInformationProtectionIPRangeCollection {
  @scala.inline
  def apply(displayName: String = null, ranges: js.Array[IpRange] = null): WindowsInformationProtectionIPRangeCollection = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionIPRangeCollection]
  }
}

