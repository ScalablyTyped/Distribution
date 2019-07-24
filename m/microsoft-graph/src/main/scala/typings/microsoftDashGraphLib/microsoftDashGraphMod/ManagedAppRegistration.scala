package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppRegistration extends Entity {
  // The app package Identifier
  var appIdentifier: js.UndefOr[MobileAppIdentifier] = js.undefined
  // App version
  var applicationVersion: js.UndefOr[java.lang.String] = js.undefined
  // Zero or more policys already applied on the registered app when it last synchronized with managment service.
  var appliedPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.undefined
  // Date and time of creation
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Host device name
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in
    * all conditions.
    */
  var deviceTag: js.UndefOr[java.lang.String] = js.undefined
  // Host device type
  var deviceType: js.UndefOr[java.lang.String] = js.undefined
  // Zero or more reasons an app registration is flagged. E.g. app running on rooted device
  var flaggedReasons: js.UndefOr[js.Array[ManagedAppFlaggedReason]] = js.undefined
  // Zero or more policies admin intended for the app as of now.
  var intendedPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.undefined
  // Date and time of last the app synced with management service.
  var lastSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  // App management SDK version
  var managementSdkVersion: js.UndefOr[java.lang.String] = js.undefined
  // Zero or more long running operations triggered on the app registration.
  var operations: js.UndefOr[js.Array[ManagedAppOperation]] = js.undefined
  // Operating System version
  var platformVersion: js.UndefOr[java.lang.String] = js.undefined
  // The user Id to who this app registration belongs.
  var userId: js.UndefOr[java.lang.String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedAppRegistration {
  @scala.inline
  def apply(
    appIdentifier: MobileAppIdentifier = null,
    applicationVersion: java.lang.String = null,
    appliedPolicies: js.Array[ManagedAppPolicy] = null,
    createdDateTime: java.lang.String = null,
    deviceName: java.lang.String = null,
    deviceTag: java.lang.String = null,
    deviceType: java.lang.String = null,
    flaggedReasons: js.Array[ManagedAppFlaggedReason] = null,
    id: java.lang.String = null,
    intendedPolicies: js.Array[ManagedAppPolicy] = null,
    lastSyncDateTime: java.lang.String = null,
    managementSdkVersion: java.lang.String = null,
    operations: js.Array[ManagedAppOperation] = null,
    platformVersion: java.lang.String = null,
    userId: java.lang.String = null,
    version: java.lang.String = null
  ): ManagedAppRegistration = {
    val __obj = js.Dynamic.literal()
    if (appIdentifier != null) __obj.updateDynamic("appIdentifier")(appIdentifier)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    if (appliedPolicies != null) __obj.updateDynamic("appliedPolicies")(appliedPolicies)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (deviceTag != null) __obj.updateDynamic("deviceTag")(deviceTag)
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType)
    if (flaggedReasons != null) __obj.updateDynamic("flaggedReasons")(flaggedReasons)
    if (id != null) __obj.updateDynamic("id")(id)
    if (intendedPolicies != null) __obj.updateDynamic("intendedPolicies")(intendedPolicies)
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime)
    if (managementSdkVersion != null) __obj.updateDynamic("managementSdkVersion")(managementSdkVersion)
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ManagedAppRegistration]
  }
}

