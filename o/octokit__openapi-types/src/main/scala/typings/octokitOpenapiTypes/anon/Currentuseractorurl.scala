package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentuseractorurl extends StObject {
  
  var _links: Currentuser
  
  /** @example https://github.com/octocat.private.actor?token=abc123 */
  var current_user_actor_url: js.UndefOr[String] = js.undefined
  
  /** @example https://github.com/octocat-org */
  var current_user_organization_url: js.UndefOr[String] = js.undefined
  
  /**
    * @example [
    *   "https://github.com/organizations/github/octocat.private.atom?token=abc123"
    * ]
    */
  var current_user_organization_urls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @example https://github.com/octocat */
  var current_user_public_url: js.UndefOr[String] = js.undefined
  
  /** @example https://github.com/octocat.private?token=abc123 */
  var current_user_url: js.UndefOr[String] = js.undefined
  
  /** @example https://github.com/security-advisories */
  var security_advisories_url: js.UndefOr[String] = js.undefined
  
  /** @example https://github.com/timeline */
  var timeline_url: String
  
  /** @example https://github.com/{user} */
  var user_url: String
}
object Currentuseractorurl {
  
  inline def apply(_links: Currentuser, timeline_url: String, user_url: String): Currentuseractorurl = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], timeline_url = timeline_url.asInstanceOf[js.Any], user_url = user_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentuseractorurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currentuseractorurl] (val x: Self) extends AnyVal {
    
    inline def setCurrent_user_actor_url(value: String): Self = StObject.set(x, "current_user_actor_url", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_actor_urlUndefined: Self = StObject.set(x, "current_user_actor_url", js.undefined)
    
    inline def setCurrent_user_organization_url(value: String): Self = StObject.set(x, "current_user_organization_url", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organization_urlUndefined: Self = StObject.set(x, "current_user_organization_url", js.undefined)
    
    inline def setCurrent_user_organization_urls(value: js.Array[String]): Self = StObject.set(x, "current_user_organization_urls", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organization_urlsUndefined: Self = StObject.set(x, "current_user_organization_urls", js.undefined)
    
    inline def setCurrent_user_organization_urlsVarargs(value: String*): Self = StObject.set(x, "current_user_organization_urls", js.Array(value*))
    
    inline def setCurrent_user_public_url(value: String): Self = StObject.set(x, "current_user_public_url", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_public_urlUndefined: Self = StObject.set(x, "current_user_public_url", js.undefined)
    
    inline def setCurrent_user_url(value: String): Self = StObject.set(x, "current_user_url", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_urlUndefined: Self = StObject.set(x, "current_user_url", js.undefined)
    
    inline def setSecurity_advisories_url(value: String): Self = StObject.set(x, "security_advisories_url", value.asInstanceOf[js.Any])
    
    inline def setSecurity_advisories_urlUndefined: Self = StObject.set(x, "security_advisories_url", js.undefined)
    
    inline def setTimeline_url(value: String): Self = StObject.set(x, "timeline_url", value.asInstanceOf[js.Any])
    
    inline def setUser_url(value: String): Self = StObject.set(x, "user_url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Currentuser): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
