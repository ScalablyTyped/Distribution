package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatMember extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.undefined
  var can_be_edited: js.UndefOr[Boolean] = js.undefined
  var can_change_info: js.UndefOr[Boolean] = js.undefined
  var can_delete_messages: js.UndefOr[Boolean] = js.undefined
  var can_edit_messages: js.UndefOr[Boolean] = js.undefined
  var can_invite_users: js.UndefOr[Boolean] = js.undefined
  var can_pin_messages: js.UndefOr[Boolean] = js.undefined
  var can_post_messages: js.UndefOr[Boolean] = js.undefined
  var can_promote_members: js.UndefOr[Boolean] = js.undefined
  var can_restrict_members: js.UndefOr[Boolean] = js.undefined
  var can_send_media_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_other_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_polls: Boolean
  var is_member: js.UndefOr[Boolean] = js.undefined
  var status: ChatMemberStatus
  var until_date: js.UndefOr[Double] = js.undefined
  var user: User
}

object ChatMember {
  @scala.inline
  def apply(
    can_send_polls: Boolean,
    status: ChatMemberStatus,
    user: User,
    can_add_web_page_previews: js.UndefOr[Boolean] = js.undefined,
    can_be_edited: js.UndefOr[Boolean] = js.undefined,
    can_change_info: js.UndefOr[Boolean] = js.undefined,
    can_delete_messages: js.UndefOr[Boolean] = js.undefined,
    can_edit_messages: js.UndefOr[Boolean] = js.undefined,
    can_invite_users: js.UndefOr[Boolean] = js.undefined,
    can_pin_messages: js.UndefOr[Boolean] = js.undefined,
    can_post_messages: js.UndefOr[Boolean] = js.undefined,
    can_promote_members: js.UndefOr[Boolean] = js.undefined,
    can_restrict_members: js.UndefOr[Boolean] = js.undefined,
    can_send_media_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_other_messages: js.UndefOr[Boolean] = js.undefined,
    is_member: js.UndefOr[Boolean] = js.undefined,
    until_date: Int | Double = null
  ): ChatMember = {
    val __obj = js.Dynamic.literal(can_send_polls = can_send_polls.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(can_add_web_page_previews)) __obj.updateDynamic("can_add_web_page_previews")(can_add_web_page_previews.asInstanceOf[js.Any])
    if (!js.isUndefined(can_be_edited)) __obj.updateDynamic("can_be_edited")(can_be_edited.asInstanceOf[js.Any])
    if (!js.isUndefined(can_change_info)) __obj.updateDynamic("can_change_info")(can_change_info.asInstanceOf[js.Any])
    if (!js.isUndefined(can_delete_messages)) __obj.updateDynamic("can_delete_messages")(can_delete_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_edit_messages)) __obj.updateDynamic("can_edit_messages")(can_edit_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_invite_users)) __obj.updateDynamic("can_invite_users")(can_invite_users.asInstanceOf[js.Any])
    if (!js.isUndefined(can_pin_messages)) __obj.updateDynamic("can_pin_messages")(can_pin_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_post_messages)) __obj.updateDynamic("can_post_messages")(can_post_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_promote_members)) __obj.updateDynamic("can_promote_members")(can_promote_members.asInstanceOf[js.Any])
    if (!js.isUndefined(can_restrict_members)) __obj.updateDynamic("can_restrict_members")(can_restrict_members.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_media_messages)) __obj.updateDynamic("can_send_media_messages")(can_send_media_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_messages)) __obj.updateDynamic("can_send_messages")(can_send_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_other_messages)) __obj.updateDynamic("can_send_other_messages")(can_send_other_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(is_member)) __obj.updateDynamic("is_member")(is_member.asInstanceOf[js.Any])
    if (until_date != null) __obj.updateDynamic("until_date")(until_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMember]
  }
}

