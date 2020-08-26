package typings.notp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HOTPGenOpt extends js.Object {
  /**
    * Counter value used in generating the token. This should be stored by the
    * application, must be user specific, and be incremented for each request.
    */
  var counter: js.UndefOr[Double] = js.native
}

object HOTPGenOpt {
  @scala.inline
  def apply(): HOTPGenOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HOTPGenOpt]
  }
  @scala.inline
  implicit class HOTPGenOptOps[Self <: HOTPGenOpt] (val x: Self) extends AnyVal {
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
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
  }
  
}

