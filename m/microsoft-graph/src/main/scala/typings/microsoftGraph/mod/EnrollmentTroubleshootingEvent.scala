package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent {
  
  // Azure AD device identifier.
  var deviceId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Type of the enrollment. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser,
    * appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin,
    * windowsCoManagement.
    */
  var enrollmentType: js.UndefOr[DeviceEnrollmentType] = js.native
  
  /**
    * Highlevel failure category. Possible values are: unknown, authentication, authorization, accountValidation,
    * userValidation, deviceNotSupported, inMaintenance, badRequest, featureNotSupported, enrollmentRestrictionsEnforced,
    * clientDisconnected, userAbandonment.
    */
  var failureCategory: js.UndefOr[DeviceEnrollmentFailureReason] = js.native
  
  // Detailed failure reason.
  var failureReason: js.UndefOr[NullableOption[String]] = js.native
  
  // Device identifier created or collected by Intune.
  var managedDeviceIdentifier: js.UndefOr[NullableOption[String]] = js.native
  
  // Operating System.
  var operatingSystem: js.UndefOr[NullableOption[String]] = js.native
  
  // OS Version.
  var osVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // Identifier for the user that tried to enroll the device.
  var userId: js.UndefOr[NullableOption[String]] = js.native
}
object EnrollmentTroubleshootingEvent {
  
  @scala.inline
  def apply(): EnrollmentTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentTroubleshootingEvent]
  }
  
  @scala.inline
  implicit class EnrollmentTroubleshootingEventMutableBuilder[Self <: EnrollmentTroubleshootingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setEnrollmentType(value: DeviceEnrollmentType): Self = StObject.set(x, "enrollmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnrollmentTypeUndefined: Self = StObject.set(x, "enrollmentType", js.undefined)
    
    @scala.inline
    def setFailureCategory(value: DeviceEnrollmentFailureReason): Self = StObject.set(x, "failureCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCategoryUndefined: Self = StObject.set(x, "failureCategory", js.undefined)
    
    @scala.inline
    def setFailureReason(value: NullableOption[String]): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonNull: Self = StObject.set(x, "failureReason", null)
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setManagedDeviceIdentifier(value: NullableOption[String]): Self = StObject.set(x, "managedDeviceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedDeviceIdentifierNull: Self = StObject.set(x, "managedDeviceIdentifier", null)
    
    @scala.inline
    def setManagedDeviceIdentifierUndefined: Self = StObject.set(x, "managedDeviceIdentifier", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: NullableOption[String]): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemNull: Self = StObject.set(x, "operatingSystem", null)
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    @scala.inline
    def setOsVersion(value: NullableOption[String]): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
    
    @scala.inline
    def setOsVersionUndefined: Self = StObject.set(x, "osVersion", js.undefined)
    
    @scala.inline
    def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
