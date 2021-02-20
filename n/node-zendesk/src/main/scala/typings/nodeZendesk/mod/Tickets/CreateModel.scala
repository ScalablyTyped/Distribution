package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#create-ticket|Zendesk Tickets Create}
  */
@js.native
trait CreateModel extends StObject {
  
  var assignee_id: js.UndefOr[ZendeskID | Null] = js.native
  
  var brand_id: js.UndefOr[Double | Null] = js.native
  
  var collaborator_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var collaborators: js.UndefOr[js.Array[_] | Null] = js.native
  
  var comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel = js.native
  
  var custom_fields: js.UndefOr[js.Array[Field] | Null] = js.native
  
  var due_at: js.UndefOr[String | Null] = js.native
  
  var email_cc_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var external_id: js.UndefOr[String | Null] = js.native
  
  var fields: js.UndefOr[js.Array[Field] | Null] = js.native
  
  var follower_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var forum_topic_id: js.UndefOr[Double | Null] = js.native
  
  var group_id: js.UndefOr[Double | Null] = js.native
  
  var macro_ids: js.UndefOr[js.Array[Double] | Null] = js.native
  
  var organization_id: js.UndefOr[Double | Null] = js.native
  
  var priority: js.UndefOr[Priority | Null] = js.native
  
  var problem_id: js.UndefOr[Double | Null] = js.native
  
  var raw_subject: js.UndefOr[String | Null] = js.native
  
  var recipient: js.UndefOr[String | Null] = js.native
  
  var requester_id: js.UndefOr[ZendeskID] = js.native
  
  var status: js.UndefOr[Status | Null] = js.native
  
  var subject: js.UndefOr[String | Null] = js.native
  
  var submitter_id: js.UndefOr[ZendeskID | Null] = js.native
  
  var tags: js.UndefOr[js.Array[String] | Null] = js.native
  
  var ticket_form_id: js.UndefOr[Double | Null] = js.native
  
  var `type`: js.UndefOr[TicketType | Null] = js.native
  
  var via_followup_source_id: js.UndefOr[Double | Null] = js.native
}
object CreateModel {
  
  @scala.inline
  def apply(comment: typings.nodeZendesk.mod.Requests.Comments.CreateModel): CreateModel = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModel]
  }
  
  @scala.inline
  implicit class CreateModelMutableBuilder[Self <: CreateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignee_id(value: ZendeskID): Self = StObject.set(x, "assignee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee_idNull: Self = StObject.set(x, "assignee_id", null)
    
    @scala.inline
    def setAssignee_idUndefined: Self = StObject.set(x, "assignee_id", js.undefined)
    
    @scala.inline
    def setBrand_id(value: Double): Self = StObject.set(x, "brand_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand_idNull: Self = StObject.set(x, "brand_id", null)
    
    @scala.inline
    def setBrand_idUndefined: Self = StObject.set(x, "brand_id", js.undefined)
    
    @scala.inline
    def setCollaborator_ids(value: js.Array[Double]): Self = StObject.set(x, "collaborator_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaborator_idsNull: Self = StObject.set(x, "collaborator_ids", null)
    
    @scala.inline
    def setCollaborator_idsUndefined: Self = StObject.set(x, "collaborator_ids", js.undefined)
    
    @scala.inline
    def setCollaborator_idsVarargs(value: Double*): Self = StObject.set(x, "collaborator_ids", js.Array(value :_*))
    
    @scala.inline
    def setCollaborators(value: js.Array[_]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaboratorsNull: Self = StObject.set(x, "collaborators", null)
    
    @scala.inline
    def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
    
    @scala.inline
    def setCollaboratorsVarargs(value: js.Any*): Self = StObject.set(x, "collaborators", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
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
    def setEmail_cc_ids(value: js.Array[Double]): Self = StObject.set(x, "email_cc_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_cc_idsNull: Self = StObject.set(x, "email_cc_ids", null)
    
    @scala.inline
    def setEmail_cc_idsUndefined: Self = StObject.set(x, "email_cc_ids", js.undefined)
    
    @scala.inline
    def setEmail_cc_idsVarargs(value: Double*): Self = StObject.set(x, "email_cc_ids", js.Array(value :_*))
    
    @scala.inline
    def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    @scala.inline
    def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFollower_ids(value: js.Array[Double]): Self = StObject.set(x, "follower_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollower_idsNull: Self = StObject.set(x, "follower_ids", null)
    
    @scala.inline
    def setFollower_idsUndefined: Self = StObject.set(x, "follower_ids", js.undefined)
    
    @scala.inline
    def setFollower_idsVarargs(value: Double*): Self = StObject.set(x, "follower_ids", js.Array(value :_*))
    
    @scala.inline
    def setForum_topic_id(value: Double): Self = StObject.set(x, "forum_topic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForum_topic_idNull: Self = StObject.set(x, "forum_topic_id", null)
    
    @scala.inline
    def setForum_topic_idUndefined: Self = StObject.set(x, "forum_topic_id", js.undefined)
    
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
    def setRaw_subject(value: String): Self = StObject.set(x, "raw_subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_subjectNull: Self = StObject.set(x, "raw_subject", null)
    
    @scala.inline
    def setRaw_subjectUndefined: Self = StObject.set(x, "raw_subject", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNull: Self = StObject.set(x, "recipient", null)
    
    @scala.inline
    def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    @scala.inline
    def setRequester_id(value: ZendeskID): Self = StObject.set(x, "requester_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequester_idUndefined: Self = StObject.set(x, "requester_id", js.undefined)
    
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
    def setSubmitter_id(value: ZendeskID): Self = StObject.set(x, "submitter_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitter_idNull: Self = StObject.set(x, "submitter_id", null)
    
    @scala.inline
    def setSubmitter_idUndefined: Self = StObject.set(x, "submitter_id", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsNull: Self = StObject.set(x, "tags", null)
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTicket_form_id(value: Double): Self = StObject.set(x, "ticket_form_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicket_form_idNull: Self = StObject.set(x, "ticket_form_id", null)
    
    @scala.inline
    def setTicket_form_idUndefined: Self = StObject.set(x, "ticket_form_id", js.undefined)
    
    @scala.inline
    def setType(value: TicketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVia_followup_source_id(value: Double): Self = StObject.set(x, "via_followup_source_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia_followup_source_idNull: Self = StObject.set(x, "via_followup_source_id", null)
    
    @scala.inline
    def setVia_followup_source_idUndefined: Self = StObject.set(x, "via_followup_source_id", js.undefined)
  }
}
