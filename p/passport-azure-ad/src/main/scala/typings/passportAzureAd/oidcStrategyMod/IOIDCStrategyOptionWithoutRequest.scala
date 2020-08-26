package typings.passportAzureAd.oidcStrategyMod

import typings.passportAzureAd.passportAzureAdBooleans.`false`
import typings.passportAzureAd.passportAzureAdStrings.`code id_token`
import typings.passportAzureAd.passportAzureAdStrings.`id_token code`
import typings.passportAzureAd.passportAzureAdStrings.code
import typings.passportAzureAd.passportAzureAdStrings.form_post
import typings.passportAzureAd.passportAzureAdStrings.id_token
import typings.passportAzureAd.passportAzureAdStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOIDCStrategyOptionWithoutRequest extends IOIDCStrategyOption {
  var passReqToCallback: `false` = js.native
}

object IOIDCStrategyOptionWithoutRequest {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    passReqToCallback: `false`,
    redirectUrl: String,
    responseMode: query | form_post,
    responseType: code | (`code id_token`) | (`id_token code`) | id_token
  ): IOIDCStrategyOptionWithoutRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOIDCStrategyOptionWithoutRequest]
  }
  @scala.inline
  implicit class IOIDCStrategyOptionWithoutRequestOps[Self <: IOIDCStrategyOptionWithoutRequest] (val x: Self) extends AnyVal {
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
  }
  
}

