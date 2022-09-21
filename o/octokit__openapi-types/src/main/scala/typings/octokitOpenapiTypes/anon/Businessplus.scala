package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Businessplus extends StObject {
  
  /**
    * Format: uri
    * @example https://github.com/images/error/octocat_happy.gif
    */
  var avatar_url: String
  
  /** @example There once was... */
  var bio: String | Null
  
  /** @example https://github.com/blog */
  var blog: String | Null
  
  var business_plus: js.UndefOr[Boolean] = js.undefined
  
  /** @example 8 */
  var collaborators: Double
  
  /** @example GitHub */
  var company: String | Null
  
  /**
    * Format: date-time
    * @example 2008-01-14T04:33:35Z
    */
  var created_at: String
  
  /** @example 10000 */
  var disk_usage: Double
  
  /**
    * Format: email
    * @example octocat@github.com
    */
  var email: String | Null
  
  /** @example https://api.github.com/users/octocat/events{/privacy} */
  var events_url: String
  
  /** @example 20 */
  var followers: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/followers
    */
  var followers_url: String
  
  /** @example 0 */
  var following: Double
  
  /** @example https://api.github.com/users/octocat/following{/other_user} */
  var following_url: String
  
  /** @example https://api.github.com/users/octocat/gists{/gist_id} */
  var gists_url: String
  
  /** @example 41d064eb2195891e12d0413f63227ea7 */
  var gravatar_id: String | Null
  
  var hireable: Boolean | Null
  
  /**
    * Format: uri
    * @example https://github.com/octocat
    */
  var html_url: String
  
  /** @example 1 */
  var id: Double
  
  var ldap_dn: js.UndefOr[String] = js.undefined
  
  /** @example San Francisco */
  var location: String | Null
  
  /** @example octocat */
  var login: String
  
  /** @example monalisa octocat */
  var name: String | Null
  
  /** @example MDQ6VXNlcjE= */
  var node_id: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/orgs
    */
  var organizations_url: String
  
  /** @example 100 */
  var owned_private_repos: Double
  
  var plan: js.UndefOr[Collaborators] = js.undefined
  
  /** @example 81 */
  var private_gists: Double
  
  /** @example 1 */
  var public_gists: Double
  
  /** @example 2 */
  var public_repos: Double
  
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
  
  var site_admin: Boolean
  
  /** @example https://api.github.com/users/octocat/starred{/owner}{/repo} */
  var starred_url: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat/subscriptions
    */
  var subscriptions_url: String
  
  /** Format: date-time */
  var suspended_at: js.UndefOr[String | Null] = js.undefined
  
  /** @example 100 */
  var total_private_repos: Double
  
  /** @example monalisa */
  var twitter_username: js.UndefOr[String | Null] = js.undefined
  
  /** @example true */
  var two_factor_authentication: Boolean
  
  /** @example User */
  var `type`: String
  
  /**
    * Format: date-time
    * @example 2008-01-14T04:33:35Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/users/octocat
    */
  var url: String
}
object Businessplus {
  
  inline def apply(
    avatar_url: String,
    collaborators: Double,
    created_at: String,
    disk_usage: Double,
    events_url: String,
    followers: Double,
    followers_url: String,
    following: Double,
    following_url: String,
    gists_url: String,
    html_url: String,
    id: Double,
    login: String,
    node_id: String,
    organizations_url: String,
    owned_private_repos: Double,
    private_gists: Double,
    public_gists: Double,
    public_repos: Double,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    total_private_repos: Double,
    two_factor_authentication: Boolean,
    `type`: String,
    updated_at: String,
    url: String
  ): Businessplus = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], disk_usage = disk_usage.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], owned_private_repos = owned_private_repos.asInstanceOf[js.Any], private_gists = private_gists.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], total_private_repos = total_private_repos.asInstanceOf[js.Any], two_factor_authentication = two_factor_authentication.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], bio = null, blog = null, company = null, email = null, gravatar_id = null, hireable = null, location = null, name = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Businessplus]
  }
  
  extension [Self <: Businessplus](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioNull: Self = StObject.set(x, "bio", null)
    
    inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogNull: Self = StObject.set(x, "blog", null)
    
    inline def setBusiness_plus(value: Boolean): Self = StObject.set(x, "business_plus", value.asInstanceOf[js.Any])
    
    inline def setBusiness_plusUndefined: Self = StObject.set(x, "business_plus", js.undefined)
    
    inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyNull: Self = StObject.set(x, "company", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDisk_usage(value: Double): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setFollowers_url(value: String): Self = StObject.set(x, "followers_url", value.asInstanceOf[js.Any])
    
    inline def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setFollowing_url(value: String): Self = StObject.set(x, "following_url", value.asInstanceOf[js.Any])
    
    inline def setGists_url(value: String): Self = StObject.set(x, "gists_url", value.asInstanceOf[js.Any])
    
    inline def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
    
    inline def setGravatar_idNull: Self = StObject.set(x, "gravatar_id", null)
    
    inline def setHireable(value: Boolean): Self = StObject.set(x, "hireable", value.asInstanceOf[js.Any])
    
    inline def setHireableNull: Self = StObject.set(x, "hireable", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLdap_dn(value: String): Self = StObject.set(x, "ldap_dn", value.asInstanceOf[js.Any])
    
    inline def setLdap_dnUndefined: Self = StObject.set(x, "ldap_dn", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOrganizations_url(value: String): Self = StObject.set(x, "organizations_url", value.asInstanceOf[js.Any])
    
    inline def setOwned_private_repos(value: Double): Self = StObject.set(x, "owned_private_repos", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Collaborators): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPrivate_gists(value: Double): Self = StObject.set(x, "private_gists", value.asInstanceOf[js.Any])
    
    inline def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
    
    inline def setPublic_repos(value: Double): Self = StObject.set(x, "public_repos", value.asInstanceOf[js.Any])
    
    inline def setReceived_events_url(value: String): Self = StObject.set(x, "received_events_url", value.asInstanceOf[js.Any])
    
    inline def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    inline def setSite_admin(value: Boolean): Self = StObject.set(x, "site_admin", value.asInstanceOf[js.Any])
    
    inline def setStarred_url(value: String): Self = StObject.set(x, "starred_url", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions_url(value: String): Self = StObject.set(x, "subscriptions_url", value.asInstanceOf[js.Any])
    
    inline def setSuspended_at(value: String): Self = StObject.set(x, "suspended_at", value.asInstanceOf[js.Any])
    
    inline def setSuspended_atNull: Self = StObject.set(x, "suspended_at", null)
    
    inline def setSuspended_atUndefined: Self = StObject.set(x, "suspended_at", js.undefined)
    
    inline def setTotal_private_repos(value: Double): Self = StObject.set(x, "total_private_repos", value.asInstanceOf[js.Any])
    
    inline def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    inline def setTwitter_usernameNull: Self = StObject.set(x, "twitter_username", null)
    
    inline def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
    
    inline def setTwo_factor_authentication(value: Boolean): Self = StObject.set(x, "two_factor_authentication", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
