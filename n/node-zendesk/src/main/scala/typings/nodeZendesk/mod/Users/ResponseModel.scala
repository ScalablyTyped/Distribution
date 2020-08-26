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
@js.native
trait ResponseModel extends AuditableModel {
  val active: Boolean = js.native
  val alias: String | Null = js.native
  val chat_only: Boolean = js.native
  val custom_role_id: Double | Null = js.native
  val default_group_id: Double | Null = js.native
  val details: String | Null = js.native
  val email: String | Null = js.native
  val external_id: String | Null = js.native
  val last_login_at: String | Null = js.native
  val locale: String | Null = js.native
  val locale_id: Double | Null = js.native
  val moderator: Boolean = js.native
  val name: String = js.native
  val notes: String | Null = js.native
  val only_private_comments: Boolean = js.native
  val organization_id: Double | Null = js.native
  val phone: String | Null = js.native
  val photo: Model | Null = js.native
  val report_csv: Boolean = js.native
  val restricted_agent: Boolean = js.native
  val role: Role = js.native
  val role_type: RoleType = js.native
  val shared: Boolean = js.native
  val shared_agent: Boolean = js.native
  val shared_phone_number: Boolean | Null = js.native
  val signature: String | Null = js.native
  val suspended: Boolean = js.native
  val tags: js.UndefOr[js.Array[_] | Null] = js.native
  val ticket_restriction: TicketRestriction | Null = js.native
  val time_zone: String | Null = js.native
  val two_factor_auth_enabled: Boolean = js.native
  val url: String = js.native
  val user_fields: js.UndefOr[js.Object | Null] = js.native
  val verified: Boolean = js.native
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
    verified: Boolean
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chat_only = chat_only.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], only_private_comments = only_private_comments.asInstanceOf[js.Any], report_csv = report_csv.asInstanceOf[js.Any], restricted_agent = restricted_agent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], role_type = role_type.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], shared_agent = shared_agent.asInstanceOf[js.Any], suspended = suspended.asInstanceOf[js.Any], two_factor_auth_enabled = two_factor_auth_enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseModel]
  }
  @scala.inline
  implicit class ResponseModelOps[Self <: ResponseModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setChat_only(value: Boolean): Self = this.set("chat_only", value.asInstanceOf[js.Any])
    @scala.inline
    def setModerator(value: Boolean): Self = this.set("moderator", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnly_private_comments(value: Boolean): Self = this.set("only_private_comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setReport_csv(value: Boolean): Self = this.set("report_csv", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestricted_agent(value: Boolean): Self = this.set("restricted_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: Role): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole_type(value: RoleType): Self = this.set("role_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def setShared_agent(value: Boolean): Self = this.set("shared_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwo_factor_auth_enabled(value: Boolean): Self = this.set("two_factor_auth_enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setAliasNull: Self = this.set("alias", null)
    @scala.inline
    def setCustom_role_id(value: Double): Self = this.set("custom_role_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom_role_idNull: Self = this.set("custom_role_id", null)
    @scala.inline
    def setDefault_group_id(value: Double): Self = this.set("default_group_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault_group_idNull: Self = this.set("default_group_id", null)
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternal_idNull: Self = this.set("external_id", null)
    @scala.inline
    def setLast_login_at(value: String): Self = this.set("last_login_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_login_atNull: Self = this.set("last_login_at", null)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocaleNull: Self = this.set("locale", null)
    @scala.inline
    def setLocale_id(value: Double): Self = this.set("locale_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale_idNull: Self = this.set("locale_id", null)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotesNull: Self = this.set("notes", null)
    @scala.inline
    def setOrganization_id(value: Double): Self = this.set("organization_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganization_idNull: Self = this.set("organization_id", null)
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
    @scala.inline
    def setPhoto(value: Model): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoNull: Self = this.set("photo", null)
    @scala.inline
    def setShared_phone_number(value: Boolean): Self = this.set("shared_phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setShared_phone_numberNull: Self = this.set("shared_phone_number", null)
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureNull: Self = this.set("signature", null)
    @scala.inline
    def setTagsVarargs(value: js.Any*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[_]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
    @scala.inline
    def setTicket_restriction(value: TicketRestriction): Self = this.set("ticket_restriction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTicket_restrictionNull: Self = this.set("ticket_restriction", null)
    @scala.inline
    def setTime_zone(value: String): Self = this.set("time_zone", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime_zoneNull: Self = this.set("time_zone", null)
    @scala.inline
    def setUser_fields(value: js.Object): Self = this.set("user_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_fields: Self = this.set("user_fields", js.undefined)
    @scala.inline
    def setUser_fieldsNull: Self = this.set("user_fields", null)
  }
  
}

