package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutomaticRepliesSetting extends js.Object {
  /**
    * The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status
    * is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
    */
  var externalAudience: js.UndefOr[ExternalAudienceScope] = js.undefined
  // The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
  var externalReplyMessage: js.UndefOr[String] = js.undefined
  /**
    * The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled
    * or Scheduled.
    */
  var internalReplyMessage: js.UndefOr[String] = js.undefined
  // The date and time that automatic replies are set to end, if Status is set to Scheduled.
  var scheduledEndDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The date and time that automatic replies are set to begin, if Status is set to Scheduled.
  var scheduledStartDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  // Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
  var status: js.UndefOr[AutomaticRepliesStatus] = js.undefined
}

object AutomaticRepliesSetting {
  @scala.inline
  def apply(
    externalAudience: ExternalAudienceScope = null,
    externalReplyMessage: String = null,
    internalReplyMessage: String = null,
    scheduledEndDateTime: DateTimeTimeZone = null,
    scheduledStartDateTime: DateTimeTimeZone = null,
    status: AutomaticRepliesStatus = null
  ): AutomaticRepliesSetting = {
    val __obj = js.Dynamic.literal()
    if (externalAudience != null) __obj.updateDynamic("externalAudience")(externalAudience.asInstanceOf[js.Any])
    if (externalReplyMessage != null) __obj.updateDynamic("externalReplyMessage")(externalReplyMessage.asInstanceOf[js.Any])
    if (internalReplyMessage != null) __obj.updateDynamic("internalReplyMessage")(internalReplyMessage.asInstanceOf[js.Any])
    if (scheduledEndDateTime != null) __obj.updateDynamic("scheduledEndDateTime")(scheduledEndDateTime.asInstanceOf[js.Any])
    if (scheduledStartDateTime != null) __obj.updateDynamic("scheduledStartDateTime")(scheduledStartDateTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticRepliesSetting]
  }
}

