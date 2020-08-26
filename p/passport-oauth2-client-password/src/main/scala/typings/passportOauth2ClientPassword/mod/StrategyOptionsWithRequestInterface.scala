package typings.passportOauth2ClientPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsWithRequestInterface extends js.Object {
  var passReqToCallback: Boolean = js.native
}

object StrategyOptionsWithRequestInterface {
  @scala.inline
  def apply(passReqToCallback: Boolean): StrategyOptionsWithRequestInterface = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequestInterface]
  }
  @scala.inline
  implicit class StrategyOptionsWithRequestInterfaceOps[Self <: StrategyOptionsWithRequestInterface] (val x: Self) extends AnyVal {
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
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
  }
  
}

