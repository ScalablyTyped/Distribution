package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.alwaysNotify
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notifyOnAppChanges
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notifyOnAppChangesWithoutDimming
  - typings.microsoftDashGraph.microsoftDashGraphStrings.neverNotify
*/
trait WindowsUserAccountControlSettings extends js.Object

object WindowsUserAccountControlSettings {
  @scala.inline
  def alwaysNotify: typings.microsoftDashGraph.microsoftDashGraphStrings.alwaysNotify = this.cast("alwaysNotify")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neverNotify: typings.microsoftDashGraph.microsoftDashGraphStrings.neverNotify = this.cast("neverNotify")
  @scala.inline
  def notifyOnAppChanges: typings.microsoftDashGraph.microsoftDashGraphStrings.notifyOnAppChanges = this.cast("notifyOnAppChanges")
  @scala.inline
  def notifyOnAppChangesWithoutDimming: typings.microsoftDashGraph.microsoftDashGraphStrings.notifyOnAppChangesWithoutDimming = this.cast("notifyOnAppChangesWithoutDimming")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

