package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ldapdn extends StObject {
  
  /**
    * @description Description of the team
    * @example A great team.
    */
  var description: String | Null
  
  /**
    * Format: uri
    * @example https://github.com/orgs/rails/teams/core
    */
  var html_url: String
  
  /**
    * @description Unique identifier of the team
    * @example 1
    */
  var id: Double
  
  /**
    * @description Distinguished Name (DN) that team maps to within LDAP environment
    * @example uid=example,ou=users,dc=github,dc=com
    */
  var ldap_dn: js.UndefOr[String] = js.undefined
  
  /** @example https://api.github.com/organizations/1/team/1/members{/member} */
  var members_url: String
  
  /**
    * @description Name of the team
    * @example Justice League
    */
  var name: String
  
  /** @example MDQ6VGVhbTE= */
  var node_id: String
  
  /**
    * @description Permission that the team will have for its repositories
    * @example admin
    */
  var permission: String
  
  /**
    * @description The level of privacy this team should have
    * @example closed
    */
  var privacy: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/organizations/1/team/1/repos
    */
  var repositories_url: String
  
  /** @example justice-league */
  var slug: String
  
  /**
    * Format: uri
    * @description URL for the team
    * @example https://api.github.com/organizations/1/team/1
    */
  var url: String
}
object Ldapdn {
  
  inline def apply(
    html_url: String,
    id: Double,
    members_url: String,
    name: String,
    node_id: String,
    permission: String,
    repositories_url: String,
    slug: String,
    url: String
  ): Ldapdn = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members_url = members_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null)
    __obj.asInstanceOf[Ldapdn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ldapdn] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLdap_dn(value: String): Self = StObject.set(x, "ldap_dn", value.asInstanceOf[js.Any])
    
    inline def setLdap_dnUndefined: Self = StObject.set(x, "ldap_dn", js.undefined)
    
    inline def setMembers_url(value: String): Self = StObject.set(x, "members_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
    
    inline def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    
    inline def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
