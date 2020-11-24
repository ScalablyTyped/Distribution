package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#json-format|Zendesk Tickets JSON Format}
  */
@js.native
trait ResponseModel extends AuditableModel {
  
  val allow_attachments: Boolean = js.native
  
   // Enterprise version only
  val allow_channelback: Boolean = js.native
  
  val assignee_id: ZendeskID | Null = js.native
  
   // Enterprise version only
  val brand_id: js.UndefOr[Double | Null] = js.native
  
  val collaborator_ids: js.Array[Double] = js.native
  
  val comment_count: js.UndefOr[Double] = js.native
  
  val custom_fields: js.Array[Field] = js.native
  
  val description: String = js.native
  
  val due_at: String | Null = js.native
  
  val email_cc_ids: js.Array[Double] = js.native
  
  val external_id: String | Null = js.native
  
  val fields: js.Array[Field] = js.native
  
  val follower_ids: js.Array[Double] = js.native
  
  val followup_ids: js.Array[Double] = js.native
  
  val forum_topic_id: Double | Null = js.native
  
  val group_id: Double | Null = js.native
  
  val has_incidents: Boolean = js.native
  
  val is_public: Boolean = js.native
  
  val organization_id: Double = js.native
  
  val priority: Priority | Null = js.native
  
  val problem_id: Double | Null = js.native
  
  val raw_subject: String | Null = js.native
  
  val recipient: String | Null = js.native
  
  val requester_id: ZendeskID = js.native
  
  val satisfaction_rating: js.Object | String | Null = js.native
  
  val sharing_agreement_ids: js.Array[Double] = js.native
  
  val status: Status = js.native
  
  val subject: String | Null = js.native
  
  val submitter_id: ZendeskID = js.native
  
  val tags: js.Array[String] = js.native
  
  val ticket_form_id: js.UndefOr[Double | Null] = js.native
  
  val `type`: TicketType | Null = js.native
  
  val url: String = js.native
  
  val via: Via = js.native
}
object ResponseModel {
  
  @scala.inline
  def apply(
    allow_attachments: Boolean,
    allow_channelback: Boolean,
    collaborator_ids: js.Array[Double],
    created_at: String,
    custom_fields: js.Array[Field],
    description: String,
    email_cc_ids: js.Array[Double],
    fields: js.Array[Field],
    follower_ids: js.Array[Double],
    followup_ids: js.Array[Double],
    has_incidents: Boolean,
    id: ZendeskID,
    is_public: Boolean,
    organization_id: Double,
    requester_id: ZendeskID,
    sharing_agreement_ids: js.Array[Double],
    status: Status,
    submitter_id: ZendeskID,
    tags: js.Array[String],
    url: String,
    via: Via
  ): ResponseModel = {
    val __obj = js.Dynamic.literal(allow_attachments = allow_attachments.asInstanceOf[js.Any], allow_channelback = allow_channelback.asInstanceOf[js.Any], collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], follower_ids = follower_ids.asInstanceOf[js.Any], followup_ids = followup_ids.asInstanceOf[js.Any], has_incidents = has_incidents.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], sharing_agreement_ids = sharing_agreement_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], submitter_id = submitter_id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
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
    def setAllow_attachments(value: Boolean): Self = this.set("allow_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_channelback(value: Boolean): Self = this.set("allow_channelback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollaborator_idsVarargs(value: Double*): Self = this.set("collaborator_ids", js.Array(value :_*))
    
    @scala.inline
    def setCollaborator_ids(value: js.Array[Double]): Self = this.set("collaborator_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_fieldsVarargs(value: Field*): Self = this.set("custom_fields", js.Array(value :_*))
    
    @scala.inline
    def setCustom_fields(value: js.Array[Field]): Self = this.set("custom_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail_cc_idsVarargs(value: Double*): Self = this.set("email_cc_ids", js.Array(value :_*))
    
    @scala.inline
    def setEmail_cc_ids(value: js.Array[Double]): Self = this.set("email_cc_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollower_idsVarargs(value: Double*): Self = this.set("follower_ids", js.Array(value :_*))
    
    @scala.inline
    def setFollower_ids(value: js.Array[Double]): Self = this.set("follower_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowup_idsVarargs(value: Double*): Self = this.set("followup_ids", js.Array(value :_*))
    
    @scala.inline
    def setFollowup_ids(value: js.Array[Double]): Self = this.set("followup_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_incidents(value: Boolean): Self = this.set("has_incidents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_public(value: Boolean): Self = this.set("is_public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_id(value: Double): Self = this.set("organization_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequester_id(value: ZendeskID): Self = this.set("requester_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharing_agreement_idsVarargs(value: Double*): Self = this.set("sharing_agreement_ids", js.Array(value :_*))
    
    @scala.inline
    def setSharing_agreement_ids(value: js.Array[Double]): Self = this.set("sharing_agreement_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitter_id(value: ZendeskID): Self = this.set("submitter_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia(value: Via): Self = this.set("via", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee_id(value: ZendeskID): Self = this.set("assignee_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignee_idNull: Self = this.set("assignee_id", null)
    
    @scala.inline
    def setBrand_id(value: Double): Self = this.set("brand_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand_id: Self = this.set("brand_id", js.undefined)
    
    @scala.inline
    def setBrand_idNull: Self = this.set("brand_id", null)
    
    @scala.inline
    def setComment_count(value: Double): Self = this.set("comment_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment_count: Self = this.set("comment_count", js.undefined)
    
    @scala.inline
    def setDue_at(value: String): Self = this.set("due_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_atNull: Self = this.set("due_at", null)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_idNull: Self = this.set("external_id", null)
    
    @scala.inline
    def setForum_topic_id(value: Double): Self = this.set("forum_topic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForum_topic_idNull: Self = this.set("forum_topic_id", null)
    
    @scala.inline
    def setGroup_id(value: Double): Self = this.set("group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup_idNull: Self = this.set("group_id", null)
    
    @scala.inline
    def setPriority(value: Priority): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = this.set("priority", null)
    
    @scala.inline
    def setProblem_id(value: Double): Self = this.set("problem_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblem_idNull: Self = this.set("problem_id", null)
    
    @scala.inline
    def setRaw_subject(value: String): Self = this.set("raw_subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_subjectNull: Self = this.set("raw_subject", null)
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientNull: Self = this.set("recipient", null)
    
    @scala.inline
    def setSatisfaction_rating(value: js.Object | String): Self = this.set("satisfaction_rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatisfaction_ratingNull: Self = this.set("satisfaction_rating", null)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNull: Self = this.set("subject", null)
    
    @scala.inline
    def setTicket_form_id(value: Double): Self = this.set("ticket_form_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicket_form_id: Self = this.set("ticket_form_id", js.undefined)
    
    @scala.inline
    def setTicket_form_idNull: Self = this.set("ticket_form_id", null)
    
    @scala.inline
    def setType(value: TicketType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
