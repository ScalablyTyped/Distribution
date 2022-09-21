package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAppRegistration
  extends StObject
     with Entity {
  
  // The app package Identifier
  var appIdentifier: js.UndefOr[NullableOption[MobileAppIdentifier]] = js.undefined
  
  // App version
  var applicationVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Zero or more policys already applied on the registered app when it last synchronized with managment service.
  var appliedPolicies: js.UndefOr[NullableOption[js.Array[ManagedAppPolicy]]] = js.undefined
  
  // Date and time of creation
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // Host device name
  var deviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in
    * all conditions.
    */
  var deviceTag: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Host device type
  var deviceType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Zero or more reasons an app registration is flagged. E.g. app running on rooted device
  var flaggedReasons: js.UndefOr[js.Array[ManagedAppFlaggedReason]] = js.undefined
  
  // Zero or more policies admin intended for the app as of now.
  var intendedPolicies: js.UndefOr[NullableOption[js.Array[ManagedAppPolicy]]] = js.undefined
  
  // Date and time of last the app synced with management service.
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  
  // App management SDK version
  var managementSdkVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Zero or more long running operations triggered on the app registration.
  var operations: js.UndefOr[NullableOption[js.Array[ManagedAppOperation]]] = js.undefined
  
  // Operating System version
  var platformVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The user Id to who this app registration belongs.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object ManagedAppRegistration {
  
  inline def apply(): ManagedAppRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAppRegistration]
  }
  
  extension [Self <: ManagedAppRegistration](x: Self) {
    
    inline def setAppIdentifier(value: NullableOption[MobileAppIdentifier]): Self = StObject.set(x, "appIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAppIdentifierNull: Self = StObject.set(x, "appIdentifier", null)
    
    inline def setAppIdentifierUndefined: Self = StObject.set(x, "appIdentifier", js.undefined)
    
    inline def setApplicationVersion(value: NullableOption[String]): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionNull: Self = StObject.set(x, "applicationVersion", null)
    
    inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    inline def setAppliedPolicies(value: NullableOption[js.Array[ManagedAppPolicy]]): Self = StObject.set(x, "appliedPolicies", value.asInstanceOf[js.Any])
    
    inline def setAppliedPoliciesNull: Self = StObject.set(x, "appliedPolicies", null)
    
    inline def setAppliedPoliciesUndefined: Self = StObject.set(x, "appliedPolicies", js.undefined)
    
    inline def setAppliedPoliciesVarargs(value: ManagedAppPolicy*): Self = StObject.set(x, "appliedPolicies", js.Array(value*))
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDeviceName(value: NullableOption[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setDeviceTag(value: NullableOption[String]): Self = StObject.set(x, "deviceTag", value.asInstanceOf[js.Any])
    
    inline def setDeviceTagNull: Self = StObject.set(x, "deviceTag", null)
    
    inline def setDeviceTagUndefined: Self = StObject.set(x, "deviceTag", js.undefined)
    
    inline def setDeviceType(value: NullableOption[String]): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNull: Self = StObject.set(x, "deviceType", null)
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setFlaggedReasons(value: js.Array[ManagedAppFlaggedReason]): Self = StObject.set(x, "flaggedReasons", value.asInstanceOf[js.Any])
    
    inline def setFlaggedReasonsUndefined: Self = StObject.set(x, "flaggedReasons", js.undefined)
    
    inline def setFlaggedReasonsVarargs(value: ManagedAppFlaggedReason*): Self = StObject.set(x, "flaggedReasons", js.Array(value*))
    
    inline def setIntendedPolicies(value: NullableOption[js.Array[ManagedAppPolicy]]): Self = StObject.set(x, "intendedPolicies", value.asInstanceOf[js.Any])
    
    inline def setIntendedPoliciesNull: Self = StObject.set(x, "intendedPolicies", null)
    
    inline def setIntendedPoliciesUndefined: Self = StObject.set(x, "intendedPolicies", js.undefined)
    
    inline def setIntendedPoliciesVarargs(value: ManagedAppPolicy*): Self = StObject.set(x, "intendedPolicies", js.Array(value*))
    
    inline def setLastSyncDateTime(value: String): Self = StObject.set(x, "lastSyncDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncDateTimeUndefined: Self = StObject.set(x, "lastSyncDateTime", js.undefined)
    
    inline def setManagementSdkVersion(value: NullableOption[String]): Self = StObject.set(x, "managementSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setManagementSdkVersionNull: Self = StObject.set(x, "managementSdkVersion", null)
    
    inline def setManagementSdkVersionUndefined: Self = StObject.set(x, "managementSdkVersion", js.undefined)
    
    inline def setOperations(value: NullableOption[js.Array[ManagedAppOperation]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsNull: Self = StObject.set(x, "operations", null)
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: ManagedAppOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setPlatformVersion(value: NullableOption[String]): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionNull: Self = StObject.set(x, "platformVersion", null)
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
