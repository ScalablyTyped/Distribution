package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatPermissions extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.undefined
  var can_change_info: js.UndefOr[Boolean] = js.undefined
  var can_invite_users: js.UndefOr[Boolean] = js.undefined
  var can_pin_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_media_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_other_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_polls: js.UndefOr[Boolean] = js.undefined
}

object ChatPermissions {
  @scala.inline
  def apply(
    can_add_web_page_previews: js.UndefOr[Boolean] = js.undefined,
    can_change_info: js.UndefOr[Boolean] = js.undefined,
    can_invite_users: js.UndefOr[Boolean] = js.undefined,
    can_pin_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_media_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_other_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_polls: js.UndefOr[Boolean] = js.undefined
  ): ChatPermissions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(can_add_web_page_previews)) __obj.updateDynamic("can_add_web_page_previews")(can_add_web_page_previews.asInstanceOf[js.Any])
    if (!js.isUndefined(can_change_info)) __obj.updateDynamic("can_change_info")(can_change_info.asInstanceOf[js.Any])
    if (!js.isUndefined(can_invite_users)) __obj.updateDynamic("can_invite_users")(can_invite_users.asInstanceOf[js.Any])
    if (!js.isUndefined(can_pin_messages)) __obj.updateDynamic("can_pin_messages")(can_pin_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_media_messages)) __obj.updateDynamic("can_send_media_messages")(can_send_media_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_messages)) __obj.updateDynamic("can_send_messages")(can_send_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_other_messages)) __obj.updateDynamic("can_send_other_messages")(can_send_other_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_polls)) __obj.updateDynamic("can_send_polls")(can_send_polls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatPermissions]
  }
}

