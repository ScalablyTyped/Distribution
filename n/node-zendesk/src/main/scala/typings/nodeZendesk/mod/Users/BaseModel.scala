package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.Attachments.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseModel extends StObject {
  
  var alias: js.UndefOr[String | Null] = js.native
  
  var custom_role_id: js.UndefOr[Double | Null] = js.native
  
  var default_group_id: js.UndefOr[Double | Null] = js.native
  
  var details: js.UndefOr[String | Null] = js.native
  
  var email: js.UndefOr[String | Null] = js.native
  
  var external_id: js.UndefOr[String | Null] = js.native
  
  var locale_id: js.UndefOr[Double | Null] = js.native
  
  var moderator: js.UndefOr[Boolean | Null] = js.native
  
  var notes: js.UndefOr[String | Null] = js.native
  
  var only_private_comments: js.UndefOr[Boolean | Null] = js.native
  
  var organization_id: js.UndefOr[Double | Null] = js.native
  
  var phone: js.UndefOr[String | Null] = js.native
  
  var photo: js.UndefOr[Model | Null] = js.native
  
  var restricted_agent: js.UndefOr[Boolean | Null] = js.native
  
  var role: js.UndefOr[Role | Null] = js.native
  
  var signature: js.UndefOr[String | Null] = js.native
  
  var suspended: js.UndefOr[Boolean | Null] = js.native
  
  var tags: js.UndefOr[js.Array[_] | Null] = js.native
  
  var ticket_restriction: js.UndefOr[TicketRestriction | Null] = js.native
  
  var time_zone: js.UndefOr[String | Null] = js.native
  
  var user_fields: js.UndefOr[js.Object | Null] = js.native
  
  var verified: js.UndefOr[Boolean | Null] = js.native
}
object BaseModel {
  
  @scala.inline
  def apply(): BaseModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModel]
  }
  
  @scala.inline
  implicit class BaseModelMutableBuilder[Self <: BaseModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = StObject.set(x, "alias", null)
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setCustom_role_id(value: Double): Self = StObject.set(x, "custom_role_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_role_idNull: Self = StObject.set(x, "custom_role_id", null)
    
    @scala.inline
    def setCustom_role_idUndefined: Self = StObject.set(x, "custom_role_id", js.undefined)
    
    @scala.inline
    def setDefault_group_id(value: Double): Self = StObject.set(x, "default_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_group_idNull: Self = StObject.set(x, "default_group_id", null)
    
    @scala.inline
    def setDefault_group_idUndefined: Self = StObject.set(x, "default_group_id", js.undefined)
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsNull: Self = StObject.set(x, "details", null)
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    @scala.inline
    def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    @scala.inline
    def setLocale_id(value: Double): Self = StObject.set(x, "locale_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale_idNull: Self = StObject.set(x, "locale_id", null)
    
    @scala.inline
    def setLocale_idUndefined: Self = StObject.set(x, "locale_id", js.undefined)
    
    @scala.inline
    def setModerator(value: Boolean): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeratorNull: Self = StObject.set(x, "moderator", null)
    
    @scala.inline
    def setModeratorUndefined: Self = StObject.set(x, "moderator", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesNull: Self = StObject.set(x, "notes", null)
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setOnly_private_comments(value: Boolean): Self = StObject.set(x, "only_private_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnly_private_commentsNull: Self = StObject.set(x, "only_private_comments", null)
    
    @scala.inline
    def setOnly_private_commentsUndefined: Self = StObject.set(x, "only_private_comments", js.undefined)
    
    @scala.inline
    def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
    
    @scala.inline
    def setOrganization_idUndefined: Self = StObject.set(x, "organization_id", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNull: Self = StObject.set(x, "phone", null)
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setPhoto(value: Model): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoNull: Self = StObject.set(x, "photo", null)
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setRestricted_agent(value: Boolean): Self = StObject.set(x, "restricted_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestricted_agentNull: Self = StObject.set(x, "restricted_agent", null)
    
    @scala.inline
    def setRestricted_agentUndefined: Self = StObject.set(x, "restricted_agent", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNull: Self = StObject.set(x, "role", null)
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    @scala.inline
    def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
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
    def setTicket_restrictionUndefined: Self = StObject.set(x, "ticket_restriction", js.undefined)
    
    @scala.inline
    def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime_zoneNull: Self = StObject.set(x, "time_zone", null)
    
    @scala.inline
    def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
    
    @scala.inline
    def setUser_fields(value: js.Object): Self = StObject.set(x, "user_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_fieldsNull: Self = StObject.set(x, "user_fields", null)
    
    @scala.inline
    def setUser_fieldsUndefined: Self = StObject.set(x, "user_fields", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedNull: Self = StObject.set(x, "verified", null)
    
    @scala.inline
    def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
