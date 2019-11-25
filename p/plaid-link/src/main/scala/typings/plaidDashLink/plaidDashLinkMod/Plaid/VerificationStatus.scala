package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidDashLink.plaidDashLinkStrings.pending_automatic_verification
  - typings.plaidDashLink.plaidDashLinkStrings.pending_manual_verification
  - typings.plaidDashLink.plaidDashLinkStrings.manually_verified
*/
trait VerificationStatus extends js.Object

object VerificationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manually_verified: typings.plaidDashLink.plaidDashLinkStrings.manually_verified = this.cast("manually_verified")
  @scala.inline
  def pending_automatic_verification: typings.plaidDashLink.plaidDashLinkStrings.pending_automatic_verification = this.cast("pending_automatic_verification")
  @scala.inline
  def pending_manual_verification: typings.plaidDashLink.plaidDashLinkStrings.pending_manual_verification = this.cast("pending_manual_verification")
}

