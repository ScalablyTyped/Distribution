package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Administration extends StObject {
  
  /**
    * @description The level of permission to grant the access token for GitHub Actions workflows, workflow runs, and artifacts.
    * @enum {string}
    */
  var actions: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for repository creation, deletion, settings, teams, and collaborators creation.
    * @enum {string}
    */
  var administration: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for checks on code.
    * @enum {string}
    */
  var checks: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for repository contents, commits, branches, downloads, releases, and merges.
    * @enum {string}
    */
  var contents: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for deployments and deployment statuses.
    * @enum {string}
    */
  var deployments: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for managing repository environments.
    * @enum {string}
    */
  var environments: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for issues and related comments, assignees, labels, and milestones.
    * @enum {string}
    */
  var issues: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for organization teams and members.
    * @enum {string}
    */
  var members: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to search repositories, list collaborators, and access repository metadata.
    * @enum {string}
    */
  var metadata: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage access to an organization.
    * @enum {string}
    */
  var organization_administration: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for custom roles management. This property is in beta and is subject to change.
    * @enum {string}
    */
  var organization_custom_roles: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage the post-receive hooks for an organization.
    * @enum {string}
    */
  var organization_hooks: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for organization packages published to GitHub Packages.
    * @enum {string}
    */
  var organization_packages: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for viewing an organization's plan.
    * @enum {string}
    */
  var organization_plan: js.UndefOr[read] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage organization projects and projects beta (where available).
    * @enum {string}
    */
  var organization_projects: js.UndefOr[read | write | admin] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage organization secrets.
    * @enum {string}
    */
  var organization_secrets: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to view and manage GitHub Actions self-hosted runners available to an organization.
    * @enum {string}
    */
  var organization_self_hosted_runners: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to view and manage users blocked by the organization.
    * @enum {string}
    */
  var organization_user_blocking: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for packages published to GitHub Packages.
    * @enum {string}
    */
  var packages: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to retrieve Pages statuses, configuration, and builds, as well as create new builds.
    * @enum {string}
    */
  var pages: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for pull requests and related comments, assignees, labels, milestones, and merges.
    * @enum {string}
    */
  var pull_requests: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage the post-receive hooks for a repository.
    * @enum {string}
    */
  var repository_hooks: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage repository projects, columns, and cards.
    * @enum {string}
    */
  var repository_projects: js.UndefOr[read | write | admin] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to view and manage secret scanning alerts.
    * @enum {string}
    */
  var secret_scanning_alerts: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage repository secrets.
    * @enum {string}
    */
  var secrets: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to view and manage security events like code scanning alerts.
    * @enum {string}
    */
  var security_events: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage just a single file.
    * @enum {string}
    */
  var single_file: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token for commit statuses.
    * @enum {string}
    */
  var statuses: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage team discussions and related comments.
    * @enum {string}
    */
  var team_discussions: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to manage Dependabot alerts.
    * @enum {string}
    */
  var vulnerability_alerts: js.UndefOr[read | write] = js.undefined
  
  /**
    * @description The level of permission to grant the access token to update GitHub Actions workflow files.
    * @enum {string}
    */
  var workflows: js.UndefOr[write] = js.undefined
}
object Administration {
  
  inline def apply(): Administration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Administration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Administration] (val x: Self) extends AnyVal {
    
    inline def setActions(value: read | write): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setAdministration(value: read | write): Self = StObject.set(x, "administration", value.asInstanceOf[js.Any])
    
    inline def setAdministrationUndefined: Self = StObject.set(x, "administration", js.undefined)
    
    inline def setChecks(value: read | write): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    inline def setContents(value: read | write): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setDeployments(value: read | write): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setEnvironments(value: read | write): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setIssues(value: read | write): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setMembers(value: read | write): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMetadata(value: read | write): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOrganization_administration(value: read | write): Self = StObject.set(x, "organization_administration", value.asInstanceOf[js.Any])
    
    inline def setOrganization_administrationUndefined: Self = StObject.set(x, "organization_administration", js.undefined)
    
    inline def setOrganization_custom_roles(value: read | write): Self = StObject.set(x, "organization_custom_roles", value.asInstanceOf[js.Any])
    
    inline def setOrganization_custom_rolesUndefined: Self = StObject.set(x, "organization_custom_roles", js.undefined)
    
    inline def setOrganization_hooks(value: read | write): Self = StObject.set(x, "organization_hooks", value.asInstanceOf[js.Any])
    
    inline def setOrganization_hooksUndefined: Self = StObject.set(x, "organization_hooks", js.undefined)
    
    inline def setOrganization_packages(value: read | write): Self = StObject.set(x, "organization_packages", value.asInstanceOf[js.Any])
    
    inline def setOrganization_packagesUndefined: Self = StObject.set(x, "organization_packages", js.undefined)
    
    inline def setOrganization_plan(value: read): Self = StObject.set(x, "organization_plan", value.asInstanceOf[js.Any])
    
    inline def setOrganization_planUndefined: Self = StObject.set(x, "organization_plan", js.undefined)
    
    inline def setOrganization_projects(value: read | write | admin): Self = StObject.set(x, "organization_projects", value.asInstanceOf[js.Any])
    
    inline def setOrganization_projectsUndefined: Self = StObject.set(x, "organization_projects", js.undefined)
    
    inline def setOrganization_secrets(value: read | write): Self = StObject.set(x, "organization_secrets", value.asInstanceOf[js.Any])
    
    inline def setOrganization_secretsUndefined: Self = StObject.set(x, "organization_secrets", js.undefined)
    
    inline def setOrganization_self_hosted_runners(value: read | write): Self = StObject.set(x, "organization_self_hosted_runners", value.asInstanceOf[js.Any])
    
    inline def setOrganization_self_hosted_runnersUndefined: Self = StObject.set(x, "organization_self_hosted_runners", js.undefined)
    
    inline def setOrganization_user_blocking(value: read | write): Self = StObject.set(x, "organization_user_blocking", value.asInstanceOf[js.Any])
    
    inline def setOrganization_user_blockingUndefined: Self = StObject.set(x, "organization_user_blocking", js.undefined)
    
    inline def setPackages(value: read | write): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPages(value: read | write): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPull_requests(value: read | write): Self = StObject.set(x, "pull_requests", value.asInstanceOf[js.Any])
    
    inline def setPull_requestsUndefined: Self = StObject.set(x, "pull_requests", js.undefined)
    
    inline def setRepository_hooks(value: read | write): Self = StObject.set(x, "repository_hooks", value.asInstanceOf[js.Any])
    
    inline def setRepository_hooksUndefined: Self = StObject.set(x, "repository_hooks", js.undefined)
    
    inline def setRepository_projects(value: read | write | admin): Self = StObject.set(x, "repository_projects", value.asInstanceOf[js.Any])
    
    inline def setRepository_projectsUndefined: Self = StObject.set(x, "repository_projects", js.undefined)
    
    inline def setSecret_scanning_alerts(value: read | write): Self = StObject.set(x, "secret_scanning_alerts", value.asInstanceOf[js.Any])
    
    inline def setSecret_scanning_alertsUndefined: Self = StObject.set(x, "secret_scanning_alerts", js.undefined)
    
    inline def setSecrets(value: read | write): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsUndefined: Self = StObject.set(x, "secrets", js.undefined)
    
    inline def setSecurity_events(value: read | write): Self = StObject.set(x, "security_events", value.asInstanceOf[js.Any])
    
    inline def setSecurity_eventsUndefined: Self = StObject.set(x, "security_events", js.undefined)
    
    inline def setSingle_file(value: read | write): Self = StObject.set(x, "single_file", value.asInstanceOf[js.Any])
    
    inline def setSingle_fileUndefined: Self = StObject.set(x, "single_file", js.undefined)
    
    inline def setStatuses(value: read | write): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setTeam_discussions(value: read | write): Self = StObject.set(x, "team_discussions", value.asInstanceOf[js.Any])
    
    inline def setTeam_discussionsUndefined: Self = StObject.set(x, "team_discussions", js.undefined)
    
    inline def setVulnerability_alerts(value: read | write): Self = StObject.set(x, "vulnerability_alerts", value.asInstanceOf[js.Any])
    
    inline def setVulnerability_alertsUndefined: Self = StObject.set(x, "vulnerability_alerts", js.undefined)
    
    inline def setWorkflows(value: write): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsUndefined: Self = StObject.set(x, "workflows", js.undefined)
  }
}
