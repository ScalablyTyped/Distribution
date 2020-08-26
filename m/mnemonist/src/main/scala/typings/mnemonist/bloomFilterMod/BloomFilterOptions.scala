package typings.mnemonist.bloomFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BloomFilterOptions extends js.Object {
  var capacity: Double = js.native
  var errorRate: js.UndefOr[Double] = js.native
}

object BloomFilterOptions {
  @scala.inline
  def apply(capacity: Double): BloomFilterOptions = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BloomFilterOptions]
  }
  @scala.inline
  implicit class BloomFilterOptionsOps[Self <: BloomFilterOptions] (val x: Self) extends AnyVal {
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
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorRate(value: Double): Self = this.set("errorRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorRate: Self = this.set("errorRate", js.undefined)
  }
  
}

