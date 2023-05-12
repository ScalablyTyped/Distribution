package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileThreatDefenseConnector
  extends StObject
     with Entity {
  
  /**
    * When TRUE, indicates the Mobile Threat Defense partner may collect metadata about installed applications from Intune
    * for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about installed
    * applications from Intune for IOS devices. Default value is FALSE.
    */
  var allowPartnerToCollectIOSApplicationMetadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, indicates the Mobile Threat Defense partner may collect metadata about personally installed applications
    * from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about
    * personally installed applications from Intune for IOS devices. Default value is FALSE.
    */
  var allowPartnerToCollectIOSPersonalApplicationMetadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For Android, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device
    * compliant
    */
  var androidDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.undefined
  
  // For Android, set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
  var androidEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management
    * (MAM) evaluations for Android devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should
    * not be used during Mobile Application Management (MAM) evaluations for Android devices. Only one partner per platform
    * may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
    */
  var androidMobileApplicationManagementEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For IOS, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device
    * compliant
    */
  var iosDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.undefined
  
  // For IOS, get or set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
  var iosEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management
    * (MAM) evaluations for IOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not
    * be used during Mobile Application Management (MAM) evaluations for IOS devices. Only one partner per platform may be
    * enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
    */
  var iosMobileApplicationManagementEnabled: js.UndefOr[Boolean] = js.undefined
  
  // DateTime of last Heartbeat recieved from the Mobile Threat Defense partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When TRUE, inidicates that configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE,
    * inidicates that configuration profile management via Microsoft Defender for Endpoint is disabled. Default value is
    * FALSE.
    */
  var microsoftDefenderForEndpointAttachEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Mobile Threat Defense partner state for this account. Possible values are: unavailable, available, enabled,
    * unresponsive.
    */
  var partnerState: js.UndefOr[MobileThreatPartnerTenantState] = js.undefined
  
  // Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
  var partnerUnresponsivenessThresholdInDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the
    * Mobile Threat Defense partner
    */
  var partnerUnsupportedOsVersionBlocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, inidicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a device
    * compliant for Windows. When FALSE, inidicates that Intune may make a device compliant without receiving data from the
    * Mobile Threat Defense partner for Windows. Default value is FALSE.
    */
  var windowsDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during compliance evaluations for
    * Windows. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during compliance
    * evaluations for Windows. Default value is FALSE.
    */
  var windowsEnabled: js.UndefOr[Boolean] = js.undefined
}
object MobileThreatDefenseConnector {
  
  inline def apply(): MobileThreatDefenseConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileThreatDefenseConnector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileThreatDefenseConnector] (val x: Self) extends AnyVal {
    
    inline def setAllowPartnerToCollectIOSApplicationMetadata(value: Boolean): Self = StObject.set(x, "allowPartnerToCollectIOSApplicationMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPartnerToCollectIOSApplicationMetadataUndefined: Self = StObject.set(x, "allowPartnerToCollectIOSApplicationMetadata", js.undefined)
    
    inline def setAllowPartnerToCollectIOSPersonalApplicationMetadata(value: Boolean): Self = StObject.set(x, "allowPartnerToCollectIOSPersonalApplicationMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPartnerToCollectIOSPersonalApplicationMetadataUndefined: Self = StObject.set(x, "allowPartnerToCollectIOSPersonalApplicationMetadata", js.undefined)
    
    inline def setAndroidDeviceBlockedOnMissingPartnerData(value: Boolean): Self = StObject.set(x, "androidDeviceBlockedOnMissingPartnerData", value.asInstanceOf[js.Any])
    
    inline def setAndroidDeviceBlockedOnMissingPartnerDataUndefined: Self = StObject.set(x, "androidDeviceBlockedOnMissingPartnerData", js.undefined)
    
    inline def setAndroidEnabled(value: Boolean): Self = StObject.set(x, "androidEnabled", value.asInstanceOf[js.Any])
    
    inline def setAndroidEnabledUndefined: Self = StObject.set(x, "androidEnabled", js.undefined)
    
    inline def setAndroidMobileApplicationManagementEnabled(value: Boolean): Self = StObject.set(x, "androidMobileApplicationManagementEnabled", value.asInstanceOf[js.Any])
    
    inline def setAndroidMobileApplicationManagementEnabledUndefined: Self = StObject.set(x, "androidMobileApplicationManagementEnabled", js.undefined)
    
    inline def setIosDeviceBlockedOnMissingPartnerData(value: Boolean): Self = StObject.set(x, "iosDeviceBlockedOnMissingPartnerData", value.asInstanceOf[js.Any])
    
    inline def setIosDeviceBlockedOnMissingPartnerDataUndefined: Self = StObject.set(x, "iosDeviceBlockedOnMissingPartnerData", js.undefined)
    
    inline def setIosEnabled(value: Boolean): Self = StObject.set(x, "iosEnabled", value.asInstanceOf[js.Any])
    
    inline def setIosEnabledUndefined: Self = StObject.set(x, "iosEnabled", js.undefined)
    
    inline def setIosMobileApplicationManagementEnabled(value: Boolean): Self = StObject.set(x, "iosMobileApplicationManagementEnabled", value.asInstanceOf[js.Any])
    
    inline def setIosMobileApplicationManagementEnabledUndefined: Self = StObject.set(x, "iosMobileApplicationManagementEnabled", js.undefined)
    
    inline def setLastHeartbeatDateTime(value: String): Self = StObject.set(x, "lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastHeartbeatDateTimeUndefined: Self = StObject.set(x, "lastHeartbeatDateTime", js.undefined)
    
    inline def setMicrosoftDefenderForEndpointAttachEnabled(value: Boolean): Self = StObject.set(x, "microsoftDefenderForEndpointAttachEnabled", value.asInstanceOf[js.Any])
    
    inline def setMicrosoftDefenderForEndpointAttachEnabledUndefined: Self = StObject.set(x, "microsoftDefenderForEndpointAttachEnabled", js.undefined)
    
    inline def setPartnerState(value: MobileThreatPartnerTenantState): Self = StObject.set(x, "partnerState", value.asInstanceOf[js.Any])
    
    inline def setPartnerStateUndefined: Self = StObject.set(x, "partnerState", js.undefined)
    
    inline def setPartnerUnresponsivenessThresholdInDays(value: Double): Self = StObject.set(x, "partnerUnresponsivenessThresholdInDays", value.asInstanceOf[js.Any])
    
    inline def setPartnerUnresponsivenessThresholdInDaysUndefined: Self = StObject.set(x, "partnerUnresponsivenessThresholdInDays", js.undefined)
    
    inline def setPartnerUnsupportedOsVersionBlocked(value: Boolean): Self = StObject.set(x, "partnerUnsupportedOsVersionBlocked", value.asInstanceOf[js.Any])
    
    inline def setPartnerUnsupportedOsVersionBlockedUndefined: Self = StObject.set(x, "partnerUnsupportedOsVersionBlocked", js.undefined)
    
    inline def setWindowsDeviceBlockedOnMissingPartnerData(value: Boolean): Self = StObject.set(x, "windowsDeviceBlockedOnMissingPartnerData", value.asInstanceOf[js.Any])
    
    inline def setWindowsDeviceBlockedOnMissingPartnerDataUndefined: Self = StObject.set(x, "windowsDeviceBlockedOnMissingPartnerData", js.undefined)
    
    inline def setWindowsEnabled(value: Boolean): Self = StObject.set(x, "windowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setWindowsEnabledUndefined: Self = StObject.set(x, "windowsEnabled", js.undefined)
  }
}
