package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceManagementPartner extends Entity {
  // Partner display name
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  // Whether device management partner is configured or not
  var isConfigured: js.UndefOr[scala.Boolean] = js.undefined
  // Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
  var lastHeartbeatDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Partner App type. Possible values are: unknown, singleTenantApp, multiTenantApp.
  var partnerAppType: js.UndefOr[DeviceManagementPartnerAppType] = js.undefined
  // Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
  var partnerState: js.UndefOr[DeviceManagementPartnerTenantState] = js.undefined
  // Partner Single tenant App id
  var singleTenantAppId: js.UndefOr[java.lang.String] = js.undefined
  // DateTime in UTC when PartnerDevices will be marked as NonCompliant
  var whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: js.UndefOr[java.lang.String] = js.undefined
  // DateTime in UTC when PartnerDevices will be removed
  var whenPartnerDevicesWillBeRemovedDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceManagementPartner {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    isConfigured: js.UndefOr[scala.Boolean] = js.undefined,
    lastHeartbeatDateTime: java.lang.String = null,
    partnerAppType: DeviceManagementPartnerAppType = null,
    partnerState: DeviceManagementPartnerTenantState = null,
    singleTenantAppId: java.lang.String = null,
    whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: java.lang.String = null,
    whenPartnerDevicesWillBeRemovedDateTime: java.lang.String = null
  ): DeviceManagementPartner = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isConfigured)) __obj.updateDynamic("isConfigured")(isConfigured)
    if (lastHeartbeatDateTime != null) __obj.updateDynamic("lastHeartbeatDateTime")(lastHeartbeatDateTime)
    if (partnerAppType != null) __obj.updateDynamic("partnerAppType")(partnerAppType)
    if (partnerState != null) __obj.updateDynamic("partnerState")(partnerState)
    if (singleTenantAppId != null) __obj.updateDynamic("singleTenantAppId")(singleTenantAppId)
    if (whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime != null) __obj.updateDynamic("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime")(whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime)
    if (whenPartnerDevicesWillBeRemovedDateTime != null) __obj.updateDynamic("whenPartnerDevicesWillBeRemovedDateTime")(whenPartnerDevicesWillBeRemovedDateTime)
    __obj.asInstanceOf[DeviceManagementPartner]
  }
}

