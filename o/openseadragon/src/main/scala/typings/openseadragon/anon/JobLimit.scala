package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobLimit extends js.Object {
  var jobLimit: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object JobLimit {
  @scala.inline
  def apply(): JobLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLimit]
  }
  @scala.inline
  implicit class JobLimitOps[Self <: JobLimit] (val x: Self) extends AnyVal {
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
    def setJobLimit(value: Double): Self = this.set("jobLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobLimit: Self = this.set("jobLimit", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

