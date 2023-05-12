package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.notifications_disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.notifications_enabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.push
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notificationsetting extends StObject {
  
  /** @description The description of the team. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description The name of the team. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description The notification setting the team has chosen. Editing teams without specifying this parameter leaves `notification_setting` intact. The options are:
    *  * `notifications_enabled` - team members receive notifications when the team is @mentioned.
    *  * `notifications_disabled` - no one receives notifications.
    * @enum {string}
    */
  var notification_setting: js.UndefOr[notifications_enabled | notifications_disabled] = js.undefined
  
  /** @description The ID of a team to set as the parent team. */
  var parent_team_id: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * @description **Deprecated**. The permission that new repositories will be added to the team with when none is specified.
    * @default pull
    * @enum {string}
    */
  var permission: js.UndefOr[pull | push | admin] = js.undefined
  
  /**
    * @description The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:
    * **For a non-nested team:**
    *  * `secret` - only visible to organization owners and members of this team.
    *  * `closed` - visible to all members of this organization.
    * **For a parent or child team:**
    *  * `closed` - visible to all members of this organization.
    * @enum {string}
    */
  var privacy: js.UndefOr[secret | closed] = js.undefined
}
object Notificationsetting {
  
  inline def apply(): Notificationsetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notificationsetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notificationsetting] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotification_setting(value: notifications_enabled | notifications_disabled): Self = StObject.set(x, "notification_setting", value.asInstanceOf[js.Any])
    
    inline def setNotification_settingUndefined: Self = StObject.set(x, "notification_setting", js.undefined)
    
    inline def setParent_team_id(value: Double): Self = StObject.set(x, "parent_team_id", value.asInstanceOf[js.Any])
    
    inline def setParent_team_idNull: Self = StObject.set(x, "parent_team_id", null)
    
    inline def setParent_team_idUndefined: Self = StObject.set(x, "parent_team_id", js.undefined)
    
    inline def setPermission(value: pull | push | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setPrivacy(value: secret | closed): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
  }
}
