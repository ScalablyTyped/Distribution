package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileThreatDefenseConnector extends Entity {
  // For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
  var androidDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.undefined
  // For Android, set whether data from the data sync partner should be used during compliance evaluations
  var androidEnabled: js.UndefOr[Boolean] = js.undefined
  // For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
  var iosDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.undefined
  // For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
  var iosEnabled: js.UndefOr[Boolean] = js.undefined
  // DateTime of last Heartbeat recieved from the Data Sync Partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.undefined
  // Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive.
  var partnerState: js.UndefOr[MobileThreatPartnerTenantState] = js.undefined
  // Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
  var partnerUnresponsivenessThresholdInDays: js.UndefOr[Double] = js.undefined
  /**
    * Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the
    * Data Sync Partner
    */
  var partnerUnsupportedOsVersionBlocked: js.UndefOr[Boolean] = js.undefined
}

object MobileThreatDefenseConnector {
  @scala.inline
  def apply(
    androidDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.undefined,
    androidEnabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    iosDeviceBlockedOnMissingPartnerData: js.UndefOr[Boolean] = js.undefined,
    iosEnabled: js.UndefOr[Boolean] = js.undefined,
    lastHeartbeatDateTime: String = null,
    partnerState: MobileThreatPartnerTenantState = null,
    partnerUnresponsivenessThresholdInDays: js.UndefOr[Double] = js.undefined,
    partnerUnsupportedOsVersionBlocked: js.UndefOr[Boolean] = js.undefined
  ): MobileThreatDefenseConnector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(androidDeviceBlockedOnMissingPartnerData)) __obj.updateDynamic("androidDeviceBlockedOnMissingPartnerData")(androidDeviceBlockedOnMissingPartnerData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(androidEnabled)) __obj.updateDynamic("androidEnabled")(androidEnabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(iosDeviceBlockedOnMissingPartnerData)) __obj.updateDynamic("iosDeviceBlockedOnMissingPartnerData")(iosDeviceBlockedOnMissingPartnerData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iosEnabled)) __obj.updateDynamic("iosEnabled")(iosEnabled.get.asInstanceOf[js.Any])
    if (lastHeartbeatDateTime != null) __obj.updateDynamic("lastHeartbeatDateTime")(lastHeartbeatDateTime.asInstanceOf[js.Any])
    if (partnerState != null) __obj.updateDynamic("partnerState")(partnerState.asInstanceOf[js.Any])
    if (!js.isUndefined(partnerUnresponsivenessThresholdInDays)) __obj.updateDynamic("partnerUnresponsivenessThresholdInDays")(partnerUnresponsivenessThresholdInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partnerUnsupportedOsVersionBlocked)) __obj.updateDynamic("partnerUnsupportedOsVersionBlocked")(partnerUnsupportedOsVersionBlocked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileThreatDefenseConnector]
  }
}

