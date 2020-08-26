package typings.onfleetNodeOnfleet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checksum extends js.Object {
  var checksum: Null = js.native
  var failedScanCount: Double = js.native
}

object Checksum {
  @scala.inline
  def apply(checksum: Null, failedScanCount: Double): Checksum = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], failedScanCount = failedScanCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksum]
  }
  @scala.inline
  implicit class ChecksumOps[Self <: Checksum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChecksum(value: Null): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedScanCount(value: Double): Self = this.set("failedScanCount", value.asInstanceOf[js.Any])
  }
  
}

