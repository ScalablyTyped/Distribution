package typings.mobileMessagingCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Actions extends StObject {
    
    var actions: js.UndefOr[js.Array[AuthenticationRequired]] = js.native
    
    var identifier: js.UndefOr[String] = js.native
  }
  object Actions {
    
    @scala.inline
    def apply(): Actions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actions]
    }
    
    @scala.inline
    implicit class ActionsMutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[AuthenticationRequired]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: AuthenticationRequired*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    }
  }
  
  @js.native
  trait ApplicationCodePersistingDisabled extends StObject {
    
    var applicationCodePersistingDisabled: js.UndefOr[Boolean] = js.native
    
    var carrierInfoSendingDisabled: js.UndefOr[Boolean] = js.native
    
    var systemInfoSendingDisabled: js.UndefOr[Boolean] = js.native
    
    var userDataPersistingDisabled: js.UndefOr[Boolean] = js.native
  }
  object ApplicationCodePersistingDisabled {
    
    @scala.inline
    def apply(): ApplicationCodePersistingDisabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationCodePersistingDisabled]
    }
    
    @scala.inline
    implicit class ApplicationCodePersistingDisabledMutableBuilder[Self <: ApplicationCodePersistingDisabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationCodePersistingDisabled(value: Boolean): Self = StObject.set(x, "applicationCodePersistingDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationCodePersistingDisabledUndefined: Self = StObject.set(x, "applicationCodePersistingDisabled", js.undefined)
      
      @scala.inline
      def setCarrierInfoSendingDisabled(value: Boolean): Self = StObject.set(x, "carrierInfoSendingDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarrierInfoSendingDisabledUndefined: Self = StObject.set(x, "carrierInfoSendingDisabled", js.undefined)
      
      @scala.inline
      def setSystemInfoSendingDisabled(value: Boolean): Self = StObject.set(x, "systemInfoSendingDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemInfoSendingDisabledUndefined: Self = StObject.set(x, "systemInfoSendingDisabled", js.undefined)
      
      @scala.inline
      def setUserDataPersistingDisabled(value: Boolean): Self = StObject.set(x, "userDataPersistingDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDataPersistingDisabledUndefined: Self = StObject.set(x, "userDataPersistingDisabled", js.undefined)
    }
  }
  
  @js.native
  trait AuthenticationRequired extends StObject {
    
    var authenticationRequired: js.UndefOr[Boolean] = js.native
    
    var destructive: js.UndefOr[Boolean] = js.native
    
    var foreground: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var identifier: js.UndefOr[String] = js.native
    
    var moRequired: js.UndefOr[Boolean] = js.native
    
    var textInputActionButtonTitle: js.UndefOr[String] = js.native
    
    var textInputPlaceholder: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object AuthenticationRequired {
    
    @scala.inline
    def apply(): AuthenticationRequired = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationRequired]
    }
    
    @scala.inline
    implicit class AuthenticationRequiredMutableBuilder[Self <: AuthenticationRequired] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticationRequired(value: Boolean): Self = StObject.set(x, "authenticationRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationRequiredUndefined: Self = StObject.set(x, "authenticationRequired", js.undefined)
      
      @scala.inline
      def setDestructive(value: Boolean): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructiveUndefined: Self = StObject.set(x, "destructive", js.undefined)
      
      @scala.inline
      def setForeground(value: Boolean): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setMoRequired(value: Boolean): Self = StObject.set(x, "moRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoRequiredUndefined: Self = StObject.set(x, "moRequired", js.undefined)
      
      @scala.inline
      def setTextInputActionButtonTitle(value: String): Self = StObject.set(x, "textInputActionButtonTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextInputActionButtonTitleUndefined: Self = StObject.set(x, "textInputActionButtonTitle", js.undefined)
      
      @scala.inline
      def setTextInputPlaceholder(value: String): Self = StObject.set(x, "textInputPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextInputPlaceholderUndefined: Self = StObject.set(x, "textInputPlaceholder", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ForceCleanup extends StObject {
    
    var forceCleanup: js.UndefOr[Boolean] = js.native
    
    var logging: js.UndefOr[Boolean] = js.native
    
    var notificationTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object ForceCleanup {
    
    @scala.inline
    def apply(): ForceCleanup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForceCleanup]
    }
    
    @scala.inline
    implicit class ForceCleanupMutableBuilder[Self <: ForceCleanup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceCleanup(value: Boolean): Self = StObject.set(x, "forceCleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceCleanupUndefined: Self = StObject.set(x, "forceCleanup", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setNotificationTypes(value: js.Array[String]): Self = StObject.set(x, "notificationTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTypesUndefined: Self = StObject.set(x, "notificationTypes", js.undefined)
      
      @scala.inline
      def setNotificationTypesVarargs(value: String*): Self = StObject.set(x, "notificationTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MultipleNotifications extends StObject {
    
    // a resource name for a status bar icon (without extension), located in '/platforms/android/app/src/main/res/mipmap'
    var multipleNotifications: Boolean = js.native
    
    var notificationAccentColor: String = js.native
    
    var notificationIcon: String = js.native
  }
  object MultipleNotifications {
    
    @scala.inline
    def apply(multipleNotifications: Boolean, notificationAccentColor: String, notificationIcon: String): MultipleNotifications = {
      val __obj = js.Dynamic.literal(multipleNotifications = multipleNotifications.asInstanceOf[js.Any], notificationAccentColor = notificationAccentColor.asInstanceOf[js.Any], notificationIcon = notificationIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleNotifications]
    }
    
    @scala.inline
    implicit class MultipleNotificationsMutableBuilder[Self <: MultipleNotifications] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultipleNotifications(value: Boolean): Self = StObject.set(x, "multipleNotifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationAccentColor(value: String): Self = StObject.set(x, "notificationAccentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationIcon(value: String): Self = StObject.set(x, "notificationIcon", value.asInstanceOf[js.Any])
    }
  }
}
