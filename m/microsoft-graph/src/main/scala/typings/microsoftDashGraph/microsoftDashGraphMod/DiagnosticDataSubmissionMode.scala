package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.basic
  - typings.microsoftDashGraph.microsoftDashGraphStrings.enhanced
  - typings.microsoftDashGraph.microsoftDashGraphStrings.full
*/
trait DiagnosticDataSubmissionMode extends js.Object

object DiagnosticDataSubmissionMode {
  @scala.inline
  def basic: typings.microsoftDashGraph.microsoftDashGraphStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enhanced: typings.microsoftDashGraph.microsoftDashGraphStrings.enhanced = this.cast("enhanced")
  @scala.inline
  def full: typings.microsoftDashGraph.microsoftDashGraphStrings.full = this.cast("full")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

