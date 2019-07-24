package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMessagingSettings extends js.Object {
  // If set to true, @channel mentions are allowed.
  var allowChannelMentions: js.UndefOr[scala.Boolean] = js.undefined
  // If set to true, owners can delete any message.
  var allowOwnerDeleteMessages: js.UndefOr[scala.Boolean] = js.undefined
  // If set to true, @team mentions are allowed.
  var allowTeamMentions: js.UndefOr[scala.Boolean] = js.undefined
  // If set to true, users can delete their messages.
  var allowUserDeleteMessages: js.UndefOr[scala.Boolean] = js.undefined
  // If set to true, users can edit their messages.
  var allowUserEditMessages: js.UndefOr[scala.Boolean] = js.undefined
}

object TeamMessagingSettings {
  @scala.inline
  def apply(
    allowChannelMentions: js.UndefOr[scala.Boolean] = js.undefined,
    allowOwnerDeleteMessages: js.UndefOr[scala.Boolean] = js.undefined,
    allowTeamMentions: js.UndefOr[scala.Boolean] = js.undefined,
    allowUserDeleteMessages: js.UndefOr[scala.Boolean] = js.undefined,
    allowUserEditMessages: js.UndefOr[scala.Boolean] = js.undefined
  ): TeamMessagingSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowChannelMentions)) __obj.updateDynamic("allowChannelMentions")(allowChannelMentions)
    if (!js.isUndefined(allowOwnerDeleteMessages)) __obj.updateDynamic("allowOwnerDeleteMessages")(allowOwnerDeleteMessages)
    if (!js.isUndefined(allowTeamMentions)) __obj.updateDynamic("allowTeamMentions")(allowTeamMentions)
    if (!js.isUndefined(allowUserDeleteMessages)) __obj.updateDynamic("allowUserDeleteMessages")(allowUserDeleteMessages)
    if (!js.isUndefined(allowUserEditMessages)) __obj.updateDynamic("allowUserEditMessages")(allowUserEditMessages)
    __obj.asInstanceOf[TeamMessagingSettings]
  }
}

