package typings.passportTwitter.mod

import typings.passportTwitter.passportTwitterBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStrategyOption extends IStrategyOptionBase {
  var passReqToCallback: js.UndefOr[`false`] = js.native
}

object IStrategyOption {
  @scala.inline
  def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOption]
  }
  @scala.inline
  implicit class IStrategyOptionOps[Self <: IStrategyOption] (val x: Self) extends AnyVal {
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
    def setPassReqToCallback(value: `false`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
  }
  
}

