package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentuser extends StObject {
  
  var current_user: js.UndefOr[Href] = js.undefined
  
  var current_user_actor: js.UndefOr[Href] = js.undefined
  
  var current_user_organization: js.UndefOr[Href] = js.undefined
  
  var current_user_organizations: js.UndefOr[js.Array[Href]] = js.undefined
  
  var current_user_public: js.UndefOr[Href] = js.undefined
  
  var security_advisories: js.UndefOr[Href] = js.undefined
  
  var timeline: Href
  
  var user: Href
}
object Currentuser {
  
  inline def apply(timeline: Href, user: Href): Currentuser = {
    val __obj = js.Dynamic.literal(timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentuser]
  }
  
  extension [Self <: Currentuser](x: Self) {
    
    inline def setCurrent_user(value: Href): Self = StObject.set(x, "current_user", value.asInstanceOf[js.Any])
    
    inline def setCurrent_userUndefined: Self = StObject.set(x, "current_user", js.undefined)
    
    inline def setCurrent_user_actor(value: Href): Self = StObject.set(x, "current_user_actor", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_actorUndefined: Self = StObject.set(x, "current_user_actor", js.undefined)
    
    inline def setCurrent_user_organization(value: Href): Self = StObject.set(x, "current_user_organization", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organizationUndefined: Self = StObject.set(x, "current_user_organization", js.undefined)
    
    inline def setCurrent_user_organizations(value: js.Array[Href]): Self = StObject.set(x, "current_user_organizations", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organizationsUndefined: Self = StObject.set(x, "current_user_organizations", js.undefined)
    
    inline def setCurrent_user_organizationsVarargs(value: Href*): Self = StObject.set(x, "current_user_organizations", js.Array(value*))
    
    inline def setCurrent_user_public(value: Href): Self = StObject.set(x, "current_user_public", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_publicUndefined: Self = StObject.set(x, "current_user_public", js.undefined)
    
    inline def setSecurity_advisories(value: Href): Self = StObject.set(x, "security_advisories", value.asInstanceOf[js.Any])
    
    inline def setSecurity_advisoriesUndefined: Self = StObject.set(x, "security_advisories", js.undefined)
    
    inline def setTimeline(value: Href): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Href): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
