package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.closed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.notifications_disabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.notifications_enabled
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.secret
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reposcount extends StObject {
  
  /**
    * Format: date-time
    * @example 2017-07-14T16:53:42Z
    */
  var created_at: String
  
  /** @example A great team. */
  var description: String | Null
  
  /**
    * Format: uri
    * @example https://github.com/orgs/rails/teams/core
    */
  var html_url: String
  
  /**
    * @description Unique identifier of the team
    * @example 42
    */
  var id: Double
  
  /**
    * @description Distinguished Name (DN) that team maps to within LDAP environment
    * @example uid=example,ou=users,dc=github,dc=com
    */
  var ldap_dn: js.UndefOr[String] = js.undefined
  
  /** @example 3 */
  var members_count: Double
  
  /** @example https://api.github.com/organizations/1/team/1/members{/member} */
  var members_url: String
  
  /**
    * @description Name of the team
    * @example Developers
    */
  var name: String
  
  /** @example MDQ6VGVhbTE= */
  var node_id: String
  
  /**
    * @description The notification setting the team has set
    * @example notifications_enabled
    * @enum {string}
    */
  var notification_setting: js.UndefOr[notifications_enabled | notifications_disabled] = js.undefined
  
  var organization: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team-organization'] */ js.Any
  
  var parent: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-team-simple'] */ js.Any
  ] = js.undefined
  
  /**
    * @description Permission that the team will have for its repositories
    * @example push
    */
  var permission: String
  
  /**
    * @description The level of privacy this team should have
    * @example closed
    * @enum {string}
    */
  var privacy: js.UndefOr[closed | secret] = js.undefined
  
  /** @example 10 */
  var repos_count: Double
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/1/team/1/repos
    */
  var repositories_url: String
  
  /** @example justice-league */
  var slug: String
  
  /**
    * Format: date-time
    * @example 2017-08-17T12:37:15Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @description URL for the team
    * @example https://api.github.com/organizations/1/team/1
    */
  var url: String
}
object Reposcount {
  
  inline def apply(
    created_at: String,
    html_url: String,
    id: Double,
    members_count: Double,
    members_url: String,
    name: String,
    node_id: String,
    organization: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team-organization'] */ js.Any,
    permission: String,
    repos_count: Double,
    repositories_url: String,
    slug: String,
    updated_at: String,
    url: String
  ): Reposcount = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_count = members_count.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repos_count = repos_count.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Reposcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reposcount] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLdap_dn(value: String): Self = StObject.set(x, "ldap_dn", value.asInstanceOf[js.Any])
    
    inline def setLdap_dnUndefined: Self = StObject.set(x, "ldap_dn", js.undefined)
    
    inline def setMembers_count(value: Double): Self = StObject.set(x, "members_count", value.asInstanceOf[js.Any])
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNotification_setting(value: notifications_enabled | notifications_disabled): Self = StObject.set(x, "notification_setting", value.asInstanceOf[js.Any])
    
    inline def setNotification_settingUndefined: Self = StObject.set(x, "notification_setting", js.undefined)
    
    inline def setOrganization(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team-organization'] */ js.Any
    ): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setParent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-team-simple'] */ js.Any
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: closed | secret): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setRepos_count(value: Double): Self = StObject.set(x, "repos_count", value.asInstanceOf[js.Any])
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
