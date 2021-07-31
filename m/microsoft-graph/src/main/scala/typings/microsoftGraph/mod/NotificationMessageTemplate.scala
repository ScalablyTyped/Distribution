package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationMessageTemplate
  extends StObject
     with Entity {
  
  /**
    * The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: none,
    * includeCompanyLogo, includeCompanyName, includeContactInformation.
    */
  var brandingOptions: js.UndefOr[NotificationTemplateBrandingOptions] = js.undefined
  
  // The default locale to fallback onto when the requested locale is not available.
  var defaultLocale: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Display name for the Notification Message Template.
  var displayName: js.UndefOr[String] = js.undefined
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The list of localized messages for this Notification Message Template.
  var localizedNotificationMessages: js.UndefOr[NullableOption[js.Array[LocalizedNotificationMessage]]] = js.undefined
}
object NotificationMessageTemplate {
  
  @scala.inline
  def apply(): NotificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationMessageTemplate]
  }
  
  @scala.inline
  implicit class NotificationMessageTemplateMutableBuilder[Self <: NotificationMessageTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrandingOptions(value: NotificationTemplateBrandingOptions): Self = StObject.set(x, "brandingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandingOptionsUndefined: Self = StObject.set(x, "brandingOptions", js.undefined)
    
    @scala.inline
    def setDefaultLocale(value: NullableOption[String]): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLocaleNull: Self = StObject.set(x, "defaultLocale", null)
    
    @scala.inline
    def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLocalizedNotificationMessages(value: NullableOption[js.Array[LocalizedNotificationMessage]]): Self = StObject.set(x, "localizedNotificationMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedNotificationMessagesNull: Self = StObject.set(x, "localizedNotificationMessages", null)
    
    @scala.inline
    def setLocalizedNotificationMessagesUndefined: Self = StObject.set(x, "localizedNotificationMessages", js.undefined)
    
    @scala.inline
    def setLocalizedNotificationMessagesVarargs(value: LocalizedNotificationMessage*): Self = StObject.set(x, "localizedNotificationMessages", js.Array(value :_*))
  }
}
