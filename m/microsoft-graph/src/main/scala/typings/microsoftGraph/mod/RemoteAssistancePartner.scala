package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteAssistancePartner
  extends StObject
     with Entity {
  
  // Display name of the partner.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A friendly description of the current TeamViewer connector status. Possible values are: notOnboarded, onboarding,
    * onboarded.
    */
  var onboardingStatus: js.UndefOr[RemoteAssistanceOnboardingStatus] = js.undefined
  
  // URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
  var onboardingUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object RemoteAssistancePartner {
  
  inline def apply(): RemoteAssistancePartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAssistancePartner]
  }
  
  extension [Self <: RemoteAssistancePartner](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastConnectionDateTime(value: String): Self = StObject.set(x, "lastConnectionDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastConnectionDateTimeUndefined: Self = StObject.set(x, "lastConnectionDateTime", js.undefined)
    
    inline def setOnboardingStatus(value: RemoteAssistanceOnboardingStatus): Self = StObject.set(x, "onboardingStatus", value.asInstanceOf[js.Any])
    
    inline def setOnboardingStatusUndefined: Self = StObject.set(x, "onboardingStatus", js.undefined)
    
    inline def setOnboardingUrl(value: NullableOption[String]): Self = StObject.set(x, "onboardingUrl", value.asInstanceOf[js.Any])
    
    inline def setOnboardingUrlNull: Self = StObject.set(x, "onboardingUrl", null)
    
    inline def setOnboardingUrlUndefined: Self = StObject.set(x, "onboardingUrl", js.undefined)
  }
}
