package typings.paypalPaypalJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptOptionsMod {
  
  trait PayPalScriptDataAttributes extends StObject {
    
    var `data-client-metadata-id`: js.UndefOr[String] = js.undefined
    
    var `data-client-token`: js.UndefOr[String] = js.undefined
    
    var `data-csp-nonce`: js.UndefOr[String] = js.undefined
    
    var `data-merchant-id`: js.UndefOr[String] = js.undefined
    
    var `data-namespace`: js.UndefOr[String] = js.undefined
    
    var `data-page-type`: js.UndefOr[String] = js.undefined
    
    var `data-partner-attribution-id`: js.UndefOr[String] = js.undefined
    
    var `data-sdk-integration-source`: js.UndefOr[String] = js.undefined
    
    var `data-user-id-token`: js.UndefOr[String] = js.undefined
  }
  object PayPalScriptDataAttributes {
    
    inline def apply(): PayPalScriptDataAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayPalScriptDataAttributes]
    }
    
    extension [Self <: PayPalScriptDataAttributes](x: Self) {
      
      inline def `setData-client-metadata-id`(value: String): Self = StObject.set(x, "data-client-metadata-id", value.asInstanceOf[js.Any])
      
      inline def `setData-client-metadata-idUndefined`: Self = StObject.set(x, "data-client-metadata-id", js.undefined)
      
      inline def `setData-client-token`(value: String): Self = StObject.set(x, "data-client-token", value.asInstanceOf[js.Any])
      
      inline def `setData-client-tokenUndefined`: Self = StObject.set(x, "data-client-token", js.undefined)
      
      inline def `setData-csp-nonce`(value: String): Self = StObject.set(x, "data-csp-nonce", value.asInstanceOf[js.Any])
      
      inline def `setData-csp-nonceUndefined`: Self = StObject.set(x, "data-csp-nonce", js.undefined)
      
      inline def `setData-merchant-id`(value: String): Self = StObject.set(x, "data-merchant-id", value.asInstanceOf[js.Any])
      
      inline def `setData-merchant-idUndefined`: Self = StObject.set(x, "data-merchant-id", js.undefined)
      
      inline def `setData-namespace`(value: String): Self = StObject.set(x, "data-namespace", value.asInstanceOf[js.Any])
      
      inline def `setData-namespaceUndefined`: Self = StObject.set(x, "data-namespace", js.undefined)
      
      inline def `setData-page-type`(value: String): Self = StObject.set(x, "data-page-type", value.asInstanceOf[js.Any])
      
      inline def `setData-page-typeUndefined`: Self = StObject.set(x, "data-page-type", js.undefined)
      
      inline def `setData-partner-attribution-id`(value: String): Self = StObject.set(x, "data-partner-attribution-id", value.asInstanceOf[js.Any])
      
      inline def `setData-partner-attribution-idUndefined`: Self = StObject.set(x, "data-partner-attribution-id", js.undefined)
      
      inline def `setData-sdk-integration-source`(value: String): Self = StObject.set(x, "data-sdk-integration-source", value.asInstanceOf[js.Any])
      
      inline def `setData-sdk-integration-sourceUndefined`: Self = StObject.set(x, "data-sdk-integration-source", js.undefined)
      
      inline def `setData-user-id-token`(value: String): Self = StObject.set(x, "data-user-id-token", value.asInstanceOf[js.Any])
      
      inline def `setData-user-id-tokenUndefined`: Self = StObject.set(x, "data-user-id-token", js.undefined)
    }
  }
  
  trait PayPalScriptOptions
    extends StObject
       with PayPalScriptQueryParameters
       with PayPalScriptDataAttributes
       with // eslint-disable-next-line @typescript-eslint/no-explicit-any
  /* key */ StringDictionary[Any] {
    
    var sdkBaseURL: js.UndefOr[String] = js.undefined
  }
  object PayPalScriptOptions {
    
    inline def apply(`client-id`: String): PayPalScriptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("client-id")(`client-id`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalScriptOptions]
    }
    
    extension [Self <: PayPalScriptOptions](x: Self) {
      
      inline def setSdkBaseURL(value: String): Self = StObject.set(x, "sdkBaseURL", value.asInstanceOf[js.Any])
      
      inline def setSdkBaseURLUndefined: Self = StObject.set(x, "sdkBaseURL", js.undefined)
    }
  }
  
  trait PayPalScriptQueryParameters extends StObject {
    
    var `buyer-country`: js.UndefOr[String] = js.undefined
    
    var `client-id`: String
    
    var commit: js.UndefOr[Boolean] = js.undefined
    
    var components: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean | String] = js.undefined
    
    var `disable-card`: js.UndefOr[String] = js.undefined
    
    var `disable-funding`: js.UndefOr[String] = js.undefined
    
    var `enable-funding`: js.UndefOr[String] = js.undefined
    
    var `integration-date`: js.UndefOr[String] = js.undefined
    
    var intent: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    // loadScript() supports an array and will convert it
    // to the correct merchant-id and data-merchant-id string values
    var `merchant-id`: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var vault: js.UndefOr[Boolean | String] = js.undefined
  }
  object PayPalScriptQueryParameters {
    
    inline def apply(`client-id`: String): PayPalScriptQueryParameters = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("client-id")(`client-id`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalScriptQueryParameters]
    }
    
    extension [Self <: PayPalScriptQueryParameters](x: Self) {
      
      inline def `setBuyer-country`(value: String): Self = StObject.set(x, "buyer-country", value.asInstanceOf[js.Any])
      
      inline def `setBuyer-countryUndefined`: Self = StObject.set(x, "buyer-country", js.undefined)
      
      inline def `setClient-id`(value: String): Self = StObject.set(x, "client-id", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setComponents(value: String): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDebug(value: Boolean | String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def `setDisable-card`(value: String): Self = StObject.set(x, "disable-card", value.asInstanceOf[js.Any])
      
      inline def `setDisable-cardUndefined`: Self = StObject.set(x, "disable-card", js.undefined)
      
      inline def `setDisable-funding`(value: String): Self = StObject.set(x, "disable-funding", value.asInstanceOf[js.Any])
      
      inline def `setDisable-fundingUndefined`: Self = StObject.set(x, "disable-funding", js.undefined)
      
      inline def `setEnable-funding`(value: String): Self = StObject.set(x, "enable-funding", value.asInstanceOf[js.Any])
      
      inline def `setEnable-fundingUndefined`: Self = StObject.set(x, "enable-funding", js.undefined)
      
      inline def `setIntegration-date`(value: String): Self = StObject.set(x, "integration-date", value.asInstanceOf[js.Any])
      
      inline def `setIntegration-dateUndefined`: Self = StObject.set(x, "integration-date", js.undefined)
      
      inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def `setMerchant-id`(value: js.Array[String] | String): Self = StObject.set(x, "merchant-id", value.asInstanceOf[js.Any])
      
      inline def `setMerchant-idUndefined`: Self = StObject.set(x, "merchant-id", js.undefined)
      
      inline def `setMerchant-idVarargs`(value: String*): Self = StObject.set(x, "merchant-id", js.Array(value*))
      
      inline def setVault(value: Boolean | String): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
      
      inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
    }
  }
}
