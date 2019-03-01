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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("downloadBandwidthTotal")(downloadBandwidthTotal)
    __obj.updateDynamic("downloadBandwidthUsed")(downloadBandwidthUsed)
    __obj.updateDynamic("sharedBandwidthLimit")(sharedBandwidthLimit)
    __obj.updateDynamic("sharedBandwidthUsed")(sharedBandwidthUsed)
    __obj.updateDynamic("spaceTotal")(spaceTotal)
    __obj.updateDynamic("spaceUsed")(spaceUsed)
    __obj.asInstanceOf[AccountInfo]
  }
}

