package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.noncompliant_
import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.compliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.noncompliant_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.conflict
  - typings.microsoftDashGraph.microsoftDashGraphStrings.error
  - typings.microsoftDashGraph.microsoftDashGraphStrings.inGracePeriod
  - typings.microsoftDashGraph.microsoftDashGraphStrings.configManager
*/
trait ComplianceState extends js.Object

object ComplianceState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typings.microsoftDashGraph.microsoftDashGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def configManager: typings.microsoftDashGraph.microsoftDashGraphStrings.configManager = this.cast("configManager")
  @scala.inline
  def conflict: typings.microsoftDashGraph.microsoftDashGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typings.microsoftDashGraph.microsoftDashGraphStrings.error = this.cast("error")
  @scala.inline
  def inGracePeriod: typings.microsoftDashGraph.microsoftDashGraphStrings.inGracePeriod = this.cast("inGracePeriod")
  @scala.inline
  def noncompliant: noncompliant_ = this.cast("noncompliant")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

