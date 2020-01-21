package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.noProtection
  - typings.microsoftGraph.microsoftGraphStrings.encryptAndAuditOnly
  - typings.microsoftGraph.microsoftGraphStrings.encryptAuditAndPrompt
  - typings.microsoftGraph.microsoftGraphStrings.encryptAuditAndBlock
*/
trait WindowsInformationProtectionEnforcementLevel extends js.Object

object WindowsInformationProtectionEnforcementLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def encryptAndAuditOnly: typings.microsoftGraph.microsoftGraphStrings.encryptAndAuditOnly = this.cast("encryptAndAuditOnly")
  @scala.inline
  def encryptAuditAndBlock: typings.microsoftGraph.microsoftGraphStrings.encryptAuditAndBlock = this.cast("encryptAuditAndBlock")
  @scala.inline
  def encryptAuditAndPrompt: typings.microsoftGraph.microsoftGraphStrings.encryptAuditAndPrompt = this.cast("encryptAuditAndPrompt")
  @scala.inline
  def noProtection: typings.microsoftGraph.microsoftGraphStrings.noProtection = this.cast("noProtection")
}

