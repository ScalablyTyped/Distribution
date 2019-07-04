package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#json-format-for-agent-or-admin-requests|Zendesk Users JSON Format}
  */
trait ResponseModel
  extends nodeDashZendeskLib.nodeDashZendeskMod.AuditableModel {
  val active: scala.Boolean
  val alias: java.lang.String | scala.Null
  val chat_only: scala.Boolean
  val custom_role_id: scala.Double | scala.Null
  val default_group_id: scala.Double | scala.Null
  val details: java.lang.String | scala.Null
  val email: java.lang.String | scala.Null
  val external_id: java.lang.String | scala.Null
  val last_login_at: java.lang.String | scala.Null
  val locale: java.lang.String | scala.Null
  val locale_id: scala.Double | scala.Null
  val moderator: scala.Boolean
  val name: java.lang.String
  val notes: java.lang.String | scala.Null
  val only_private_comments: scala.Boolean
  val organization_id: scala.Double | scala.Null
  val phone: java.lang.String | scala.Null
  val photo: nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs.Model | scala.Null
  val report_csv: scala.Boolean
  val restricted_agent: scala.Boolean
  val role: Role
  val role_type: RoleType
  val shared: scala.Boolean
  val shared_agent: scala.Boolean
  val shared_phone_number: scala.Boolean | scala.Null
  val signature: java.lang.String | scala.Null
  val suspended: scala.Boolean
  val tags: js.UndefOr[js.Array[_] | scala.Null] = js.undefined
  val ticket_restriction: TicketRestriction | scala.Null
  val time_zone: java.lang.String | scala.Null
  val two_factor_auth_enabled: scala.Boolean
  val url: java.lang.String
  val user_fields: js.UndefOr[js.Object | scala.Null] = js.undefined
  val verified: scala.Boolean
}

object ResponseModel {
  @scala.inline
  def apply(
    active: scala.Boolean,
    chat_only: scala.Boolean,
    created_at: java.lang.String,
    id: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    moderator: scala.Boolean,
    name: java.lang.String,
    only_private_comments: scala.Boolean,
    report_csv: scala.Boolean,
    restricted_agent: scala.Boolean,
    role: Role,
    role_type: RoleType,
    shared: scala.Boolean,
    shared_agent: scala.Boolean,
    suspended: scala.Boolean,
    two_factor_auth_enabled: scala.Boolean,
    url: java.lang.String,
    verified: scala.Boolean,
    alias: java.lang.String = null,
    custom_role_id: scala.Int | scala.Double = null,
    default_group_id: scala.Int | scala.Double = null,
    details: java.lang.String = null,
    email: java.lang.String = null,
    external_id: java.lang.String = null,
    last_login_at: java.lang.String = null,
    locale: java.lang.String = null,
    locale_id: scala.Int | scala.Double = null,
    notes: java.lang.String = null,
    organization_id: scala.Int | scala.Double = null,
    phone: java.lang.String = null,
    photo: nodeDashZendeskLib.nodeDashZendeskMod.AttachmentsNs.Model = null,
    shared_phone_number: js.UndefOr[scala.Boolean] = js.undefined,
    signature: java.lang.String = null,
    tags: js.Array[_] = null,
    ticket_restriction: TicketRestriction = null,
    time_zone: java.lang.String = null,
    updated_at: java.lang.String = null,
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

