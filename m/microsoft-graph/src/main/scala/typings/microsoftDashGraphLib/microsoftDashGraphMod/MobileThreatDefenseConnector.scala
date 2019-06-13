package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileThreatDefenseConnector extends Entity {
  /** For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant */
  var androidDeviceBlockedOnMissingPartnerData: js.UndefOr[scala.Boolean] = js.undefined
  /** For Android, set whether data from the data sync partner should be used during compliance evaluations */
  var androidEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant */
  var iosDeviceBlockedOnMissingPartnerData: js.UndefOr[scala.Boolean] = js.undefined
  /** For IOS, get or set whether data from the data sync partner should be used during compliance evaluations */
  var iosEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** DateTime of last Heartbeat recieved from the Data Sync Partner */
  var lastHeartbeatDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive. */
  var partnerState: js.UndefOr[MobileThreatPartnerTenantState] = js.undefined
  /** Get or Set days the per tenant tolerance to unresponsiveness for this partner integration */
  var partnerUnresponsivenessThresholdInDays: js.UndefOr[scala.Double] = js.undefined
  /** Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner */
  var partnerUnsupportedOsVersionBlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object MobileThreatDefenseConnector {
  @scala.inline
  def apply(
    androidDeviceBlockedOnMissingPartnerData: js.UndefOr[scala.Boolean] = js.undefined,
    androidEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    iosDeviceBlockedOnMissingPartnerData: js.UndefOr[scala.Boolean] = js.undefined,
    iosEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    lastHeartbeatDateTime: java.lang.String = null,
    partnerState: MobileThreatPartnerTenantState = null,
    partnerUnresponsivenessThresholdInDays: scala.Int | scala.Double = null,
    partnerUnsupportedOsVersionBlocked: js.UndefOr[scala.Boolean] = js.undefined
  ): MobileThreatDefenseConnector = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(androidDeviceBlockedOnMissingPartnerData)) __obj.updateDynamic("androidDeviceBlockedOnMissingPartnerData")(androidDeviceBlockedOnMissingPartnerData)
    if (!js.isUndefined(androidEnabled)) __obj.updateDynamic("androidEnabled")(androidEnabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(iosDeviceBlockedOnMissingPartnerData)) __obj.updateDynamic("iosDeviceBlockedOnMissingPartnerData")(iosDeviceBlockedOnMissingPartnerData)
    if (!js.isUndefined(iosEnabled)) __obj.updateDynamic("iosEnabled")(iosEnabled)
    if (lastHeartbeatDateTime != null) __obj.updateDynamic("lastHeartbeatDateTime")(lastHeartbeatDateTime)
    if (partnerState != null) __obj.updateDynamic("partnerState")(partnerState)
    if (partnerUnresponsivenessThresholdInDays != null) __obj.updateDynamic("partnerUnresponsivenessThresholdInDays")(partnerUnresponsivenessThresholdInDays.asInstanceOf[js.Any])
    if (!js.isUndefined(partnerUnsupportedOsVersionBlocked)) __obj.updateDynamic("partnerUnsupportedOsVersionBlocked")(partnerUnsupportedOsVersionBlocked)
    __obj.asInstanceOf[MobileThreatDefenseConnector]
  }
}

