package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Followingurl extends StObject {
  
  /**
    * Format: uri
    * @example https://github.com/images/error/octocat_happy.gif
    */
  var avatar_url: String
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  /** @example https://api.github.com/users/octocat/events{/privacy} */
  var events_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/followers
    */
  var followers_url: String
  
  /** @example https://api.github.com/users/octocat/following{/other_user} */
  var following_url: String
  
  /** @example https://api.github.com/users/octocat/gists{/gist_id} */
  var gists_url: String
  
  /** @example 41d064eb2195891e12d0413f63227ea7 */
  var gravatar_id: String | Null
  
  /**
    * Format: uri
    * @example https://github.com/octocat
    */
  var html_url: String
  
  /** @example 1 */
  var id: Double
  
  /** @example octocat */
  var login: String
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** @example MDQ6VXNlcjE= */
  var node_id: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/orgs
    */
  var organizations_url: String
  
  var permissions: js.UndefOr[Triage] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/received_events
    */
  var received_events_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/repos
    */
  var repos_url: String
  
  /** @example admin */
  var role_name: String
  
  var site_admin: Boolean
  
  /** @example https://api.github.com/users/octocat/starred{/owner}{/repo} */
  var starred_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/subscriptions
    */
  var subscriptions_url: String
  
  /** @example User */
  var `type`: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat
    */
  var url: String
}
object Followingurl {
  
  inline def apply(
    avatar_url: String,
    events_url: String,
    followers_url: String,
    following_url: String,
    gists_url: String,
    html_url: String,
    id: Double,
    login: String,
    node_id: String,
    organizations_url: String,
    received_events_url: String,
    repos_url: String,
    role_name: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: String,
    url: String
  ): Followingurl = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], role_name = role_name.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], gravatar_id = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Followingurl]
  }
  
  extension [Self <: Followingurl](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setFollowers_url(value: String): Self = StObject.set(x, "followers_url", value.asInstanceOf[js.Any])
    
    inline def setFollowing_url(value: String): Self = StObject.set(x, "following_url", value.asInstanceOf[js.Any])
    
    inline def setGists_url(value: String): Self = StObject.set(x, "gists_url", value.asInstanceOf[js.Any])
    
    inline def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
    
    inline def setGravatar_idNull: Self = StObject.set(x, "gravatar_id", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOrganizations_url(value: String): Self = StObject.set(x, "organizations_url", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Triage): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setReceived_events_url(value: String): Self = StObject.set(x, "received_events_url", value.asInstanceOf[js.Any])
    
    inline def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    inline def setRole_name(value: String): Self = StObject.set(x, "role_name", value.asInstanceOf[js.Any])
    
    inline def setSite_admin(value: Boolean): Self = StObject.set(x, "site_admin", value.asInstanceOf[js.Any])
    
    inline def setStarred_url(value: String): Self = StObject.set(x, "starred_url", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions_url(value: String): Self = StObject.set(x, "subscriptions_url", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
