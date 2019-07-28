package typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs

import typings.nodeDashZendesk.nodeDashZendeskMod.AttachmentsNs.Model
import typings.nodeDashZendesk.nodeDashZendeskMod.AuditableModel
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#json-format-for-agent-or-admin-requests|Zendesk Users JSON Format}
  */
trait ResponseModel extends AuditableModel {
  val active: Boolean
  val alias: String | Null
  val chat_only: Boolean
  val custom_role_id: Double | Null
  val default_group_id: Double | Null
  val details: String | Null
  val email: String | Null
  val external_id: String | Null
  val last_login_at: String | Null
  val locale: String | Null
  val locale_id: Double | Null
  val moderator: Boolean
  val name: String
  val notes: String | Null
  val only_private_comments: Boolean
  val organization_id: Double | Null
  val phone: String | Null
  val photo: Model | Null
  val report_csv: Boolean
  val restricted_agent: Boolean
  val role: Role
  val role_type: RoleType
  val shared: Boolean
  val shared_agent: Boolean
  val shared_phone_number: Boolean | Null
  val signature: String | Null
  val suspended: Boolean
  val tags: js.UndefOr[js.Array[_] | Null] = js.undefined
  val ticket_restriction: TicketRestriction | Null
  val time_zone: String | Null
  val two_factor_auth_enabled: Boolean
  val url: String
  val user_fields: js.UndefOr[js.Object | Null] = js.undefined
  val verified: Boolean
}

object ResponseModel {
  @scala.inline
  def apply(
    active: Boolean,
    chat_only: Boolean,
    created_at: String,
    id: ZendeskID,
    moderator: Boolean,
    name: String,
    only_private_comments: Boolean,
    report_csv: Boolean,
    restricted_agent: Boolean,
    role: Role,
    role_type: RoleType,
    shared: Boolean,
    shared_agent: Boolean,
    suspended: Boolean,
    two_factor_auth_enabled: Boolean,
    url: String,
    verified: Boolean,
    alias: String = null,
    custom_role_id: Int | Double = null,
    default_group_id: Int | Double = null,
    details: String = null,
    email: String = null,
    external_id: String = null,
    last_login_at: String = null,
    locale: String = null,
    locale_id: Int | Double = null,
    notes: String = null,
    organization_id: Int | Double = null,
    phone: String = null,
    photo: Model = null,
    shared_phone_number: js.UndefOr[Boolean] = js.undefined,
    signature: String = null,
    tags: js.Array[_] = null,
    ticket_restriction: TicketRestriction = null,
    time_zone: String = null,
    updated_at: String = null,
    user_fields: js.Object = null
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(active = active, chat_only = chat_only, created_at = created_at, id = id, moderator = moderator, name = name, only_private_comments = only_private_comments, report_csv = report_csv, restricted_agent = restricted_agent, role = role, role_type = role_type, shared = shared, shared_agent = shared_agent, suspended = suspended, two_factor_auth_enabled = two_factor_auth_enabled, url = url, verified = verified)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (custom_role_id != null) __obj.updateDynamic("custom_role_id")(custom_role_id.asInstanceOf[js.Any])
    if (default_group_id != null) __obj.updateDynamic("default_group_id")(default_group_id.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (email != null) __obj.updateDynamic("email")(email)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (last_login_at != null) __obj.updateDynamic("last_login_at")(last_login_at)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (locale_id != null) __obj.updateDynamic("locale_id")(locale_id.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (organization_id != null) __obj.updateDynamic("organization_id")(organization_id.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (!js.isUndefined(shared_phone_number)) __obj.updateDynamic("shared_phone_number")(shared_phone_number)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (ticket_restriction != null) __obj.updateDynamic("ticket_restriction")(ticket_restriction)
    if (time_zone != null) __obj.updateDynamic("time_zone")(time_zone)
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at)
    if (user_fields != null) __obj.updateDynamic("user_fields")(user_fields)
    __obj.asInstanceOf[ResponseModel]
  }
}

