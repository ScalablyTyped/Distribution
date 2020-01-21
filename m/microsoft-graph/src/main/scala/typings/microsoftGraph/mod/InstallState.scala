package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notApplicable
  - typings.microsoftGraph.microsoftGraphStrings.installed
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.notInstalled
  - typings.microsoftGraph.microsoftGraphStrings.uninstallFailed
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait InstallState extends js.Object

object InstallState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def installed: typings.microsoftGraph.microsoftGraphStrings.installed = this.cast("installed")
  @scala.inline
  def notApplicable: typings.microsoftGraph.microsoftGraphStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def notInstalled: typings.microsoftGraph.microsoftGraphStrings.notInstalled = this.cast("notInstalled")
  @scala.inline
  def uninstallFailed: typings.microsoftGraph.microsoftGraphStrings.uninstallFailed = this.cast("uninstallFailed")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

