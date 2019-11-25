package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allApps
  - typings.microsoftDashGraph.microsoftDashGraphStrings.managedAppsWithPasteIn
  - typings.microsoftDashGraph.microsoftDashGraphStrings.managedApps
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blocked
*/
trait ManagedAppClipboardSharingLevel extends js.Object

object ManagedAppClipboardSharingLevel {
  @scala.inline
  def allApps: typings.microsoftDashGraph.microsoftDashGraphStrings.allApps = this.cast("allApps")
  @scala.inline
  def blocked: typings.microsoftDashGraph.microsoftDashGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managedApps: typings.microsoftDashGraph.microsoftDashGraphStrings.managedApps = this.cast("managedApps")
  @scala.inline
  def managedAppsWithPasteIn: typings.microsoftDashGraph.microsoftDashGraphStrings.managedAppsWithPasteIn = this.cast("managedAppsWithPasteIn")
}

