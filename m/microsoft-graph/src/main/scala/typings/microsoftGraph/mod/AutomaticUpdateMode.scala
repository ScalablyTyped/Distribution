package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.notifyDownload
  - typings.microsoftGraph.microsoftGraphStrings.autoInstallAtMaintenanceTime
  - typings.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtMaintenanceTime
  - typings.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtScheduledTime
  - typings.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootWithoutEndUserControl
*/
trait AutomaticUpdateMode extends js.Object

object AutomaticUpdateMode {
  @scala.inline
  def autoInstallAndRebootAtMaintenanceTime: typings.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtMaintenanceTime = this.cast("autoInstallAndRebootAtMaintenanceTime")
  @scala.inline
  def autoInstallAndRebootAtScheduledTime: typings.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootAtScheduledTime = this.cast("autoInstallAndRebootAtScheduledTime")
  @scala.inline
  def autoInstallAndRebootWithoutEndUserControl: typings.microsoftGraph.microsoftGraphStrings.autoInstallAndRebootWithoutEndUserControl = this.cast("autoInstallAndRebootWithoutEndUserControl")
  @scala.inline
  def autoInstallAtMaintenanceTime: typings.microsoftGraph.microsoftGraphStrings.autoInstallAtMaintenanceTime = this.cast("autoInstallAtMaintenanceTime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notifyDownload: typings.microsoftGraph.microsoftGraphStrings.notifyDownload = this.cast("notifyDownload")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

