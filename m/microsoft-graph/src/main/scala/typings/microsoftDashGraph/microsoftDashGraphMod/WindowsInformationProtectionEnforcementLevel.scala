package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.noProtection
  - typings.microsoftDashGraph.microsoftDashGraphStrings.encryptAndAuditOnly
  - typings.microsoftDashGraph.microsoftDashGraphStrings.encryptAuditAndPrompt
  - typings.microsoftDashGraph.microsoftDashGraphStrings.encryptAuditAndBlock
*/
trait WindowsInformationProtectionEnforcementLevel extends js.Object

object WindowsInformationProtectionEnforcementLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptAndAuditOnly: typings.microsoftDashGraph.microsoftDashGraphStrings.encryptAndAuditOnly = this.cast("encryptAndAuditOnly")
  @scala.inline
  def encryptAuditAndBlock: typings.microsoftDashGraph.microsoftDashGraphStrings.encryptAuditAndBlock = this.cast("encryptAuditAndBlock")
  @scala.inline
  def encryptAuditAndPrompt: typings.microsoftDashGraph.microsoftDashGraphStrings.encryptAuditAndPrompt = this.cast("encryptAuditAndPrompt")
  @scala.inline
  def noProtection: typings.microsoftDashGraph.microsoftDashGraphStrings.noProtection = this.cast("noProtection")
}

