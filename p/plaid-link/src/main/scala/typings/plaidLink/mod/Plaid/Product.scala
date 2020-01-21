package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidLink.plaidLinkStrings.transactions
  - typings.plaidLink.plaidLinkStrings.auth
  - typings.plaidLink.plaidLinkStrings.identity
  - typings.plaidLink.plaidLinkStrings.income
  - typings.plaidLink.plaidLinkStrings.assets
  - typings.plaidLink.plaidLinkStrings.investments
  - typings.plaidLink.plaidLinkStrings.liabilities
*/
trait Product extends js.Object

object Product {
  @scala.inline
  def assets: typings.plaidLink.plaidLinkStrings.assets = this.cast("assets")
  @scala.inline
  def auth: typings.plaidLink.plaidLinkStrings.auth = this.cast("auth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def identity: typings.plaidLink.plaidLinkStrings.identity = this.cast("identity")
  @scala.inline
  def income: typings.plaidLink.plaidLinkStrings.income = this.cast("income")
  @scala.inline
  def investments: typings.plaidLink.plaidLinkStrings.investments = this.cast("investments")
  @scala.inline
  def liabilities: typings.plaidLink.plaidLinkStrings.liabilities = this.cast("liabilities")
  @scala.inline
  def transactions: typings.plaidLink.plaidLinkStrings.transactions = this.cast("transactions")
}

