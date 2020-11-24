package typings.paypalCheckoutComponents.anon

import typings.paypalCheckoutComponents.callbackDataMod.AuthorizationData
import typings.paypalCheckoutComponents.callbackDataMod.AuthorizationResponse
import typings.paypalCheckoutComponents.callbackDataMod.CancellationData
import typings.paypalCheckoutComponents.configurationMod.ButtonStyle
import typings.paypalCheckoutComponents.configurationMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessToken extends js.Object {
  
  var accessToken: js.UndefOr[js.Function0[Unit]] = js.native
  
  var authCode: js.UndefOr[String] = js.native
  
  var buttonSessionID: js.UndefOr[String] = js.native
  
  var checkoutUri: js.UndefOr[String] = js.native
  
  var client: js.UndefOr[js.Object] = js.native
  
  var commit: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[Environment] = js.native
  
  var experience: js.UndefOr[js.Object] = js.native
  
  var funding: js.UndefOr[Allowed] = js.native
  
  var fundingOffered: js.UndefOr[js.Object] = js.native
  
  var fundingSource: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var localhostUrl: js.UndefOr[String] = js.native
  
  var logLevel: js.UndefOr[String] = js.native
  
  var meta: js.UndefOr[js.Object] = js.native
  
  var onAuth: js.UndefOr[js.Function1[/* data */ String | js.Object, js.Object]] = js.native
  
  def onAuthorize(data: AuthorizationData, actions: js.Object): js.Promise[AuthorizationResponse] = js.native
  
  var onCancel: js.UndefOr[js.Function2[/* data */ CancellationData, /* actions */ js.Object, Unit]] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  
  var onShippingChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var payment: js.UndefOr[js.Function0[js.Promise[String]]] = js.native
  
  var sessionID: js.UndefOr[String] = js.native
  
  var stage: js.UndefOr[String] = js.native
  
  var stageUrl: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[ButtonStyle] = js.native
  
  var test: js.UndefOr[js.Object] = js.native
}
object AccessToken {
  
  @scala.inline
  def apply(onAuthorize: (AuthorizationData, js.Object) => js.Promise[AuthorizationResponse]): AccessToken = {
    val __obj = js.Dynamic.literal(onAuthorize = js.Any.fromFunction2(onAuthorize))
    __obj.asInstanceOf[AccessToken]
  }
  
  @scala.inline
  implicit class AccessTokenOps[Self <: AccessToken] (val x: Self) extends AnyVal {
    
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
    def setOnAuthorize(value: (AuthorizationData, js.Object) => js.Promise[AuthorizationResponse]): Self = this.set("onAuthorize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAccessToken(value: () => Unit): Self = this.set("accessToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setAuthCode(value: String): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthCode: Self = this.set("authCode", js.undefined)
    
    @scala.inline
    def setButtonSessionID(value: String): Self = this.set("buttonSessionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonSessionID: Self = this.set("buttonSessionID", js.undefined)
    
    @scala.inline
    def setCheckoutUri(value: String): Self = this.set("checkoutUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckoutUri: Self = this.set("checkoutUri", js.undefined)
    
    @scala.inline
    def setClient(value: js.Object): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setCommit(value: Boolean): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    
    @scala.inline
    def setEnv(value: Environment): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExperience(value: js.Object): Self = this.set("experience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperience: Self = this.set("experience", js.undefined)
    
    @scala.inline
    def setFunding(value: Allowed): Self = this.set("funding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunding: Self = this.set("funding", js.undefined)
    
    @scala.inline
    def setFundingOffered(value: js.Object): Self = this.set("fundingOffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFundingOffered: Self = this.set("fundingOffered", js.undefined)
    
    @scala.inline
    def setFundingSource(value: String): Self = this.set("fundingSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFundingSource: Self = this.set("fundingSource", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalhostUrl(value: String): Self = this.set("localhostUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalhostUrl: Self = this.set("localhostUrl", js.undefined)
    
    @scala.inline
    def setLogLevel(value: String): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setOnAuth(value: /* data */ String | js.Object => js.Object): Self = this.set("onAuth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAuth: Self = this.set("onAuth", js.undefined)
    
    @scala.inline
    def setOnCancel(value: (/* data */ CancellationData, /* actions */ js.Object) => Unit): Self = this.set("onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnShippingChange(value: () => Unit): Self = this.set("onShippingChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShippingChange: Self = this.set("onShippingChange", js.undefined)
    
    @scala.inline
    def setPayment(value: () => js.Promise[String]): Self = this.set("payment", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePayment: Self = this.set("payment", js.undefined)
    
    @scala.inline
    def setSessionID(value: String): Self = this.set("sessionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionID: Self = this.set("sessionID", js.undefined)
    
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    
    @scala.inline
    def setStageUrl(value: String): Self = this.set("stageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageUrl: Self = this.set("stageUrl", js.undefined)
    
    @scala.inline
    def setStyle(value: ButtonStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTest(value: js.Object): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
  }
}
