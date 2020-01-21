package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.created
  - typings.microsoftGraph.microsoftGraphStrings.updated
  - typings.microsoftGraph.microsoftGraphStrings.deleted
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typings.microsoftGraph.microsoftGraphStrings.created = this.cast("created")
  @scala.inline
  def deleted: typings.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def updated: typings.microsoftGraph.microsoftGraphStrings.updated = this.cast("updated")
}

