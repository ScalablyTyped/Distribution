package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checksum extends js.Object {
  var checksum: Null
  var failedScanCount: Double
}

object Checksum {
  @scala.inline
  def apply(checksum: Null, failedScanCount: Double): Checksum = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], failedScanCount = failedScanCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksum]
  }
}

