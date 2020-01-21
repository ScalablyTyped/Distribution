package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidLink.plaidLinkStrings.requires_questions
  - typings.plaidLink.plaidLinkStrings.requires_selections
  - typings.plaidLink.plaidLinkStrings.requires_code
  - typings.plaidLink.plaidLinkStrings.choose_device
  - typings.plaidLink.plaidLinkStrings.requires_credentials
  - typings.plaidLink.plaidLinkStrings.institution_not_found
*/
trait ExitStatus extends js.Object

object ExitStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def choose_device: typings.plaidLink.plaidLinkStrings.choose_device = this.cast("choose_device")
  @scala.inline
  def institution_not_found: typings.plaidLink.plaidLinkStrings.institution_not_found = this.cast("institution_not_found")
  @scala.inline
  def requires_code: typings.plaidLink.plaidLinkStrings.requires_code = this.cast("requires_code")
  @scala.inline
  def requires_credentials: typings.plaidLink.plaidLinkStrings.requires_credentials = this.cast("requires_credentials")
  @scala.inline
  def requires_questions: typings.plaidLink.plaidLinkStrings.requires_questions = this.cast("requires_questions")
  @scala.inline
  def requires_selections: typings.plaidLink.plaidLinkStrings.requires_selections = this.cast("requires_selections")
}

