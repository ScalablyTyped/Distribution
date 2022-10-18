package typings.paypalCheckoutComponents

import typings.paypalCheckoutComponents.modulesButtonMod.FundingOption
import typings.paypalCheckoutComponents.modulesCallbackDataMod.AuthorizationData
import typings.paypalCheckoutComponents.modulesCallbackDataMod.AuthorizationResponse
import typings.paypalCheckoutComponents.modulesCallbackDataMod.CancellationData
import typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonStyle
import typings.paypalCheckoutComponents.modulesConfigurationMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var authCode: js.UndefOr[String] = js.undefined
    
    var buttonSessionID: js.UndefOr[String] = js.undefined
    
    var checkoutUri: js.UndefOr[String] = js.undefined
    
    var client: js.UndefOr[js.Object] = js.undefined
    
    var commit: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[Environment] = js.undefined
    
    var experience: js.UndefOr[js.Object] = js.undefined
    
    var funding: js.UndefOr[Allowed] = js.undefined
    
    var fundingOffered: js.UndefOr[js.Object] = js.undefined
    
    var fundingSource: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var localhostUrl: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[js.Object] = js.undefined
    
    var onAuth: js.UndefOr[js.Function1[/* data */ String | js.Object, js.Object]] = js.undefined
    
    def onAuthorize(data: AuthorizationData, actions: js.Object): js.Promise[AuthorizationResponse]
    
    var onCancel: js.UndefOr[js.Function2[/* data */ CancellationData, /* actions */ js.Object, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
    
    var onShippingChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var payment: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
    
    var sessionID: js.UndefOr[String] = js.undefined
    
    var stage: js.UndefOr[String] = js.undefined
    
    var stageUrl: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[ButtonStyle] = js.undefined
    
    var test: js.UndefOr[js.Object] = js.undefined
  }
  object AccessToken {
    
    inline def apply(onAuthorize: (AuthorizationData, js.Object) => js.Promise[AuthorizationResponse]): AccessToken = {
      val __obj = js.Dynamic.literal(onAuthorize = js.Any.fromFunction2(onAuthorize))
      __obj.asInstanceOf[AccessToken]
    }
    
    extension [Self <: AccessToken](x: Self) {
      
      inline def setAccessToken(value: () => Unit): Self = StObject.set(x, "accessToken", js.Any.fromFunction0(value))
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
      
      inline def setButtonSessionID(value: String): Self = StObject.set(x, "buttonSessionID", value.asInstanceOf[js.Any])
      
      inline def setButtonSessionIDUndefined: Self = StObject.set(x, "buttonSessionID", js.undefined)
      
      inline def setCheckoutUri(value: String): Self = StObject.set(x, "checkoutUri", value.asInstanceOf[js.Any])
      
      inline def setCheckoutUriUndefined: Self = StObject.set(x, "checkoutUri", js.undefined)
      
      inline def setClient(value: js.Object): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExperience(value: js.Object): Self = StObject.set(x, "experience", value.asInstanceOf[js.Any])
      
      inline def setExperienceUndefined: Self = StObject.set(x, "experience", js.undefined)
      
      inline def setFunding(value: Allowed): Self = StObject.set(x, "funding", value.asInstanceOf[js.Any])
      
      inline def setFundingOffered(value: js.Object): Self = StObject.set(x, "fundingOffered", value.asInstanceOf[js.Any])
      
      inline def setFundingOfferedUndefined: Self = StObject.set(x, "fundingOffered", js.undefined)
      
      inline def setFundingSource(value: String): Self = StObject.set(x, "fundingSource", value.asInstanceOf[js.Any])
      
      inline def setFundingSourceUndefined: Self = StObject.set(x, "fundingSource", js.undefined)
      
      inline def setFundingUndefined: Self = StObject.set(x, "funding", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocalhostUrl(value: String): Self = StObject.set(x, "localhostUrl", value.asInstanceOf[js.Any])
      
      inline def setLocalhostUrlUndefined: Self = StObject.set(x, "localhostUrl", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setOnAuth(value: /* data */ String | js.Object => js.Object): Self = StObject.set(x, "onAuth", js.Any.fromFunction1(value))
      
      inline def setOnAuthUndefined: Self = StObject.set(x, "onAuth", js.undefined)
      
      inline def setOnAuthorize(value: (AuthorizationData, js.Object) => js.Promise[AuthorizationResponse]): Self = StObject.set(x, "onAuthorize", js.Any.fromFunction2(value))
      
      inline def setOnCancel(value: (/* data */ CancellationData, /* actions */ js.Object) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnShippingChange(value: () => Unit): Self = StObject.set(x, "onShippingChange", js.Any.fromFunction0(value))
      
      inline def setOnShippingChangeUndefined: Self = StObject.set(x, "onShippingChange", js.undefined)
      
      inline def setPayment(value: () => js.Promise[String]): Self = StObject.set(x, "payment", js.Any.fromFunction0(value))
      
      inline def setPaymentUndefined: Self = StObject.set(x, "payment", js.undefined)
      
      inline def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
      
      inline def setSessionIDUndefined: Self = StObject.set(x, "sessionID", js.undefined)
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      inline def setStageUrl(value: String): Self = StObject.set(x, "stageUrl", value.asInstanceOf[js.Any])
      
      inline def setStageUrlUndefined: Self = StObject.set(x, "stageUrl", js.undefined)
      
      inline def setStyle(value: ButtonStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTest(value: js.Object): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  trait Allowed extends StObject {
    
    var allowed: js.UndefOr[js.Array[FundingOption]] = js.undefined
    
    var disallowed: js.UndefOr[js.Array[FundingOption]] = js.undefined
  }
  object Allowed {
    
    inline def apply(): Allowed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Allowed]
    }
    
    extension [Self <: Allowed](x: Self) {
      
      inline def setAllowed(value: js.Array[FundingOption]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setAllowedVarargs(value: FundingOption*): Self = StObject.set(x, "allowed", js.Array(value*))
      
      inline def setDisallowed(value: js.Array[FundingOption]): Self = StObject.set(x, "disallowed", value.asInstanceOf[js.Any])
      
      inline def setDisallowedUndefined: Self = StObject.set(x, "disallowed", js.undefined)
      
      inline def setDisallowedVarargs(value: FundingOption*): Self = StObject.set(x, "disallowed", js.Array(value*))
    }
  }
  
  trait CreateBillingAgreement extends StObject {
    
    var createBillingAgreement: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
    
    var createOrder: js.UndefOr[js.Function0[js.Promise[String]]] = js.undefined
    
    var fundingSource: js.UndefOr[String] = js.undefined
    
    def onApprove(data: AuthorizationData, actions: js.Object): js.Promise[AuthorizationResponse]
    
    var onCancel: js.UndefOr[js.Function2[/* data */ CancellationData, /* actions */ js.Object, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  }
  object CreateBillingAgreement {
    
    inline def apply(onApprove: (AuthorizationData, js.Object) => js.Promise[AuthorizationResponse]): CreateBillingAgreement = {
      val __obj = js.Dynamic.literal(onApprove = js.Any.fromFunction2(onApprove))
      __obj.asInstanceOf[CreateBillingAgreement]
    }
    
    extension [Self <: CreateBillingAgreement](x: Self) {
      
      inline def setCreateBillingAgreement(value: () => js.Promise[String]): Self = StObject.set(x, "createBillingAgreement", js.Any.fromFunction0(value))
      
      inline def setCreateBillingAgreementUndefined: Self = StObject.set(x, "createBillingAgreement", js.undefined)
      
      inline def setCreateOrder(value: () => js.Promise[String]): Self = StObject.set(x, "createOrder", js.Any.fromFunction0(value))
      
      inline def setCreateOrderUndefined: Self = StObject.set(x, "createOrder", js.undefined)
      
      inline def setFundingSource(value: String): Self = StObject.set(x, "fundingSource", value.asInstanceOf[js.Any])
      
      inline def setFundingSourceUndefined: Self = StObject.set(x, "fundingSource", js.undefined)
      
      inline def setOnApprove(value: (AuthorizationData, js.Object) => js.Promise[AuthorizationResponse]): Self = StObject.set(x, "onApprove", js.Any.fromFunction2(value))
      
      inline def setOnCancel(value: (/* data */ CancellationData, /* actions */ js.Object) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
}
