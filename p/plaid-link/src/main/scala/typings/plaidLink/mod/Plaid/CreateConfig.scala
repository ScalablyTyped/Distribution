package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfig extends StObject {
  
  var clientName: String
  
  var countryCodes: js.UndefOr[js.Array[Country]] = js.undefined
  
  var env: Environment
  
  var isWebView: js.UndefOr[Boolean] = js.undefined
  
  var key: String
  
  var language: js.UndefOr[Language] = js.undefined
  
  var linkCustomizationName: js.UndefOr[String] = js.undefined
  
  var oauthNonce: js.UndefOr[String] = js.undefined
  
  var oauthRedirectUri: js.UndefOr[String] = js.undefined
  
  var oauthStateId: js.UndefOr[String] = js.undefined
  
  var onEvent: js.UndefOr[OnEvent] = js.undefined
  
  var onExit: js.UndefOr[OnExit] = js.undefined
  
  var onLoad: js.UndefOr[OnLoad] = js.undefined
  
  def onSuccess(public_token: String, metadata: OnSuccessMetaData): Unit
  @JSName("onSuccess")
  var onSuccess_Original: OnSuccess
  
  var product: js.Array[Product]
  
  var token: js.UndefOr[String] = js.undefined
  
  var userEmailAddress: js.UndefOr[String] = js.undefined
  
  var userLegalName: js.UndefOr[String] = js.undefined
  
  var webhook: js.UndefOr[String] = js.undefined
}
object CreateConfig {
  
  inline def apply(
    clientName: String,
    env: Environment,
    key: String,
    onSuccess: (/* public_token */ String, /* metadata */ OnSuccessMetaData) => Unit,
    product: js.Array[Product]
  ): CreateConfig = {
    val __obj = js.Dynamic.literal(clientName = clientName.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onSuccess = js.Any.fromFunction2(onSuccess), product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfig]
  }
  
  extension [Self <: CreateConfig](x: Self) {
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setCountryCodes(value: js.Array[Country]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
    
    inline def setCountryCodesUndefined: Self = StObject.set(x, "countryCodes", js.undefined)
    
    inline def setCountryCodesVarargs(value: Country*): Self = StObject.set(x, "countryCodes", js.Array(value :_*))
    
    inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setIsWebView(value: Boolean): Self = StObject.set(x, "isWebView", value.asInstanceOf[js.Any])
    
    inline def setIsWebViewUndefined: Self = StObject.set(x, "isWebView", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLinkCustomizationName(value: String): Self = StObject.set(x, "linkCustomizationName", value.asInstanceOf[js.Any])
    
    inline def setLinkCustomizationNameUndefined: Self = StObject.set(x, "linkCustomizationName", js.undefined)
    
    inline def setOauthNonce(value: String): Self = StObject.set(x, "oauthNonce", value.asInstanceOf[js.Any])
    
    inline def setOauthNonceUndefined: Self = StObject.set(x, "oauthNonce", js.undefined)
    
    inline def setOauthRedirectUri(value: String): Self = StObject.set(x, "oauthRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setOauthRedirectUriUndefined: Self = StObject.set(x, "oauthRedirectUri", js.undefined)
    
    inline def setOauthStateId(value: String): Self = StObject.set(x, "oauthStateId", value.asInstanceOf[js.Any])
    
    inline def setOauthStateIdUndefined: Self = StObject.set(x, "oauthStateId", js.undefined)
    
    inline def setOnEvent(value: (/* eventName */ EventName, /* metadata */ OnEventMetaData) => Unit): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnExit(value: (/* error */ Error | Null, /* metadata */ OnExitMetaData) => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction2(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnSuccess(value: (/* public_token */ String, /* metadata */ OnSuccessMetaData) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
    
    inline def setProduct(value: js.Array[Product]): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductVarargs(value: Product*): Self = StObject.set(x, "product", js.Array(value :_*))
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
    
    inline def setUserLegalName(value: String): Self = StObject.set(x, "userLegalName", value.asInstanceOf[js.Any])
    
    inline def setUserLegalNameUndefined: Self = StObject.set(x, "userLegalName", js.undefined)
    
    inline def setWebhook(value: String): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
    
    inline def setWebhookUndefined: Self = StObject.set(x, "webhook", js.undefined)
  }
}
