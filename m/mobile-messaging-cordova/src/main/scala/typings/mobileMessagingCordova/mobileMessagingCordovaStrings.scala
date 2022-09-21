package typings.mobileMessagingCordova

import typings.mobileMessagingCordova.MobileMessagingCordova.Event
import typings.mobileMessagingCordova.MobileMessagingCordova.Gender
import typings.mobileMessagingCordova.MobileMessagingCordova.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileMessagingCordovaStrings {
  
  @js.native
  sealed trait Android
    extends StObject
       with OS
  inline def Android: Android = "Android".asInstanceOf[Android]
  
  @js.native
  sealed trait Female
    extends StObject
       with Gender
  inline def Female: Female = "Female".asInstanceOf[Female]
  
  @js.native
  sealed trait Male
    extends StObject
       with Gender
  inline def Male: Male = "Male".asInstanceOf[Male]
  
  @js.native
  sealed trait actionTapped
    extends StObject
       with Event
  inline def actionTapped: actionTapped = "actionTapped".asInstanceOf[actionTapped]
  
  @js.native
  sealed trait deeplink
    extends StObject
       with Event
  inline def deeplink: deeplink = "deeplink".asInstanceOf[deeplink]
  
  @js.native
  sealed trait depersonalized
    extends StObject
       with Event
  inline def depersonalized: depersonalized = "depersonalized".asInstanceOf[depersonalized]
  
  @js.native
  sealed trait geofenceEntered
    extends StObject
       with Event
  inline def geofenceEntered: geofenceEntered = "geofenceEntered".asInstanceOf[geofenceEntered]
  
  @js.native
  sealed trait iOS
    extends StObject
       with OS
  inline def iOS: iOS = "iOS".asInstanceOf[iOS]
  
  @js.native
  sealed trait installationUpdated
    extends StObject
       with Event
  inline def installationUpdated: installationUpdated = "installationUpdated".asInstanceOf[installationUpdated]
  
  @js.native
  sealed trait messageReceived
    extends StObject
       with Event
  inline def messageReceived: messageReceived = "messageReceived".asInstanceOf[messageReceived]
  
  @js.native
  sealed trait notificationTapped
    extends StObject
       with Event
  inline def notificationTapped: notificationTapped = "notificationTapped".asInstanceOf[notificationTapped]
  
  @js.native
  sealed trait personalized
    extends StObject
       with Event
  inline def personalized: personalized = "personalized".asInstanceOf[personalized]
  
  @js.native
  sealed trait registrationUpdated
    extends StObject
       with Event
  inline def registrationUpdated: registrationUpdated = "registrationUpdated".asInstanceOf[registrationUpdated]
  
  @js.native
  sealed trait tokenReceived
    extends StObject
       with Event
  inline def tokenReceived: tokenReceived = "tokenReceived".asInstanceOf[tokenReceived]
  
  @js.native
  sealed trait userUpdated
    extends StObject
       with Event
  inline def userUpdated: userUpdated = "userUpdated".asInstanceOf[userUpdated]
}
