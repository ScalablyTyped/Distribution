package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.Attachments.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseModel extends js.Object {
  
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
  implicit class BaseModelOps[Self <: BaseModel] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAliasNull: Self = this.set("alias", null)
    
    @scala.inline
    def setCustom_role_id(value: Double): Self = this.set("custom_role_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_role_id: Self = this.set("custom_role_id", js.undefined)
    
    @scala.inline
    def setCustom_role_idNull: Self = this.set("custom_role_id", null)
    
    @scala.inline
    def setDefault_group_id(value: Double): Self = this.set("default_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_group_id: Self = this.set("default_group_id", js.undefined)
    
    @scala.inline
    def setDefault_group_idNull: Self = this.set("default_group_id", null)
    
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    
    @scala.inline
    def setExternal_idNull: Self = this.set("external_id", null)
    
    @scala.inline
    def setLocale_id(value: Double): Self = this.set("locale_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale_id: Self = this.set("locale_id", js.undefined)
    
    @scala.inline
    def setLocale_idNull: Self = this.set("locale_id", null)
    
    @scala.inline
    def setModerator(value: Boolean): Self = this.set("moderator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModerator: Self = this.set("moderator", js.undefined)
    
    @scala.inline
    def setModeratorNull: Self = this.set("moderator", null)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setNotesNull: Self = this.set("notes", null)
    
    @scala.inline
    def setOnly_private_comments(value: Boolean): Self = this.set("only_private_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly_private_comments: Self = this.set("only_private_comments", js.undefined)
    
    @scala.inline
    def setOnly_private_commentsNull: Self = this.set("only_private_comments", null)
    
    @scala.inline
    def setOrganization_id(value: Double): Self = this.set("organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization_id: Self = this.set("organization_id", js.undefined)
    
    @scala.inline
    def setOrganization_idNull: Self = this.set("organization_id", null)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPhoneNull: Self = this.set("phone", null)
    
    @scala.inline
    def setPhoto(value: Model): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setPhotoNull: Self = this.set("photo", null)
    
    @scala.inline
    def setRestricted_agent(value: Boolean): Self = this.set("restricted_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestricted_agent: Self = this.set("restricted_agent", js.undefined)
    
    @scala.inline
    def setRestricted_agentNull: Self = this.set("restricted_agent", null)
    
    @scala.inline
    def setRole(value: Role): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setRoleNull: Self = this.set("role", null)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setSignatureNull: Self = this.set("signature", null)
    
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspended: Self = this.set("suspended", js.undefined)
    
    @scala.inline
    def setSuspendedNull: Self = this.set("suspended", null)
    
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
    def deleteTicket_restriction: Self = this.set("ticket_restriction", js.undefined)
    
    @scala.inline
    def setTicket_restrictionNull: Self = this.set("ticket_restriction", null)
    
    @scala.inline
    def setTime_zone(value: String): Self = this.set("time_zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_zone: Self = this.set("time_zone", js.undefined)
    
    @scala.inline
    def setTime_zoneNull: Self = this.set("time_zone", null)
    
    @scala.inline
    def setUser_fields(value: js.Object): Self = this.set("user_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_fields: Self = this.set("user_fields", js.undefined)
    
    @scala.inline
    def setUser_fieldsNull: Self = this.set("user_fields", null)
    
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
    
    @scala.inline
    def setVerifiedNull: Self = this.set("verified", null)
  }
}
