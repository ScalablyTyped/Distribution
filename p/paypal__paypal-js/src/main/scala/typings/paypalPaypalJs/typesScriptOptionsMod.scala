package typings.paypalPaypalJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScriptOptionsMod {
  
  trait PayPalScriptDataAttributes extends StObject {
    
    var dataClientMetadataId: js.UndefOr[String] = js.undefined
    
    var dataClientToken: js.UndefOr[String] = js.undefined
    
    var dataCspNonce: js.UndefOr[String] = js.undefined
    
    var dataMerchantId: js.UndefOr[String] = js.undefined
    
    var dataNamespace: js.UndefOr[String] = js.undefined
    
    var dataPageType: js.UndefOr[String] = js.undefined
    
    var dataPartnerAttributionId: js.UndefOr[String] = js.undefined
    
    var dataSdkIntegrationSource: js.UndefOr[String] = js.undefined
    
    var dataUid: js.UndefOr[String] = js.undefined
    
    var dataUserIdToken: js.UndefOr[String] = js.undefined
  }
  object PayPalScriptDataAttributes {
    
    inline def apply(): PayPalScriptDataAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayPalScriptDataAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalScriptDataAttributes] (val x: Self) extends AnyVal {
      
      inline def setDataClientMetadataId(value: String): Self = StObject.set(x, "dataClientMetadataId", value.asInstanceOf[js.Any])
      
      inline def setDataClientMetadataIdUndefined: Self = StObject.set(x, "dataClientMetadataId", js.undefined)
      
      inline def setDataClientToken(value: String): Self = StObject.set(x, "dataClientToken", value.asInstanceOf[js.Any])
      
      inline def setDataClientTokenUndefined: Self = StObject.set(x, "dataClientToken", js.undefined)
      
      inline def setDataCspNonce(value: String): Self = StObject.set(x, "dataCspNonce", value.asInstanceOf[js.Any])
      
      inline def setDataCspNonceUndefined: Self = StObject.set(x, "dataCspNonce", js.undefined)
      
      inline def setDataMerchantId(value: String): Self = StObject.set(x, "dataMerchantId", value.asInstanceOf[js.Any])
      
      inline def setDataMerchantIdUndefined: Self = StObject.set(x, "dataMerchantId", js.undefined)
      
      inline def setDataNamespace(value: String): Self = StObject.set(x, "dataNamespace", value.asInstanceOf[js.Any])
      
      inline def setDataNamespaceUndefined: Self = StObject.set(x, "dataNamespace", js.undefined)
      
      inline def setDataPageType(value: String): Self = StObject.set(x, "dataPageType", value.asInstanceOf[js.Any])
      
      inline def setDataPageTypeUndefined: Self = StObject.set(x, "dataPageType", js.undefined)
      
      inline def setDataPartnerAttributionId(value: String): Self = StObject.set(x, "dataPartnerAttributionId", value.asInstanceOf[js.Any])
      
      inline def setDataPartnerAttributionIdUndefined: Self = StObject.set(x, "dataPartnerAttributionId", js.undefined)
      
      inline def setDataSdkIntegrationSource(value: String): Self = StObject.set(x, "dataSdkIntegrationSource", value.asInstanceOf[js.Any])
      
      inline def setDataSdkIntegrationSourceUndefined: Self = StObject.set(x, "dataSdkIntegrationSource", js.undefined)
      
      inline def setDataUid(value: String): Self = StObject.set(x, "dataUid", value.asInstanceOf[js.Any])
      
      inline def setDataUidUndefined: Self = StObject.set(x, "dataUid", js.undefined)
      
      inline def setDataUserIdToken(value: String): Self = StObject.set(x, "dataUserIdToken", value.asInstanceOf[js.Any])
      
      inline def setDataUserIdTokenUndefined: Self = StObject.set(x, "dataUserIdToken", js.undefined)
    }
  }
  
  trait PayPalScriptOptions
    extends StObject
       with PayPalScriptQueryParameters
       with PayPalScriptDataAttributes {
    
    var sdkBaseUrl: js.UndefOr[String] = js.undefined
  }
  object PayPalScriptOptions {
    
    inline def apply(clientId: String): PayPalScriptOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalScriptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalScriptOptions] (val x: Self) extends AnyVal {
      
      inline def setSdkBaseUrl(value: String): Self = StObject.set(x, "sdkBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setSdkBaseUrlUndefined: Self = StObject.set(x, "sdkBaseUrl", js.undefined)
    }
  }
  
  trait PayPalScriptQueryParameters extends StObject {
    
    var buyerCountry: js.UndefOr[String] = js.undefined
    
    var clientId: String
    
    var commit: js.UndefOr[Boolean] = js.undefined
    
    var components: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean | String] = js.undefined
    
    var disableFunding: js.UndefOr[String] = js.undefined
    
    var enableFunding: js.UndefOr[String] = js.undefined
    
    var integrationDate: js.UndefOr[String] = js.undefined
    
    var intent: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    // loadScript() supports an array and will convert it
    // to the correct merchant-id and data-merchant-id string values
    var merchantId: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var vault: js.UndefOr[Boolean | String] = js.undefined
  }
  object PayPalScriptQueryParameters {
    
    inline def apply(clientId: String): PayPalScriptQueryParameters = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalScriptQueryParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalScriptQueryParameters] (val x: Self) extends AnyVal {
      
      inline def setBuyerCountry(value: String): Self = StObject.set(x, "buyerCountry", value.asInstanceOf[js.Any])
      
      inline def setBuyerCountryUndefined: Self = StObject.set(x, "buyerCountry", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setComponents(value: String): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDebug(value: Boolean | String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDisableFunding(value: String): Self = StObject.set(x, "disableFunding", value.asInstanceOf[js.Any])
      
      inline def setDisableFundingUndefined: Self = StObject.set(x, "disableFunding", js.undefined)
      
      inline def setEnableFunding(value: String): Self = StObject.set(x, "enableFunding", value.asInstanceOf[js.Any])
      
      inline def setEnableFundingUndefined: Self = StObject.set(x, "enableFunding", js.undefined)
      
      inline def setIntegrationDate(value: String): Self = StObject.set(x, "integrationDate", value.asInstanceOf[js.Any])
      
      inline def setIntegrationDateUndefined: Self = StObject.set(x, "integrationDate", js.undefined)
      
      inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMerchantId(value: js.Array[String] | String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
      
      inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
      
      inline def setMerchantIdVarargs(value: String*): Self = StObject.set(x, "merchantId", js.Array(value*))
      
      inline def setVault(value: Boolean | String): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
      
      inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
    }
  }
}
