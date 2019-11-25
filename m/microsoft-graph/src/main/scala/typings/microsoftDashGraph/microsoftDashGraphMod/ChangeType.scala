package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.created
  - typings.microsoftDashGraph.microsoftDashGraphStrings.updated
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deleted
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typings.microsoftDashGraph.microsoftDashGraphStrings.created = this.cast("created")
  @scala.inline
  def deleted: typings.microsoftDashGraph.microsoftDashGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def updated: typings.microsoftDashGraph.microsoftDashGraphStrings.updated = this.cast("updated")
}

