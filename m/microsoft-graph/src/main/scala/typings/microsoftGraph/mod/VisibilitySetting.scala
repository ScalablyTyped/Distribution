package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notConfigured
  - typings.microsoftGraph.microsoftGraphStrings.hide
  - typings.microsoftGraph.microsoftGraphStrings.show
*/
trait VisibilitySetting extends js.Object

object VisibilitySetting {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hide: typings.microsoftGraph.microsoftGraphStrings.hide = this.cast("hide")
  @scala.inline
  def notConfigured: typings.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
  @scala.inline
  def show: typings.microsoftGraph.microsoftGraphStrings.show = this.cast("show")
}

