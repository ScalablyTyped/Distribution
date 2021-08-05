package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.anon.AddAppAccessRestrictions
import typings.octokitPluginRestEndpointMethods.anon.AddLabels
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateProjectPermissionsInOrg
import typings.octokitPluginRestEndpointMethods.anon.Block
import typings.octokitPluginRestEndpointMethods.anon.CancelWorkflowRun
import typings.octokitPluginRestEndpointMethods.anon.CheckBlockedUser
import typings.octokitPluginRestEndpointMethods.anon.CheckToken
import typings.octokitPluginRestEndpointMethods.anon.Commits
import typings.octokitPluginRestEndpointMethods.anon.CreateCard
import typings.octokitPluginRestEndpointMethods.anon.CreateComment
import typings.octokitPluginRestEndpointMethods.anon.CreateCommit
import typings.octokitPluginRestEndpointMethods.anon.CreateForIssue
import typings.octokitPluginRestEndpointMethods.anon.CreateReplyForReviewComment
import typings.octokitPluginRestEndpointMethods.anon.CreateSuite
import typings.octokitPluginRestEndpointMethods.anon.DeleteArchiveForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.DeleteRepoSubscription
import typings.octokitPluginRestEndpointMethods.anon.Get676
import typings.octokitPluginRestEndpointMethods.anon.Get762
import typings.octokitPluginRestEndpointMethods.anon.Get872
import typings.octokitPluginRestEndpointMethods.anon.GetConductCode
import typings.octokitPluginRestEndpointMethods.anon.GetForRepo
import typings.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingUser
import typings.octokitPluginRestEndpointMethods.anon.GetRestrictionsForRepo
import typings.octokitPluginRestEndpointMethods.anon.GetTemplate
import typings.octokitPluginRestEndpointMethods.anon.ListAlertsForRepo
import typings.octokitPluginRestEndpointMethods.anon.RenderRaw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersAndResponseTypesMod {
  
  trait RestEndpointMethodTypes extends StObject {
    
    var actions: CancelWorkflowRun
    
    var activity: DeleteRepoSubscription
    
    var apps: CheckToken
    
    var billing: GetGithubActionsBillingUser
    
    var checks: CreateSuite
    
    var codeScanning: ListAlertsForRepo
    
    var codesOfConduct: GetConductCode
    
    var emojis: Get676
    
    var gists: CreateComment
    
    var git: CreateCommit
    
    var gitignore: GetTemplate
    
    var interactions: GetRestrictionsForRepo
    
    var issues: AddLabels
    
    var licenses: GetForRepo
    
    var markdown: RenderRaw
    
    var meta: Get762
    
    var migrations: DeleteArchiveForAuthenticatedUser
    
    var orgs: CheckBlockedUser
    
    var projects: CreateCard
    
    var pulls: CreateReplyForReviewComment
    
    var rateLimit: Get872
    
    var reactions: CreateForIssue
    
    var repos: AddAppAccessRestrictions
    
    var search: Commits
    
    var teams: AddOrUpdateProjectPermissionsInOrg
    
    var users: Block
  }
  object RestEndpointMethodTypes {
    
    inline def apply(
      actions: CancelWorkflowRun,
      activity: DeleteRepoSubscription,
      apps: CheckToken,
      billing: GetGithubActionsBillingUser,
      checks: CreateSuite,
      codeScanning: ListAlertsForRepo,
      codesOfConduct: GetConductCode,
      emojis: Get676,
      gists: CreateComment,
      git: CreateCommit,
      gitignore: GetTemplate,
      interactions: GetRestrictionsForRepo,
      issues: AddLabels,
      licenses: GetForRepo,
      markdown: RenderRaw,
      meta: Get762,
      migrations: DeleteArchiveForAuthenticatedUser,
      orgs: CheckBlockedUser,
      projects: CreateCard,
      pulls: CreateReplyForReviewComment,
      rateLimit: Get872,
      reactions: CreateForIssue,
      repos: AddAppAccessRestrictions,
      search: Commits,
      teams: AddOrUpdateProjectPermissionsInOrg,
      users: Block
    ): RestEndpointMethodTypes = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestEndpointMethodTypes]
    }
    
    extension [Self <: RestEndpointMethodTypes](x: Self) {
      
      inline def setActions(value: CancelWorkflowRun): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActivity(value: DeleteRepoSubscription): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setApps(value: CheckToken): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: GetGithubActionsBillingUser): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: CreateSuite): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setCodeScanning(value: ListAlertsForRepo): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      inline def setCodesOfConduct(value: GetConductCode): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: Get676): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setGists(value: CreateComment): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      inline def setGit(value: CreateCommit): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitignore(value: GetTemplate): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setInteractions(value: GetRestrictionsForRepo): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: AddLabels): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: GetForRepo): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setMarkdown(value: RenderRaw): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Get762): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: DeleteArchiveForAuthenticatedUser): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: CheckBlockedUser): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: CreateCard): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CreateReplyForReviewComment): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get872): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: CreateForIssue): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: AddAppAccessRestrictions): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Commits): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: AddOrUpdateProjectPermissionsInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: Block): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
