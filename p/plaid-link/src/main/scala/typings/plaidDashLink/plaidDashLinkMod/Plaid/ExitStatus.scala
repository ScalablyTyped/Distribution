package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidDashLink.plaidDashLinkStrings.requires_questions
  - typings.plaidDashLink.plaidDashLinkStrings.requires_selections
  - typings.plaidDashLink.plaidDashLinkStrings.requires_code
  - typings.plaidDashLink.plaidDashLinkStrings.choose_device
  - typings.plaidDashLink.plaidDashLinkStrings.requires_credentials
  - typings.plaidDashLink.plaidDashLinkStrings.institution_not_found
*/
trait ExitStatus extends js.Object

object ExitStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def choose_device: typings.plaidDashLink.plaidDashLinkStrings.choose_device = this.cast("choose_device")
  @scala.inline
  def institution_not_found: typings.plaidDashLink.plaidDashLinkStrings.institution_not_found = this.cast("institution_not_found")
  @scala.inline
  def requires_code: typings.plaidDashLink.plaidDashLinkStrings.requires_code = this.cast("requires_code")
  @scala.inline
  def requires_credentials: typings.plaidDashLink.plaidDashLinkStrings.requires_credentials = this.cast("requires_credentials")
  @scala.inline
  def requires_questions: typings.plaidDashLink.plaidDashLinkStrings.requires_questions = this.cast("requires_questions")
  @scala.inline
  def requires_selections: typings.plaidDashLink.plaidDashLinkStrings.requires_selections = this.cast("requires_selections")
}

