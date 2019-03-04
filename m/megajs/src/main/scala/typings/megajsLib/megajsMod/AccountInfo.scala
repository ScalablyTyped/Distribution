package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfo extends js.Object {
  var downloadBandwidthTotal: scala.Double
  var downloadBandwidthUsed: scala.Double
  var sharedBandwidthLimit: scala.Double
  var sharedBandwidthUsed: scala.Double
  var spaceTotal: scala.Double
  var spaceUsed: scala.Double
  var `type`: java.lang.String
}

object AccountInfo {
  @scala.inline
  def apply(
    downloadBandwidthTotal: scala.Double,
    downloadBandwidthUsed: scala.Double,
    sharedBandwidthLimit: scala.Double,
    sharedBandwidthUsed: scala.Double,
    spaceTotal: scala.Double,
    spaceUsed: scala.Double,
    `type`: java.lang.String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(downloadBandwidthTotal = downloadBandwidthTotal, downloadBandwidthUsed = downloadBandwidthUsed, sharedBandwidthLimit = sharedBandwidthLimit, sharedBandwidthUsed = sharedBandwidthUsed, spaceTotal = spaceTotal, spaceUsed = spaceUsed)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AccountInfo]
  }
}

