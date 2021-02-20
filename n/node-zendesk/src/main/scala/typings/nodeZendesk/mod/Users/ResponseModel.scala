package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ResponseModelMutableBuilder[Self <: ResponseModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = StObject.set(x, "alias", null)
    
    @scala.inline
    def setChat_only(value: Boolean): Self = StObject.set(x, "chat_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_role_id(value: Double): Self = StObject.set(x, "custom_role_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_role_idNull: Self = StObject.set(x, "custom_role_id", null)
    
    @scala.inline
    def setDefault_group_id(value: Double): Self = StObject.set(x, "default_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_group_idNull: Self = StObject.set(x, "default_group_id", null)
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsNull: Self = StObject.set(x, "details", null)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    @scala.inline
    def setLast_login_at(value: String): Self = StObject.set(x, "last_login_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_login_atNull: Self = StObject.set(x, "last_login_at", null)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    @scala.inline
    def setLocale_id(value: Double): Self = StObject.set(x, "locale_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale_idNull: Self = StObject.set(x, "locale_id", null)
    
    @scala.inline
    def setModerator(value: Boolean): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesNull: Self = StObject.set(x, "notes", null)
    
    @scala.inline
    def setOnly_private_comments(value: Boolean): Self = StObject.set(x, "only_private_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    @scala.inline
    def setPhoto(value: Model): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    @scala.inline
    def setReport_csv(value: Boolean): Self = StObject.set(x, "report_csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestricted_agent(value: Boolean): Self = StObject.set(x, "restricted_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole_type(value: RoleType): Self = StObject.set(x, "role_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_agent(value: Boolean): Self = StObject.set(x, "shared_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_phone_number(value: Boolean): Self = StObject.set(x, "shared_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShared_phone_numberNull: Self = StObject.set(x, "shared_phone_number", null)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[_]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsNull: Self = StObject.set(x, "tags", null)
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: js.Any*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTicket_restriction(value: TicketRestriction): Self = StObject.set(x, "ticket_restriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_restrictionNull: Self = StObject.set(x, "ticket_restriction", null)
    
    @scala.inline
    def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zoneNull: Self = StObject.set(x, "time_zone", null)
    
    @scala.inline
    def setTwo_factor_auth_enabled(value: Boolean): Self = StObject.set(x, "two_factor_auth_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_fields(value: js.Object): Self = StObject.set(x, "user_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_fieldsNull: Self = StObject.set(x, "user_fields", null)
    
    @scala.inline
    def setUser_fieldsUndefined: Self = StObject.set(x, "user_fields", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
