package typings.nodeDashZendesk.nodeDashZendeskMod.Users

import typings.nodeDashZendesk.nodeDashZendeskMod.Attachments.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#update-user|Zendesk Users Update}
  */
trait UpdateModel extends BaseModel {
  var name: js.UndefOr[String] = js.undefined
}

object UpdateModel {
  @scala.inline
  def apply(
    alias: String = null,
    custom_role_id: Int | Double = null,
    default_group_id: Int | Double = null,
    details: String = null,
    email: String = null,
    external_id: String = null,
    locale_id: Int | Double = null,
    moderator: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    notes: String = null,
    only_private_comments: js.UndefOr[Boolean] = js.undefined,
    organization_id: Int | Double = null,
    phone: String = null,
    photo: Model = null,
    restricted_agent: js.UndefOr[Boolean] = js.undefined,
    role: Role = null,
    signature: String = null,
    suspended: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[_] = null,
    ticket_restriction: TicketRestriction = null,
    time_zone: String = null,
    user_fields: js.Object = null,
    verified: js.UndefOr[Boolean] = js.undefined
  ): UpdateModel = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (custom_role_id != null) __obj.updateDynamic("custom_role_id")(custom_role_id.asInstanceOf[js.Any])
    if (default_group_id != null) __obj.updateDynamic("default_group_id")(default_group_id.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (email != null) __obj.updateDynamic("email")(email)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (locale_id != null) __obj.updateDynamic("locale_id")(locale_id.asInstanceOf[js.Any])
    if (!js.isUndefined(moderator)) __obj.updateDynamic("moderator")(moderator)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (!js.isUndefined(only_private_comments)) __obj.updateDynamic("only_private_comments")(only_private_comments)
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (!js.isUndefined(restricted_agent)) __obj.updateDynamic("restricted_agent")(restricted_agent)
    if (role != null) __obj.updateDynamic("role")(role)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (ticket_restriction != null) __obj.updateDynamic("ticket_restriction")(ticket_restriction)
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone)
    if (user_fields != null) __obj.updateDynamic("user_fields")(user_fields)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[UpdateModel]
  }
}

