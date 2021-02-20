package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Currentuser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityGetFeedsResponseData extends StObject {
  
  var _links: Currentuser = js.native
  
  var current_user_actor_url: String = js.native
  
  var current_user_organization_url: String = js.native
  
  var current_user_organization_urls: js.Array[String] = js.native
  
  var current_user_public_url: String = js.native
  
  var current_user_url: String = js.native
  
  var security_advisories_url: String = js.native
  
  var timeline_url: String = js.native
  
  var user_url: String = js.native
}
object ActivityGetFeedsResponseData {
  
  @scala.inline
  def apply(
    _links: Currentuser,
    current_user_actor_url: String,
    current_user_organization_url: String,
    current_user_organization_urls: js.Array[String],
    current_user_public_url: String,
    current_user_url: String,
    security_advisories_url: String,
    timeline_url: String,
    user_url: String
  ): ActivityGetFeedsResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], current_user_actor_url = current_user_actor_url.asInstanceOf[js.Any], current_user_organization_url = current_user_organization_url.asInstanceOf[js.Any], current_user_organization_urls = current_user_organization_urls.asInstanceOf[js.Any], current_user_public_url = current_user_public_url.asInstanceOf[js.Any], current_user_url = current_user_url.asInstanceOf[js.Any], security_advisories_url = security_advisories_url.asInstanceOf[js.Any], timeline_url = timeline_url.asInstanceOf[js.Any], user_url = user_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetFeedsResponseData]
  }
  
  @scala.inline
  implicit class ActivityGetFeedsResponseDataMutableBuilder[Self <: ActivityGetFeedsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent_user_actor_url(value: String): Self = StObject.set(x, "current_user_actor_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_organization_url(value: String): Self = StObject.set(x, "current_user_organization_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_organization_urls(value: js.Array[String]): Self = StObject.set(x, "current_user_organization_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_organization_urlsVarargs(value: String*): Self = StObject.set(x, "current_user_organization_urls", js.Array(value :_*))
    
    @scala.inline
    def setCurrent_user_public_url(value: String): Self = StObject.set(x, "current_user_public_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_user_url(value: String): Self = StObject.set(x, "current_user_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurity_advisories_url(value: String): Self = StObject.set(x, "security_advisories_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeline_url(value: String): Self = StObject.set(x, "timeline_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_url(value: String): Self = StObject.set(x, "user_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: Currentuser): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
