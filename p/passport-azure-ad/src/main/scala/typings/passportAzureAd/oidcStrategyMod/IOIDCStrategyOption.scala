package typings.passportAzureAd.oidcStrategyMod

import typings.passportAzureAd.anon.Iv
import typings.passportAzureAd.commonMod.IBaseStrategyOption
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
trait IOIDCStrategyOption extends IBaseStrategyOption {
  var allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var cookieEncryptionKeys: js.UndefOr[js.Array[Iv]] = js.native
  var cookieSameSite: js.UndefOr[Boolean] = js.native
  var nonceLifetime: js.UndefOr[Double] = js.native
  var nonceMaxAmount: js.UndefOr[Double] = js.native
  var privatePEMKey: js.UndefOr[String] = js.native
  var redirectUrl: String = js.native
  var responseMode: query | form_post = js.native
  var responseType: code | (`code id_token`) | (`id_token code`) | id_token = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  var thumbprint: js.UndefOr[String] = js.native
  var useCookieInsteadOfSession: js.UndefOr[Boolean] = js.native
}

object IOIDCStrategyOption {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    redirectUrl: String,
    responseMode: query | form_post,
    responseType: code | (`code id_token`) | (`id_token code`) | id_token
  ): IOIDCStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOIDCStrategyOption]
  }
  @scala.inline
  implicit class IOIDCStrategyOptionOps[Self <: IOIDCStrategyOption] (val x: Self) extends AnyVal {
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
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseMode(value: query | form_post): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseType(value: code | (`code id_token`) | (`id_token code`) | id_token): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowHttpForRedirectUrl(value: Boolean): Self = this.set("allowHttpForRedirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHttpForRedirectUrl: Self = this.set("allowHttpForRedirectUrl", js.undefined)
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    @scala.inline
    def setCookieEncryptionKeysVarargs(value: Iv*): Self = this.set("cookieEncryptionKeys", js.Array(value :_*))
    @scala.inline
    def setCookieEncryptionKeys(value: js.Array[Iv]): Self = this.set("cookieEncryptionKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieEncryptionKeys: Self = this.set("cookieEncryptionKeys", js.undefined)
    @scala.inline
    def setCookieSameSite(value: Boolean): Self = this.set("cookieSameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieSameSite: Self = this.set("cookieSameSite", js.undefined)
    @scala.inline
    def setNonceLifetime(value: Double): Self = this.set("nonceLifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonceLifetime: Self = this.set("nonceLifetime", js.undefined)
    @scala.inline
    def setNonceMaxAmount(value: Double): Self = this.set("nonceMaxAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonceMaxAmount: Self = this.set("nonceMaxAmount", js.undefined)
    @scala.inline
    def setPrivatePEMKey(value: String): Self = this.set("privatePEMKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivatePEMKey: Self = this.set("privatePEMKey", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setThumbprint(value: String): Self = this.set("thumbprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbprint: Self = this.set("thumbprint", js.undefined)
    @scala.inline
    def setUseCookieInsteadOfSession(value: Boolean): Self = this.set("useCookieInsteadOfSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCookieInsteadOfSession: Self = this.set("useCookieInsteadOfSession", js.undefined)
  }
  
}

