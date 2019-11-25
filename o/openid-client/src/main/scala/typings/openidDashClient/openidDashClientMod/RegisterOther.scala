package typings.openidDashClient.openidDashClientMod

import typings.jose.joseMod.JSONWebKeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOther extends js.Object {
  /**
    * Initial Access Token to use as a Bearer token during the registration call.
    */
  var initialAccessToken: js.UndefOr[String] = js.undefined
  /**
    * JWK Set formatted object with private keys used for signing client assertions or decrypting responses.
    * When neither jwks_uri or jwks is present in metadata the key's public parts will be registered as jwks.
    */
  var jwks: js.UndefOr[JSONWebKeySet] = js.undefined
}

object RegisterOther {
  @scala.inline
  def apply(initialAccessToken: String = null, jwks: JSONWebKeySet = null): RegisterOther = {
    val __obj = js.Dynamic.literal()
    if (initialAccessToken != null) __obj.updateDynamic("initialAccessToken")(initialAccessToken.asInstanceOf[js.Any])
    if (jwks != null) __obj.updateDynamic("jwks")(jwks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOther]
  }
}

