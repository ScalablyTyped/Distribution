package typings.paypalCheckoutComponents

import typings.paypalCheckoutComponents.buttonMod.FundingOption
import typings.paypalCheckoutComponents.callbackDataMod.AuthorizationData
import typings.paypalCheckoutComponents.callbackDataMod.AuthorizationResponse
import typings.paypalCheckoutComponents.callbackDataMod.CancellationData
import typings.paypalCheckoutComponents.configurationMod.ButtonStyle
import typings.paypalCheckoutComponents.configurationMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessToken extends StObject {
    
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
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: () => Unit): Self = StObject.set(x, "accessToken", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
      
      @scala.inline
      def setButtonSessionID(value: String): Self = StObject.set(x, "buttonSessionID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonSessionIDUndefined: Self = StObject.set(x, "buttonSessionID", js.undefined)
      
      @scala.inline
      def setCheckoutUri(value: String): Self = StObject.set(x, "checkoutUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckoutUriUndefined: Self = StObject.set(x, "checkoutUri", js.undefined)
      
      @scala.inline
      def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      @scala.inline
      def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExperience(value: js.Object): Self = StObject.set(x, "experience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperienceUndefined: Self = StObject.set(x, "experience", js.undefined)
      
      @scala.inline
      def setFunding(value: Allowed): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFundingOffered(value: js.Object): Self = StObject.set(x, "fundingOffered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFundingOfferedUndefined: Self = StObject.set(x, "fundingOffered", js.undefined)
      
      @scala.inline
      def setFundingSource(value: String): Self = StObject.set(x, "fundingSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFundingSourceUndefined: Self = StObject.set(x, "fundingSource", js.undefined)
      
      @scala.inline
      def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocalhostUrl(value: String): Self = StObject.set(x, "localhostUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalhostUrlUndefined: Self = StObject.set(x, "localhostUrl", js.undefined)
      
      @scala.inline
      def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setOnAuth(value: /* data */ String | js.Object => js.Object): Self = StObject.set(x, "onAuth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuthUndefined: Self = StObject.set(x, "onAuth", js.undefined)
      
      @scala.inline
      def setOnAuthorize(value: (AuthorizationData, js.Object) => js.Promise[AuthorizationResponse]): Self = StObject.set(x, "onAuthorize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancel(value: (/* data */ CancellationData, /* actions */ js.Object) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnShippingChange(value: () => Unit): Self = StObject.set(x, "onShippingChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShippingChangeUndefined: Self = StObject.set(x, "onShippingChange", js.undefined)
      
      @scala.inline
      def setPayment(value: () => js.Promise[String]): Self = StObject.set(x, "payment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
      
      @scala.inline
      def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIDUndefined: Self = StObject.set(x, "sessionID", js.undefined)
      
      @scala.inline
      def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      @scala.inline
      def setStageUrl(value: String): Self = StObject.set(x, "stageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStageUrlUndefined: Self = StObject.set(x, "stageUrl", js.undefined)
      
      @scala.inline
      def setStyle(value: ButtonStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTest(value: js.Object): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  @js.native
  trait Allowed extends StObject {
    
    var allowed: js.UndefOr[js.Array[FundingOption]] = js.native
    
    var disallowed: js.UndefOr[js.Array[FundingOption]] = js.native
  }
  object Allowed {
    
    @scala.inline
    def apply(): Allowed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Allowed]
    }
    
    @scala.inline
    implicit class AllowedMutableBuilder[Self <: Allowed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed(value: js.Array[FundingOption]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      @scala.inline
      def setAllowedVarargs(value: FundingOption*): Self = StObject.set(x, "allowed", js.Array(value :_*))
      
      @scala.inline
      def setDisallowed(value: js.Array[FundingOption]): Self = StObject.set(x, "disallowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowedUndefined: Self = StObject.set(x, "disallowed", js.undefined)
      
      @scala.inline
      def setDisallowedVarargs(value: FundingOption*): Self = StObject.set(x, "disallowed", js.Array(value :_*))
    }
  }
}
