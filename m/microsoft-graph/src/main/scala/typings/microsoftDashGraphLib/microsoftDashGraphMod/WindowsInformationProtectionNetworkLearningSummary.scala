package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionNetworkLearningSummary extends Entity {
  // Device Count
  var deviceCount: js.UndefOr[scala.Double] = js.undefined
  // Website url
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsInformationProtectionNetworkLearningSummary {
  @scala.inline
  def apply(
    deviceCount: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    url: java.lang.String = null
  ): WindowsInformationProtectionNetworkLearningSummary = {
    val __obj = js.Dynamic.literal()
    if (deviceCount != null) __obj.updateDynamic("deviceCount")(deviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WindowsInformationProtectionNetworkLearningSummary]
  }
}

