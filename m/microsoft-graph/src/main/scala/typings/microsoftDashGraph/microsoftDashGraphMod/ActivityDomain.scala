package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.work
  - typings.microsoftDashGraph.microsoftDashGraphStrings.personal
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unrestricted
*/
trait ActivityDomain extends js.Object

object ActivityDomain {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def personal: typings.microsoftDashGraph.microsoftDashGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unrestricted: typings.microsoftDashGraph.microsoftDashGraphStrings.unrestricted = this.cast("unrestricted")
  @scala.inline
  def work: typings.microsoftDashGraph.microsoftDashGraphStrings.work = this.cast("work")
}

