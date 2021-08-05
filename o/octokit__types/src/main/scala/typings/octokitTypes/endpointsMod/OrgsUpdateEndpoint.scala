package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.none
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgsUpdateEndpoint extends StObject {
  
  /**
    * Billing email address. This address is not publicized.
    */
  var billing_email: js.UndefOr[String] = js.undefined
  
  /**
    * The company name.
    */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    * Default permission level members have for organization repositories:
    * \* `read` - can pull, but not push to or administer this repository.
    * \* `write` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push, and administer this repository.
    * \* `none` - no permissions granted by default.
    */
  var default_repository_permission: js.UndefOr[read | write | admin | none] = js.undefined
  
  /**
    * The description of the company.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The publicly visible email address.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Toggles whether an organization can use organization projects.
    */
  var has_organization_projects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Toggles whether repositories that belong to the organization can use repository projects.
    */
  var has_repository_projects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The location.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies which types of repositories non-admin organization members can create. Can be one of:
    * \* `all` - all organization members can create public and private repositories.
    * \* `private` - members can create private repositories. This option is only available to repositories that are part of an organization on GitHub Enterprise Cloud.
    * \* `none` - only admin members can create repositories.
    * **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See [this note](https://developer.github.com/v3/orgs/#members_can_create_repositories) for details.
    */
  var members_allowed_repository_creation_type: js.UndefOr[all | `private` | none] = js.undefined
  
  /**
    * Toggles whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. Can be one of:
    * \* `true` - all organization members can create internal repositories.
    * \* `false` - only organization owners can create internal repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)".
    */
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Toggles whether organization members can create private repositories, which are visible to organization members with permission. Can be one of:
    * \* `true` - all organization members can create private repositories.
    * \* `false` - only organization owners can create private repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)".
    */
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Toggles whether organization members can create public repositories, which are visible to anyone. Can be one of:
    * \* `true` - all organization members can create public repositories.
    * \* `false` - only organization owners can create public repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)".
    */
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Toggles the ability of non-admin organization members to create repositories. Can be one of:
    * \* `true` - all organization members can create repositories.
    * \* `false` - only organization owners can create repositories.
    * Default: `true`
    * **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.
    */
  var members_can_create_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The shorthand name of the company.
    */
  var name: js.UndefOr[String] = js.undefined
  
  @JSName("org")
  var org_ : String
  
  /**
    * The Twitter username of the company.
    */
  var twitter_username: js.UndefOr[String] = js.undefined
}
object OrgsUpdateEndpoint {
  
  inline def apply(org_ : String): OrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateEndpoint]
  }
  
  extension [Self <: OrgsUpdateEndpoint](x: Self) {
    
    inline def setBilling_email(value: String): Self = StObject.set(x, "billing_email", value.asInstanceOf[js.Any])
    
    inline def setBilling_emailUndefined: Self = StObject.set(x, "billing_email", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setDefault_repository_permission(value: read | write | admin | none): Self = StObject.set(x, "default_repository_permission", value.asInstanceOf[js.Any])
    
    inline def setDefault_repository_permissionUndefined: Self = StObject.set(x, "default_repository_permission", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setHas_organization_projects(value: Boolean): Self = StObject.set(x, "has_organization_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_organization_projectsUndefined: Self = StObject.set(x, "has_organization_projects", js.undefined)
    
    inline def setHas_repository_projects(value: Boolean): Self = StObject.set(x, "has_repository_projects", value.asInstanceOf[js.Any])
    
    inline def setHas_repository_projectsUndefined: Self = StObject.set(x, "has_repository_projects", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMembers_allowed_repository_creation_type(value: all | `private` | none): Self = StObject.set(x, "members_allowed_repository_creation_type", value.asInstanceOf[js.Any])
    
    inline def setMembers_allowed_repository_creation_typeUndefined: Self = StObject.set(x, "members_allowed_repository_creation_type", js.undefined)
    
    inline def setMembers_can_create_internal_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_internal_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_internal_repositoriesUndefined: Self = StObject.set(x, "members_can_create_internal_repositories", js.undefined)
    
    inline def setMembers_can_create_private_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_private_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_private_repositoriesUndefined: Self = StObject.set(x, "members_can_create_private_repositories", js.undefined)
    
    inline def setMembers_can_create_public_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_public_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_public_repositoriesUndefined: Self = StObject.set(x, "members_can_create_public_repositories", js.undefined)
    
    inline def setMembers_can_create_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_repositoriesUndefined: Self = StObject.set(x, "members_can_create_repositories", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    inline def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
  }
}
