package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.Attachments.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseModel extends StObject {
  
  var alias: js.UndefOr[String | Null] = js.undefined
  
  var custom_role_id: js.UndefOr[Double | Null] = js.undefined
  
  var default_group_id: js.UndefOr[Double | Null] = js.undefined
  
  var details: js.UndefOr[String | Null] = js.undefined
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var external_id: js.UndefOr[String | Null] = js.undefined
  
  var locale_id: js.UndefOr[Double | Null] = js.undefined
  
  var moderator: js.UndefOr[Boolean | Null] = js.undefined
  
  var notes: js.UndefOr[String | Null] = js.undefined
  
  var only_private_comments: js.UndefOr[Boolean | Null] = js.undefined
  
  var organization_id: js.UndefOr[Double | Null] = js.undefined
  
  var phone: js.UndefOr[String | Null] = js.undefined
  
  var photo: js.UndefOr[Model | Null] = js.undefined
  
  var restricted_agent: js.UndefOr[Boolean | Null] = js.undefined
  
  var role: js.UndefOr[Role | Null] = js.undefined
  
  var signature: js.UndefOr[String | Null] = js.undefined
  
  var suspended: js.UndefOr[Boolean | Null] = js.undefined
  
  var tags: js.UndefOr[js.Array[js.Any] | Null] = js.undefined
  
  var ticket_restriction: js.UndefOr[TicketRestriction | Null] = js.undefined
  
  var time_zone: js.UndefOr[String | Null] = js.undefined
  
  var user_fields: js.UndefOr[js.Object | Null] = js.undefined
  
  var verified: js.UndefOr[Boolean | Null] = js.undefined
}
object BaseModel {
  
  inline def apply(): BaseModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModel]
  }
  
  extension [Self <: BaseModel](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasNull: Self = StObject.set(x, "alias", null)
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCustom_role_id(value: Double): Self = StObject.set(x, "custom_role_id", value.asInstanceOf[js.Any])
    
    inline def setCustom_role_idNull: Self = StObject.set(x, "custom_role_id", null)
    
    inline def setCustom_role_idUndefined: Self = StObject.set(x, "custom_role_id", js.undefined)
    
    inline def setDefault_group_id(value: Double): Self = StObject.set(x, "default_group_id", value.asInstanceOf[js.Any])
    
    inline def setDefault_group_idNull: Self = StObject.set(x, "default_group_id", null)
    
    inline def setDefault_group_idUndefined: Self = StObject.set(x, "default_group_id", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    inline def setLocale_id(value: Double): Self = StObject.set(x, "locale_id", value.asInstanceOf[js.Any])
    
    inline def setLocale_idNull: Self = StObject.set(x, "locale_id", null)
    
    inline def setLocale_idUndefined: Self = StObject.set(x, "locale_id", js.undefined)
    
    inline def setModerator(value: Boolean): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    inline def setModeratorNull: Self = StObject.set(x, "moderator", null)
    
    inline def setModeratorUndefined: Self = StObject.set(x, "moderator", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOnly_private_comments(value: Boolean): Self = StObject.set(x, "only_private_comments", value.asInstanceOf[js.Any])
    
    inline def setOnly_private_commentsNull: Self = StObject.set(x, "only_private_comments", null)
    
    inline def setOnly_private_commentsUndefined: Self = StObject.set(x, "only_private_comments", js.undefined)
    
    inline def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
    
    inline def setOrganization_idUndefined: Self = StObject.set(x, "organization_id", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPhoto(value: Model): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setRestricted_agent(value: Boolean): Self = StObject.set(x, "restricted_agent", value.asInstanceOf[js.Any])
    
    inline def setRestricted_agentNull: Self = StObject.set(x, "restricted_agent", null)
    
    inline def setRestricted_agentUndefined: Self = StObject.set(x, "restricted_agent", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    inline def setTags(value: js.Array[js.Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: js.Any*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTicket_restriction(value: TicketRestriction): Self = StObject.set(x, "ticket_restriction", value.asInstanceOf[js.Any])
    
    inline def setTicket_restrictionNull: Self = StObject.set(x, "ticket_restriction", null)
    
    inline def setTicket_restrictionUndefined: Self = StObject.set(x, "ticket_restriction", js.undefined)
    
    inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneNull: Self = StObject.set(x, "time_zone", null)
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
    
    inline def setUser_fields(value: js.Object): Self = StObject.set(x, "user_fields", value.asInstanceOf[js.Any])
    
    inline def setUser_fieldsNull: Self = StObject.set(x, "user_fields", null)
    
    inline def setUser_fieldsUndefined: Self = StObject.set(x, "user_fields", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedNull: Self = StObject.set(x, "verified", null)
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
