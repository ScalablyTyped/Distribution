package typings.onfleetNodeOnfleet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecksum extends js.Object {
  var checksum: Null
  var failedScanCount: Double
}

object AnonChecksum {
  @scala.inline
  def apply(checksum: Null, failedScanCount: Double): AnonChecksum = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], failedScanCount = failedScanCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecksum]
  }
}

