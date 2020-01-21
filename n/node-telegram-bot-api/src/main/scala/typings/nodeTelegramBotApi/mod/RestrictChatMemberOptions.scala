package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictChatMemberOptions extends js.Object {
  var can_add_web_page_previews: js.UndefOr[Boolean] = js.undefined
  var can_send_media_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_messages: js.UndefOr[Boolean] = js.undefined
  var can_send_other_messages: js.UndefOr[Boolean] = js.undefined
  var until_date: js.UndefOr[Double] = js.undefined
}

object RestrictChatMemberOptions {
  @scala.inline
  def apply(
    can_add_web_page_previews: js.UndefOr[Boolean] = js.undefined,
    can_send_media_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_messages: js.UndefOr[Boolean] = js.undefined,
    can_send_other_messages: js.UndefOr[Boolean] = js.undefined,
    until_date: Int | Double = null
  ): RestrictChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(can_add_web_page_previews)) __obj.updateDynamic("can_add_web_page_previews")(can_add_web_page_previews.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_media_messages)) __obj.updateDynamic("can_send_media_messages")(can_send_media_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_messages)) __obj.updateDynamic("can_send_messages")(can_send_messages.asInstanceOf[js.Any])
    if (!js.isUndefined(can_send_other_messages)) __obj.updateDynamic("can_send_other_messages")(can_send_other_messages.asInstanceOf[js.Any])
    if (until_date != null) __obj.updateDynamic("until_date")(until_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictChatMemberOptions]
  }
}

