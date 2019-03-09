package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCStats extends js.Object {
  var id: java.lang.String
  var timestamp: scala.Double
  var `type`: RTCStatsType
}

object RTCStats {
  @scala.inline
  def apply(id: java.lang.String, timestamp: scala.Double, `type`: RTCStatsType): RTCStats = {
    val __obj = js.Dynamic.literal(id = id, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RTCStats]
  }
}

