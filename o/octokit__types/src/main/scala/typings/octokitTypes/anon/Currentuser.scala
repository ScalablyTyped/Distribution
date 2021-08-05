package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentuser extends StObject {
  
  var current_user: Href
  
  var current_user_actor: Href
  
  var current_user_organization: Href
  
  var current_user_organizations: js.Array[Href]
  
  var current_user_public: Href
  
  var security_advisories: Href
  
  var timeline: Href
  
  var user: Href
}
object Currentuser {
  
  inline def apply(
    current_user: Href,
    current_user_actor: Href,
    current_user_organization: Href,
    current_user_organizations: js.Array[Href],
    current_user_public: Href,
    security_advisories: Href,
    timeline: Href,
    user: Href
  ): Currentuser = {
    val __obj = js.Dynamic.literal(current_user = current_user.asInstanceOf[js.Any], current_user_actor = current_user_actor.asInstanceOf[js.Any], current_user_organization = current_user_organization.asInstanceOf[js.Any], current_user_organizations = current_user_organizations.asInstanceOf[js.Any], current_user_public = current_user_public.asInstanceOf[js.Any], security_advisories = security_advisories.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentuser]
  }
  
  extension [Self <: Currentuser](x: Self) {
    
    inline def setCurrent_user(value: Href): Self = StObject.set(x, "current_user", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_actor(value: Href): Self = StObject.set(x, "current_user_actor", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organization(value: Href): Self = StObject.set(x, "current_user_organization", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organizations(value: js.Array[Href]): Self = StObject.set(x, "current_user_organizations", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organizationsVarargs(value: Href*): Self = StObject.set(x, "current_user_organizations", js.Array(value :_*))
    
    inline def setCurrent_user_public(value: Href): Self = StObject.set(x, "current_user_public", value.asInstanceOf[js.Any])
    
    inline def setSecurity_advisories(value: Href): Self = StObject.set(x, "security_advisories", value.asInstanceOf[js.Any])
    
    inline def setTimeline(value: Href): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Href): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
