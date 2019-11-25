package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.useDeviceSettings
  - typings.microsoftDashGraph.microsoftDashGraphStrings.afterDeviceRestart
  - typings.microsoftDashGraph.microsoftDashGraphStrings.whenDeviceLockedExceptOpenFiles
  - typings.microsoftDashGraph.microsoftDashGraphStrings.whenDeviceLocked
*/
trait ManagedAppDataEncryptionType extends js.Object

object ManagedAppDataEncryptionType {
  @scala.inline
  def afterDeviceRestart: typings.microsoftDashGraph.microsoftDashGraphStrings.afterDeviceRestart = this.cast("afterDeviceRestart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def useDeviceSettings: typings.microsoftDashGraph.microsoftDashGraphStrings.useDeviceSettings = this.cast("useDeviceSettings")
  @scala.inline
  def whenDeviceLocked: typings.microsoftDashGraph.microsoftDashGraphStrings.whenDeviceLocked = this.cast("whenDeviceLocked")
  @scala.inline
  def whenDeviceLockedExceptOpenFiles: typings.microsoftDashGraph.microsoftDashGraphStrings.whenDeviceLockedExceptOpenFiles = this.cast("whenDeviceLockedExceptOpenFiles")
}

