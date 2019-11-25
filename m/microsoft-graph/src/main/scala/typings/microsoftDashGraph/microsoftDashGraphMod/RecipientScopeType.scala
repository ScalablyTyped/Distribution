package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.internal
  - typings.microsoftDashGraph.microsoftDashGraphStrings.external
  - typings.microsoftDashGraph.microsoftDashGraphStrings.externalPartner
  - typings.microsoftDashGraph.microsoftDashGraphStrings.externalNonPartner
*/
trait RecipientScopeType extends js.Object

object RecipientScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def external: typings.microsoftDashGraph.microsoftDashGraphStrings.external = this.cast("external")
  @scala.inline
  def externalNonPartner: typings.microsoftDashGraph.microsoftDashGraphStrings.externalNonPartner = this.cast("externalNonPartner")
  @scala.inline
  def externalPartner: typings.microsoftDashGraph.microsoftDashGraphStrings.externalPartner = this.cast("externalPartner")
  @scala.inline
  def internal: typings.microsoftDashGraph.microsoftDashGraphStrings.internal = this.cast("internal")
  @scala.inline
  def none: none_ = this.cast("none")
}

