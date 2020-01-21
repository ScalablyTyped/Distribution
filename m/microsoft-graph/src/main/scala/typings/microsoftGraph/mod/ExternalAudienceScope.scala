package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.contactsOnly
  - typings.microsoftGraph.microsoftGraphStrings.all
*/
trait ExternalAudienceScope extends js.Object

object ExternalAudienceScope {
  @scala.inline
  def all: typings.microsoftGraph.microsoftGraphStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contactsOnly: typings.microsoftGraph.microsoftGraphStrings.contactsOnly = this.cast("contactsOnly")
  @scala.inline
  def none: none_ = this.cast("none")
}

