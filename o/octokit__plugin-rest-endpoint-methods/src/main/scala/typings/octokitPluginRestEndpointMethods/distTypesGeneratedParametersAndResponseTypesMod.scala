package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.anon.AcceptInvitationForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.AddCustomLabelsToSelfHostedRunnerForRepo
import typings.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.AddLabels
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateProjectPermissionsInOrg
import typings.octokitPluginRestEndpointMethods.anon.AddRepoToInstallationForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.BlockUser
import typings.octokitPluginRestEndpointMethods.anon.CodespaceMachinesForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Commits
import typings.octokitPluginRestEndpointMethods.anon.CreateCard
import typings.octokitPluginRestEndpointMethods.anon.CreateComment
import typings.octokitPluginRestEndpointMethods.anon.CreateCommit
import typings.octokitPluginRestEndpointMethods.anon.CreateForIssue
import typings.octokitPluginRestEndpointMethods.anon.CreateOrUpdateOrgSecret
import typings.octokitPluginRestEndpointMethods.anon.CreateReplyForReviewComment
import typings.octokitPluginRestEndpointMethods.anon.CreateRepositoryAdvisory
import typings.octokitPluginRestEndpointMethods.anon.CreateSuite
import typings.octokitPluginRestEndpointMethods.anon.DeleteArchiveForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.DeletePackageForOrg
import typings.octokitPluginRestEndpointMethods.anon.DeleteRepoSubscription
import typings.octokitPluginRestEndpointMethods.anon.DiffRange
import typings.octokitPluginRestEndpointMethods.anon.Get1139
import typings.octokitPluginRestEndpointMethods.anon.Get1390
import typings.octokitPluginRestEndpointMethods.anon.GetAnalysis
import typings.octokitPluginRestEndpointMethods.anon.GetConductCode
import typings.octokitPluginRestEndpointMethods.anon.GetForRepo
import typings.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingUser
import typings.octokitPluginRestEndpointMethods.anon.GetOctocat
import typings.octokitPluginRestEndpointMethods.anon.GetRestrictionsForOrg
import typings.octokitPluginRestEndpointMethods.anon.GetTemplate
import typings.octokitPluginRestEndpointMethods.anon.ListAlertsForEnterprise
import typings.octokitPluginRestEndpointMethods.anon.RenderRaw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneratedParametersAndResponseTypesMod {
  
  trait RestEndpointMethodTypes extends StObject {
    
    var actions: AddCustomLabelsToSelfHostedRunnerForRepo
    
    var activity: DeleteRepoSubscription
    
    var apps: AddRepoToInstallationForAuthenticatedUser
    
    var billing: GetGithubActionsBillingUser
    
    var checks: CreateSuite
    
    var codeScanning: GetAnalysis
    
    var codesOfConduct: GetConductCode
    
    var codespaces: CodespaceMachinesForAuthenticatedUser
    
    var dependabot: CreateOrUpdateOrgSecret
    
    var dependencyGraph: DiffRange
    
    var emojis: Get1139
    
    var gists: CreateComment
    
    var git: CreateCommit
    
    var gitignore: GetTemplate
    
    var interactions: GetRestrictionsForOrg
    
    var issues: AddLabels
    
    var licenses: GetForRepo
    
    var markdown: RenderRaw
    
    var meta: GetOctocat
    
    var migrations: DeleteArchiveForAuthenticatedUser
    
    var orgs: BlockUser
    
    var packages: DeletePackageForOrg
    
    var projects: CreateCard
    
    var pulls: CreateReplyForReviewComment
    
    var rateLimit: Get1390
    
    var reactions: CreateForIssue
    
    var repos: AcceptInvitationForAuthenticatedUser
    
    var search: Commits
    
    var secretScanning: ListAlertsForEnterprise
    
    var securityAdvisories: CreateRepositoryAdvisory
    
    var teams: AddOrUpdateProjectPermissionsInOrg
    
    var users: AddEmailForAuthenticatedUser
  }
  object RestEndpointMethodTypes {
    
    inline def apply(
      actions: AddCustomLabelsToSelfHostedRunnerForRepo,
      activity: DeleteRepoSubscription,
      apps: AddRepoToInstallationForAuthenticatedUser,
      billing: GetGithubActionsBillingUser,
      checks: CreateSuite,
      codeScanning: GetAnalysis,
      codesOfConduct: GetConductCode,
      codespaces: CodespaceMachinesForAuthenticatedUser,
      dependabot: CreateOrUpdateOrgSecret,
      dependencyGraph: DiffRange,
      emojis: Get1139,
      gists: CreateComment,
      git: CreateCommit,
      gitignore: GetTemplate,
      interactions: GetRestrictionsForOrg,
      issues: AddLabels,
      licenses: GetForRepo,
      markdown: RenderRaw,
      meta: GetOctocat,
      migrations: DeleteArchiveForAuthenticatedUser,
      orgs: BlockUser,
      packages: DeletePackageForOrg,
      projects: CreateCard,
      pulls: CreateReplyForReviewComment,
      rateLimit: Get1390,
      reactions: CreateForIssue,
      repos: AcceptInvitationForAuthenticatedUser,
      search: Commits,
      secretScanning: ListAlertsForEnterprise,
      securityAdvisories: CreateRepositoryAdvisory,
      teams: AddOrUpdateProjectPermissionsInOrg,
      users: AddEmailForAuthenticatedUser
    ): RestEndpointMethodTypes = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], codespaces = codespaces.asInstanceOf[js.Any], dependabot = dependabot.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], secretScanning = secretScanning.asInstanceOf[js.Any], securityAdvisories = securityAdvisories.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestEndpointMethodTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestEndpointMethodTypes] (val x: Self) extends AnyVal {
      
      inline def setActions(value: AddCustomLabelsToSelfHostedRunnerForRepo): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActivity(value: DeleteRepoSubscription): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setApps(value: AddRepoToInstallationForAuthenticatedUser): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: GetGithubActionsBillingUser): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: CreateSuite): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setCodeScanning(value: GetAnalysis): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      inline def setCodesOfConduct(value: GetConductCode): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      inline def setCodespaces(value: CodespaceMachinesForAuthenticatedUser): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
      
      inline def setDependabot(value: CreateOrUpdateOrgSecret): Self = StObject.set(x, "dependabot", value.asInstanceOf[js.Any])
      
      inline def setDependencyGraph(value: DiffRange): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: Get1139): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setGists(value: CreateComment): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      inline def setGit(value: CreateCommit): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitignore(value: GetTemplate): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setInteractions(value: GetRestrictionsForOrg): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: AddLabels): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: GetForRepo): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setMarkdown(value: RenderRaw): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: GetOctocat): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: DeleteArchiveForAuthenticatedUser): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: BlockUser): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: DeletePackageForOrg): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: CreateCard): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CreateReplyForReviewComment): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get1390): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: CreateForIssue): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: AcceptInvitationForAuthenticatedUser): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Commits): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSecretScanning(value: ListAlertsForEnterprise): Self = StObject.set(x, "secretScanning", value.asInstanceOf[js.Any])
      
      inline def setSecurityAdvisories(value: CreateRepositoryAdvisory): Self = StObject.set(x, "securityAdvisories", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: AddOrUpdateProjectPermissionsInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: AddEmailForAuthenticatedUser): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
