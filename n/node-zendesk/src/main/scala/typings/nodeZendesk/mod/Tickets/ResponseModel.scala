package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.AuditableModel
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#json-format|Zendesk Tickets JSON Format}
  */
trait ResponseModel
  extends StObject
     with AuditableModel {
  
  val allow_attachments: Boolean
  
  // Enterprise version only
  val allow_channelback: Boolean
  
  val assignee_id: ZendeskID | Null
  
  // Enterprise version only
  val brand_id: js.UndefOr[Double | Null] = js.undefined
  
  val collaborator_ids: js.Array[Double]
  
  val comment_count: js.UndefOr[Double] = js.undefined
  
  val custom_fields: js.Array[Field]
  
  val description: String
  
  val due_at: String | Null
  
  val email_cc_ids: js.Array[Double]
  
  val external_id: String | Null
  
  val fields: js.Array[Field]
  
  val follower_ids: js.Array[Double]
  
  val followup_ids: js.Array[Double]
  
  val forum_topic_id: Double | Null
  
  val group_id: Double | Null
  
  val has_incidents: Boolean
  
  val is_public: Boolean
  
  val organization_id: Double
  
  val priority: Priority | Null
  
  val problem_id: Double | Null
  
  val raw_subject: String | Null
  
  val recipient: String | Null
  
  val requester_id: ZendeskID
  
  val satisfaction_rating: js.Object | String | Null
  
  val sharing_agreement_ids: js.Array[Double]
  
  val status: Status
  
  val subject: String | Null
  
  val submitter_id: ZendeskID
  
  val tags: js.Array[String]
  
  val ticket_form_id: js.UndefOr[Double | Null] = js.undefined
  
  val `type`: TicketType | Null
  
  val url: String
  
  val via: Via
}
object ResponseModel {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(allow_attachments = allow_attachments.asInstanceOf[js.Any], allow_channelback = allow_channelback.asInstanceOf[js.Any], collaborator_ids = collaborator_ids.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], custom_fields = custom_fields.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email_cc_ids = email_cc_ids.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], follower_ids = follower_ids.asInstanceOf[js.Any], followup_ids = followup_ids.asInstanceOf[js.Any], has_incidents = has_incidents.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_public = is_public.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], requester_id = requester_id.asInstanceOf[js.Any], sharing_agreement_ids = sharing_agreement_ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], submitter_id = submitter_id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any], assignee_id = null, due_at = null, external_id = null, forum_topic_id = null, group_id = null, priority = null, problem_id = null, raw_subject = null, recipient = null, satisfaction_rating = null, subject = null, updated_at = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[ResponseModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseModel] (val x: Self) extends AnyVal {
    
    inline def setAllow_attachments(value: Boolean): Self = StObject.set(x, "allow_attachments", value.asInstanceOf[js.Any])
    
    inline def setAllow_channelback(value: Boolean): Self = StObject.set(x, "allow_channelback", value.asInstanceOf[js.Any])
    
    inline def setAssignee_id(value: ZendeskID): Self = StObject.set(x, "assignee_id", value.asInstanceOf[js.Any])
    
    inline def setAssignee_idNull: Self = StObject.set(x, "assignee_id", null)
    
    inline def setBrand_id(value: Double): Self = StObject.set(x, "brand_id", value.asInstanceOf[js.Any])
    
    inline def setBrand_idNull: Self = StObject.set(x, "brand_id", null)
    
    inline def setBrand_idUndefined: Self = StObject.set(x, "brand_id", js.undefined)
    
    inline def setCollaborator_ids(value: js.Array[Double]): Self = StObject.set(x, "collaborator_ids", value.asInstanceOf[js.Any])
    
    inline def setCollaborator_idsVarargs(value: Double*): Self = StObject.set(x, "collaborator_ids", js.Array(value*))
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setComment_countUndefined: Self = StObject.set(x, "comment_count", js.undefined)
    
    inline def setCustom_fields(value: js.Array[Field]): Self = StObject.set(x, "custom_fields", value.asInstanceOf[js.Any])
    
    inline def setCustom_fieldsVarargs(value: Field*): Self = StObject.set(x, "custom_fields", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDue_at(value: String): Self = StObject.set(x, "due_at", value.asInstanceOf[js.Any])
    
    inline def setDue_atNull: Self = StObject.set(x, "due_at", null)
    
    inline def setEmail_cc_ids(value: js.Array[Double]): Self = StObject.set(x, "email_cc_ids", value.asInstanceOf[js.Any])
    
    inline def setEmail_cc_idsVarargs(value: Double*): Self = StObject.set(x, "email_cc_ids", js.Array(value*))
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idNull: Self = StObject.set(x, "external_id", null)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFollower_ids(value: js.Array[Double]): Self = StObject.set(x, "follower_ids", value.asInstanceOf[js.Any])
    
    inline def setFollower_idsVarargs(value: Double*): Self = StObject.set(x, "follower_ids", js.Array(value*))
    
    inline def setFollowup_ids(value: js.Array[Double]): Self = StObject.set(x, "followup_ids", value.asInstanceOf[js.Any])
    
    inline def setFollowup_idsVarargs(value: Double*): Self = StObject.set(x, "followup_ids", js.Array(value*))
    
    inline def setForum_topic_id(value: Double): Self = StObject.set(x, "forum_topic_id", value.asInstanceOf[js.Any])
    
    inline def setForum_topic_idNull: Self = StObject.set(x, "forum_topic_id", null)
    
    inline def setGroup_id(value: Double): Self = StObject.set(x, "group_id", value.asInstanceOf[js.Any])
    
    inline def setGroup_idNull: Self = StObject.set(x, "group_id", null)
    
    inline def setHas_incidents(value: Boolean): Self = StObject.set(x, "has_incidents", value.asInstanceOf[js.Any])
    
    inline def setIs_public(value: Boolean): Self = StObject.set(x, "is_public", value.asInstanceOf[js.Any])
    
    inline def setOrganization_id(value: Double): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setProblem_id(value: Double): Self = StObject.set(x, "problem_id", value.asInstanceOf[js.Any])
    
    inline def setProblem_idNull: Self = StObject.set(x, "problem_id", null)
    
    inline def setRaw_subject(value: String): Self = StObject.set(x, "raw_subject", value.asInstanceOf[js.Any])
    
    inline def setRaw_subjectNull: Self = StObject.set(x, "raw_subject", null)
    
    inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientNull: Self = StObject.set(x, "recipient", null)
    
    inline def setRequester_id(value: ZendeskID): Self = StObject.set(x, "requester_id", value.asInstanceOf[js.Any])
    
    inline def setSatisfaction_rating(value: js.Object | String): Self = StObject.set(x, "satisfaction_rating", value.asInstanceOf[js.Any])
    
    inline def setSatisfaction_ratingNull: Self = StObject.set(x, "satisfaction_rating", null)
    
    inline def setSharing_agreement_ids(value: js.Array[Double]): Self = StObject.set(x, "sharing_agreement_ids", value.asInstanceOf[js.Any])
    
    inline def setSharing_agreement_idsVarargs(value: Double*): Self = StObject.set(x, "sharing_agreement_ids", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubmitter_id(value: ZendeskID): Self = StObject.set(x, "submitter_id", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTicket_form_id(value: Double): Self = StObject.set(x, "ticket_form_id", value.asInstanceOf[js.Any])
    
    inline def setTicket_form_idNull: Self = StObject.set(x, "ticket_form_id", null)
    
    inline def setTicket_form_idUndefined: Self = StObject.set(x, "ticket_form_id", js.undefined)
    
    inline def setType(value: TicketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVia(value: Via): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
  }
}
