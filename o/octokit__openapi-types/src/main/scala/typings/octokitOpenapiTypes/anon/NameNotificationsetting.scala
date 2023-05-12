package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameNotificationsetting extends StObject {
  
  var description: js.UndefOr[FromString] = js.undefined
  
  var name: js.UndefOr[FromString] = js.undefined
  
  var notification_setting: js.UndefOr[FromString] = js.undefined
  
  var privacy: js.UndefOr[FromString] = js.undefined
  
  var repository: js.UndefOr[PermissionsFromAdminPull] = js.undefined
}
object NameNotificationsetting {
  
  inline def apply(): NameNotificationsetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameNotificationsetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameNotificationsetting] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: FromString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: FromString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotification_setting(value: FromString): Self = StObject.set(x, "notification_setting", value.asInstanceOf[js.Any])
    
    inline def setNotification_settingUndefined: Self = StObject.set(x, "notification_setting", js.undefined)
    
    inline def setPrivacy(value: FromString): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setRepository(value: PermissionsFromAdminPull): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
