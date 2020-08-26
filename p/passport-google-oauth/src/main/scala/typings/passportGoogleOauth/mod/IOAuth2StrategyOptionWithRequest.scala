package typings.passportGoogleOauth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOAuth2StrategyOptionWithRequest extends IOAuth2StrategyOption {
  var passReqToCallback: Boolean = js.native
}

object IOAuth2StrategyOptionWithRequest {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String, passReqToCallback: Boolean): IOAuth2StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuth2StrategyOptionWithRequest]
  }
  @scala.inline
  implicit class IOAuth2StrategyOptionWithRequestOps[Self <: IOAuth2StrategyOptionWithRequest] (val x: Self) extends AnyVal {
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

