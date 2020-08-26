package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxStalenessSeconds extends js.Object {
  /**
    * Max Secondary Read Staleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[Double] = js.native
}

object MaxStalenessSeconds {
  @scala.inline
  def apply(): MaxStalenessSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxStalenessSeconds]
  }
  @scala.inline
  implicit class MaxStalenessSecondsOps[Self <: MaxStalenessSeconds] (val x: Self) extends AnyVal {
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
    def setMaxStalenessSeconds(value: Double): Self = this.set("maxStalenessSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStalenessSeconds: Self = this.set("maxStalenessSeconds", js.undefined)
  }
  
}

