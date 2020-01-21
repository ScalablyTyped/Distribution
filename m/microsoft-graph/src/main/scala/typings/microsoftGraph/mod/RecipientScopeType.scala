package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.internal
  - typings.microsoftGraph.microsoftGraphStrings.external
  - typings.microsoftGraph.microsoftGraphStrings.externalPartner
  - typings.microsoftGraph.microsoftGraphStrings.externalNonPartner
*/
trait RecipientScopeType extends js.Object

object RecipientScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typings.microsoftGraph.microsoftGraphStrings.external = this.cast("external")
  @scala.inline
  def externalNonPartner: typings.microsoftGraph.microsoftGraphStrings.externalNonPartner = this.cast("externalNonPartner")
  @scala.inline
  def externalPartner: typings.microsoftGraph.microsoftGraphStrings.externalPartner = this.cast("externalPartner")
  @scala.inline
  def internal: typings.microsoftGraph.microsoftGraphStrings.internal = this.cast("internal")
  @scala.inline
  def none: none_ = this.cast("none")
}

