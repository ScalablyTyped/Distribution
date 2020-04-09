package typings.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized
  - typings.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized
*/
trait Event extends js.Object

object Event {
  @scala.inline
  def actionTapped: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.actionTapped = this.cast("actionTapped")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def depersonalized: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.depersonalized = this.cast("depersonalized")
  @scala.inline
  def geofenceEntered: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.geofenceEntered = this.cast("geofenceEntered")
  @scala.inline
  def installationUpdated: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.installationUpdated = this.cast("installationUpdated")
  @scala.inline
  def messageReceived: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.messageReceived = this.cast("messageReceived")
  @scala.inline
  def notificationTapped: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.notificationTapped = this.cast("notificationTapped")
  @scala.inline
  def personalized: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.personalized = this.cast("personalized")
  @scala.inline
  def registrationUpdated: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.registrationUpdated = this.cast("registrationUpdated")
  @scala.inline
  def tokenReceived: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.tokenReceived = this.cast("tokenReceived")
  @scala.inline
  def userUpdated: typings.mobileMessagingCordova.mobileMessagingCordovaStrings.userUpdated = this.cast("userUpdated")
}

