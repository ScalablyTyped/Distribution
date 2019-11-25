package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedAppRegistration extends Entity {
  // The app package Identifier
  var appIdentifier: js.UndefOr[MobileAppIdentifier] = js.undefined
  // App version
  var applicationVersion: js.UndefOr[String] = js.undefined
  // Zero or more policys already applied on the registered app when it last synchronized with managment service.
  var appliedPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.undefined
  // Date and time of creation
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Host device name
  var deviceName: js.UndefOr[String] = js.undefined
  /**
    * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in
    * all conditions.
    */
  var deviceTag: js.UndefOr[String] = js.undefined
  // Host device type
  var deviceType: js.UndefOr[String] = js.undefined
  // Zero or more reasons an app registration is flagged. E.g. app running on rooted device
  var flaggedReasons: js.UndefOr[js.Array[ManagedAppFlaggedReason]] = js.undefined
  // Zero or more policies admin intended for the app as of now.
  var intendedPolicies: js.UndefOr[js.Array[ManagedAppPolicy]] = js.undefined
  // Date and time of last the app synced with management service.
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  // App management SDK version
  var managementSdkVersion: js.UndefOr[String] = js.undefined
  // Zero or more long running operations triggered on the app registration.
  var operations: js.UndefOr[js.Array[ManagedAppOperation]] = js.undefined
  // Operating System version
  var platformVersion: js.UndefOr[String] = js.undefined
  // The user Id to who this app registration belongs.
  var userId: js.UndefOr[String] = js.undefined
  // Version of the entity.
  var version: js.UndefOr[String] = js.undefined
}

object ManagedAppRegistration {
  @scala.inline
  def apply(
    appIdentifier: MobileAppIdentifier = null,
    applicationVersion: String = null,
    appliedPolicies: js.Array[ManagedAppPolicy] = null,
    createdDateTime: String = null,
    deviceName: String = null,
    deviceTag: String = null,
    deviceType: String = null,
    flaggedReasons: js.Array[ManagedAppFlaggedReason] = null,
    id: String = null,
    intendedPolicies: js.Array[ManagedAppPolicy] = null,
    lastSyncDateTime: String = null,
    managementSdkVersion: String = null,
    operations: js.Array[ManagedAppOperation] = null,
    platformVersion: String = null,
    userId: String = null,
    version: String = null
  ): ManagedAppRegistration = {
    val __obj = js.Dynamic.literal()
    if (appIdentifier != null) __obj.updateDynamic("appIdentifier")(appIdentifier.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    if (appliedPolicies != null) __obj.updateDynamic("appliedPolicies")(appliedPolicies.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (deviceTag != null) __obj.updateDynamic("deviceTag")(deviceTag.asInstanceOf[js.Any])
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    if (flaggedReasons != null) __obj.updateDynamic("flaggedReasons")(flaggedReasons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (intendedPolicies != null) __obj.updateDynamic("intendedPolicies")(intendedPolicies.asInstanceOf[js.Any])
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime.asInstanceOf[js.Any])
    if (managementSdkVersion != null) __obj.updateDynamic("managementSdkVersion")(managementSdkVersion.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAppRegistration]
  }
}

