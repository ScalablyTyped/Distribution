package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosDeviceFeaturesConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Asset tag information for the device, displayed on the login window and lock screen.
  var assetTagTemplate: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
  var homeScreenDockIcons: js.UndefOr[NullableOption[js.Array[IosHomeScreenItem]]] = js.undefined
  
  // A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
  var homeScreenPages: js.UndefOr[NullableOption[js.Array[IosHomeScreenPage]]] = js.undefined
  
  // A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
  var lockScreenFootnote: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This
    * collection can contain a maximum of 500 elements.
    */
  var notificationSettings: js.UndefOr[NullableOption[js.Array[IosNotificationSettings]]] = js.undefined
}
object IosDeviceFeaturesConfiguration {
  
  @scala.inline
  def apply(): IosDeviceFeaturesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceFeaturesConfiguration]
  }
  
  @scala.inline
  implicit class IosDeviceFeaturesConfigurationMutableBuilder[Self <: IosDeviceFeaturesConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetTagTemplate(value: NullableOption[String]): Self = StObject.set(x, "assetTagTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTagTemplateNull: Self = StObject.set(x, "assetTagTemplate", null)
    
    @scala.inline
    def setAssetTagTemplateUndefined: Self = StObject.set(x, "assetTagTemplate", js.undefined)
    
    @scala.inline
    def setHomeScreenDockIcons(value: NullableOption[js.Array[IosHomeScreenItem]]): Self = StObject.set(x, "homeScreenDockIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeScreenDockIconsNull: Self = StObject.set(x, "homeScreenDockIcons", null)
    
    @scala.inline
    def setHomeScreenDockIconsUndefined: Self = StObject.set(x, "homeScreenDockIcons", js.undefined)
    
    @scala.inline
    def setHomeScreenDockIconsVarargs(value: IosHomeScreenItem*): Self = StObject.set(x, "homeScreenDockIcons", js.Array(value :_*))
    
    @scala.inline
    def setHomeScreenPages(value: NullableOption[js.Array[IosHomeScreenPage]]): Self = StObject.set(x, "homeScreenPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeScreenPagesNull: Self = StObject.set(x, "homeScreenPages", null)
    
    @scala.inline
    def setHomeScreenPagesUndefined: Self = StObject.set(x, "homeScreenPages", js.undefined)
    
    @scala.inline
    def setHomeScreenPagesVarargs(value: IosHomeScreenPage*): Self = StObject.set(x, "homeScreenPages", js.Array(value :_*))
    
    @scala.inline
    def setLockScreenFootnote(value: NullableOption[String]): Self = StObject.set(x, "lockScreenFootnote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenFootnoteNull: Self = StObject.set(x, "lockScreenFootnote", null)
    
    @scala.inline
    def setLockScreenFootnoteUndefined: Self = StObject.set(x, "lockScreenFootnote", js.undefined)
    
    @scala.inline
    def setNotificationSettings(value: NullableOption[js.Array[IosNotificationSettings]]): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSettingsNull: Self = StObject.set(x, "notificationSettings", null)
    
    @scala.inline
    def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
    
    @scala.inline
    def setNotificationSettingsVarargs(value: IosNotificationSettings*): Self = StObject.set(x, "notificationSettings", js.Array(value :_*))
  }
}
