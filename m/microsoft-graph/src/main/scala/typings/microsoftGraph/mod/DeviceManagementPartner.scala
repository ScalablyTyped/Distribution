package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceManagementPartner extends Entity {
  // Partner display name
  var displayName: js.UndefOr[String] = js.native
  // Whether device management partner is configured or not
  var isConfigured: js.UndefOr[Boolean] = js.native
  // Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.native
  // Partner App type. Possible values are: unknown, singleTenantApp, multiTenantApp.
  var partnerAppType: js.UndefOr[DeviceManagementPartnerAppType] = js.native
  // Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
  var partnerState: js.UndefOr[DeviceManagementPartnerTenantState] = js.native
  // Partner Single tenant App id
  var singleTenantAppId: js.UndefOr[String] = js.native
  // DateTime in UTC when PartnerDevices will be marked as NonCompliant
  var whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: js.UndefOr[String] = js.native
  // DateTime in UTC when PartnerDevices will be removed
  var whenPartnerDevicesWillBeRemovedDateTime: js.UndefOr[String] = js.native
}

object DeviceManagementPartner {
  @scala.inline
  def apply(): DeviceManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementPartner]
  }
  @scala.inline
  implicit class DeviceManagementPartnerOps[Self <: DeviceManagementPartner] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIsConfigured(value: Boolean): Self = this.set("isConfigured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsConfigured: Self = this.set("isConfigured", js.undefined)
    @scala.inline
    def setLastHeartbeatDateTime(value: String): Self = this.set("lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastHeartbeatDateTime: Self = this.set("lastHeartbeatDateTime", js.undefined)
    @scala.inline
    def setPartnerAppType(value: DeviceManagementPartnerAppType): Self = this.set("partnerAppType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerAppType: Self = this.set("partnerAppType", js.undefined)
    @scala.inline
    def setPartnerState(value: DeviceManagementPartnerTenantState): Self = this.set("partnerState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerState: Self = this.set("partnerState", js.undefined)
    @scala.inline
    def setSingleTenantAppId(value: String): Self = this.set("singleTenantAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleTenantAppId: Self = this.set("singleTenantAppId", js.undefined)
    @scala.inline
    def setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(value: String): Self = this.set("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: Self = this.set("whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", js.undefined)
    @scala.inline
    def setWhenPartnerDevicesWillBeRemovedDateTime(value: String): Self = this.set("whenPartnerDevicesWillBeRemovedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhenPartnerDevicesWillBeRemovedDateTime: Self = this.set("whenPartnerDevicesWillBeRemovedDateTime", js.undefined)
  }
  
}

