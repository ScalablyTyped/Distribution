package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reject extends js.Object {
  var reject: js.Function = js.native
  var resolve: js.Function = js.native
}

object Reject {
  @scala.inline
  def apply(reject: js.Function, resolve: js.Function): Reject = {
    val __obj = js.Dynamic.literal(reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reject]
  }
  @scala.inline
  implicit class RejectOps[Self <: Reject] (val x: Self) extends AnyVal {
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
    def setReject(value: js.Function): Self = this.set("reject", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolve(value: js.Function): Self = this.set("resolve", value.asInstanceOf[js.Any])
  }
  
}

