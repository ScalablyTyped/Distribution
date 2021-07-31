package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#update-ticket|Zendesk Tickets Update}
  */
trait UpdateModel extends StObject {
  
  var additional_collaborators: js.UndefOr[js.Array[js.Any] | Null] = js.undefined
  
  var assignee_email: js.UndefOr[String | Null] = js.undefined
  
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.undefined
  
  var attribute_value_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var comment: js.UndefOr[typings.nodeZendesk.mod.Requests.Comments.CreateModel] = js.undefined
  
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.undefined
  
  var due_at: js.UndefOr[String | Null] = js.undefined
  
  var email_ccs: js.UndefOr[js.Array[EmailCC] | Null] = js.undefined
  
  var external_id: js.UndefOr[String | Null] = js.undefined
  
  var followers: js.UndefOr[js.Array[Follower] | Null] = js.undefined
  
  var group_id: js.UndefOr[Double | Null] = js.undefined
  
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var organization_id: js.UndefOr[Double | Null] = js.undefined
  
  var priority: js.UndefOr[Priority | Null] = js.undefined
  
  var problem_id: js.UndefOr[Double | Null] = js.undefined
  
  var requester_id: js.UndefOr[ZendeskID] = js.undefined
  
  var safe_update: js.UndefOr[Boolean] = js.undefined
  
  var sharing_agreement_ids: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  var status: js.UndefOr[Status | Null] = js.undefined
  
  var subject: js.UndefOr[String | Null] = js.undefined
  
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var `type`: js.UndefOr[TicketType | Null] = js.undefined
  
  var updated_stamp: js.UndefOr[String | Null] = js.undefined
}
object UpdateModel {
  
  @scala.inline
  def apply(): UpdateModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModel]
  }
  
  @scala.inline
  implicit class UpdateModelMutableBuilder[Self <: UpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditional_collaborators(value: js.Array[js.Any]): Self = StObject.set(x, "additional_collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditional_collaboratorsNull: Self = StObject.set(x, "additional_collaborators", null)
    
    @scala.inline
    def setAdditional_collaboratorsUndefined: Self = StObject.set(x, "additional_collaborators", js.undefined)
    
    @scala.inline
    def setAdditional_collaboratorsVarargs(value: js.Any*): Self = StObject.set(x, "additional_collaborators", js.Array(value :_*))
    
    @scala.inline
    def setAssignee_email(value: String): Self = StObject.set(x, "assignee_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee_emailNull: Self = StObject.set(x, "assignee_email", null)
    
    @scala.inline
    def setAssignee_emailUndefined: Self = StObject.set(x, "assignee_email", js.undefined)
    
    @scala.inline
    def setAssignee_id(value: ZendeskID): Self = StObject.set(x, "assignee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee_idNull: Self = StObject.set(x, "assignee_id", null)
    
    @scala.inline
    def setAssignee_idUndefined: Self = StObject.set(x, "assignee_id", js.undefined)
    
    @scala.inline
    def setAttribute_value_ids(value: js.Array[Double]): Self = StObject.set(x, "attribute_value_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute_value_idsNull: Self = StObject.set(x, "attribute_value_ids", null)
    
    @scala.inline
    def setAttribute_value_idsUndefined: Self = StObject.set(x, "attribute_value_ids", js.undefined)
    
    @scala.inline
    def setAttribute_value_idsVarargs(value: Double*): Self = StObject.set(x, "attribute_value_ids", js.Array(value :_*))
    
    @scala.inline
    def setCollaborator_ids(value: js.Array[Double]): Self = StObject.set(x, "collaborator_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaborator_idsNull: Self = StObject.set(x, "collaborator_ids", null)
    
    @scala.inline
    def setCollaborator_idsUndefined: Self = StObject.set(x, "collaborator_ids", js.undefined)
    
    @scala.inline
    def setCollaborator_idsVarargs(value: Double*): Self = StObject.set(x, "collaborator_ids", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCustom_fields(value: js.Array[Field]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_fieldsNull: Self = StObject.set(x, "custom_fields", null)
    
    @scala.inline
    def setCustom_fieldsUndefined: Self = StObject.set(x, "custom_fields", js.undefined)
    
    @scala.inline
    def setCustom_fieldsVarargs(value: Field*): Self = StObject.set(x, "custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_atNull: Self = StObject.set(x, "due_at", null)
    
    @scala.inline
    def setDue_atUndefined: Self = StObject.set(x, "due_at", js.undefined)
    
    @scala.inline
    def setEmail_ccs(value: js.Array[EmailCC]): Self = StObject.set(x, "email_ccs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_ccsNull: Self = StObject.set(x, "email_ccs", null)
    
    @scala.inline
    def setEmail_ccsUndefined: Self = StObject.set(x, "email_ccs", js.undefined)
    
    @scala.inline
    def setEmail_ccsVarargs(value: EmailCC*): Self = StObject.set(x, "email_ccs", js.Array(value :_*))
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    @scala.inline
    def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    @scala.inline
    def setFollowers(value: js.Array[Follower]): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowersNull: Self = StObject.set(x, "followers", null)
    
    @scala.inline
    def setFollowersUndefined: Self = StObject.set(x, "followers", js.undefined)
    
    @scala.inline
    def setFollowersVarargs(value: Follower*): Self = StObject.set(x, "followers", js.Array(value :_*))
    
    @scala.inline
    def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup_idNull: Self = StObject.set(x, "group_id", null)
    
    @scala.inline
    def setGroup_idUndefined: Self = StObject.set(x, "group_id", js.undefined)
    
    @scala.inline
    def setMacro_ids(value: js.Array[Double]): Self = StObject.set(x, "macro_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacro_idsNull: Self = StObject.set(x, "macro_ids", null)
    
    @scala.inline
    def setMacro_idsUndefined: Self = StObject.set(x, "macro_ids", js.undefined)
    
    @scala.inline
    def setMacro_idsVarargs(value: Double*): Self = StObject.set(x, "macro_ids", js.Array(value :_*))
    
    @scala.inline
    def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_idNull: Self = StObject.set(x, "organization_id", null)
    
    @scala.inline
    def setOrganization_idUndefined: Self = StObject.set(x, "organization_id", js.undefined)
    
    @scala.inline
    def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProblem_id(value: Double): Self = StObject.set(x, "problem_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblem_idNull: Self = StObject.set(x, "problem_id", null)
    
    @scala.inline
    def setProblem_idUndefined: Self = StObject.set(x, "problem_id", js.undefined)
    
    @scala.inline
    def setRequester_id(value: ZendeskID): Self = StObject.set(x, "requester_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequester_idUndefined: Self = StObject.set(x, "requester_id", js.undefined)
    
    @scala.inline
    def setSafe_update(value: Boolean): Self = StObject.set(x, "safe_update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafe_updateUndefined: Self = StObject.set(x, "safe_update", js.undefined)
    
    @scala.inline
    def setSharing_agreement_ids(value: js.Array[Double]): Self = StObject.set(x, "sharing_agreement_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharing_agreement_idsNull: Self = StObject.set(x, "sharing_agreement_ids", null)
    
    @scala.inline
    def setSharing_agreement_idsUndefined: Self = StObject.set(x, "sharing_agreement_ids", js.undefined)
    
    @scala.inline
    def setSharing_agreement_idsVarargs(value: Double*): Self = StObject.set(x, "sharing_agreement_ids", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsNull: Self = StObject.set(x, "tags", null)
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TicketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdated_stamp(value: String): Self = StObject.set(x, "updated_stamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_stampNull: Self = StObject.set(x, "updated_stamp", null)
    
    @scala.inline
    def setUpdated_stampUndefined: Self = StObject.set(x, "updated_stamp", js.undefined)
  }
}
