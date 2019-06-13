package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedEBook extends Entity {
  /** The list of assignments for this eBook. */
  var assignments: js.UndefOr[js.Array[ManagedEBookAssignment]] = js.undefined
  /** The date and time when the eBook file was created. */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The list of installation states for this eBook. */
  var deviceStates: js.UndefOr[js.Array[DeviceInstallState]] = js.undefined
  /** Name of the eBook. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The more information Url. */
  var informationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Mobile App Install Summary. */
  var installSummary: js.UndefOr[EBookInstallSummary] = js.undefined
  /** Book cover. */
  var largeCover: js.UndefOr[MimeContent] = js.undefined
  /** The date and time when the eBook was last modified. */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The privacy statement Url. */
  var privacyInformationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time when the eBook was published. */
  var publishedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher. */
  var publisher: js.UndefOr[java.lang.String] = js.undefined
  /** The list of installation states for this eBook. */
  var userStateSummary: js.UndefOr[js.Array[UserInstallStateSummary]] = js.undefined
}

object ManagedEBook {
  @scala.inline
  def apply(
    assignments: js.Array[ManagedEBookAssignment] = null,
    createdDateTime: java.lang.String = null,
    description: java.lang.String = null,
    deviceStates: js.Array[DeviceInstallState] = null,
    displayName: java.lang.String = null,
    id: java.lang.String = null,
    informationUrl: java.lang.String = null,
    installSummary: EBookInstallSummary = null,
    largeCover: MimeContent = null,
    lastModifiedDateTime: java.lang.String = null,
    privacyInformationUrl: java.lang.String = null,
    publishedDateTime: java.lang.String = null,
    publisher: java.lang.String = null,
    userStateSummary: js.Array[UserInstallStateSummary] = null
  ): ManagedEBook = {
    val __obj = js.Dynamic.literal()
    if (assignments != null) __obj.updateDynamic("assignments")(assignments)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (informationUrl != null) __obj.updateDynamic("informationUrl")(informationUrl)
    if (installSummary != null) __obj.updateDynamic("installSummary")(installSummary)
    if (largeCover != null) __obj.updateDynamic("largeCover")(largeCover)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (privacyInformationUrl != null) __obj.updateDynamic("privacyInformationUrl")(privacyInformationUrl)
    if (publishedDateTime != null) __obj.updateDynamic("publishedDateTime")(publishedDateTime)
    if (publisher != null) __obj.updateDynamic("publisher")(publisher)
    if (userStateSummary != null) __obj.updateDynamic("userStateSummary")(userStateSummary)
    __obj.asInstanceOf[ManagedEBook]
  }
}

