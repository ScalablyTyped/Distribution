package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blog extends StObject {
  
  /** Format: uri */
  var avatar_url: String
  
  var bio: String | Null
  
  var blog: String | Null
  
  /** @example 3 */
  var collaborators: js.UndefOr[Double] = js.undefined
  
  var company: String | Null
  
  /** Format: date-time */
  var created_at: String
  
  /** @example 1 */
  var disk_usage: js.UndefOr[Double] = js.undefined
  
  /** Format: email */
  var email: String | Null
  
  var events_url: String
  
  var followers: Double
  
  /** Format: uri */
  var followers_url: String
  
  var following: Double
  
  var following_url: String
  
  var gists_url: String
  
  var gravatar_id: String | Null
  
  var hireable: Boolean | Null
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  var location: String | Null
  
  var login: String
  
  var name: String | Null
  
  var node_id: String
  
  /** Format: uri */
  var organizations_url: String
  
  /** @example 2 */
  var owned_private_repos: js.UndefOr[Double] = js.undefined
  
  var plan: js.UndefOr[Collaborators] = js.undefined
  
  /** @example 1 */
  var private_gists: js.UndefOr[Double] = js.undefined
  
  var public_gists: Double
  
  var public_repos: Double
  
  /** Format: uri */
  var received_events_url: String
  
  /** Format: uri */
  var repos_url: String
  
  var site_admin: Boolean
  
  var starred_url: String
  
  /** Format: uri */
  var subscriptions_url: String
  
  /** Format: date-time */
  var suspended_at: js.UndefOr[String | Null] = js.undefined
  
  /** @example 2 */
  var total_private_repos: js.UndefOr[Double] = js.undefined
  
  var twitter_username: js.UndefOr[String | Null] = js.undefined
  
  var `type`: String
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object Blog {
  
  inline def apply(
    avatar_url: String,
    created_at: String,
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
    public_gists: Double,
    public_repos: Double,
    received_events_url: String,
    repos_url: String,
    site_admin: Boolean,
    starred_url: String,
    subscriptions_url: String,
    `type`: String,
    updated_at: String,
    url: String
  ): Blog = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], followers_url = followers_url.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], following_url = following_url.asInstanceOf[js.Any], gists_url = gists_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organizations_url = organizations_url.asInstanceOf[js.Any], public_gists = public_gists.asInstanceOf[js.Any], public_repos = public_repos.asInstanceOf[js.Any], received_events_url = received_events_url.asInstanceOf[js.Any], repos_url = repos_url.asInstanceOf[js.Any], site_admin = site_admin.asInstanceOf[js.Any], starred_url = starred_url.asInstanceOf[js.Any], subscriptions_url = subscriptions_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], bio = null, blog = null, company = null, email = null, gravatar_id = null, hireable = null, location = null, name = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blog] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
    
    inline def setBioNull: Self = StObject.set(x, "bio", null)
    
    inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogNull: Self = StObject.set(x, "blog", null)
    
    inline def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsUndefined: Self = StObject.set(x, "collaborators", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyNull: Self = StObject.set(x, "company", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDisk_usage(value: Double): Self = StObject.set(x, "disk_usage", value.asInstanceOf[js.Any])
    
    inline def setDisk_usageUndefined: Self = StObject.set(x, "disk_usage", js.undefined)
    
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
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOrganizations_url(value: String): Self = StObject.set(x, "organizations_url", value.asInstanceOf[js.Any])
    
    inline def setOwned_private_repos(value: Double): Self = StObject.set(x, "owned_private_repos", value.asInstanceOf[js.Any])
    
    inline def setOwned_private_reposUndefined: Self = StObject.set(x, "owned_private_repos", js.undefined)
    
    inline def setPlan(value: Collaborators): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPrivate_gists(value: Double): Self = StObject.set(x, "private_gists", value.asInstanceOf[js.Any])
    
    inline def setPrivate_gistsUndefined: Self = StObject.set(x, "private_gists", js.undefined)
    
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
    
    inline def setTotal_private_reposUndefined: Self = StObject.set(x, "total_private_repos", js.undefined)
    
    inline def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    inline def setTwitter_usernameNull: Self = StObject.set(x, "twitter_username", null)
    
    inline def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
