package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.viewer
  - typings.microsoftGraph.microsoftGraphStrings.sharer
*/
trait ScreenSharingRole extends js.Object

object ScreenSharingRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sharer: typings.microsoftGraph.microsoftGraphStrings.sharer = this.cast("sharer")
  @scala.inline
  def viewer: typings.microsoftGraph.microsoftGraphStrings.viewer = this.cast("viewer")
}

