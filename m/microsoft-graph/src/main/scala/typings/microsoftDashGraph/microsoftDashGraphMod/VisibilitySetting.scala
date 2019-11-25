package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notConfigured
  - typings.microsoftDashGraph.microsoftDashGraphStrings.hide
  - typings.microsoftDashGraph.microsoftDashGraphStrings.show
*/
trait VisibilitySetting extends js.Object

object VisibilitySetting {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hide: typings.microsoftDashGraph.microsoftDashGraphStrings.hide = this.cast("hide")
  @scala.inline
  def notConfigured: typings.microsoftDashGraph.microsoftDashGraphStrings.notConfigured = this.cast("notConfigured")
  @scala.inline
  def show: typings.microsoftDashGraph.microsoftDashGraphStrings.show = this.cast("show")
}

