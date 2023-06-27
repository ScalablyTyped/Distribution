package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.anon.AcceptInvitation
import typings.octokitPluginRestEndpointMethods.anon.AddAssignees
import typings.octokitPluginRestEndpointMethods.anon.AddCollaborator
import typings.octokitPluginRestEndpointMethods.anon.AddCustomLabelsToSelfHostedRunnerForOrg
import typings.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticated
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembershipForUserInOrg
import typings.octokitPluginRestEndpointMethods.anon.AddRepoToInstallation
import typings.octokitPluginRestEndpointMethods.anon.AddRepositoryForSecretForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.AddSecurityManagerTeam
import typings.octokitPluginRestEndpointMethods.anon.AddSelectedRepoToOrgSecret
import typings.octokitPluginRestEndpointMethods.anon.CancelImport
import typings.octokitPluginRestEndpointMethods.anon.CheckIfMerged
import typings.octokitPluginRestEndpointMethods.anon.CheckIsStarred
import typings.octokitPluginRestEndpointMethods.anon.CheckRepoIsStarredByAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Code
import typings.octokitPluginRestEndpointMethods.anon.Create
import typings.octokitPluginRestEndpointMethods.anon.CreateBlob
import typings.octokitPluginRestEndpointMethods.anon.CreateForCommitComment
import typings.octokitPluginRestEndpointMethods.anon.CreatePrivateVulnerabilityReport
import typings.octokitPluginRestEndpointMethods.anon.CreateRepositorySnapshot
import typings.octokitPluginRestEndpointMethods.anon.DeleteAnalysis
import typings.octokitPluginRestEndpointMethods.anon.DeletePackageForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Get
import typings.octokitPluginRestEndpointMethods.anon.Get545
import typings.octokitPluginRestEndpointMethods.anon.GetAlert
import typings.octokitPluginRestEndpointMethods.anon.GetAllCodesOfConduct
import typings.octokitPluginRestEndpointMethods.anon.GetAllCommonlyUsed
import typings.octokitPluginRestEndpointMethods.anon.GetAllTemplates
import typings.octokitPluginRestEndpointMethods.anon.GetAllVersions
import typings.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingOrg
import typings.octokitPluginRestEndpointMethods.anon.GetRestrictionsForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneratedMethodTypesMod {
  
  trait RestEndpointMethods extends StObject {
    
    var actions: AddCustomLabelsToSelfHostedRunnerForOrg
    
    var activity: CheckRepoIsStarredByAuthenticatedUser
    
    var apps: AddRepoToInstallation
    
    var billing: GetGithubActionsBillingOrg
    
    var checks: Create
    
    var codeScanning: DeleteAnalysis
    
    var codesOfConduct: GetAllCodesOfConduct
    
    var codespaces: AddRepositoryForSecretForAuthenticatedUser
    
    var dependabot: AddSelectedRepoToOrgSecret
    
    var dependencyGraph: CreateRepositorySnapshot
    
    var emojis: Get
    
    var gists: CheckIsStarred
    
    var git: CreateBlob
    
    var gitignore: GetAllTemplates
    
    var interactions: GetRestrictionsForAuthenticatedUser
    
    var issues: AddAssignees
    
    var licenses: GetAllCommonlyUsed
    
    var markdown: Render
    
    var meta: GetAllVersions
    
    var migrations: CancelImport
    
    var orgs: AddSecurityManagerTeam
    
    var packages: DeletePackageForAuthenticatedUser
    
    var projects: AddCollaborator
    
    var pulls: CheckIfMerged
    
    var rateLimit: Get545
    
    var reactions: CreateForCommitComment
    
    var repos: AcceptInvitation
    
    var search: Code
    
    var secretScanning: GetAlert
    
    var securityAdvisories: CreatePrivateVulnerabilityReport
    
    var teams: AddOrUpdateMembershipForUserInOrg
    
    var users: AddEmailForAuthenticated
  }
  object RestEndpointMethods {
    
    inline def apply(
      actions: AddCustomLabelsToSelfHostedRunnerForOrg,
      activity: CheckRepoIsStarredByAuthenticatedUser,
      apps: AddRepoToInstallation,
      billing: GetGithubActionsBillingOrg,
      checks: Create,
      codeScanning: DeleteAnalysis,
      codesOfConduct: GetAllCodesOfConduct,
      codespaces: AddRepositoryForSecretForAuthenticatedUser,
      dependabot: AddSelectedRepoToOrgSecret,
      dependencyGraph: CreateRepositorySnapshot,
      emojis: Get,
      gists: CheckIsStarred,
      git: CreateBlob,
      gitignore: GetAllTemplates,
      interactions: GetRestrictionsForAuthenticatedUser,
      issues: AddAssignees,
      licenses: GetAllCommonlyUsed,
      markdown: Render,
      meta: GetAllVersions,
      migrations: CancelImport,
      orgs: AddSecurityManagerTeam,
      packages: DeletePackageForAuthenticatedUser,
      projects: AddCollaborator,
      pulls: CheckIfMerged,
      rateLimit: Get545,
      reactions: CreateForCommitComment,
      repos: AcceptInvitation,
      search: Code,
      secretScanning: GetAlert,
      securityAdvisories: CreatePrivateVulnerabilityReport,
      teams: AddOrUpdateMembershipForUserInOrg,
      users: AddEmailForAuthenticated
    ): RestEndpointMethods = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], codespaces = codespaces.asInstanceOf[js.Any], dependabot = dependabot.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], secretScanning = secretScanning.asInstanceOf[js.Any], securityAdvisories = securityAdvisories.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestEndpointMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestEndpointMethods] (val x: Self) extends AnyVal {
      
      inline def setActions(value: AddCustomLabelsToSelfHostedRunnerForOrg): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActivity(value: CheckRepoIsStarredByAuthenticatedUser): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setApps(value: AddRepoToInstallation): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: GetGithubActionsBillingOrg): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: Create): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setCodeScanning(value: DeleteAnalysis): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      inline def setCodesOfConduct(value: GetAllCodesOfConduct): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      inline def setCodespaces(value: AddRepositoryForSecretForAuthenticatedUser): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
      
      inline def setDependabot(value: AddSelectedRepoToOrgSecret): Self = StObject.set(x, "dependabot", value.asInstanceOf[js.Any])
      
      inline def setDependencyGraph(value: CreateRepositorySnapshot): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: Get): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setGists(value: CheckIsStarred): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      inline def setGit(value: CreateBlob): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitignore(value: GetAllTemplates): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setInteractions(value: GetRestrictionsForAuthenticatedUser): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: AddAssignees): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: GetAllCommonlyUsed): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setMarkdown(value: Render): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: GetAllVersions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: CancelImport): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: AddSecurityManagerTeam): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: DeletePackageForAuthenticatedUser): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: AddCollaborator): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CheckIfMerged): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get545): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: CreateForCommitComment): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: AcceptInvitation): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Code): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSecretScanning(value: GetAlert): Self = StObject.set(x, "secretScanning", value.asInstanceOf[js.Any])
      
      inline def setSecurityAdvisories(value: CreatePrivateVulnerabilityReport): Self = StObject.set(x, "securityAdvisories", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: AddOrUpdateMembershipForUserInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: AddEmailForAuthenticated): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
