package typings.mobileMessagingCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actions extends StObject {
    
    var actions: js.UndefOr[js.Array[AuthenticationRequired]] = js.undefined
    
    var identifier: js.UndefOr[String] = js.undefined
  }
  object Actions {
    
    inline def apply(): Actions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actions]
    }
    
    extension [Self <: Actions](x: Self) {
      
      inline def setActions(value: js.Array[AuthenticationRequired]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: AuthenticationRequired*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    }
  }
  
  trait ApplicationCodePersistingDisabled extends StObject {
    
    var applicationCodePersistingDisabled: js.UndefOr[Boolean] = js.undefined
    
    var carrierInfoSendingDisabled: js.UndefOr[Boolean] = js.undefined
    
    var systemInfoSendingDisabled: js.UndefOr[Boolean] = js.undefined
    
    var userDataPersistingDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object ApplicationCodePersistingDisabled {
    
    inline def apply(): ApplicationCodePersistingDisabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationCodePersistingDisabled]
    }
    
    extension [Self <: ApplicationCodePersistingDisabled](x: Self) {
      
      inline def setApplicationCodePersistingDisabled(value: Boolean): Self = StObject.set(x, "applicationCodePersistingDisabled", value.asInstanceOf[js.Any])
      
      inline def setApplicationCodePersistingDisabledUndefined: Self = StObject.set(x, "applicationCodePersistingDisabled", js.undefined)
      
      inline def setCarrierInfoSendingDisabled(value: Boolean): Self = StObject.set(x, "carrierInfoSendingDisabled", value.asInstanceOf[js.Any])
      
      inline def setCarrierInfoSendingDisabledUndefined: Self = StObject.set(x, "carrierInfoSendingDisabled", js.undefined)
      
      inline def setSystemInfoSendingDisabled(value: Boolean): Self = StObject.set(x, "systemInfoSendingDisabled", value.asInstanceOf[js.Any])
      
      inline def setSystemInfoSendingDisabledUndefined: Self = StObject.set(x, "systemInfoSendingDisabled", js.undefined)
      
      inline def setUserDataPersistingDisabled(value: Boolean): Self = StObject.set(x, "userDataPersistingDisabled", value.asInstanceOf[js.Any])
      
      inline def setUserDataPersistingDisabledUndefined: Self = StObject.set(x, "userDataPersistingDisabled", js.undefined)
    }
  }
  
  trait AuthenticationRequired extends StObject {
    
    var authenticationRequired: js.UndefOr[Boolean] = js.undefined
    
    var destructive: js.UndefOr[Boolean] = js.undefined
    
    var foreground: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var moRequired: js.UndefOr[Boolean] = js.undefined
    
    var textInputActionButtonTitle: js.UndefOr[String] = js.undefined
    
    var textInputPlaceholder: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AuthenticationRequired {
    
    inline def apply(): AuthenticationRequired = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationRequired]
    }
    
    extension [Self <: AuthenticationRequired](x: Self) {
      
      inline def setAuthenticationRequired(value: Boolean): Self = StObject.set(x, "authenticationRequired", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationRequiredUndefined: Self = StObject.set(x, "authenticationRequired", js.undefined)
      
      inline def setDestructive(value: Boolean): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
      
      inline def setDestructiveUndefined: Self = StObject.set(x, "destructive", js.undefined)
      
      inline def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setMoRequired(value: Boolean): Self = StObject.set(x, "moRequired", value.asInstanceOf[js.Any])
      
      inline def setMoRequiredUndefined: Self = StObject.set(x, "moRequired", js.undefined)
      
      inline def setTextInputActionButtonTitle(value: String): Self = StObject.set(x, "textInputActionButtonTitle", value.asInstanceOf[js.Any])
      
      inline def setTextInputActionButtonTitleUndefined: Self = StObject.set(x, "textInputActionButtonTitle", js.undefined)
      
      inline def setTextInputPlaceholder(value: String): Self = StObject.set(x, "textInputPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setTextInputPlaceholderUndefined: Self = StObject.set(x, "textInputPlaceholder", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ForceCleanup extends StObject {
    
    var forceCleanup: js.UndefOr[Boolean] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var notificationTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ForceCleanup {
    
    inline def apply(): ForceCleanup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceCleanup]
    }
    
    extension [Self <: ForceCleanup](x: Self) {
      
      inline def setForceCleanup(value: Boolean): Self = StObject.set(x, "forceCleanup", value.asInstanceOf[js.Any])
      
      inline def setForceCleanupUndefined: Self = StObject.set(x, "forceCleanup", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setNotificationTypes(value: js.Array[String]): Self = StObject.set(x, "notificationTypes", value.asInstanceOf[js.Any])
      
      inline def setNotificationTypesUndefined: Self = StObject.set(x, "notificationTypes", js.undefined)
      
      inline def setNotificationTypesVarargs(value: String*): Self = StObject.set(x, "notificationTypes", js.Array(value*))
    }
  }
  
  trait MultipleNotifications extends StObject {
    
    // a resource name for a status bar icon (without extension), located in '/platforms/android/app/src/main/res/mipmap'
    var multipleNotifications: Boolean
    
    var notificationAccentColor: String
    
    var notificationIcon: String
  }
  object MultipleNotifications {
    
    inline def apply(multipleNotifications: Boolean, notificationAccentColor: String, notificationIcon: String): MultipleNotifications = {
      val __obj = js.Dynamic.literal(multipleNotifications = multipleNotifications.asInstanceOf[js.Any], notificationAccentColor = notificationAccentColor.asInstanceOf[js.Any], notificationIcon = notificationIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleNotifications]
    }
    
    extension [Self <: MultipleNotifications](x: Self) {
      
      inline def setMultipleNotifications(value: Boolean): Self = StObject.set(x, "multipleNotifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationAccentColor(value: String): Self = StObject.set(x, "notificationAccentColor", value.asInstanceOf[js.Any])
      
      inline def setNotificationIcon(value: String): Self = StObject.set(x, "notificationIcon", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShowModally extends StObject {
    
    var showModally: Boolean
  }
  object ShowModally {
    
    inline def apply(showModally: Boolean): ShowModally = {
      val __obj = js.Dynamic.literal(showModally = showModally.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowModally]
    }
    
    extension [Self <: ShowModally](x: Self) {
      
      inline def setShowModally(value: Boolean): Self = StObject.set(x, "showModally", value.asInstanceOf[js.Any])
    }
  }
}
