package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.active
  - typings.microsoftDashGraph.microsoftDashGraphStrings.updated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deleted
  - typings.microsoftDashGraph.microsoftDashGraphStrings.ignored
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def active: typings.microsoftDashGraph.microsoftDashGraphStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typings.microsoftDashGraph.microsoftDashGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def ignored: typings.microsoftDashGraph.microsoftDashGraphStrings.ignored = this.cast("ignored")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def updated: typings.microsoftDashGraph.microsoftDashGraphStrings.updated = this.cast("updated")
}

