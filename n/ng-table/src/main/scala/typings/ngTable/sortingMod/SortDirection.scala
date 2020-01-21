package typings.ngTable.sortingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ngTable.ngTableStrings.asc
  - typings.ngTable.ngTableStrings.desc
*/
trait SortDirection extends js.Object

object SortDirection {
  @scala.inline
  def asc: typings.ngTable.ngTableStrings.asc = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typings.ngTable.ngTableStrings.desc = this.cast("desc")
}

