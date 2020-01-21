package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plaidLink.plaidLinkStrings.en
  - typings.plaidLink.plaidLinkStrings.fr
  - typings.plaidLink.plaidLinkStrings.es
*/
trait Language extends js.Object

object Language {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def en: typings.plaidLink.plaidLinkStrings.en = this.cast("en")
  @scala.inline
  def es: typings.plaidLink.plaidLinkStrings.es = this.cast("es")
  @scala.inline
  def fr: typings.plaidLink.plaidLinkStrings.fr = this.cast("fr")
}

