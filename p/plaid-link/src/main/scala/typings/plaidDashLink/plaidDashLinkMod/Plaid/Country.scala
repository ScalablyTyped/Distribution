package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidDashLink.plaidDashLinkStrings.US
  - typings.plaidDashLink.plaidDashLinkStrings.CA
  - typings.plaidDashLink.plaidDashLinkStrings.GB
*/
trait Country extends js.Object

object Country {
  @scala.inline
  def CA: typings.plaidDashLink.plaidDashLinkStrings.CA = this.cast("CA")
  @scala.inline
  def GB: typings.plaidDashLink.plaidDashLinkStrings.GB = this.cast("GB")
  @scala.inline
  def US: typings.plaidDashLink.plaidDashLinkStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

