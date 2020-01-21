package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidLink.plaidLinkStrings.pending_automatic_verification
  - typings.plaidLink.plaidLinkStrings.pending_manual_verification
  - typings.plaidLink.plaidLinkStrings.manually_verified
*/
trait VerificationStatus extends js.Object

object VerificationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manually_verified: typings.plaidLink.plaidLinkStrings.manually_verified = this.cast("manually_verified")
  @scala.inline
  def pending_automatic_verification: typings.plaidLink.plaidLinkStrings.pending_automatic_verification = this.cast("pending_automatic_verification")
  @scala.inline
  def pending_manual_verification: typings.plaidLink.plaidLinkStrings.pending_manual_verification = this.cast("pending_manual_verification")
}

