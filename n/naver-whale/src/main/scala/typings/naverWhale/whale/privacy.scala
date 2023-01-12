package typings.naverWhale.whale

import typings.chrome.chrome.types.ChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Privacy
////////////////////
/**
  * Use the chrome.privacy API to control usage of the features in Chrome that can affect a user's privacy. This API relies on the ChromeSetting prototype of the type API for getting and setting Chrome's configuration.
  * Permissions:  "privacy"
  * The Chrome Privacy Whitepaper gives background detail regarding the features which this API can control.
  * @since Chrome 18.
  */
object privacy {
  
  trait Network extends StObject {
    
    var networkPredictionEnabled: ChromeSetting
    
    /** @since Chrome 48. */
    var webRTCIPHandlingPolicy: ChromeSetting
    
    /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
    var webRTCMultipleRoutesEnabled: ChromeSetting
    
    /** @deprecated since Chrome 48. Please use privacy.network.webRTCIPHandlingPolicy. */
    var webRTCNonProxiedUdpEnabled: ChromeSetting
  }
  object Network {
    
    inline def apply(
      networkPredictionEnabled: ChromeSetting,
      webRTCIPHandlingPolicy: ChromeSetting,
      webRTCMultipleRoutesEnabled: ChromeSetting,
      webRTCNonProxiedUdpEnabled: ChromeSetting
    ): Network = {
      val __obj = js.Dynamic.literal(networkPredictionEnabled = networkPredictionEnabled.asInstanceOf[js.Any], webRTCIPHandlingPolicy = webRTCIPHandlingPolicy.asInstanceOf[js.Any], webRTCMultipleRoutesEnabled = webRTCMultipleRoutesEnabled.asInstanceOf[js.Any], webRTCNonProxiedUdpEnabled = webRTCNonProxiedUdpEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
      
      inline def setNetworkPredictionEnabled(value: ChromeSetting): Self = StObject.set(x, "networkPredictionEnabled", value.asInstanceOf[js.Any])
      
      inline def setWebRTCIPHandlingPolicy(value: ChromeSetting): Self = StObject.set(x, "webRTCIPHandlingPolicy", value.asInstanceOf[js.Any])
      
      inline def setWebRTCMultipleRoutesEnabled(value: ChromeSetting): Self = StObject.set(x, "webRTCMultipleRoutesEnabled", value.asInstanceOf[js.Any])
      
      inline def setWebRTCNonProxiedUdpEnabled(value: ChromeSetting): Self = StObject.set(x, "webRTCNonProxiedUdpEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Services extends StObject {
    
    var alternateErrorPagesEnabled: ChromeSetting
    
    /** @since Chrome 70. */
    var autofillAddressEnabled: ChromeSetting
    
    /** @since Chrome 70. */
    var autofillCreditCardEnabled: ChromeSetting
    
    /** @deprecated since Chrome 70. Please use privacy.services.autofillAddressEnabled and privacy.services.autofillCreditCardEnabled. */
    var autofillEnabled: ChromeSetting
    
    /** @since Chrome 42. */
    var hotwordSearchEnabled: ChromeSetting
    
    var instantEnabled: ChromeSetting
    
    /** @since Chrome 38. */
    var passwordSavingEnabled: ChromeSetting
    
    var safeBrowsingEnabled: ChromeSetting
    
    /** @since Chrome 42. */
    var safeBrowsingExtendedReportingEnabled: ChromeSetting
    
    var searchSuggestEnabled: ChromeSetting
    
    /** since Chrome 20. */
    var spellingServiceEnabled: ChromeSetting
    
    var translationServiceEnabled: ChromeSetting
  }
  object Services {
    
    inline def apply(
      alternateErrorPagesEnabled: ChromeSetting,
      autofillAddressEnabled: ChromeSetting,
      autofillCreditCardEnabled: ChromeSetting,
      autofillEnabled: ChromeSetting,
      hotwordSearchEnabled: ChromeSetting,
      instantEnabled: ChromeSetting,
      passwordSavingEnabled: ChromeSetting,
      safeBrowsingEnabled: ChromeSetting,
      safeBrowsingExtendedReportingEnabled: ChromeSetting,
      searchSuggestEnabled: ChromeSetting,
      spellingServiceEnabled: ChromeSetting,
      translationServiceEnabled: ChromeSetting
    ): Services = {
      val __obj = js.Dynamic.literal(alternateErrorPagesEnabled = alternateErrorPagesEnabled.asInstanceOf[js.Any], autofillAddressEnabled = autofillAddressEnabled.asInstanceOf[js.Any], autofillCreditCardEnabled = autofillCreditCardEnabled.asInstanceOf[js.Any], autofillEnabled = autofillEnabled.asInstanceOf[js.Any], hotwordSearchEnabled = hotwordSearchEnabled.asInstanceOf[js.Any], instantEnabled = instantEnabled.asInstanceOf[js.Any], passwordSavingEnabled = passwordSavingEnabled.asInstanceOf[js.Any], safeBrowsingEnabled = safeBrowsingEnabled.asInstanceOf[js.Any], safeBrowsingExtendedReportingEnabled = safeBrowsingExtendedReportingEnabled.asInstanceOf[js.Any], searchSuggestEnabled = searchSuggestEnabled.asInstanceOf[js.Any], spellingServiceEnabled = spellingServiceEnabled.asInstanceOf[js.Any], translationServiceEnabled = translationServiceEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Services]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Services] (val x: Self) extends AnyVal {
      
      inline def setAlternateErrorPagesEnabled(value: ChromeSetting): Self = StObject.set(x, "alternateErrorPagesEnabled", value.asInstanceOf[js.Any])
      
      inline def setAutofillAddressEnabled(value: ChromeSetting): Self = StObject.set(x, "autofillAddressEnabled", value.asInstanceOf[js.Any])
      
      inline def setAutofillCreditCardEnabled(value: ChromeSetting): Self = StObject.set(x, "autofillCreditCardEnabled", value.asInstanceOf[js.Any])
      
      inline def setAutofillEnabled(value: ChromeSetting): Self = StObject.set(x, "autofillEnabled", value.asInstanceOf[js.Any])
      
      inline def setHotwordSearchEnabled(value: ChromeSetting): Self = StObject.set(x, "hotwordSearchEnabled", value.asInstanceOf[js.Any])
      
      inline def setInstantEnabled(value: ChromeSetting): Self = StObject.set(x, "instantEnabled", value.asInstanceOf[js.Any])
      
      inline def setPasswordSavingEnabled(value: ChromeSetting): Self = StObject.set(x, "passwordSavingEnabled", value.asInstanceOf[js.Any])
      
      inline def setSafeBrowsingEnabled(value: ChromeSetting): Self = StObject.set(x, "safeBrowsingEnabled", value.asInstanceOf[js.Any])
      
      inline def setSafeBrowsingExtendedReportingEnabled(value: ChromeSetting): Self = StObject.set(x, "safeBrowsingExtendedReportingEnabled", value.asInstanceOf[js.Any])
      
      inline def setSearchSuggestEnabled(value: ChromeSetting): Self = StObject.set(x, "searchSuggestEnabled", value.asInstanceOf[js.Any])
      
      inline def setSpellingServiceEnabled(value: ChromeSetting): Self = StObject.set(x, "spellingServiceEnabled", value.asInstanceOf[js.Any])
      
      inline def setTranslationServiceEnabled(value: ChromeSetting): Self = StObject.set(x, "translationServiceEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait Websites extends StObject {
    
    /** @since Chrome 65. */
    var doNotTrackEnabled: ChromeSetting
    
    var hyperlinkAuditingEnabled: ChromeSetting
    
    /** @since Chrome 21. Available on Windows and ChromeOS only. */
    var protectedContentEnabled: ChromeSetting
    
    var referrersEnabled: ChromeSetting
    
    var thirdPartyCookiesAllowed: ChromeSetting
  }
  object Websites {
    
    inline def apply(
      doNotTrackEnabled: ChromeSetting,
      hyperlinkAuditingEnabled: ChromeSetting,
      protectedContentEnabled: ChromeSetting,
      referrersEnabled: ChromeSetting,
      thirdPartyCookiesAllowed: ChromeSetting
    ): Websites = {
      val __obj = js.Dynamic.literal(doNotTrackEnabled = doNotTrackEnabled.asInstanceOf[js.Any], hyperlinkAuditingEnabled = hyperlinkAuditingEnabled.asInstanceOf[js.Any], protectedContentEnabled = protectedContentEnabled.asInstanceOf[js.Any], referrersEnabled = referrersEnabled.asInstanceOf[js.Any], thirdPartyCookiesAllowed = thirdPartyCookiesAllowed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Websites]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Websites] (val x: Self) extends AnyVal {
      
      inline def setDoNotTrackEnabled(value: ChromeSetting): Self = StObject.set(x, "doNotTrackEnabled", value.asInstanceOf[js.Any])
      
      inline def setHyperlinkAuditingEnabled(value: ChromeSetting): Self = StObject.set(x, "hyperlinkAuditingEnabled", value.asInstanceOf[js.Any])
      
      inline def setProtectedContentEnabled(value: ChromeSetting): Self = StObject.set(x, "protectedContentEnabled", value.asInstanceOf[js.Any])
      
      inline def setReferrersEnabled(value: ChromeSetting): Self = StObject.set(x, "referrersEnabled", value.asInstanceOf[js.Any])
      
      inline def setThirdPartyCookiesAllowed(value: ChromeSetting): Self = StObject.set(x, "thirdPartyCookiesAllowed", value.asInstanceOf[js.Any])
    }
  }
}
