package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advancedsecurityenabledfornewrepositories extends StObject {
  
  /**
    * @description Whether GitHub Advanced Security is automatically enabled for new repositories.
    *
    * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
    */
  var advanced_security_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @description Billing email address. This address is not publicized. */
  var billing_email: js.UndefOr[String] = js.undefined
  
  /** @example "http://github.blog" */
  var blog: js.UndefOr[String] = js.undefined
  
  /** @description The company name. */
  var company: js.UndefOr[String] = js.undefined
  
  /**
    * @description Default permission level members have for organization repositories.
    * @default read
    * @enum {string}
    */
  var default_repository_permission: js.UndefOr[read | write | admin | none_] = js.undefined
  
  /**
    * @description Whether Dependabot alerts is automatically enabled for new repositories.
    *
    * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
    */
  var dependabot_alerts_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether Dependabot security updates is automatically enabled for new repositories.
    *
    * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
    */
  var dependabot_security_updates_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether dependency graph is automatically enabled for new repositories.
    *
    * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
    */
  var dependency_graph_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @description The description of the company. */
  var description: js.UndefOr[String] = js.undefined
  
  /** @description The publicly visible email address. */
  var email: js.UndefOr[String] = js.undefined
  
  /** @description Whether an organization can use organization projects. */
  var has_organization_projects: js.UndefOr[Boolean] = js.undefined
  
  /** @description Whether repositories that belong to the organization can use repository projects. */
  var has_repository_projects: js.UndefOr[Boolean] = js.undefined
  
  /** @description The location. */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * @description Specifies which types of repositories non-admin organization members can create. `private` is only available to repositories that are part of an organization on GitHub Enterprise Cloud.
    * **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter deprecation notice in the operation description for details.
    * @enum {string}
    */
  var members_allowed_repository_creation_type: js.UndefOr[all | `private` | none_] = js.undefined
  
  /** @description Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation. */
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted.
    * @default true
    */
  var members_can_create_pages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted.
    * @default true
    */
  var members_can_create_private_pages: js.UndefOr[Boolean] = js.undefined
  
  /** @description Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation. */
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted.
    * @default true
    */
  var members_can_create_public_pages: js.UndefOr[Boolean] = js.undefined
  
  /** @description Whether organization members can create public repositories, which are visible to anyone. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation. */
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.
    * @default true
    */
  var members_can_create_repositories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether organization members can fork private organization repositories.
    * @default false
    */
  var members_can_fork_private_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @description The shorthand name of the company. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * @description Whether secret scanning is automatically enabled for new repositories.
    *
    * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
    */
  var secret_scanning_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @description If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors who are blocked from pushing a secret. */
  var secret_scanning_push_protection_custom_link: js.UndefOr[String] = js.undefined
  
  /** @description Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection. */
  var secret_scanning_push_protection_custom_link_enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description Whether secret scanning push protection is automatically enabled for new repositories.
    *
    * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    *
    * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
    */
  var secret_scanning_push_protection_enabled_for_new_repositories: js.UndefOr[Boolean] = js.undefined
  
  /** @description The Twitter username of the company. */
  var twitter_username: js.UndefOr[String] = js.undefined
  
  /**
    * @description Whether contributors to organization repositories are required to sign off on commits they make through GitHub's web interface.
    * @default false
    */
  var web_commit_signoff_required: js.UndefOr[Boolean] = js.undefined
}
object Advancedsecurityenabledfornewrepositories {
  
  inline def apply(): Advancedsecurityenabledfornewrepositories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advancedsecurityenabledfornewrepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Advancedsecurityenabledfornewrepositories] (val x: Self) extends AnyVal {
    
    inline def setAdvanced_security_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "advanced_security_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setAdvanced_security_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "advanced_security_enabled_for_new_repositories", js.undefined)
    
    inline def setBilling_email(value: String): Self = StObject.set(x, "billing_email", value.asInstanceOf[js.Any])
    
    inline def setBilling_emailUndefined: Self = StObject.set(x, "billing_email", js.undefined)
    
    inline def setBlog(value: String): Self = StObject.set(x, "blog", value.asInstanceOf[js.Any])
    
    inline def setBlogUndefined: Self = StObject.set(x, "blog", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setDefault_repository_permission(value: read | write | admin | none_): Self = StObject.set(x, "default_repository_permission", value.asInstanceOf[js.Any])
    
    inline def setDefault_repository_permissionUndefined: Self = StObject.set(x, "default_repository_permission", js.undefined)
    
    inline def setDependabot_alerts_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "dependabot_alerts_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setDependabot_alerts_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "dependabot_alerts_enabled_for_new_repositories", js.undefined)
    
    inline def setDependabot_security_updates_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "dependabot_security_updates_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setDependabot_security_updates_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "dependabot_security_updates_enabled_for_new_repositories", js.undefined)
    
    inline def setDependency_graph_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "dependency_graph_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setDependency_graph_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "dependency_graph_enabled_for_new_repositories", js.undefined)
    
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
    
    inline def setMembers_allowed_repository_creation_type(value: all | `private` | none_): Self = StObject.set(x, "members_allowed_repository_creation_type", value.asInstanceOf[js.Any])
    
    inline def setMembers_allowed_repository_creation_typeUndefined: Self = StObject.set(x, "members_allowed_repository_creation_type", js.undefined)
    
    inline def setMembers_can_create_internal_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_internal_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_internal_repositoriesUndefined: Self = StObject.set(x, "members_can_create_internal_repositories", js.undefined)
    
    inline def setMembers_can_create_pages(value: Boolean): Self = StObject.set(x, "members_can_create_pages", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_pagesUndefined: Self = StObject.set(x, "members_can_create_pages", js.undefined)
    
    inline def setMembers_can_create_private_pages(value: Boolean): Self = StObject.set(x, "members_can_create_private_pages", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_private_pagesUndefined: Self = StObject.set(x, "members_can_create_private_pages", js.undefined)
    
    inline def setMembers_can_create_private_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_private_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_private_repositoriesUndefined: Self = StObject.set(x, "members_can_create_private_repositories", js.undefined)
    
    inline def setMembers_can_create_public_pages(value: Boolean): Self = StObject.set(x, "members_can_create_public_pages", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_public_pagesUndefined: Self = StObject.set(x, "members_can_create_public_pages", js.undefined)
    
    inline def setMembers_can_create_public_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_public_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_public_repositoriesUndefined: Self = StObject.set(x, "members_can_create_public_repositories", js.undefined)
    
    inline def setMembers_can_create_repositories(value: Boolean): Self = StObject.set(x, "members_can_create_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_create_repositoriesUndefined: Self = StObject.set(x, "members_can_create_repositories", js.undefined)
    
    inline def setMembers_can_fork_private_repositories(value: Boolean): Self = StObject.set(x, "members_can_fork_private_repositories", value.asInstanceOf[js.Any])
    
    inline def setMembers_can_fork_private_repositoriesUndefined: Self = StObject.set(x, "members_can_fork_private_repositories", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecret_scanning_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "secret_scanning_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "secret_scanning_enabled_for_new_repositories", js.undefined)
    
    inline def setSecret_scanning_push_protection_custom_link(value: String): Self = StObject.set(x, "secret_scanning_push_protection_custom_link", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_push_protection_custom_linkUndefined: Self = StObject.set(x, "secret_scanning_push_protection_custom_link", js.undefined)
    
    inline def setSecret_scanning_push_protection_custom_link_enabled(value: Boolean): Self = StObject.set(x, "secret_scanning_push_protection_custom_link_enabled", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_push_protection_custom_link_enabledUndefined: Self = StObject.set(x, "secret_scanning_push_protection_custom_link_enabled", js.undefined)
    
    inline def setSecret_scanning_push_protection_enabled_for_new_repositories(value: Boolean): Self = StObject.set(x, "secret_scanning_push_protection_enabled_for_new_repositories", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_push_protection_enabled_for_new_repositoriesUndefined: Self = StObject.set(x, "secret_scanning_push_protection_enabled_for_new_repositories", js.undefined)
    
    inline def setTwitter_username(value: String): Self = StObject.set(x, "twitter_username", value.asInstanceOf[js.Any])
    
    inline def setTwitter_usernameUndefined: Self = StObject.set(x, "twitter_username", js.undefined)
    
    inline def setWeb_commit_signoff_required(value: Boolean): Self = StObject.set(x, "web_commit_signoff_required", value.asInstanceOf[js.Any])
    
    inline def setWeb_commit_signoff_requiredUndefined: Self = StObject.set(x, "web_commit_signoff_required", js.undefined)
  }
}
