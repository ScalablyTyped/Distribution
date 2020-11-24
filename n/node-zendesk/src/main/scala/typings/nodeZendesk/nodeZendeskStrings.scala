package typings.nodeZendesk

import typings.nodeZendesk.mod.Requests.Comments.RequestType
import typings.nodeZendesk.mod.Tickets.Priority
import typings.nodeZendesk.mod.Tickets.Status
import typings.nodeZendesk.mod.Tickets.TicketType
import typings.nodeZendesk.mod.Tickets.ViaChannel
import typings.nodeZendesk.mod.Users.Fields.UserFieldType
import typings.nodeZendesk.mod.Users.Identities.DeliverableState
import typings.nodeZendesk.mod.Users.Identities.IdentityType
import typings.nodeZendesk.mod.Users.Role
import typings.nodeZendesk.mod.Users.TicketRestriction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeZendeskStrings {
  
  @scala.inline
  def Comment: Comment = "Comment".asInstanceOf[Comment]
  
  @scala.inline
  def VoiceComment: VoiceComment = "VoiceComment".asInstanceOf[VoiceComment]
  
  @scala.inline
  def admin: admin = "admin".asInstanceOf[admin]
  
  @scala.inline
  def agent: agent = "agent".asInstanceOf[agent]
  
  @scala.inline
  def agent_forwarding: agent_forwarding = "agent_forwarding".asInstanceOf[agent_forwarding]
  
  @scala.inline
  def api: api = "api".asInstanceOf[api]
  
  @scala.inline
  def assigned: assigned = "assigned".asInstanceOf[assigned]
  
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @scala.inline
  def deliverable: deliverable = "deliverable".asInstanceOf[deliverable]
  
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @scala.inline
  def `end-user`: `end-user` = "end-user".asInstanceOf[`end-user`]
  
  @scala.inline
  def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @scala.inline
  def google: google = "google".asInstanceOf[google]
  
  @scala.inline
  def groups: groups = "groups".asInstanceOf[groups]
  
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @scala.inline
  def hold: hold = "hold".asInstanceOf[hold]
  
  @scala.inline
  def incident: incident = "incident".asInstanceOf[incident]
  
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @scala.inline
  def killed: killed = "killed".asInstanceOf[killed]
  
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @scala.inline
  def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @scala.inline
  def organization: organization = "organization".asInstanceOf[organization]
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @scala.inline
  def phone_number: phone_number = "phone_number".asInstanceOf[phone_number]
  
  @scala.inline
  def problem: problem = "problem".asInstanceOf[problem]
  
  @scala.inline
  def question: question = "question".asInstanceOf[question]
  
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  
  @scala.inline
  def regexp: regexp = "regexp".asInstanceOf[regexp]
  
  @scala.inline
  def requested: requested = "requested".asInstanceOf[requested]
  
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @scala.inline
  def sdk: sdk = "sdk".asInstanceOf[sdk]
  
  @scala.inline
  def solved: solved = "solved".asInstanceOf[solved]
  
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  
  @scala.inline
  def tagger: tagger = "tagger".asInstanceOf[tagger]
  
  @scala.inline
  def task: task = "task".asInstanceOf[task]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @scala.inline
  def undeliverable: undeliverable = "undeliverable".asInstanceOf[undeliverable]
  
  @scala.inline
  def urgent: urgent = "urgent".asInstanceOf[urgent]
  
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  
  @scala.inline
  def working: working = "working".asInstanceOf[working]
  
  @js.native
  sealed trait Comment extends RequestType
  
  @js.native
  sealed trait VoiceComment extends RequestType
  
  @js.native
  sealed trait admin extends Role
  
  @js.native
  sealed trait agent extends Role
  
  @js.native
  sealed trait agent_forwarding extends IdentityType
  
  @js.native
  sealed trait api extends ViaChannel
  
  @js.native
  sealed trait assigned extends TicketRestriction
  
  @js.native
  sealed trait checkbox extends UserFieldType
  
  @js.native
  sealed trait closed extends Status
  
  @js.native
  sealed trait completed
    extends typings.nodeZendesk.mod.JobStatuses.Status
  
  @js.native
  sealed trait date extends UserFieldType
  
  @js.native
  sealed trait decimal extends UserFieldType
  
  @js.native
  sealed trait deliverable extends DeliverableState
  
  @js.native
  sealed trait email extends IdentityType
  
  @js.native
  sealed trait `end-user` extends Role
  
  @js.native
  sealed trait facebook extends IdentityType
  
  @js.native
  sealed trait failed
    extends typings.nodeZendesk.mod.JobStatuses.Status
  
  @js.native
  sealed trait google extends IdentityType
  
  @js.native
  sealed trait groups extends TicketRestriction
  
  @js.native
  sealed trait high extends Priority
  
  @js.native
  sealed trait hold extends Status
  
  @js.native
  sealed trait incident extends TicketType
  
  @js.native
  sealed trait integer extends UserFieldType
  
  @js.native
  sealed trait killed
    extends typings.nodeZendesk.mod.JobStatuses.Status
  
  @js.native
  sealed trait low extends Priority
  
  @js.native
  sealed trait mobile extends ViaChannel
  
  @js.native
  sealed trait `new` extends Status
  
  @js.native
  sealed trait normal extends Priority
  
  @js.native
  sealed trait open extends Status
  
  @js.native
  sealed trait organization extends TicketRestriction
  
  @js.native
  sealed trait pending extends Status
  
  @js.native
  sealed trait phone_number extends IdentityType
  
  @js.native
  sealed trait problem extends TicketType
  
  @js.native
  sealed trait question extends TicketType
  
  @js.native
  sealed trait queued
    extends typings.nodeZendesk.mod.JobStatuses.Status
  
  @js.native
  sealed trait regexp extends UserFieldType
  
  @js.native
  sealed trait requested extends TicketRestriction
  
  @js.native
  sealed trait rule extends ViaChannel
  
  @js.native
  sealed trait sdk extends IdentityType
  
  @js.native
  sealed trait solved extends Status
  
  @js.native
  sealed trait system extends ViaChannel
  
  @js.native
  sealed trait tagger extends UserFieldType
  
  @js.native
  sealed trait task extends TicketType
  
  @js.native
  sealed trait text extends UserFieldType
  
  @js.native
  sealed trait textarea extends UserFieldType
  
  @js.native
  sealed trait undeliverable extends DeliverableState
  
  @js.native
  sealed trait urgent extends Priority
  
  @js.native
  sealed trait web extends ViaChannel
  
  @js.native
  sealed trait working
    extends typings.nodeZendesk.mod.JobStatuses.Status
}
