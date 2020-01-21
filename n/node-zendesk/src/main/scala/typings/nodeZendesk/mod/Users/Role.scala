package typings.nodeZendesk.mod.Users

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.admin
  - typings.nodeZendesk.nodeZendeskStrings.agent
  - typings.nodeZendesk.nodeZendeskStrings.`end-user`
*/
trait Role extends js.Object

object Role {
  @scala.inline
  def admin: typings.nodeZendesk.nodeZendeskStrings.admin = this.cast("admin")
  @scala.inline
  def agent: typings.nodeZendesk.nodeZendeskStrings.agent = this.cast("agent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `end-user`: typings.nodeZendesk.nodeZendeskStrings.`end-user` = this.cast("end-user")
}

