package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.allApps
  - typings.microsoftGraph.microsoftGraphStrings.managedAppsWithPasteIn
  - typings.microsoftGraph.microsoftGraphStrings.managedApps
  - typings.microsoftGraph.microsoftGraphStrings.blocked
*/
trait ManagedAppClipboardSharingLevel extends js.Object

object ManagedAppClipboardSharingLevel {
  @scala.inline
  def allApps: typings.microsoftGraph.microsoftGraphStrings.allApps = this.cast("allApps")
  @scala.inline
  def blocked: typings.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managedApps: typings.microsoftGraph.microsoftGraphStrings.managedApps = this.cast("managedApps")
  @scala.inline
  def managedAppsWithPasteIn: typings.microsoftGraph.microsoftGraphStrings.managedAppsWithPasteIn = this.cast("managedAppsWithPasteIn")
}

