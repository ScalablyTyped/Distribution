package typings.ngTable.filterSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ngTable.ngTableStrings.stack
  - typings.ngTable.ngTableStrings.horizontal
*/
trait FilterLayout extends js.Object

object FilterLayout {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.ngTable.ngTableStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def stack: typings.ngTable.ngTableStrings.stack = this.cast("stack")
}

