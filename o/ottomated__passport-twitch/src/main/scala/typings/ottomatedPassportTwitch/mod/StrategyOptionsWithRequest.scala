package typings.ottomatedPassportTwitch.mod

import typings.ottomatedPassportTwitch.ottomatedPassportTwitchBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsWithRequest extends StrategyOptionsBase {
  var passReqToCallback: `true` = js.native
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(clientID: String, clientSecret: String, passReqToCallback: `true`): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
  @scala.inline
  implicit class StrategyOptionsWithRequestOps[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
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
    def setPassReqToCallback(value: `true`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
  }
  
}

