package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chat extends js.Object {
  /**
    * @deprecated since version Telegram Bot API 4.4 - July 29, 2019
    */
  var all_members_are_administrators: js.UndefOr[Boolean] = js.undefined
  var can_set_sticker_set: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var first_name: js.UndefOr[String] = js.undefined
  var id: Double
  var invite_link: js.UndefOr[String] = js.undefined
  var last_name: js.UndefOr[String] = js.undefined
  var permissions: js.UndefOr[ChatPermissions] = js.undefined
  var photo: js.UndefOr[ChatPhoto] = js.undefined
  var pinned_message: js.UndefOr[Message] = js.undefined
  var sticker_set_name: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: ChatType
  var username: js.UndefOr[String] = js.undefined
}

object Chat {
  @scala.inline
  def apply(
    id: Double,
    `type`: ChatType,
    all_members_are_administrators: js.UndefOr[Boolean] = js.undefined,
    can_set_sticker_set: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    first_name: String = null,
    invite_link: String = null,
    last_name: String = null,
    permissions: ChatPermissions = null,
    photo: ChatPhoto = null,
    pinned_message: Message = null,
    sticker_set_name: String = null,
    title: String = null,
    username: String = null
  ): Chat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(all_members_are_administrators)) __obj.updateDynamic("all_members_are_administrators")(all_members_are_administrators.asInstanceOf[js.Any])
    if (!js.isUndefined(can_set_sticker_set)) __obj.updateDynamic("can_set_sticker_set")(can_set_sticker_set.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (invite_link != null) __obj.updateDynamic("invite_link")(invite_link.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (photo != null) __obj.updateDynamic("photo")(photo.asInstanceOf[js.Any])
    if (pinned_message != null) __obj.updateDynamic("pinned_message")(pinned_message.asInstanceOf[js.Any])
    if (sticker_set_name != null) __obj.updateDynamic("sticker_set_name")(sticker_set_name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chat]
  }
}

