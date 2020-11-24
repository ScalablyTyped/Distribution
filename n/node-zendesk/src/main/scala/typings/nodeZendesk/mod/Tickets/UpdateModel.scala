package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#update-ticket|Zendesk Tickets Update}
  */
@js.native
trait UpdateModel extends js.Object {
  
  var additional_collaborators: js.UndefOr[js.Array[_] | Null] = js.native
  
  var assignee_email: js.UndefOr[String | Null] = js.native
  
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.native
  
  var attribute_value_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var comment: js.UndefOr[typings.nodeZendesk.mod.Requests.Comments.CreateModel] = js.native
  
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.native
  
  var due_at: js.UndefOr[String | Null] = js.native
  
  var email_ccs: js.UndefOr[js.Array[EmailCC] | Null] = js.native
  
  var external_id: js.UndefOr[String | Null] = js.native
  
  var followers: js.UndefOr[js.Array[Follower] | Null] = js.native
  
  var group_id: js.UndefOr[Double | Null] = js.native
  
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var organization_id: js.UndefOr[Double | Null] = js.native
  
  var priority: js.UndefOr[Priority | Null] = js.native
  
  var problem_id: js.UndefOr[Double | Null] = js.native
  
  var requester_id: js.UndefOr[ZendeskID] = js.native
  
  var safe_update: js.UndefOr[Boolean] = js.native
  
  var sharing_agreement_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var status: js.UndefOr[Status | Null] = js.native
  
  var subject: js.UndefOr[String | Null] = js.native
  
  var tags: js.UndefOr[js.Array[String] | Null] = js.native
  
  var `type`: js.UndefOr[TicketType | Null] = js.native
  
  var updated_stamp: js.UndefOr[String | Null] = js.native
}
object UpdateModel {
  
  @scala.inline
  def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  
  @scala.inline
  implicit class UpdateModelOps[Self <: UpdateModel] (val x: Self) extends AnyVal {
    
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
    def setAdditional_collaboratorsVarargs(value: js.Any*): Self = this.set("additional_collaborators", js.Array(value :_*))
    
    @scala.inline
    def setAdditional_collaborators(value: js.Array[_]): Self = this.set("additional_collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditional_collaborators: Self = this.set("additional_collaborators", js.undefined)
    
    @scala.inline
    def setAdditional_collaboratorsNull: Self = this.set("additional_collaborators", null)
    
    @scala.inline
    def setAssignee_email(value: String): Self = this.set("assignee_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignee_email: Self = this.set("assignee_email", js.undefined)
    
    @scala.inline
    def setAssignee_emailNull: Self = this.set("assignee_email", null)
    
    @scala.inline
    def setAssignee_id(value: ZendeskID): Self = this.set("assignee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignee_id: Self = this.set("assignee_id", js.undefined)
    
    @scala.inline
    def setAssignee_idNull: Self = this.set("assignee_id", null)
    
    @scala.inline
    def setAttribute_value_idsVarargs(value: Double*): Self = this.set("attribute_value_ids", js.Array(value :_*))
    
    @scala.inline
    def setAttribute_value_ids(value: js.Array[Double]): Self = this.set("attribute_value_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute_value_ids: Self = this.set("attribute_value_ids", js.undefined)
    
    @scala.inline
    def setAttribute_value_idsNull: Self = this.set("attribute_value_ids", null)
    
    @scala.inline
    def setCollaborator_idsVarargs(value: Double*): Self = this.set("collaborator_ids", js.Array(value :_*))
    
    @scala.inline
    def setCollaborator_ids(value: js.Array[Double]): Self = this.set("collaborator_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollaborator_ids: Self = this.set("collaborator_ids", js.undefined)
    
    @scala.inline
    def setCollaborator_idsNull: Self = this.set("collaborator_ids", null)
    
    @scala.inline
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCustom_fieldsVarargs(value: Field*): Self = this.set("custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setCustom_fields(value: js.Array[Field]): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_fields: Self = this.set("custom_fields", js.undefined)
    
    @scala.inline
    def setCustom_fieldsNull: Self = this.set("custom_fields", null)
    
    @scala.inline
    def setDue_at(value: String): Self = this.set("due_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDue_at: Self = this.set("due_at", js.undefined)
    
    @scala.inline
    def setDue_atNull: Self = this.set("due_at", null)
    
    @scala.inline
    def setEmail_ccsVarargs(value: EmailCC*): Self = this.set("email_ccs", js.Array(value :_*))
    
    @scala.inline
    def setEmail_ccs(value: js.Array[EmailCC]): Self = this.set("email_ccs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail_ccs: Self = this.set("email_ccs", js.undefined)
    
    @scala.inline
    def setEmail_ccsNull: Self = this.set("email_ccs", null)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    
    @scala.inline
    def setExternal_idNull: Self = this.set("external_id", null)
    
    @scala.inline
    def setFollowersVarargs(value: Follower*): Self = this.set("followers", js.Array(value :_*))
    
    @scala.inline
    def setFollowers(value: js.Array[Follower]): Self = this.set("followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowers: Self = this.set("followers", js.undefined)
    
    @scala.inline
    def setFollowersNull: Self = this.set("followers", null)
    
    @scala.inline
    def setGroup_id(value: Double): Self = this.set("group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup_id: Self = this.set("group_id", js.undefined)
    
    @scala.inline
    def setGroup_idNull: Self = this.set("group_id", null)
    
    @scala.inline
    def setMacro_idsVarargs(value: Double*): Self = this.set("macro_ids", js.Array(value :_*))
    
    @scala.inline
    def setMacro_ids(value: js.Array[Double]): Self = this.set("macro_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacro_ids: Self = this.set("macro_ids", js.undefined)
    
    @scala.inline
    def setMacro_idsNull: Self = this.set("macro_ids", null)
    
    @scala.inline
    def setOrganization_id(value: Double): Self = this.set("organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization_id: Self = this.set("organization_id", js.undefined)
    
    @scala.inline
    def setOrganization_idNull: Self = this.set("organization_id", null)
    
    @scala.inline
    def setPriority(value: Priority): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setPriorityNull: Self = this.set("priority", null)
    
    @scala.inline
    def setProblem_id(value: Double): Self = this.set("problem_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProblem_id: Self = this.set("problem_id", js.undefined)
    
    @scala.inline
    def setProblem_idNull: Self = this.set("problem_id", null)
    
    @scala.inline
    def setRequester_id(value: ZendeskID): Self = this.set("requester_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequester_id: Self = this.set("requester_id", js.undefined)
    
    @scala.inline
    def setSafe_update(value: Boolean): Self = this.set("safe_update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe_update: Self = this.set("safe_update", js.undefined)
    
    @scala.inline
    def setSharing_agreement_idsVarargs(value: Double*): Self = this.set("sharing_agreement_ids", js.Array(value :_*))
    
    @scala.inline
    def setSharing_agreement_ids(value: js.Array[Double]): Self = this.set("sharing_agreement_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharing_agreement_ids: Self = this.set("sharing_agreement_ids", js.undefined)
    
    @scala.inline
    def setSharing_agreement_idsNull: Self = this.set("sharing_agreement_ids", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setSubjectNull: Self = this.set("subject", null)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
    
    @scala.inline
    def setType(value: TicketType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setUpdated_stamp(value: String): Self = this.set("updated_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated_stamp: Self = this.set("updated_stamp", js.undefined)
    
    @scala.inline
    def setUpdated_stampNull: Self = this.set("updated_stamp", null)
  }
}
