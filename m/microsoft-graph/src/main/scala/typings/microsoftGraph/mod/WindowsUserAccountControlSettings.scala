package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.alwaysNotify
  - typings.microsoftGraph.microsoftGraphStrings.notifyOnAppChanges
  - typings.microsoftGraph.microsoftGraphStrings.notifyOnAppChangesWithoutDimming
  - typings.microsoftGraph.microsoftGraphStrings.neverNotify
*/
trait WindowsUserAccountControlSettings extends js.Object

object WindowsUserAccountControlSettings {
  @scala.inline
  def alwaysNotify: typings.microsoftGraph.microsoftGraphStrings.alwaysNotify = this.cast("alwaysNotify")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverNotify: typings.microsoftGraph.microsoftGraphStrings.neverNotify = this.cast("neverNotify")
  @scala.inline
  def notifyOnAppChanges: typings.microsoftGraph.microsoftGraphStrings.notifyOnAppChanges = this.cast("notifyOnAppChanges")
  @scala.inline
  def notifyOnAppChangesWithoutDimming: typings.microsoftGraph.microsoftGraphStrings.notifyOnAppChangesWithoutDimming = this.cast("notifyOnAppChangesWithoutDimming")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

