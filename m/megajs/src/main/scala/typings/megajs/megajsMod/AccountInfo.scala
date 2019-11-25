package typings.megajs.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfo extends js.Object {
  var downloadBandwidthTotal: Double
  var downloadBandwidthUsed: Double
  var sharedBandwidthLimit: Double
  var sharedBandwidthUsed: Double
  var spaceTotal: Double
  var spaceUsed: Double
  var `type`: String
}

object AccountInfo {
  @scala.inline
  def apply(
    downloadBandwidthTotal: Double,
    downloadBandwidthUsed: Double,
    sharedBandwidthLimit: Double,
    sharedBandwidthUsed: Double,
    spaceTotal: Double,
    spaceUsed: Double,
    `type`: String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(downloadBandwidthTotal = downloadBandwidthTotal.asInstanceOf[js.Any], downloadBandwidthUsed = downloadBandwidthUsed.asInstanceOf[js.Any], sharedBandwidthLimit = sharedBandwidthLimit.asInstanceOf[js.Any], sharedBandwidthUsed = sharedBandwidthUsed.asInstanceOf[js.Any], spaceTotal = spaceTotal.asInstanceOf[js.Any], spaceUsed = spaceUsed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
}

