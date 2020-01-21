package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.active
  - typings.microsoftGraph.microsoftGraphStrings.updated
  - typings.microsoftGraph.microsoftGraphStrings.deleted
  - typings.microsoftGraph.microsoftGraphStrings.ignored
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def active: typings.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typings.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def ignored: typings.microsoftGraph.microsoftGraphStrings.ignored = this.cast("ignored")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def updated: typings.microsoftGraph.microsoftGraphStrings.updated = this.cast("updated")
}

