package typings.paypalPaypalJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@paypal/paypal-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadScript(options: ScriptOptions): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("@paypal/paypal-js", "version")
  @js.native
  val version: String = js.native
  
  trait ScriptOptions extends StObject {
    
    var `buyer-country`: js.UndefOr[String] = js.undefined
    
    var `client-id`: String
    
    var commit: js.UndefOr[Boolean] = js.undefined
    
    var components: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var `data-client-token`: js.UndefOr[String] = js.undefined
    
    var `data-csp-nonce`: js.UndefOr[String] = js.undefined
    
    var `data-order-id`: js.UndefOr[String] = js.undefined
    
    var `data-page-type`: js.UndefOr[String] = js.undefined
    
    var `data-partner-attribution-id`: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean | String] = js.undefined
    
    /*
      * @deprecated
      */
    var `disable-card`: js.UndefOr[String] = js.undefined
    
    var `disable-funding`: js.UndefOr[String] = js.undefined
    
    var `integration-date`: js.UndefOr[String] = js.undefined
    
    var intent: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var `merchant-id`: js.UndefOr[String] = js.undefined
    
    var vault: js.UndefOr[Boolean | String] = js.undefined
  }
  object ScriptOptions {
    
    inline def apply(`client-id`: String): ScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("client-id")(`client-id`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptOptions]
    }
    
    extension [Self <: ScriptOptions](x: Self) {
      
      inline def `setBuyer-country`(value: String): Self = StObject.set(x, "buyer-country", value.asInstanceOf[js.Any])
      
      inline def `setBuyer-countryUndefined`: Self = StObject.set(x, "buyer-country", js.undefined)
      
      inline def `setClient-id`(value: String): Self = StObject.set(x, "client-id", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setComponents(value: String): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def `setData-client-token`(value: String): Self = StObject.set(x, "data-client-token", value.asInstanceOf[js.Any])
      
      inline def `setData-client-tokenUndefined`: Self = StObject.set(x, "data-client-token", js.undefined)
      
      inline def `setData-csp-nonce`(value: String): Self = StObject.set(x, "data-csp-nonce", value.asInstanceOf[js.Any])
      
      inline def `setData-csp-nonceUndefined`: Self = StObject.set(x, "data-csp-nonce", js.undefined)
      
      inline def `setData-order-id`(value: String): Self = StObject.set(x, "data-order-id", value.asInstanceOf[js.Any])
      
      inline def `setData-order-idUndefined`: Self = StObject.set(x, "data-order-id", js.undefined)
      
      inline def `setData-page-type`(value: String): Self = StObject.set(x, "data-page-type", value.asInstanceOf[js.Any])
      
      inline def `setData-page-typeUndefined`: Self = StObject.set(x, "data-page-type", js.undefined)
      
      inline def `setData-partner-attribution-id`(value: String): Self = StObject.set(x, "data-partner-attribution-id", value.asInstanceOf[js.Any])
      
      inline def `setData-partner-attribution-idUndefined`: Self = StObject.set(x, "data-partner-attribution-id", js.undefined)
      
      inline def setDebug(value: Boolean | String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def `setDisable-card`(value: String): Self = StObject.set(x, "disable-card", value.asInstanceOf[js.Any])
      
      inline def `setDisable-cardUndefined`: Self = StObject.set(x, "disable-card", js.undefined)
      
      inline def `setDisable-funding`(value: String): Self = StObject.set(x, "disable-funding", value.asInstanceOf[js.Any])
      
      inline def `setDisable-fundingUndefined`: Self = StObject.set(x, "disable-funding", js.undefined)
      
      inline def `setIntegration-date`(value: String): Self = StObject.set(x, "integration-date", value.asInstanceOf[js.Any])
      
      inline def `setIntegration-dateUndefined`: Self = StObject.set(x, "integration-date", js.undefined)
      
      inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def `setMerchant-id`(value: String): Self = StObject.set(x, "merchant-id", value.asInstanceOf[js.Any])
      
      inline def `setMerchant-idUndefined`: Self = StObject.set(x, "merchant-id", js.undefined)
      
      inline def setVault(value: Boolean | String): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
      
      inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
    }
  }
}
