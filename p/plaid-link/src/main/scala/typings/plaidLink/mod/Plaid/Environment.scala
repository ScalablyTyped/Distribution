package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidLink.plaidLinkStrings.development
  - typings.plaidLink.plaidLinkStrings.sandbox
  - typings.plaidLink.plaidLinkStrings.production
*/
trait Environment extends js.Object

object Environment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typings.plaidLink.plaidLinkStrings.development = this.cast("development")
  @scala.inline
  def production: typings.plaidLink.plaidLinkStrings.production = this.cast("production")
  @scala.inline
  def sandbox: typings.plaidLink.plaidLinkStrings.sandbox = this.cast("sandbox")
}

