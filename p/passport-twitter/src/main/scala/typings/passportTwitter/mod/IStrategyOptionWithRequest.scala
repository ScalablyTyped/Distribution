package typings.passportTwitter.mod

import typings.passportTwitter.passportTwitterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStrategyOptionWithRequest extends IStrategyOptionBase {
  var passReqToCallback: `true` = js.native
}

object IStrategyOptionWithRequest {
  @scala.inline
  def apply(callbackURL: String, consumerKey: String, consumerSecret: String, passReqToCallback: `true`): IStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptionWithRequest]
  }
  @scala.inline
  implicit class IStrategyOptionWithRequestOps[Self <: IStrategyOptionWithRequest] (val x: Self) extends AnyVal {
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

