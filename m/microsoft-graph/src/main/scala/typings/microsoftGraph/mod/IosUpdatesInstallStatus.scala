package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.success
  - typings.microsoftGraph.microsoftGraphStrings.available
  - typings.microsoftGraph.microsoftGraphStrings.idle
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.downloading
  - typings.microsoftGraph.microsoftGraphStrings.downloadFailed
  - typings.microsoftGraph.microsoftGraphStrings.downloadRequiresComputer
  - typings.microsoftGraph.microsoftGraphStrings.downloadInsufficientSpace
  - typings.microsoftGraph.microsoftGraphStrings.downloadInsufficientPower
  - typings.microsoftGraph.microsoftGraphStrings.downloadInsufficientNetwork
  - typings.microsoftGraph.microsoftGraphStrings.installing
  - typings.microsoftGraph.microsoftGraphStrings.installInsufficientSpace
  - typings.microsoftGraph.microsoftGraphStrings.installInsufficientPower
  - typings.microsoftGraph.microsoftGraphStrings.installPhoneCallInProgress
  - typings.microsoftGraph.microsoftGraphStrings.installFailed
  - typings.microsoftGraph.microsoftGraphStrings.notSupportedOperation
  - typings.microsoftGraph.microsoftGraphStrings.sharedDeviceUserLoggedInError
*/
trait IosUpdatesInstallStatus extends js.Object

object IosUpdatesInstallStatus {
  @scala.inline
  def available: typings.microsoftGraph.microsoftGraphStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def downloadFailed: typings.microsoftGraph.microsoftGraphStrings.downloadFailed = this.cast("downloadFailed")
  @scala.inline
  def downloadInsufficientNetwork: typings.microsoftGraph.microsoftGraphStrings.downloadInsufficientNetwork = this.cast("downloadInsufficientNetwork")
  @scala.inline
  def downloadInsufficientPower: typings.microsoftGraph.microsoftGraphStrings.downloadInsufficientPower = this.cast("downloadInsufficientPower")
  @scala.inline
  def downloadInsufficientSpace: typings.microsoftGraph.microsoftGraphStrings.downloadInsufficientSpace = this.cast("downloadInsufficientSpace")
  @scala.inline
  def downloadRequiresComputer: typings.microsoftGraph.microsoftGraphStrings.downloadRequiresComputer = this.cast("downloadRequiresComputer")
  @scala.inline
  def downloading: typings.microsoftGraph.microsoftGraphStrings.downloading = this.cast("downloading")
  @scala.inline
  def idle: typings.microsoftGraph.microsoftGraphStrings.idle = this.cast("idle")
  @scala.inline
  def installFailed: typings.microsoftGraph.microsoftGraphStrings.installFailed = this.cast("installFailed")
  @scala.inline
  def installInsufficientPower: typings.microsoftGraph.microsoftGraphStrings.installInsufficientPower = this.cast("installInsufficientPower")
  @scala.inline
  def installInsufficientSpace: typings.microsoftGraph.microsoftGraphStrings.installInsufficientSpace = this.cast("installInsufficientSpace")
  @scala.inline
  def installPhoneCallInProgress: typings.microsoftGraph.microsoftGraphStrings.installPhoneCallInProgress = this.cast("installPhoneCallInProgress")
  @scala.inline
  def installing: typings.microsoftGraph.microsoftGraphStrings.installing = this.cast("installing")
  @scala.inline
  def notSupportedOperation: typings.microsoftGraph.microsoftGraphStrings.notSupportedOperation = this.cast("notSupportedOperation")
  @scala.inline
  def sharedDeviceUserLoggedInError: typings.microsoftGraph.microsoftGraphStrings.sharedDeviceUserLoggedInError = this.cast("sharedDeviceUserLoggedInError")
  @scala.inline
  def success: typings.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

