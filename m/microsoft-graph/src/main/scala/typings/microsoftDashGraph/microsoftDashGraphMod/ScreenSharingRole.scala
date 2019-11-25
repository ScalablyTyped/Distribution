package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.viewer
  - typings.microsoftDashGraph.microsoftDashGraphStrings.sharer
*/
trait ScreenSharingRole extends js.Object

object ScreenSharingRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sharer: typings.microsoftDashGraph.microsoftDashGraphStrings.sharer = this.cast("sharer")
  @scala.inline
  def viewer: typings.microsoftDashGraph.microsoftDashGraphStrings.viewer = this.cast("viewer")
}

