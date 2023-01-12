package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentTroubleshootingEvent
  extends StObject
     with DeviceManagementTroubleshootingEvent {
  
  // Azure AD device identifier.
  var deviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Type of the enrollment. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser,
    * appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin,
    * windowsCoManagement, windowsAzureADJoinUsingDeviceAuth, appleUserEnrollment, appleUserEnrollmentWithServiceAccount.
    */
  var enrollmentType: js.UndefOr[DeviceEnrollmentType] = js.undefined
  
  /**
    * Highlevel failure category. Possible values are: unknown, authentication, authorization, accountValidation,
    * userValidation, deviceNotSupported, inMaintenance, badRequest, featureNotSupported, enrollmentRestrictionsEnforced,
    * clientDisconnected, userAbandonment.
    */
  var failureCategory: js.UndefOr[DeviceEnrollmentFailureReason] = js.undefined
  
  // Detailed failure reason.
  var failureReason: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Device identifier created or collected by Intune.
  var managedDeviceIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Operating System.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.undefined
  
  // OS Version.
  var osVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identifier for the user that tried to enroll the device.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object EnrollmentTroubleshootingEvent {
  
  inline def apply(): EnrollmentTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentTroubleshootingEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrollmentTroubleshootingEvent] (val x: Self) extends AnyVal {
    
    inline def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setEnrollmentType(value: DeviceEnrollmentType): Self = StObject.set(x, "enrollmentType", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentTypeUndefined: Self = StObject.set(x, "enrollmentType", js.undefined)
    
    inline def setFailureCategory(value: DeviceEnrollmentFailureReason): Self = StObject.set(x, "failureCategory", value.asInstanceOf[js.Any])
    
    inline def setFailureCategoryUndefined: Self = StObject.set(x, "failureCategory", js.undefined)
    
    inline def setFailureReason(value: NullableOption[String]): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setManagedDeviceIdentifier(value: NullableOption[String]): Self = StObject.set(x, "managedDeviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceIdentifierNull: Self = StObject.set(x, "managedDeviceIdentifier", null)
    
    inline def setManagedDeviceIdentifierUndefined: Self = StObject.set(x, "managedDeviceIdentifier", js.undefined)
    
    inline def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setOsVersion(value: NullableOption[String]): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    inline def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
