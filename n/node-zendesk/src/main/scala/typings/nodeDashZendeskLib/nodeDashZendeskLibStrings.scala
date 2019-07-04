package typings
package nodeDashZendeskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashZendeskLibStrings {
  @js.native
  sealed trait Comment
    extends nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.RequestType
  
  @js.native
  sealed trait VoiceComment
    extends nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.RequestType
  
  @js.native
  sealed trait admin
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.Role
  
  @js.native
  sealed trait agent
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.Role
  
  @js.native
  sealed trait agent_forwarding
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.IdentityType
  
  @js.native
  sealed trait api
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.ViaChannel
  
  @js.native
  sealed trait assigned
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.TicketRestriction
  
  @js.native
  sealed trait closed
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status
  
  @js.native
  sealed trait completed
    extends nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.Status
  
  @js.native
  sealed trait deliverable
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.DeliverableState
  
  @js.native
  sealed trait email
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.IdentityType
  
  @js.native
  sealed trait `end-user`
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.Role
  
  @js.native
  sealed trait facebook
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.IdentityType
  
  @js.native
  sealed trait failed
    extends nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.Status
  
  @js.native
  sealed trait google
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.IdentityType
  
  @js.native
  sealed trait groups
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.TicketRestriction
  
  @js.native
  sealed trait high
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority
  
  @js.native
  sealed trait hold
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status
  
  @js.native
  sealed trait incident
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType
  
  @js.native
  sealed trait killed
    extends nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.Status
  
  @js.native
  sealed trait low
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority
  
  @js.native
  sealed trait mobile
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.ViaChannel
  
  @js.native
  sealed trait `new`
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status
  
  @js.native
  sealed trait normal
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority
  
  @js.native
  sealed trait open
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status
  
  @js.native
  sealed trait organization
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.TicketRestriction
  
  @js.native
  sealed trait pending
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status
  
  @js.native
  sealed trait phone_number
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.IdentityType
  
  @js.native
  sealed trait problem
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType
  
  @js.native
  sealed trait question
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType
  
  @js.native
  sealed trait queued
    extends nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.Status
  
  @js.native
  sealed trait requested
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.TicketRestriction
  
  @js.native
  sealed trait rule
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.ViaChannel
  
  @js.native
  sealed trait sdk
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.IdentityType
  
  @js.native
  sealed trait solved
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Status
  
  @js.native
  sealed trait system
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.ViaChannel
  
  @js.native
  sealed trait task
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.TicketType
  
  @js.native
  sealed trait undeliverable
    extends nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs.DeliverableState
  
  @js.native
  sealed trait urgent
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.Priority
  
  @js.native
  sealed trait web
    extends nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.ViaChannel
  
  @js.native
  sealed trait working
    extends nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.Status
  
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
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
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
  def task: task = "task".asInstanceOf[task]
  @scala.inline
  def undeliverable: undeliverable = "undeliverable".asInstanceOf[undeliverable]
  @scala.inline
  def urgent: urgent = "urgent".asInstanceOf[urgent]
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  @scala.inline
  def working: working = "working".asInstanceOf[working]
}

