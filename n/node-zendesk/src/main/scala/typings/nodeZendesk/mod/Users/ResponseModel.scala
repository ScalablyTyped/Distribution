package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.Attachments.Model
import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/users#json-format-for-agent-or-admin-requests|Zendesk Users JSON Format}
  */
trait ResponseModel
  extends StObject
     with AuditableModel {
  
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
  
  val tags: js.UndefOr[js.Array[Any] | Null] = js.undefined
  
  val ticket_restriction: TicketRestriction | Null
  
  val time_zone: String | Null
  
  val two_factor_auth_enabled: Boolean
  
  val url: String
  
  val user_fields: js.UndefOr[js.Object | Null] = js.undefined
  
  val verified: Boolean
}
object ResponseModel {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chat_only = chat_only.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moderator = moderator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], only_private_comments = only_private_comments.asInstanceOf[js.Any], report_csv = report_csv.asInstanceOf[js.Any], restricted_agent = restricted_agent.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], role_type = role_type.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any], shared_agent = shared_agent.asInstanceOf[js.Any], suspended = suspended.asInstanceOf[js.Any], two_factor_auth_enabled = two_factor_auth_enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], alias = null, custom_role_id = null, default_group_id = null, details = null, email = null, external_id = null, last_login_at = null, locale = null, locale_id = null, notes = null, organization_id = null, phone = null, photo = null, shared_phone_number = null, signature = null, ticket_restriction = null, time_zone = null, updated_at = null)
    __obj.asInstanceOf[ResponseModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseModel] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setChat_only(value: Boolean): Self = StObject.set(x, "chat_only", value.asInstanceOf[js.Any])
    
    inline def setCustom_role_id(value: Double): Self = StObject.set(x, "custom_role_id", value.asInstanceOf[js.Any])
    
    inline def setCustom_role_idNull: Self = StObject.set(x, "custom_role_id", null)
    
    inline def setDefault_group_id(value: Double): Self = StObject.set(x, "default_group_id", value.asInstanceOf[js.Any])
    
    inline def setDefault_group_idNull: Self = StObject.set(x, "default_group_id", null)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    inline def setLast_login_at(value: String): Self = StObject.set(x, "last_login_at", value.asInstanceOf[js.Any])
    
    inline def setLast_login_atNull: Self = StObject.set(x, "last_login_at", null)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setLocale_id(value: Double): Self = StObject.set(x, "locale_id", value.asInstanceOf[js.Any])
    
    inline def setLocale_idNull: Self = StObject.set(x, "locale_id", null)
    
    inline def setModerator(value: Boolean): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setOnly_private_comments(value: Boolean): Self = StObject.set(x, "only_private_comments", value.asInstanceOf[js.Any])
    
    inline def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoto(value: Model): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    inline def setReport_csv(value: Boolean): Self = StObject.set(x, "report_csv", value.asInstanceOf[js.Any])
    
    inline def setRestricted_agent(value: Boolean): Self = StObject.set(x, "restricted_agent", value.asInstanceOf[js.Any])
    
    inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRole_type(value: RoleType): Self = StObject.set(x, "role_type", value.asInstanceOf[js.Any])
    
    inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
    
    inline def setShared_agent(value: Boolean): Self = StObject.set(x, "shared_agent", value.asInstanceOf[js.Any])
    
    inline def setShared_phone_number(value: Boolean): Self = StObject.set(x, "shared_phone_number", value.asInstanceOf[js.Any])
    
    inline def setShared_phone_numberNull: Self = StObject.set(x, "shared_phone_number", null)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Any*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTicket_restriction(value: TicketRestriction): Self = StObject.set(x, "ticket_restriction", value.asInstanceOf[js.Any])
    
    inline def setTicket_restrictionNull: Self = StObject.set(x, "ticket_restriction", null)
    
    inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneNull: Self = StObject.set(x, "time_zone", null)
    
    inline def setTwo_factor_auth_enabled(value: Boolean): Self = StObject.set(x, "two_factor_auth_enabled", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser_fields(value: js.Object): Self = StObject.set(x, "user_fields", value.asInstanceOf[js.Any])
    
    inline def setUser_fieldsNull: Self = StObject.set(x, "user_fields", null)
    
    inline def setUser_fieldsUndefined: Self = StObject.set(x, "user_fields", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
