package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileThreatDefenseConnector extends Entity {
  
  // For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
  var androidDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.native
  
  // For Android, set whether data from the data sync partner should be used during compliance evaluations
  var androidEnabled: js.UndefOr[Boolean] = js.native
  
  // For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
  var iosDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.native
  
  // For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
  var iosEnabled: js.UndefOr[Boolean] = js.native
  
  // DateTime of last Heartbeat recieved from the Data Sync Partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.native
  
  // Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive.
  var partnerState: js.UndefOr[MobileThreatPartnerTenantState] = js.native
  
  // Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
  var partnerUnresponsivenessThresholdInDays: js.UndefOr[Double] = js.native
  
  /**
    * Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the
    * Data Sync Partner
    */
  var partnerUnsupportedOsVersionBlocked: js.UndefOr[Boolean] = js.native
}
object MobileThreatDefenseConnector {
  
  @scala.inline
  def apply(): MobileThreatDefenseConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileThreatDefenseConnector]
  }
  
  @scala.inline
  implicit class MobileThreatDefenseConnectorMutableBuilder[Self <: MobileThreatDefenseConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDeviceBlockedOnMissingPartnerData(value: Boolean): Self = StObject.set(x, "androidDeviceBlockedOnMissingPartnerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDeviceBlockedOnMissingPartnerDataUndefined: Self = StObject.set(x, "androidDeviceBlockedOnMissingPartnerData", js.undefined)
    
    @scala.inline
    def setAndroidEnabled(value: Boolean): Self = StObject.set(x, "androidEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidEnabledUndefined: Self = StObject.set(x, "androidEnabled", js.undefined)
    
    @scala.inline
    def setIosDeviceBlockedOnMissingPartnerData(value: Boolean): Self = StObject.set(x, "iosDeviceBlockedOnMissingPartnerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDeviceBlockedOnMissingPartnerDataUndefined: Self = StObject.set(x, "iosDeviceBlockedOnMissingPartnerData", js.undefined)
    
    @scala.inline
    def setIosEnabled(value: Boolean): Self = StObject.set(x, "iosEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosEnabledUndefined: Self = StObject.set(x, "iosEnabled", js.undefined)
    
    @scala.inline
    def setLastHeartbeatDateTime(value: String): Self = StObject.set(x, "lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastHeartbeatDateTimeUndefined: Self = StObject.set(x, "lastHeartbeatDateTime", js.undefined)
    
    @scala.inline
    def setPartnerState(value: MobileThreatPartnerTenantState): Self = StObject.set(x, "partnerState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerStateUndefined: Self = StObject.set(x, "partnerState", js.undefined)
    
    @scala.inline
    def setPartnerUnresponsivenessThresholdInDays(value: Double): Self = StObject.set(x, "partnerUnresponsivenessThresholdInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerUnresponsivenessThresholdInDaysUndefined: Self = StObject.set(x, "partnerUnresponsivenessThresholdInDays", js.undefined)
    
    @scala.inline
    def setPartnerUnsupportedOsVersionBlocked(value: Boolean): Self = StObject.set(x, "partnerUnsupportedOsVersionBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerUnsupportedOsVersionBlockedUndefined: Self = StObject.set(x, "partnerUnsupportedOsVersionBlocked", js.undefined)
  }
}
