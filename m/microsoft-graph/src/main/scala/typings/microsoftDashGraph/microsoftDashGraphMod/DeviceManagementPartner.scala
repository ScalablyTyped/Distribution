package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementPartner extends Entity {
  // Partner display name
  var displayName: js.UndefOr[String] = js.undefined
  // Whether device management partner is configured or not
  var isConfigured: js.UndefOr[Boolean] = js.undefined
  // Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.undefined
  // Partner App type. Possible values are: unknown, singleTenantApp, multiTenantApp.
  var partnerAppType: js.UndefOr[DeviceManagementPartnerAppType] = js.undefined
  // Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
  var partnerState: js.UndefOr[DeviceManagementPartnerTenantState] = js.undefined
  // Partner Single tenant App id
  var singleTenantAppId: js.UndefOr[String] = js.undefined
  // DateTime in UTC when PartnerDevices will be marked as NonCompliant
  var whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: js.UndefOr[String] = js.undefined
  // DateTime in UTC when PartnerDevices will be removed
  var whenPartnerDevicesWillBeRemovedDateTime: js.UndefOr[String] = js.undefined
}

object DeviceManagementPartner {
  @scala.inline
  def apply(
    displayName: String = null,
    id: String = null,
    isConfigured: js.UndefOr[Boolean] = js.undefined,
    lastHeartbeatDateTime: String = null,
    partnerAppType: DeviceManagementPartnerAppType = null,
    partnerState: DeviceManagementPartnerTenantState = null,
    singleTenantAppId: String = null,
    whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: String = null,
    whenPartnerDevicesWillBeRemovedDateTime: String = null
  ): DeviceManagementPartner = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isConfigured)) __obj.updateDynamic("isConfigured")(isConfigured.asInstanceOf[js.Any])
    if (lastHeartbeatDateTime != null) __obj.updateDynamic("lastHeartbeatDateTime")(lastHeartbeatDateTime.asInstanceOf[js.Any])
    if (partnerAppType != null) __obj.updateDynamic("partnerAppType")(partnerAppType.asInstanceOf[js.Any])
    if (partnerState != null) __obj.updateDynamic("partnerState")(partnerState.asInstanceOf[js.Any])
    if (singleTenantAppId != null) __obj.updateDynamic("singleTenantAppId")(singleTenantAppId.asInstanceOf[js.Any])
    if (whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime != null) __obj.updateDynamic("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime")(whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime.asInstanceOf[js.Any])
    if (whenPartnerDevicesWillBeRemovedDateTime != null) __obj.updateDynamic("whenPartnerDevicesWillBeRemovedDateTime")(whenPartnerDevicesWillBeRemovedDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManagementPartner]
  }
}

