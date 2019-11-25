package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMessagingSettings extends js.Object {
  // If set to true, @channel mentions are allowed.
  var allowChannelMentions: js.UndefOr[Boolean] = js.undefined
  // If set to true, owners can delete any message.
  var allowOwnerDeleteMessages: js.UndefOr[Boolean] = js.undefined
  // If set to true, @team mentions are allowed.
  var allowTeamMentions: js.UndefOr[Boolean] = js.undefined
  // If set to true, users can delete their messages.
  var allowUserDeleteMessages: js.UndefOr[Boolean] = js.undefined
  // If set to true, users can edit their messages.
  var allowUserEditMessages: js.UndefOr[Boolean] = js.undefined
}

object TeamMessagingSettings {
  @scala.inline
  def apply(
    allowChannelMentions: js.UndefOr[Boolean] = js.undefined,
    allowOwnerDeleteMessages: js.UndefOr[Boolean] = js.undefined,
    allowTeamMentions: js.UndefOr[Boolean] = js.undefined,
    allowUserDeleteMessages: js.UndefOr[Boolean] = js.undefined,
    allowUserEditMessages: js.UndefOr[Boolean] = js.undefined
  ): TeamMessagingSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowChannelMentions)) __obj.updateDynamic("allowChannelMentions")(allowChannelMentions.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOwnerDeleteMessages)) __obj.updateDynamic("allowOwnerDeleteMessages")(allowOwnerDeleteMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTeamMentions)) __obj.updateDynamic("allowTeamMentions")(allowTeamMentions.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUserDeleteMessages)) __obj.updateDynamic("allowUserDeleteMessages")(allowUserDeleteMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUserEditMessages)) __obj.updateDynamic("allowUserEditMessages")(allowUserEditMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMessagingSettings]
  }
}

