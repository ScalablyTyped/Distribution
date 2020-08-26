package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jobs extends js.Object {
  var jobs: Double = js.native
  var total_ms: Double = js.native
}

object Jobs {
  @scala.inline
  def apply(jobs: Double, total_ms: Double): Jobs = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any], total_ms = total_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jobs]
  }
  @scala.inline
  implicit class JobsOps[Self <: Jobs] (val x: Self) extends AnyVal {
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
    def setJobs(value: Double): Self = this.set("jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_ms(value: Double): Self = this.set("total_ms", value.asInstanceOf[js.Any])
  }
  
}

