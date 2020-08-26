package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://developer.zendesk.com/rest_api/docs/support/tickets#create-ticket|Zendesk Tickets Create}
  */
@js.native
trait CreateModel extends js.Object {
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
  implicit class CreateModelOps[Self <: CreateModel] (val x: Self) extends AnyVal {
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
    def setComment(value: typings.nodeZendesk.mod.Requests.Comments.CreateModel): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignee_id(value: ZendeskID): Self = this.set("assignee_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignee_id: Self = this.set("assignee_id", js.undefined)
    @scala.inline
    def setAssignee_idNull: Self = this.set("assignee_id", null)
    @scala.inline
    def setBrand_id(value: Double): Self = this.set("brand_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand_id: Self = this.set("brand_id", js.undefined)
    @scala.inline
    def setBrand_idNull: Self = this.set("brand_id", null)
    @scala.inline
    def setCollaborator_idsVarargs(value: Double*): Self = this.set("collaborator_ids", js.Array(value :_*))
    @scala.inline
    def setCollaborator_ids(value: js.Array[Double]): Self = this.set("collaborator_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollaborator_ids: Self = this.set("collaborator_ids", js.undefined)
    @scala.inline
    def setCollaborator_idsNull: Self = this.set("collaborator_ids", null)
    @scala.inline
    def setCollaboratorsVarargs(value: js.Any*): Self = this.set("collaborators", js.Array(value :_*))
    @scala.inline
    def setCollaborators(value: js.Array[_]): Self = this.set("collaborators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollaborators: Self = this.set("collaborators", js.undefined)
    @scala.inline
    def setCollaboratorsNull: Self = this.set("collaborators", null)
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
    def setEmail_cc_idsVarargs(value: Double*): Self = this.set("email_cc_ids", js.Array(value :_*))
    @scala.inline
    def setEmail_cc_ids(value: js.Array[Double]): Self = this.set("email_cc_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail_cc_ids: Self = this.set("email_cc_ids", js.undefined)
    @scala.inline
    def setEmail_cc_idsNull: Self = this.set("email_cc_ids", null)
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    @scala.inline
    def setExternal_idNull: Self = this.set("external_id", null)
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[Field]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
    @scala.inline
    def setFollower_idsVarargs(value: Double*): Self = this.set("follower_ids", js.Array(value :_*))
    @scala.inline
    def setFollower_ids(value: js.Array[Double]): Self = this.set("follower_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollower_ids: Self = this.set("follower_ids", js.undefined)
    @scala.inline
    def setFollower_idsNull: Self = this.set("follower_ids", null)
    @scala.inline
    def setForum_topic_id(value: Double): Self = this.set("forum_topic_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForum_topic_id: Self = this.set("forum_topic_id", js.undefined)
    @scala.inline
    def setForum_topic_idNull: Self = this.set("forum_topic_id", null)
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
    def setRaw_subject(value: String): Self = this.set("raw_subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw_subject: Self = this.set("raw_subject", js.undefined)
    @scala.inline
    def setRaw_subjectNull: Self = this.set("raw_subject", null)
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    @scala.inline
    def setRecipientNull: Self = this.set("recipient", null)
    @scala.inline
    def setRequester_id(value: ZendeskID): Self = this.set("requester_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester_id: Self = this.set("requester_id", js.undefined)
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
    def setSubmitter_id(value: ZendeskID): Self = this.set("submitter_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitter_id: Self = this.set("submitter_id", js.undefined)
    @scala.inline
    def setSubmitter_idNull: Self = this.set("submitter_id", null)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
    @scala.inline
    def setTicket_form_id(value: Double): Self = this.set("ticket_form_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicket_form_id: Self = this.set("ticket_form_id", js.undefined)
    @scala.inline
    def setTicket_form_idNull: Self = this.set("ticket_form_id", null)
    @scala.inline
    def setType(value: TicketType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    @scala.inline
    def setVia_followup_source_id(value: Double): Self = this.set("via_followup_source_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVia_followup_source_id: Self = this.set("via_followup_source_id", js.undefined)
    @scala.inline
    def setVia_followup_source_idNull: Self = this.set("via_followup_source_id", null)
  }
  
}

