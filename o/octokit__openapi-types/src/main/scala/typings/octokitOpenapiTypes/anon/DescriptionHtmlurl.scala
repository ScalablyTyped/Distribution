package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.notifications_disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.notifications_enabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionHtmlurl extends StObject {
  
  /** @description Description of the team */
  var description: String | Null
  
  /** Format: uri */
  var html_url: String
  
  /** @description Unique identifier of the team */
  var id: Double
  
  /** Format: uri-template */
  var members_url: String
  
  /** @description Name of the team */
  var name: String
  
  var node_id: String
  
  /**
    * @description Whether team members will receive notifications when their team is @mentioned
    * @enum {string}
    */
  var notification_setting: notifications_enabled | notifications_disabled
  
  /** @description Permission that the team will have for its repositories */
  var permission: String
  
  /** @enum {string} */
  var privacy: open | closed | secret
  
  /** Format: uri */
  var repositories_url: String
  
  var slug: String
  
  /**
    * Format: uri
    * @description URL for the team
    */
  var url: String
}
object DescriptionHtmlurl {
  
  inline def apply(
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    notification_setting: notifications_enabled | notifications_disabled,
    permission: String,
    privacy: open | closed | secret,
    repositories_url: String,
    slug: String,
    url: String
  ): DescriptionHtmlurl = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], notification_setting = notification_setting.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[DescriptionHtmlurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionHtmlurl] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNotification_setting(value: notifications_enabled | notifications_disabled): Self = StObject.set(x, "notification_setting", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: open | closed | secret): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
