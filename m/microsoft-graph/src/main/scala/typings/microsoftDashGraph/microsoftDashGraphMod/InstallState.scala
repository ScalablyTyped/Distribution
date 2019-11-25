package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notApplicable
  - typings.microsoftDashGraph.microsoftDashGraphStrings.installed
  - typings.microsoftDashGraph.microsoftDashGraphStrings.failed_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notInstalled
  - typings.microsoftDashGraph.microsoftDashGraphStrings.uninstallFailed
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
*/
trait InstallState extends js.Object

object InstallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def installed: typings.microsoftDashGraph.microsoftDashGraphStrings.installed = this.cast("installed")
  @scala.inline
  def notApplicable: typings.microsoftDashGraph.microsoftDashGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notInstalled: typings.microsoftDashGraph.microsoftDashGraphStrings.notInstalled = this.cast("notInstalled")
  @scala.inline
  def uninstallFailed: typings.microsoftDashGraph.microsoftDashGraphStrings.uninstallFailed = this.cast("uninstallFailed")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

