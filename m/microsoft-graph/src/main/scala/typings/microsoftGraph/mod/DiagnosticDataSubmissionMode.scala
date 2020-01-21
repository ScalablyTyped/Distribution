package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.basic
  - typings.microsoftGraph.microsoftGraphStrings.enhanced
  - typings.microsoftGraph.microsoftGraphStrings.full
*/
trait DiagnosticDataSubmissionMode extends js.Object

object DiagnosticDataSubmissionMode {
  @scala.inline
  def basic: typings.microsoftGraph.microsoftGraphStrings.basic = this.cast("basic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enhanced: typings.microsoftGraph.microsoftGraphStrings.enhanced = this.cast("enhanced")
  @scala.inline
  def full: typings.microsoftGraph.microsoftGraphStrings.full = this.cast("full")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

