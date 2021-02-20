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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parametersAndResponseTypesMod {
  
  @js.native
  trait RestEndpointMethodTypes extends StObject {
    
    var actions: CancelWorkflowRun = js.native
    
    var activity: DeleteRepoSubscription = js.native
    
    var apps: CheckToken = js.native
    
    var billing: GetGithubActionsBillingUser = js.native
    
    var checks: CreateSuite = js.native
    
    var codeScanning: ListAlertsForRepo = js.native
    
    var codesOfConduct: GetConductCode = js.native
    
    var emojis: Get676 = js.native
    
    var gists: CreateComment = js.native
    
    var git: CreateCommit = js.native
    
    var gitignore: GetTemplate = js.native
    
    var interactions: GetRestrictionsForRepo = js.native
    
    var issues: AddLabels = js.native
    
    var licenses: GetForRepo = js.native
    
    var markdown: RenderRaw = js.native
    
    var meta: Get762 = js.native
    
    var migrations: DeleteArchiveForAuthenticatedUser = js.native
    
    var orgs: CheckBlockedUser = js.native
    
    var projects: CreateCard = js.native
    
    var pulls: CreateReplyForReviewComment = js.native
    
    var rateLimit: Get872 = js.native
    
    var reactions: CreateForIssue = js.native
    
    var repos: AddAppAccessRestrictions = js.native
    
    var search: Commits = js.native
    
    var teams: AddOrUpdateProjectPermissionsInOrg = js.native
    
    var users: Block = js.native
  }
  object RestEndpointMethodTypes {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RestEndpointMethodTypesMutableBuilder[Self <: RestEndpointMethodTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: CancelWorkflowRun): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivity(value: DeleteRepoSubscription): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApps(value: CheckToken): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBilling(value: GetGithubActionsBillingUser): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecks(value: CreateSuite): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeScanning(value: ListAlertsForRepo): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodesOfConduct(value: GetConductCode): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojis(value: Get676): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGists(value: CreateComment): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGit(value: CreateCommit): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitignore(value: GetTemplate): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractions(value: GetRestrictionsForRepo): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssues(value: AddLabels): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenses(value: GetForRepo): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkdown(value: RenderRaw): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Get762): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMigrations(value: DeleteArchiveForAuthenticatedUser): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrgs(value: CheckBlockedUser): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjects(value: CreateCard): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulls(value: CreateReplyForReviewComment): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateLimit(value: Get872): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReactions(value: CreateForIssue): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepos(value: AddAppAccessRestrictions): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: Commits): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeams(value: AddOrUpdateProjectPermissionsInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: Block): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
