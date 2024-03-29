package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceManagementPartner
  extends StObject
     with Entity {
  
  // Partner display name
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User groups that specifies whether enrollment is through partner.
  var groupsRequiringPartnerEnrollment: js.UndefOr[NullableOption[js.Array[DeviceManagementPartnerAssignment]]] = js.undefined
  
  // Whether device management partner is configured or not
  var isConfigured: js.UndefOr[Boolean] = js.undefined
  
  // Timestamp of last heartbeat after admin enabled option Connect to Device management Partner
  var lastHeartbeatDateTime: js.UndefOr[String] = js.undefined
  
  // Partner App type. Possible values are: unknown, singleTenantApp, multiTenantApp.
  var partnerAppType: js.UndefOr[DeviceManagementPartnerAppType] = js.undefined
  
  // Partner state of this tenant. Possible values are: unknown, unavailable, enabled, terminated, rejected, unresponsive.
  var partnerState: js.UndefOr[DeviceManagementPartnerTenantState] = js.undefined
  
  // Partner Single tenant App id
  var singleTenantAppId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // DateTime in UTC when PartnerDevices will be marked as NonCompliant
  var whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // DateTime in UTC when PartnerDevices will be removed
  var whenPartnerDevicesWillBeRemovedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object DeviceManagementPartner {
  
  inline def apply(): DeviceManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceManagementPartner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceManagementPartner] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGroupsRequiringPartnerEnrollment(value: NullableOption[js.Array[DeviceManagementPartnerAssignment]]): Self = StObject.set(x, "groupsRequiringPartnerEnrollment", value.asInstanceOf[js.Any])
    
    inline def setGroupsRequiringPartnerEnrollmentNull: Self = StObject.set(x, "groupsRequiringPartnerEnrollment", null)
    
    inline def setGroupsRequiringPartnerEnrollmentUndefined: Self = StObject.set(x, "groupsRequiringPartnerEnrollment", js.undefined)
    
    inline def setGroupsRequiringPartnerEnrollmentVarargs(value: DeviceManagementPartnerAssignment*): Self = StObject.set(x, "groupsRequiringPartnerEnrollment", js.Array(value*))
    
    inline def setIsConfigured(value: Boolean): Self = StObject.set(x, "isConfigured", value.asInstanceOf[js.Any])
    
    inline def setIsConfiguredUndefined: Self = StObject.set(x, "isConfigured", js.undefined)
    
    inline def setLastHeartbeatDateTime(value: String): Self = StObject.set(x, "lastHeartbeatDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastHeartbeatDateTimeUndefined: Self = StObject.set(x, "lastHeartbeatDateTime", js.undefined)
    
    inline def setPartnerAppType(value: DeviceManagementPartnerAppType): Self = StObject.set(x, "partnerAppType", value.asInstanceOf[js.Any])
    
    inline def setPartnerAppTypeUndefined: Self = StObject.set(x, "partnerAppType", js.undefined)
    
    inline def setPartnerState(value: DeviceManagementPartnerTenantState): Self = StObject.set(x, "partnerState", value.asInstanceOf[js.Any])
    
    inline def setPartnerStateUndefined: Self = StObject.set(x, "partnerState", js.undefined)
    
    inline def setSingleTenantAppId(value: NullableOption[String]): Self = StObject.set(x, "singleTenantAppId", value.asInstanceOf[js.Any])
    
    inline def setSingleTenantAppIdNull: Self = StObject.set(x, "singleTenantAppId", null)
    
    inline def setSingleTenantAppIdUndefined: Self = StObject.set(x, "singleTenantAppId", js.undefined)
    
    inline def setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTime(value: NullableOption[String]): Self = StObject.set(x, "whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", value.asInstanceOf[js.Any])
    
    inline def setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTimeNull: Self = StObject.set(x, "whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", null)
    
    inline def setWhenPartnerDevicesWillBeMarkedAsNonCompliantDateTimeUndefined: Self = StObject.set(x, "whenPartnerDevicesWillBeMarkedAsNonCompliantDateTime", js.undefined)
    
    inline def setWhenPartnerDevicesWillBeRemovedDateTime(value: NullableOption[String]): Self = StObject.set(x, "whenPartnerDevicesWillBeRemovedDateTime", value.asInstanceOf[js.Any])
    
    inline def setWhenPartnerDevicesWillBeRemovedDateTimeNull: Self = StObject.set(x, "whenPartnerDevicesWillBeRemovedDateTime", null)
    
    inline def setWhenPartnerDevicesWillBeRemovedDateTimeUndefined: Self = StObject.set(x, "whenPartnerDevicesWillBeRemovedDateTime", js.undefined)
  }
}
