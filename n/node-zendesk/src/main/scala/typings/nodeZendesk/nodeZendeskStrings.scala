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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeZendeskStrings {
  
  @js.native
  sealed trait Comment
    extends StObject
       with RequestType
  inline def Comment: Comment = "Comment".asInstanceOf[Comment]
  
  @js.native
  sealed trait VoiceComment
    extends StObject
       with RequestType
  inline def VoiceComment: VoiceComment = "VoiceComment".asInstanceOf[VoiceComment]
  
  @js.native
  sealed trait admin
    extends StObject
       with Role
  inline def admin: admin = "admin".asInstanceOf[admin]
  
  @js.native
  sealed trait agent
    extends StObject
       with Role
  inline def agent: agent = "agent".asInstanceOf[agent]
  
  @js.native
  sealed trait agent_forwarding
    extends StObject
       with IdentityType
  inline def agent_forwarding: agent_forwarding = "agent_forwarding".asInstanceOf[agent_forwarding]
  
  @js.native
  sealed trait api
    extends StObject
       with ViaChannel
  inline def api: api = "api".asInstanceOf[api]
  
  @js.native
  sealed trait assigned
    extends StObject
       with TicketRestriction
  inline def assigned: assigned = "assigned".asInstanceOf[assigned]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with UserFieldType
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait closed
    extends StObject
       with Status
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait completed
    extends StObject
       with typings.nodeZendesk.mod.JobStatuses.Status
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait date
    extends StObject
       with UserFieldType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait decimal
    extends StObject
       with UserFieldType
  inline def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait deliverable
    extends StObject
       with DeliverableState
  inline def deliverable: deliverable = "deliverable".asInstanceOf[deliverable]
  
  @js.native
  sealed trait email
    extends StObject
       with IdentityType
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait `end-user`
    extends StObject
       with Role
  inline def `end-user`: `end-user` = "end-user".asInstanceOf[`end-user`]
  
  @js.native
  sealed trait facebook
    extends StObject
       with IdentityType
  inline def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait failed
    extends StObject
       with typings.nodeZendesk.mod.JobStatuses.Status
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait google
    extends StObject
       with IdentityType
  inline def google: google = "google".asInstanceOf[google]
  
  @js.native
  sealed trait groups
    extends StObject
       with TicketRestriction
  inline def groups: groups = "groups".asInstanceOf[groups]
  
  @js.native
  sealed trait high
    extends StObject
       with Priority
  inline def high: high = "high".asInstanceOf[high]
  
  @js.native
  sealed trait hold
    extends StObject
       with Status
  inline def hold: hold = "hold".asInstanceOf[hold]
  
  @js.native
  sealed trait incident
    extends StObject
       with TicketType
  inline def incident: incident = "incident".asInstanceOf[incident]
  
  @js.native
  sealed trait integer
    extends StObject
       with UserFieldType
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait killed
    extends StObject
       with typings.nodeZendesk.mod.JobStatuses.Status
  inline def killed: killed = "killed".asInstanceOf[killed]
  
  @js.native
  sealed trait low
    extends StObject
       with Priority
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait mobile
    extends StObject
       with ViaChannel
  inline def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @js.native
  sealed trait `new`
    extends StObject
       with Status
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait normal
    extends StObject
       with Priority
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait open
    extends StObject
       with Status
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait organization
    extends StObject
       with TicketRestriction
  inline def organization: organization = "organization".asInstanceOf[organization]
  
  @js.native
  sealed trait pending
    extends StObject
       with Status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait phone_number
    extends StObject
       with IdentityType
  inline def phone_number: phone_number = "phone_number".asInstanceOf[phone_number]
  
  @js.native
  sealed trait problem
    extends StObject
       with TicketType
  inline def problem: problem = "problem".asInstanceOf[problem]
  
  @js.native
  sealed trait question
    extends StObject
       with TicketType
  inline def question: question = "question".asInstanceOf[question]
  
  @js.native
  sealed trait queued
    extends StObject
       with typings.nodeZendesk.mod.JobStatuses.Status
  inline def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait regexp
    extends StObject
       with UserFieldType
  inline def regexp: regexp = "regexp".asInstanceOf[regexp]
  
  @js.native
  sealed trait requested
    extends StObject
       with TicketRestriction
  inline def requested: requested = "requested".asInstanceOf[requested]
  
  @js.native
  sealed trait rule
    extends StObject
       with ViaChannel
  inline def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait sdk
    extends StObject
       with IdentityType
  inline def sdk: sdk = "sdk".asInstanceOf[sdk]
  
  @js.native
  sealed trait solved
    extends StObject
       with Status
  inline def solved: solved = "solved".asInstanceOf[solved]
  
  @js.native
  sealed trait system
    extends StObject
       with ViaChannel
  inline def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait tagger
    extends StObject
       with UserFieldType
  inline def tagger: tagger = "tagger".asInstanceOf[tagger]
  
  @js.native
  sealed trait task
    extends StObject
       with TicketType
  inline def task: task = "task".asInstanceOf[task]
  
  @js.native
  sealed trait text
    extends StObject
       with UserFieldType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textarea
    extends StObject
       with UserFieldType
  inline def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait undeliverable
    extends StObject
       with DeliverableState
  inline def undeliverable: undeliverable = "undeliverable".asInstanceOf[undeliverable]
  
  @js.native
  sealed trait urgent
    extends StObject
       with Priority
  inline def urgent: urgent = "urgent".asInstanceOf[urgent]
  
  @js.native
  sealed trait web
    extends StObject
       with ViaChannel
  inline def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait working
    extends StObject
       with typings.nodeZendesk.mod.JobStatuses.Status
  inline def working: working = "working".asInstanceOf[working]
}
