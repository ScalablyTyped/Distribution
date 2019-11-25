package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.contactsOnly
  - typings.microsoftDashGraph.microsoftDashGraphStrings.all
*/
trait ExternalAudienceScope extends js.Object

object ExternalAudienceScope {
  @scala.inline
  def all: typings.microsoftDashGraph.microsoftDashGraphStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contactsOnly: typings.microsoftDashGraph.microsoftDashGraphStrings.contactsOnly = this.cast("contactsOnly")
  @scala.inline
  def none: none_ = this.cast("none")
}

