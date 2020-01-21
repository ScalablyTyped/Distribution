package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionNetworkLearningSummary extends Entity {
  // Device Count
  var deviceCount: js.UndefOr[Double] = js.undefined
  // Website url
  var url: js.UndefOr[String] = js.undefined
}

object WindowsInformationProtectionNetworkLearningSummary {
  @scala.inline
  def apply(deviceCount: Int | Double = null, id: String = null, url: String = null): WindowsInformationProtectionNetworkLearningSummary = {
    val __obj = js.Dynamic.literal()
    if (deviceCount != null) __obj.updateDynamic("deviceCount")(deviceCount.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionNetworkLearningSummary]
  }
}

