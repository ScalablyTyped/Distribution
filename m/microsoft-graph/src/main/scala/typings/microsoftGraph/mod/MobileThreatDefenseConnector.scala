package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class MobileThreatDefenseConnectorOps[Self <: MobileThreatDefenseConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidDeviceBlockedOnMissingPartnerData(value: Boolean): Self = this.set("androidDeviceBlockedOnMissingPartnerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDeviceBlockedOnMissingPartnerData: Self = this.set("androidDeviceBlockedOnMissingPartnerData", js.undefined)
    @scala.inline
    def setAndroidEnabled(value: Boolean): Self = this.set("androidEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidEnabled: Self = this.set("androidEnabled", js.undefined)
    @scala.inline
    def setIosDeviceBlockedOnMissingPartnerData(value: Boolean): Self = this.set("iosDeviceBlockedOnMissingPartnerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosDeviceBlockedOnMissingPartnerData: Self = this.set("iosDeviceBlockedOnMissingPartnerData", js.undefined)
    @scala.inline
    def setIosEnabled(value: Boolean): Self = this.set("iosEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosEnabled: Self = this.set("iosEnabled", js.undefined)
    @scala.inline
    def setLastHeartbeatDateTime(value: String): Self = this.set("lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastHeartbeatDateTime: Self = this.set("lastHeartbeatDateTime", js.undefined)
    @scala.inline
    def setPartnerState(value: MobileThreatPartnerTenantState): Self = this.set("partnerState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerState: Self = this.set("partnerState", js.undefined)
    @scala.inline
    def setPartnerUnresponsivenessThresholdInDays(value: Double): Self = this.set("partnerUnresponsivenessThresholdInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerUnresponsivenessThresholdInDays: Self = this.set("partnerUnresponsivenessThresholdInDays", js.undefined)
    @scala.inline
    def setPartnerUnsupportedOsVersionBlocked(value: Boolean): Self = this.set("partnerUnsupportedOsVersionBlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerUnsupportedOsVersionBlocked: Self = this.set("partnerUnsupportedOsVersionBlocked", js.undefined)
  }
  
}

