package typings.npmRegistryPackageInfo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure extends js.Object {
  var failure: Double = js.native
  var success: Double = js.native
  var total: Double = js.native
}

object Failure {
  @scala.inline
  def apply(failure: Double, success: Double, total: Double): Failure = {
    val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
  @scala.inline
  implicit class FailureOps[Self <: Failure] (val x: Self) extends AnyVal {
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
    def setFailure(value: Double): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Double): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

