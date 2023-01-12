package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelecomExpenseManagementPartner
  extends StObject
     with Entity {
  
  // Whether the partner's AAD app has been authorized to access Intune.
  var appAuthorized: js.UndefOr[Boolean] = js.undefined
  
  // Display name of the TEM partner.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Whether Intune's connection to the TEM service is currently enabled or disabled.
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  // Timestamp of the last request sent to Intune by the TEM partner.
  var lastConnectionDateTime: js.UndefOr[String] = js.undefined
  
  // URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.
  var url: js.UndefOr[NullableOption[String]] = js.undefined
}
object TelecomExpenseManagementPartner {
  
  inline def apply(): TelecomExpenseManagementPartner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelecomExpenseManagementPartner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelecomExpenseManagementPartner] (val x: Self) extends AnyVal {
    
    inline def setAppAuthorized(value: Boolean): Self = StObject.set(x, "appAuthorized", value.asInstanceOf[js.Any])
    
    inline def setAppAuthorizedUndefined: Self = StObject.set(x, "appAuthorized", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLastConnectionDateTime(value: String): Self = StObject.set(x, "lastConnectionDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastConnectionDateTimeUndefined: Self = StObject.set(x, "lastConnectionDateTime", js.undefined)
    
    inline def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
