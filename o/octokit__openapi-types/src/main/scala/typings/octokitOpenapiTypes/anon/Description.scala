package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  /** @example https://github.com/images/error/octocat_happy.gif */
  var avatar_url: String
  
  /** @example A great organization */
  var description: String | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/github/events
    */
  var events_url: String
  
  /** @example https://api.github.com/orgs/github/hooks */
  var hooks_url: String
  
  /** @example 1 */
  var id: Double
  
  /** @example https://api.github.com/orgs/github/issues */
  var issues_url: String
  
  /** @example github */
  var login: String
  
  /** @example https://api.github.com/orgs/github/members{/member} */
  var members_url: String
  
  /** @example MDEyOk9yZ2FuaXphdGlvbjE= */
  var node_id: String
  
  /** @example https://api.github.com/orgs/github/public_members{/member} */
  var public_members_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/github/repos
    */
  var repos_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/github
    */
  var url: String
}
object Description {
  
  inline def apply(
    avatar_url: String,
    events_url: String,
    hooks_url: String,
    id: Double,
    issues_url: String,
    login: String,
    members_url: String,
    node_id: String,
    public_members_url: String,
    repos_url: String,
    url: String
  ): Description = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], hooks_url = hooks_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues_url = issues_url.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], public_members_url = public_members_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPublic_members_url(value: String): Self = StObject.set(x, "public_members_url", value.asInstanceOf[js.Any])
    
    inline def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
