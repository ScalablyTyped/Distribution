package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.notApplicable
  - typings.microsoftGraph.microsoftGraphStrings.compliant
  - typings.microsoftGraph.microsoftGraphStrings.remediated
  - typings.microsoftGraph.microsoftGraphStrings.nonCompliant
  - typings.microsoftGraph.microsoftGraphStrings.error
  - typings.microsoftGraph.microsoftGraphStrings.conflict
  - typings.microsoftGraph.microsoftGraphStrings.notAssigned
*/
trait ComplianceStatus extends js.Object

object ComplianceStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typings.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def conflict: typings.microsoftGraph.microsoftGraphStrings.conflict = this.cast("conflict")
  @scala.inline
  def error: typings.microsoftGraph.microsoftGraphStrings.error = this.cast("error")
  @scala.inline
  def nonCompliant: typings.microsoftGraph.microsoftGraphStrings.nonCompliant = this.cast("nonCompliant")
  @scala.inline
  def notApplicable: typings.microsoftGraph.microsoftGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notAssigned: typings.microsoftGraph.microsoftGraphStrings.notAssigned = this.cast("notAssigned")
  @scala.inline
  def remediated: typings.microsoftGraph.microsoftGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

