package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
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
    custom_role_id: Double = null.asInstanceOf[Double],
    default_group_id: Double = null.asInstanceOf[Double],
    details: String = null,
    email: String = null,
    external_id: String = null,
    last_login_at: String = null,
    locale: String = null,
    locale_id: Double = null.asInstanceOf[Double],
    notes: String = null,
    organization_id: Double = null.asInstanceOf[Double],
    phone: String = null,
    photo: Model = null,
    shared_phone_number: Boolean = null.asInstanceOf[Boolean],
    signature: String = null,
    tags: js.UndefOr[Null | js.Array[_]] = js.undefined,
    ticket_restriction: TicketRestriction = null,
    time_zone: String = null,
    updated_at: String = null,
    user_fields: js.UndefOr[Null | js.Object] = js.undefined
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chat_only = chat_only.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], only_private_comments = only_private_comments.asInstanceOf[js.Any], report_csv = report_csv.asInstanceOf[js.Any], restricted_agent = restricted_agent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], role_type = role_type.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], shared_agent = shared_agent.asInstanceOf[js.Any], suspended = suspended.asInstanceOf[js.Any], two_factor_auth_enabled = two_factor_auth_enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], custom_role_id = custom_role_id.asInstanceOf[js.Any], default_group_id = default_group_id.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], last_login_at = last_login_at.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], locale_id = locale_id.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], photo = photo.asInstanceOf[js.Any], shared_phone_number = shared_phone_number.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], ticket_restriction = ticket_restriction.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(user_fields)) __obj.updateDynamic("user_fields")(user_fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
}

