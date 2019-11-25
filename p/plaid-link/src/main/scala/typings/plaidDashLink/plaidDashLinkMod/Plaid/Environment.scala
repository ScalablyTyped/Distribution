package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidDashLink.plaidDashLinkStrings.development
  - typings.plaidDashLink.plaidDashLinkStrings.sandbox
  - typings.plaidDashLink.plaidDashLinkStrings.production
*/
trait Environment extends js.Object

object Environment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def development: typings.plaidDashLink.plaidDashLinkStrings.development = this.cast("development")
  @scala.inline
  def production: typings.plaidDashLink.plaidDashLinkStrings.production = this.cast("production")
  @scala.inline
  def sandbox: typings.plaidDashLink.plaidDashLinkStrings.sandbox = this.cast("sandbox")
}

