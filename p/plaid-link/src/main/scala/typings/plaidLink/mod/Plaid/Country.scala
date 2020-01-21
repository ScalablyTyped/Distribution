package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidLink.plaidLinkStrings.US
  - typings.plaidLink.plaidLinkStrings.CA
  - typings.plaidLink.plaidLinkStrings.GB
*/
trait Country extends js.Object

object Country {
  @scala.inline
  def CA: typings.plaidLink.plaidLinkStrings.CA = this.cast("CA")
  @scala.inline
  def GB: typings.plaidLink.plaidLinkStrings.GB = this.cast("GB")
  @scala.inline
  def US: typings.plaidLink.plaidLinkStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

