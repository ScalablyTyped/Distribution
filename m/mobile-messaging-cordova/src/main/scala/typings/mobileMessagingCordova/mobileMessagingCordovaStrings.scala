package typings.mobileMessagingCordova

import typings.mobileMessagingCordova.MobileMessagingCordova.Event
import typings.mobileMessagingCordova.MobileMessagingCordova.Gender
import typings.mobileMessagingCordova.MobileMessagingCordova.OS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mobileMessagingCordovaStrings {
  @js.native
  sealed trait Android extends OS
  
  @js.native
  sealed trait Female extends Gender
  
  @js.native
  sealed trait Male extends Gender
  
  @js.native
  sealed trait actionTapped extends Event
  
  @js.native
  sealed trait depersonalized extends Event
  
  @js.native
  sealed trait geofenceEntered extends Event
  
  @js.native
  sealed trait iOS extends OS
  
  @js.native
  sealed trait installationUpdated extends Event
  
  @js.native
  sealed trait messageReceived extends Event
  
  @js.native
  sealed trait notificationTapped extends Event
  
  @js.native
  sealed trait personalized extends Event
  
  @js.native
  sealed trait registrationUpdated extends Event
  
  @js.native
  sealed trait tokenReceived extends Event
  
  @js.native
  sealed trait userUpdated extends Event
  
  @scala.inline
  def Android: Android = "Android".asInstanceOf[Android]
  @scala.inline
  def Female: Female = "Female".asInstanceOf[Female]
  @scala.inline
  def Male: Male = "Male".asInstanceOf[Male]
  @scala.inline
  def actionTapped: actionTapped = "actionTapped".asInstanceOf[actionTapped]
  @scala.inline
  def depersonalized: depersonalized = "depersonalized".asInstanceOf[depersonalized]
  @scala.inline
  def geofenceEntered: geofenceEntered = "geofenceEntered".asInstanceOf[geofenceEntered]
  @scala.inline
  def iOS: iOS = "iOS".asInstanceOf[iOS]
  @scala.inline
  def installationUpdated: installationUpdated = "installationUpdated".asInstanceOf[installationUpdated]
  @scala.inline
  def messageReceived: messageReceived = "messageReceived".asInstanceOf[messageReceived]
  @scala.inline
  def notificationTapped: notificationTapped = "notificationTapped".asInstanceOf[notificationTapped]
  @scala.inline
  def personalized: personalized = "personalized".asInstanceOf[personalized]
  @scala.inline
  def registrationUpdated: registrationUpdated = "registrationUpdated".asInstanceOf[registrationUpdated]
  @scala.inline
  def tokenReceived: tokenReceived = "tokenReceived".asInstanceOf[tokenReceived]
  @scala.inline
  def userUpdated: userUpdated = "userUpdated".asInstanceOf[userUpdated]
}

