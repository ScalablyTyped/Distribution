package typings.oibackoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackoffOptions extends js.Object {
  var algorithm: js.UndefOr[
    typings.oibackoff.oibackoffStrings.incremental | typings.oibackoff.oibackoffStrings.exponential | typings.oibackoff.oibackoffStrings.fibonacci
  ] = js.native
  var delayRatio: js.UndefOr[Double] = js.native
  var maxDelay: js.UndefOr[Double] = js.native
  var maxTries: js.UndefOr[Double] = js.native
}

object BackoffOptions {
  @scala.inline
  def apply(): BackoffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackoffOptions]
  }
  @scala.inline
  implicit class BackoffOptionsOps[Self <: BackoffOptions] (val x: Self) extends AnyVal {
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
    def setAlgorithm(
      value: typings.oibackoff.oibackoffStrings.incremental | typings.oibackoff.oibackoffStrings.exponential | typings.oibackoff.oibackoffStrings.fibonacci
    ): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setDelayRatio(value: Double): Self = this.set("delayRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayRatio: Self = this.set("delayRatio", js.undefined)
    @scala.inline
    def setMaxDelay(value: Double): Self = this.set("maxDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDelay: Self = this.set("maxDelay", js.undefined)
    @scala.inline
    def setMaxTries(value: Double): Self = this.set("maxTries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTries: Self = this.set("maxTries", js.undefined)
  }
  
}

