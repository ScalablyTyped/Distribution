package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnrollmentTroubleshootingEvent extends DeviceManagementTroubleshootingEvent {
  // Azure AD device identifier.
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of the enrollment. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser,
    * appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin,
    * windowsCoManagement.
    */
  var enrollmentType: js.UndefOr[DeviceEnrollmentType] = js.undefined
  /**
    * Highlevel failure category. Possible values are: unknown, authentication, authorization, accountValidation,
    * userValidation, deviceNotSupported, inMaintenance, badRequest, featureNotSupported, enrollmentRestrictionsEnforced,
    * clientDisconnected, userAbandonment.
    */
  var failureCategory: js.UndefOr[DeviceEnrollmentFailureReason] = js.undefined
  // Detailed failure reason.
  var failureReason: js.UndefOr[java.lang.String] = js.undefined
  // Device identifier created or collected by Intune.
  var managedDeviceIdentifier: js.UndefOr[java.lang.String] = js.undefined
  // Operating System.
  var operatingSystem: js.UndefOr[java.lang.String] = js.undefined
  // OS Version.
  var osVersion: js.UndefOr[java.lang.String] = js.undefined
  // Identifier for the user that tried to enroll the device.
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object EnrollmentTroubleshootingEvent {
  @scala.inline
  def apply(
    correlationId: java.lang.String = null,
    deviceId: java.lang.String = null,
    enrollmentType: DeviceEnrollmentType = null,
    eventDateTime: java.lang.String = null,
    failureCategory: DeviceEnrollmentFailureReason = null,
    failureReason: java.lang.String = null,
    id: java.lang.String = null,
    managedDeviceIdentifier: java.lang.String = null,
    operatingSystem: java.lang.String = null,
    osVersion: java.lang.String = null,
    userId: java.lang.String = null
  ): EnrollmentTroubleshootingEvent = {
    val __obj = js.Dynamic.literal()
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (enrollmentType != null) __obj.updateDynamic("enrollmentType")(enrollmentType)
    if (eventDateTime != null) __obj.updateDynamic("eventDateTime")(eventDateTime)
    if (failureCategory != null) __obj.updateDynamic("failureCategory")(failureCategory)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (id != null) __obj.updateDynamic("id")(id)
    if (managedDeviceIdentifier != null) __obj.updateDynamic("managedDeviceIdentifier")(managedDeviceIdentifier)
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem)
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[EnrollmentTroubleshootingEvent]
  }
}

