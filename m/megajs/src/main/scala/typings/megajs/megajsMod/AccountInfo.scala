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
    val __obj = js.Dynamic.literal(downloadBandwidthTotal = downloadBandwidthTotal, downloadBandwidthUsed = downloadBandwidthUsed, sharedBandwidthLimit = sharedBandwidthLimit, sharedBandwidthUsed = sharedBandwidthUsed, spaceTotal = spaceTotal, spaceUsed = spaceUsed)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AccountInfo]
  }
}

