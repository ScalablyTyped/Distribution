package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoteChatMemberOptions extends js.Object {
  var can_change_info: js.UndefOr[scala.Boolean] = js.undefined
  var can_delete_messages: js.UndefOr[scala.Boolean] = js.undefined
  var can_edit_messages: js.UndefOr[scala.Boolean] = js.undefined
  var can_invite_users: js.UndefOr[scala.Boolean] = js.undefined
  var can_pin_messages: js.UndefOr[scala.Boolean] = js.undefined
  var can_post_messages: js.UndefOr[scala.Boolean] = js.undefined
  var can_promote_members: js.UndefOr[scala.Boolean] = js.undefined
  var can_restrict_members: js.UndefOr[scala.Boolean] = js.undefined
}

object PromoteChatMemberOptions {
  @scala.inline
  def apply(
    can_change_info: js.UndefOr[scala.Boolean] = js.undefined,
    can_delete_messages: js.UndefOr[scala.Boolean] = js.undefined,
    can_edit_messages: js.UndefOr[scala.Boolean] = js.undefined,
    can_invite_users: js.UndefOr[scala.Boolean] = js.undefined,
    can_pin_messages: js.UndefOr[scala.Boolean] = js.undefined,
    can_post_messages: js.UndefOr[scala.Boolean] = js.undefined,
    can_promote_members: js.UndefOr[scala.Boolean] = js.undefined,
    can_restrict_members: js.UndefOr[scala.Boolean] = js.undefined
  ): PromoteChatMemberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(can_change_info)) __obj.updateDynamic("can_change_info")(can_change_info)
    if (!js.isUndefined(can_delete_messages)) __obj.updateDynamic("can_delete_messages")(can_delete_messages)
    if (!js.isUndefined(can_edit_messages)) __obj.updateDynamic("can_edit_messages")(can_edit_messages)
    if (!js.isUndefined(can_invite_users)) __obj.updateDynamic("can_invite_users")(can_invite_users)
    if (!js.isUndefined(can_pin_messages)) __obj.updateDynamic("can_pin_messages")(can_pin_messages)
    if (!js.isUndefined(can_post_messages)) __obj.updateDynamic("can_post_messages")(can_post_messages)
    if (!js.isUndefined(can_promote_members)) __obj.updateDynamic("can_promote_members")(can_promote_members)
    if (!js.isUndefined(can_restrict_members)) __obj.updateDynamic("can_restrict_members")(can_restrict_members)
    __obj.asInstanceOf[PromoteChatMemberOptions]
  }
}

