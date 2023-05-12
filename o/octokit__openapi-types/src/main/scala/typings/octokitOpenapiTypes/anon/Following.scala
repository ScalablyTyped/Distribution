package typings.octokitOpenapiTypes.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Following extends StObject {
  
  var avatar_url: String
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
  
  var events_url: js.UndefOr[String] = js.undefined
  
  var followers: js.UndefOr[Double] = js.undefined
  
  var followers_url: js.UndefOr[String] = js.undefined
  
  var following: js.UndefOr[Double] = js.undefined
  
  var following_url: js.UndefOr[String] = js.undefined
  
  var gists_url: js.UndefOr[String] = js.undefined
  
  var gravatar_id: js.UndefOr[String] = js.undefined
  
  var has_organization_projects: js.UndefOr[Boolean] = js.undefined
  
  var has_repository_projects: js.UndefOr[Boolean] = js.undefined
  
  var hooks_url: js.UndefOr[String] = js.undefined
  
  var html_url: String
  
  var id: Double
  
  var is_verified: js.UndefOr[Boolean] = js.undefined
  
  var issues_url: js.UndefOr[String] = js.undefined
  
  var login: js.UndefOr[String] = js.undefined
  
  var members_url: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var node_id: String
  
  var organizations_url: js.UndefOr[String] = js.undefined
  
  var public_gists: js.UndefOr[Double] = js.undefined
  
  var public_members_url: js.UndefOr[String] = js.undefined
  
  var public_repos: js.UndefOr[Double] = js.undefined
  
  var received_events_url: js.UndefOr[String] = js.undefined
  
  var repos_url: js.UndefOr[String] = js.undefined
  
  var site_admin: js.UndefOr[Boolean] = js.undefined
  
  var slug: js.UndefOr[String] = js.undefined
  
  var starred_url: js.UndefOr[String] = js.undefined
  
  var subscriptions_url: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var updated_at: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var website_url: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
}
object Following {
  
  inline def apply(avatar_url: String, html_url: String, id: Double, node_id: String): Following = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Following]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Following] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setDescription(value: Record[String, Any]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setEvents_urlUndefined: Self = StObject.set(x, "events_url", js.undefined)
    
    inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
    
    inline def setFollowersUndefined: Self = StObject.set(x, "followers", js.undefined)
    
    inline def setFollowers_url(value: String): Self = StObject.set(x, "followers_url", value.asInstanceOf[js.Any])
    
    inline def setFollowers_urlUndefined: Self = StObject.set(x, "followers_url", js.undefined)
    
    inline def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setFollowingUndefined: Self = StObject.set(x, "following", js.undefined)
    
    inline def setFollowing_url(value: String): Self = StObject.set(x, "following_url", value.asInstanceOf[js.Any])
    
    inline def setFollowing_urlUndefined: Self = StObject.set(x, "following_url", js.undefined)
    
    inline def setGists_url(value: String): Self = StObject.set(x, "gists_url", value.asInstanceOf[js.Any])
    
    inline def setGists_urlUndefined: Self = StObject.set(x, "gists_url", js.undefined)
    
    inline def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
    
    inline def setGravatar_idUndefined: Self = StObject.set(x, "gravatar_id", js.undefined)
    
    inline def setHas_organization_projects(value: Boolean): Self = StObject.set(x, "has_organization_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_organization_projectsUndefined: Self = StObject.set(x, "has_organization_projects", js.undefined)
    
    inline def setHas_repository_projects(value: Boolean): Self = StObject.set(x, "has_repository_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_repository_projectsUndefined: Self = StObject.set(x, "has_repository_projects", js.undefined)
    
    inline def setHooks_url(value: String): Self = StObject.set(x, "hooks_url", value.asInstanceOf[js.Any])
    
    inline def setHooks_urlUndefined: Self = StObject.set(x, "hooks_url", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    inline def setIs_verifiedUndefined: Self = StObject.set(x, "is_verified", js.undefined)
    
    inline def setIssues_url(value: String): Self = StObject.set(x, "issues_url", value.asInstanceOf[js.Any])
    
    inline def setIssues_urlUndefined: Self = StObject.set(x, "issues_url", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setMembers_urlUndefined: Self = StObject.set(x, "members_url", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOrganizations_url(value: String): Self = StObject.set(x, "organizations_url", value.asInstanceOf[js.Any])
    
    inline def setOrganizations_urlUndefined: Self = StObject.set(x, "organizations_url", js.undefined)
    
    inline def setPublic_gists(value: Double): Self = StObject.set(x, "public_gists", value.asInstanceOf[js.Any])
    
    inline def setPublic_gistsUndefined: Self = StObject.set(x, "public_gists", js.undefined)
    
    inline def setPublic_members_url(value: String): Self = StObject.set(x, "public_members_url", value.asInstanceOf[js.Any])
    
    inline def setPublic_members_urlUndefined: Self = StObject.set(x, "public_members_url", js.undefined)
    
    inline def setPublic_repos(value: Double): Self = StObject.set(x, "public_repos", value.asInstanceOf[js.Any])
    
    inline def setPublic_reposUndefined: Self = StObject.set(x, "public_repos", js.undefined)
    
    inline def setReceived_events_url(value: String): Self = StObject.set(x, "received_events_url", value.asInstanceOf[js.Any])
    
    inline def setReceived_events_urlUndefined: Self = StObject.set(x, "received_events_url", js.undefined)
    
    inline def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    inline def setRepos_urlUndefined: Self = StObject.set(x, "repos_url", js.undefined)
    
    inline def setSite_admin(value: Boolean): Self = StObject.set(x, "site_admin", value.asInstanceOf[js.Any])
    
    inline def setSite_adminUndefined: Self = StObject.set(x, "site_admin", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setStarred_url(value: String): Self = StObject.set(x, "starred_url", value.asInstanceOf[js.Any])
    
    inline def setStarred_urlUndefined: Self = StObject.set(x, "starred_url", js.undefined)
    
    inline def setSubscriptions_url(value: String): Self = StObject.set(x, "subscriptions_url", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions_urlUndefined: Self = StObject.set(x, "subscriptions_url", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWebsite_url(value: Record[String, Any]): Self = StObject.set(x, "website_url", value.asInstanceOf[js.Any])
    
    inline def setWebsite_urlNull: Self = StObject.set(x, "website_url", null)
    
    inline def setWebsite_urlUndefined: Self = StObject.set(x, "website_url", js.undefined)
  }
}
