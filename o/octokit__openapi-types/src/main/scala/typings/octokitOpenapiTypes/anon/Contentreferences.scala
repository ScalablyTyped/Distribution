package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.read
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contentreferences extends StObject {
  
  /** @enum {string} */
  var actions: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var administration: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var checks: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var content_references: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var contents: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var deployments: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var discussions: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var emails: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var environments: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var issues: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var keys: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var members: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var metadata: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var organization_administration: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var organization_hooks: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var organization_packages: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var organization_plan: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var organization_projects: js.UndefOr[read | write | admin] = js.undefined
  
  /** @enum {string} */
  var organization_secrets: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var organization_self_hosted_runners: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var organization_user_blocking: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var packages: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var pages: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var pull_requests: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var repository_hooks: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var repository_projects: js.UndefOr[read | write | admin] = js.undefined
  
  /** @enum {string} */
  var secret_scanning_alerts: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var secrets: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var security_events: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var security_scanning_alert: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var single_file: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var statuses: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var team_discussions: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var vulnerability_alerts: js.UndefOr[read | write] = js.undefined
  
  /** @enum {string} */
  var workflows: js.UndefOr[read | write] = js.undefined
}
object Contentreferences {
  
  inline def apply(): Contentreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contentreferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contentreferences] (val x: Self) extends AnyVal {
    
    inline def setActions(value: read | write): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setAdministration(value: read | write): Self = StObject.set(x, "administration", value.asInstanceOf[js.Any])
    
    inline def setAdministrationUndefined: Self = StObject.set(x, "administration", js.undefined)
    
    inline def setChecks(value: read | write): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    inline def setContent_references(value: read | write): Self = StObject.set(x, "content_references", value.asInstanceOf[js.Any])
    
    inline def setContent_referencesUndefined: Self = StObject.set(x, "content_references", js.undefined)
    
    inline def setContents(value: read | write): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setDeployments(value: read | write): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    inline def setDiscussions(value: read | write): Self = StObject.set(x, "discussions", value.asInstanceOf[js.Any])
    
    inline def setDiscussionsUndefined: Self = StObject.set(x, "discussions", js.undefined)
    
    inline def setEmails(value: read | write): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEnvironments(value: read | write): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setIssues(value: read | write): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setKeys(value: read | write): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setMembers(value: read | write): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMetadata(value: read | write): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setOrganization_administration(value: read | write): Self = StObject.set(x, "organization_administration", value.asInstanceOf[js.Any])
    
    inline def setOrganization_administrationUndefined: Self = StObject.set(x, "organization_administration", js.undefined)
    
    inline def setOrganization_hooks(value: read | write): Self = StObject.set(x, "organization_hooks", value.asInstanceOf[js.Any])
    
    inline def setOrganization_hooksUndefined: Self = StObject.set(x, "organization_hooks", js.undefined)
    
    inline def setOrganization_packages(value: read | write): Self = StObject.set(x, "organization_packages", value.asInstanceOf[js.Any])
    
    inline def setOrganization_packagesUndefined: Self = StObject.set(x, "organization_packages", js.undefined)
    
    inline def setOrganization_plan(value: read | write): Self = StObject.set(x, "organization_plan", value.asInstanceOf[js.Any])
    
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
    
    inline def setSecurity_scanning_alert(value: read | write): Self = StObject.set(x, "security_scanning_alert", value.asInstanceOf[js.Any])
    
    inline def setSecurity_scanning_alertUndefined: Self = StObject.set(x, "security_scanning_alert", js.undefined)
    
    inline def setSingle_file(value: read | write): Self = StObject.set(x, "single_file", value.asInstanceOf[js.Any])
    
    inline def setSingle_fileUndefined: Self = StObject.set(x, "single_file", js.undefined)
    
    inline def setStatuses(value: read | write): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setTeam_discussions(value: read | write): Self = StObject.set(x, "team_discussions", value.asInstanceOf[js.Any])
    
    inline def setTeam_discussionsUndefined: Self = StObject.set(x, "team_discussions", js.undefined)
    
    inline def setVulnerability_alerts(value: read | write): Self = StObject.set(x, "vulnerability_alerts", value.asInstanceOf[js.Any])
    
    inline def setVulnerability_alertsUndefined: Self = StObject.set(x, "vulnerability_alerts", js.undefined)
    
    inline def setWorkflows(value: read | write): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsUndefined: Self = StObject.set(x, "workflows", js.undefined)
  }
}
