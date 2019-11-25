package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.notifyDownload
  - typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAtMaintenanceTime
  - typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAndRebootAtMaintenanceTime
  - typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAndRebootAtScheduledTime
  - typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAndRebootWithoutEndUserControl
*/
trait AutomaticUpdateMode extends js.Object

object AutomaticUpdateMode {
  @scala.inline
  def autoInstallAndRebootAtMaintenanceTime: typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAndRebootAtMaintenanceTime = this.cast("autoInstallAndRebootAtMaintenanceTime")
  @scala.inline
  def autoInstallAndRebootAtScheduledTime: typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAndRebootAtScheduledTime = this.cast("autoInstallAndRebootAtScheduledTime")
  @scala.inline
  def autoInstallAndRebootWithoutEndUserControl: typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAndRebootWithoutEndUserControl = this.cast("autoInstallAndRebootWithoutEndUserControl")
  @scala.inline
  def autoInstallAtMaintenanceTime: typings.microsoftDashGraph.microsoftDashGraphStrings.autoInstallAtMaintenanceTime = this.cast("autoInstallAtMaintenanceTime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notifyDownload: typings.microsoftDashGraph.microsoftDashGraphStrings.notifyDownload = this.cast("notifyDownload")
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

