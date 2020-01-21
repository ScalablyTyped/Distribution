package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.noncompliant_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.compliant
  - typings.microsoftGraph.microsoftGraphStrings.noncompliant_
  - typings.microsoftGraph.microsoftGraphStrings.conflict
  - typings.microsoftGraph.microsoftGraphStrings.error
  - typings.microsoftGraph.microsoftGraphStrings.inGracePeriod
  - typings.microsoftGraph.microsoftGraphStrings.configManager
*/
trait ComplianceState extends js.Object

object ComplianceState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typings.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def configManager: typings.microsoftGraph.microsoftGraphStrings.configManager = this.cast("configManager")
  @scala.inline
  def conflict: typings.microsoftGraph.microsoftGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typings.microsoftGraph.microsoftGraphStrings.error = this.cast("error")
  @scala.inline
  def inGracePeriod: typings.microsoftGraph.microsoftGraphStrings.inGracePeriod = this.cast("inGracePeriod")
  @scala.inline
  def noncompliant: noncompliant_ = this.cast("noncompliant")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

