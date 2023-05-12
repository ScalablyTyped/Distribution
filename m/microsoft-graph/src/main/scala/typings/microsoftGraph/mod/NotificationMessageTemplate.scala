package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationMessageTemplate
  extends StObject
     with Entity {
  
  /**
    * The Message Template Branding Options. Branding is defined in the Intune Admin Console. Possible values are: none,
    * includeCompanyLogo, includeCompanyName, includeContactInformation, includeCompanyPortalLink, includeDeviceDetails,
    * unknownFutureValue.
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
  
  // List of Scope Tags for this Entity instance.
  var roleScopeTagIds: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object NotificationMessageTemplate {
  
  inline def apply(): NotificationMessageTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationMessageTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotificationMessageTemplate] (val x: Self) extends AnyVal {
    
    inline def setBrandingOptions(value: NotificationTemplateBrandingOptions): Self = StObject.set(x, "brandingOptions", value.asInstanceOf[js.Any])
    
    inline def setBrandingOptionsUndefined: Self = StObject.set(x, "brandingOptions", js.undefined)
    
    inline def setDefaultLocale(value: NullableOption[String]): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleNull: Self = StObject.set(x, "defaultLocale", null)
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setLocalizedNotificationMessages(value: NullableOption[js.Array[LocalizedNotificationMessage]]): Self = StObject.set(x, "localizedNotificationMessages", value.asInstanceOf[js.Any])
    
    inline def setLocalizedNotificationMessagesNull: Self = StObject.set(x, "localizedNotificationMessages", null)
    
    inline def setLocalizedNotificationMessagesUndefined: Self = StObject.set(x, "localizedNotificationMessages", js.undefined)
    
    inline def setLocalizedNotificationMessagesVarargs(value: LocalizedNotificationMessage*): Self = StObject.set(x, "localizedNotificationMessages", js.Array(value*))
    
    inline def setRoleScopeTagIds(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "roleScopeTagIds", value.asInstanceOf[js.Any])
    
    inline def setRoleScopeTagIdsNull: Self = StObject.set(x, "roleScopeTagIds", null)
    
    inline def setRoleScopeTagIdsUndefined: Self = StObject.set(x, "roleScopeTagIds", js.undefined)
    
    inline def setRoleScopeTagIdsVarargs(value: String*): Self = StObject.set(x, "roleScopeTagIds", js.Array(value*))
  }
}
