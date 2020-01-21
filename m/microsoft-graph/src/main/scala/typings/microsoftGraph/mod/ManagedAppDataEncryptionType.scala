package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.useDeviceSettings
  - typings.microsoftGraph.microsoftGraphStrings.afterDeviceRestart
  - typings.microsoftGraph.microsoftGraphStrings.whenDeviceLockedExceptOpenFiles
  - typings.microsoftGraph.microsoftGraphStrings.whenDeviceLocked
*/
trait ManagedAppDataEncryptionType extends js.Object

object ManagedAppDataEncryptionType {
  @scala.inline
  def afterDeviceRestart: typings.microsoftGraph.microsoftGraphStrings.afterDeviceRestart = this.cast("afterDeviceRestart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def useDeviceSettings: typings.microsoftGraph.microsoftGraphStrings.useDeviceSettings = this.cast("useDeviceSettings")
  @scala.inline
  def whenDeviceLocked: typings.microsoftGraph.microsoftGraphStrings.whenDeviceLocked = this.cast("whenDeviceLocked")
  @scala.inline
  def whenDeviceLockedExceptOpenFiles: typings.microsoftGraph.microsoftGraphStrings.whenDeviceLockedExceptOpenFiles = this.cast("whenDeviceLockedExceptOpenFiles")
}

