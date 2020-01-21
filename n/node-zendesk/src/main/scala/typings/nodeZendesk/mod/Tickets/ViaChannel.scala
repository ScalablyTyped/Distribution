package typings.nodeZendesk.mod.Tickets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeZendesk.nodeZendeskStrings.api
  - typings.nodeZendesk.nodeZendeskStrings.web
  - typings.nodeZendesk.nodeZendeskStrings.mobile
  - typings.nodeZendesk.nodeZendeskStrings.rule
  - typings.nodeZendesk.nodeZendeskStrings.system
*/
trait ViaChannel extends js.Object

object ViaChannel {
  @scala.inline
  def api: typings.nodeZendesk.nodeZendeskStrings.api = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mobile: typings.nodeZendesk.nodeZendeskStrings.mobile = this.cast("mobile")
  @scala.inline
  def rule: typings.nodeZendesk.nodeZendeskStrings.rule = this.cast("rule")
  @scala.inline
  def system: typings.nodeZendesk.nodeZendeskStrings.system = this.cast("system")
  @scala.inline
  def web: typings.nodeZendesk.nodeZendeskStrings.web = this.cast("web")
}

