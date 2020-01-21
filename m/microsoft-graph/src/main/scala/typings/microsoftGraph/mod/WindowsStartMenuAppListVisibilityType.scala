package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.collapse
  - typings.microsoftGraph.microsoftGraphStrings.remove
  - typings.microsoftGraph.microsoftGraphStrings.disableSettingsApp
*/
trait WindowsStartMenuAppListVisibilityType extends js.Object

object WindowsStartMenuAppListVisibilityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collapse: typings.microsoftGraph.microsoftGraphStrings.collapse = this.cast("collapse")
  @scala.inline
  def disableSettingsApp: typings.microsoftGraph.microsoftGraphStrings.disableSettingsApp = this.cast("disableSettingsApp")
  @scala.inline
  def remove: typings.microsoftGraph.microsoftGraphStrings.remove = this.cast("remove")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

