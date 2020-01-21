package typings.nodeZendesk.mod.Users.Identities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.agent_forwarding
  - typings.nodeZendesk.nodeZendeskStrings.email
  - typings.nodeZendesk.nodeZendeskStrings.facebook
  - typings.nodeZendesk.nodeZendeskStrings.google
  - typings.nodeZendesk.nodeZendeskStrings.phone_number
  - typings.nodeZendesk.nodeZendeskStrings.sdk
*/
trait IdentityType extends js.Object

object IdentityType {
  @scala.inline
  def agent_forwarding: typings.nodeZendesk.nodeZendeskStrings.agent_forwarding = this.cast("agent_forwarding")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typings.nodeZendesk.nodeZendeskStrings.email = this.cast("email")
  @scala.inline
  def facebook: typings.nodeZendesk.nodeZendeskStrings.facebook = this.cast("facebook")
  @scala.inline
  def google: typings.nodeZendesk.nodeZendeskStrings.google = this.cast("google")
  @scala.inline
  def phone_number: typings.nodeZendesk.nodeZendeskStrings.phone_number = this.cast("phone_number")
  @scala.inline
  def sdk: typings.nodeZendesk.nodeZendeskStrings.sdk = this.cast("sdk")
}

