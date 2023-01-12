package typings.mercadopago

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  trait ConfigCredentialsOption
    extends StObject
       with GeneralConfigOptions
       with ConfigOptions {
    
    var client_id: String
    
    var client_secret: String
  }
  object ConfigCredentialsOption {
    
    inline def apply(client_id: String, client_secret: String): ConfigCredentialsOption = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigCredentialsOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigCredentialsOption] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mercadopago.configurationMod.ConfigCredentialsOption
    - typings.mercadopago.configurationMod.ConfigTokenOption
  */
  trait ConfigOptions extends StObject
  object ConfigOptions {
    
    inline def ConfigCredentialsOption(client_id: String, client_secret: String): typings.mercadopago.configurationMod.ConfigCredentialsOption = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mercadopago.configurationMod.ConfigCredentialsOption]
    }
    
    inline def ConfigTokenOption(access_token: String): typings.mercadopago.configurationMod.ConfigTokenOption = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mercadopago.configurationMod.ConfigTokenOption]
    }
  }
  
  trait ConfigTokenOption
    extends StObject
       with GeneralConfigOptions
       with ConfigOptions {
    
    var access_token: String
  }
  object ConfigTokenOption {
    
    inline def apply(access_token: String): ConfigTokenOption = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigTokenOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigTokenOption] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeneralConfigOptions extends StObject {
    
    var corporation_id: js.UndefOr[String] = js.undefined
    
    var integrator_id: js.UndefOr[String] = js.undefined
    
    var platform_id: js.UndefOr[String] = js.undefined
    
    var sandbox: js.UndefOr[Boolean] = js.undefined
    
    var show_promise_error: js.UndefOr[Boolean] = js.undefined
  }
  object GeneralConfigOptions {
    
    inline def apply(): GeneralConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneralConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeneralConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setCorporation_id(value: String): Self = StObject.set(x, "corporation_id", value.asInstanceOf[js.Any])
      
      inline def setCorporation_idUndefined: Self = StObject.set(x, "corporation_id", js.undefined)
      
      inline def setIntegrator_id(value: String): Self = StObject.set(x, "integrator_id", value.asInstanceOf[js.Any])
      
      inline def setIntegrator_idUndefined: Self = StObject.set(x, "integrator_id", js.undefined)
      
      inline def setPlatform_id(value: String): Self = StObject.set(x, "platform_id", value.asInstanceOf[js.Any])
      
      inline def setPlatform_idUndefined: Self = StObject.set(x, "platform_id", js.undefined)
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setShow_promise_error(value: Boolean): Self = StObject.set(x, "show_promise_error", value.asInstanceOf[js.Any])
      
      inline def setShow_promise_errorUndefined: Self = StObject.set(x, "show_promise_error", js.undefined)
    }
  }
  
  trait MercadoPagoConfig extends StObject {
    
    /** Check NODE_ENV variable */
    def areTestsRunnning(): String
    
    var cache_max_size: Double
    
    def configure(options: ConfigOptions): Unit
    
    def getAccessToken(): String
    
    /** Get base URL to execute rest operations */
    def getBaseUrl(): String
    
    def getClientId(): String
    
    def getClientSecret(): String
    
    def getCorporationId(): String
    
    def getIntegratorId(): String
    
    def getPlatformId(): String
    
    def getProductId(): String
    
    def getRefreshToken(): String
    
    def getTrackingId(): String
    
    def getUserAgent(): String
    
    var sandbox: Boolean
    
    def setAccessToken(token: String): MercadoPagoConfig
    
    def setRefreshToken(refreshToken: String): MercadoPagoConfig
    
    var show_promise_error: Boolean
  }
  object MercadoPagoConfig {
    
    inline def apply(
      areTestsRunnning: () => String,
      cache_max_size: Double,
      configure: ConfigOptions => Unit,
      getAccessToken: () => String,
      getBaseUrl: () => String,
      getClientId: () => String,
      getClientSecret: () => String,
      getCorporationId: () => String,
      getIntegratorId: () => String,
      getPlatformId: () => String,
      getProductId: () => String,
      getRefreshToken: () => String,
      getTrackingId: () => String,
      getUserAgent: () => String,
      sandbox: Boolean,
      setAccessToken: String => MercadoPagoConfig,
      setRefreshToken: String => MercadoPagoConfig,
      show_promise_error: Boolean
    ): MercadoPagoConfig = {
      val __obj = js.Dynamic.literal(areTestsRunnning = js.Any.fromFunction0(areTestsRunnning), cache_max_size = cache_max_size.asInstanceOf[js.Any], configure = js.Any.fromFunction1(configure), getAccessToken = js.Any.fromFunction0(getAccessToken), getBaseUrl = js.Any.fromFunction0(getBaseUrl), getClientId = js.Any.fromFunction0(getClientId), getClientSecret = js.Any.fromFunction0(getClientSecret), getCorporationId = js.Any.fromFunction0(getCorporationId), getIntegratorId = js.Any.fromFunction0(getIntegratorId), getPlatformId = js.Any.fromFunction0(getPlatformId), getProductId = js.Any.fromFunction0(getProductId), getRefreshToken = js.Any.fromFunction0(getRefreshToken), getTrackingId = js.Any.fromFunction0(getTrackingId), getUserAgent = js.Any.fromFunction0(getUserAgent), sandbox = sandbox.asInstanceOf[js.Any], setAccessToken = js.Any.fromFunction1(setAccessToken), setRefreshToken = js.Any.fromFunction1(setRefreshToken), show_promise_error = show_promise_error.asInstanceOf[js.Any])
      __obj.asInstanceOf[MercadoPagoConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MercadoPagoConfig] (val x: Self) extends AnyVal {
      
      inline def setAreTestsRunnning(value: () => String): Self = StObject.set(x, "areTestsRunnning", js.Any.fromFunction0(value))
      
      inline def setCache_max_size(value: Double): Self = StObject.set(x, "cache_max_size", value.asInstanceOf[js.Any])
      
      inline def setConfigure(value: ConfigOptions => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
      
      inline def setGetAccessToken(value: () => String): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction0(value))
      
      inline def setGetBaseUrl(value: () => String): Self = StObject.set(x, "getBaseUrl", js.Any.fromFunction0(value))
      
      inline def setGetClientId(value: () => String): Self = StObject.set(x, "getClientId", js.Any.fromFunction0(value))
      
      inline def setGetClientSecret(value: () => String): Self = StObject.set(x, "getClientSecret", js.Any.fromFunction0(value))
      
      inline def setGetCorporationId(value: () => String): Self = StObject.set(x, "getCorporationId", js.Any.fromFunction0(value))
      
      inline def setGetIntegratorId(value: () => String): Self = StObject.set(x, "getIntegratorId", js.Any.fromFunction0(value))
      
      inline def setGetPlatformId(value: () => String): Self = StObject.set(x, "getPlatformId", js.Any.fromFunction0(value))
      
      inline def setGetProductId(value: () => String): Self = StObject.set(x, "getProductId", js.Any.fromFunction0(value))
      
      inline def setGetRefreshToken(value: () => String): Self = StObject.set(x, "getRefreshToken", js.Any.fromFunction0(value))
      
      inline def setGetTrackingId(value: () => String): Self = StObject.set(x, "getTrackingId", js.Any.fromFunction0(value))
      
      inline def setGetUserAgent(value: () => String): Self = StObject.set(x, "getUserAgent", js.Any.fromFunction0(value))
      
      inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSetAccessToken(value: String => MercadoPagoConfig): Self = StObject.set(x, "setAccessToken", js.Any.fromFunction1(value))
      
      inline def setSetRefreshToken(value: String => MercadoPagoConfig): Self = StObject.set(x, "setRefreshToken", js.Any.fromFunction1(value))
      
      inline def setShow_promise_error(value: Boolean): Self = StObject.set(x, "show_promise_error", value.asInstanceOf[js.Any])
    }
  }
}
