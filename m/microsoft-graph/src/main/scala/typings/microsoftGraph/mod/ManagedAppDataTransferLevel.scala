package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.allApps
  - typings.microsoftGraph.microsoftGraphStrings.managedApps
  - typings.microsoftGraph.microsoftGraphStrings.none_
*/
trait ManagedAppDataTransferLevel extends js.Object

object ManagedAppDataTransferLevel {
  @scala.inline
  def allApps: typings.microsoftGraph.microsoftGraphStrings.allApps = this.cast("allApps")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managedApps: typings.microsoftGraph.microsoftGraphStrings.managedApps = this.cast("managedApps")
  @scala.inline
  def none: none_ = this.cast("none")
}

