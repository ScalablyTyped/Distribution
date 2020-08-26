package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent {
  // Azure AD device identifier.
  var deviceId: js.UndefOr[String] = js.native
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
  var failureReason: js.UndefOr[String] = js.native
  // Device identifier created or collected by Intune.
  var managedDeviceIdentifier: js.UndefOr[String] = js.native
  // Operating System.
  var operatingSystem: js.UndefOr[String] = js.native
  // OS Version.
  var osVersion: js.UndefOr[String] = js.native
  // Identifier for the user that tried to enroll the device.
  var userId: js.UndefOr[String] = js.native
}

object EnrollmentTroubleshootingEvent {
  @scala.inline
  def apply(): EnrollmentTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentTroubleshootingEvent]
  }
  @scala.inline
  implicit class EnrollmentTroubleshootingEventOps[Self <: EnrollmentTroubleshootingEvent] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setEnrollmentType(value: DeviceEnrollmentType): Self = this.set("enrollmentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollmentType: Self = this.set("enrollmentType", js.undefined)
    @scala.inline
    def setFailureCategory(value: DeviceEnrollmentFailureReason): Self = this.set("failureCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCategory: Self = this.set("failureCategory", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setManagedDeviceIdentifier(value: String): Self = this.set("managedDeviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedDeviceIdentifier: Self = this.set("managedDeviceIdentifier", js.undefined)
    @scala.inline
    def setOperatingSystem(value: String): Self = this.set("operatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("operatingSystem", js.undefined)
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOsVersion: Self = this.set("osVersion", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

