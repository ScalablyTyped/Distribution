package typings.nodeJose.mod.JWS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSignResult extends js.Object {
  var signResult: js.Object = js.native
}

object CreateSignResult {
  @scala.inline
  def apply(signResult: js.Object): CreateSignResult = {
    val __obj = js.Dynamic.literal(signResult = signResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSignResult]
  }
  @scala.inline
  implicit class CreateSignResultOps[Self <: CreateSignResult] (val x: Self) extends AnyVal {
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
    def setSignResult(value: js.Object): Self = this.set("signResult", value.asInstanceOf[js.Any])
  }
  
}

