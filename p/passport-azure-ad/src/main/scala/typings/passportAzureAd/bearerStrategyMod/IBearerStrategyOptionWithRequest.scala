package typings.passportAzureAd.bearerStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBearerStrategyOptionWithRequest extends IBearerStrategyOption {
  var passReqToCallback: Boolean = js.native
}

object IBearerStrategyOptionWithRequest {
  @scala.inline
  def apply(clientID: String, identityMetadata: String, passReqToCallback: Boolean): IBearerStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBearerStrategyOptionWithRequest]
  }
  @scala.inline
  implicit class IBearerStrategyOptionWithRequestOps[Self <: IBearerStrategyOptionWithRequest] (val x: Self) extends AnyVal {
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

