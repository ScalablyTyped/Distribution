package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notApplicable
  - typings.microsoftDashGraph.microsoftDashGraphStrings.compliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.remediated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.nonCompliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.error
  - typings.microsoftDashGraph.microsoftDashGraphStrings.conflict
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notAssigned
*/
trait ComplianceStatus extends js.Object

object ComplianceStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typings.microsoftDashGraph.microsoftDashGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def conflict: typings.microsoftDashGraph.microsoftDashGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typings.microsoftDashGraph.microsoftDashGraphStrings.error = this.cast("error")
  @scala.inline
  def nonCompliant: typings.microsoftDashGraph.microsoftDashGraphStrings.nonCompliant = this.cast("nonCompliant")
  @scala.inline
  def notApplicable: typings.microsoftDashGraph.microsoftDashGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notAssigned: typings.microsoftDashGraph.microsoftDashGraphStrings.notAssigned = this.cast("notAssigned")
  @scala.inline
  def remediated: typings.microsoftDashGraph.microsoftDashGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

