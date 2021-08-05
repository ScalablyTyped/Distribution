package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.anon.AcceptInvitation
import typings.octokitPluginRestEndpointMethods.anon.AddAssignees
import typings.octokitPluginRestEndpointMethods.anon.AddCollaborator
import typings.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticated
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembershipForUserInOrg
import typings.octokitPluginRestEndpointMethods.anon.AddRepoToInstallation
import typings.octokitPluginRestEndpointMethods.anon.AddSelectedRepoToOrgSecret
import typings.octokitPluginRestEndpointMethods.anon.BlockUser
import typings.octokitPluginRestEndpointMethods.anon.CancelImport
import typings.octokitPluginRestEndpointMethods.anon.CheckIfMerged
import typings.octokitPluginRestEndpointMethods.anon.CheckIsStarred
import typings.octokitPluginRestEndpointMethods.anon.CheckRepoIsStarredByAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Code
import typings.octokitPluginRestEndpointMethods.anon.Create
import typings.octokitPluginRestEndpointMethods.anon.CreateBlob
import typings.octokitPluginRestEndpointMethods.anon.CreateForCommitComment
import typings.octokitPluginRestEndpointMethods.anon.Get
import typings.octokitPluginRestEndpointMethods.anon.Get209
import typings.octokitPluginRestEndpointMethods.anon.Get319
import typings.octokitPluginRestEndpointMethods.anon.GetAlert
import typings.octokitPluginRestEndpointMethods.anon.GetAllCodesOfConduct
import typings.octokitPluginRestEndpointMethods.anon.GetAllCommonlyUsed
import typings.octokitPluginRestEndpointMethods.anon.GetAllTemplates
import typings.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingOrg
import typings.octokitPluginRestEndpointMethods.anon.GetRestrictionsForOrg
import typings.octokitPluginRestEndpointMethods.anon.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodTypesMod {
  
  trait RestEndpointMethods extends StObject {
    
    var actions: AddSelectedRepoToOrgSecret
    
    var activity: CheckRepoIsStarredByAuthenticatedUser
    
    var apps: AddRepoToInstallation
    
    var billing: GetGithubActionsBillingOrg
    
    var checks: Create
    
    var codeScanning: GetAlert
    
    var codesOfConduct: GetAllCodesOfConduct
    
    var emojis: Get
    
    var gists: CheckIsStarred
    
    var git: CreateBlob
    
    var gitignore: GetAllTemplates
    
    var interactions: GetRestrictionsForOrg
    
    var issues: AddAssignees
    
    var licenses: GetAllCommonlyUsed
    
    var markdown: Render
    
    var meta: Get209
    
    var migrations: CancelImport
    
    var orgs: BlockUser
    
    var projects: AddCollaborator
    
    var pulls: CheckIfMerged
    
    var rateLimit: Get319
    
    var reactions: CreateForCommitComment
    
    var repos: AcceptInvitation
    
    var search: Code
    
    var teams: AddOrUpdateMembershipForUserInOrg
    
    var users: AddEmailForAuthenticated
  }
  object RestEndpointMethods {
    
    inline def apply(
      actions: AddSelectedRepoToOrgSecret,
      activity: CheckRepoIsStarredByAuthenticatedUser,
      apps: AddRepoToInstallation,
      billing: GetGithubActionsBillingOrg,
      checks: Create,
      codeScanning: GetAlert,
      codesOfConduct: GetAllCodesOfConduct,
      emojis: Get,
      gists: CheckIsStarred,
      git: CreateBlob,
      gitignore: GetAllTemplates,
      interactions: GetRestrictionsForOrg,
      issues: AddAssignees,
      licenses: GetAllCommonlyUsed,
      markdown: Render,
      meta: Get209,
      migrations: CancelImport,
      orgs: BlockUser,
      projects: AddCollaborator,
      pulls: CheckIfMerged,
      rateLimit: Get319,
      reactions: CreateForCommitComment,
      repos: AcceptInvitation,
      search: Code,
      teams: AddOrUpdateMembershipForUserInOrg,
      users: AddEmailForAuthenticated
    ): RestEndpointMethods = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestEndpointMethods]
    }
    
    extension [Self <: RestEndpointMethods](x: Self) {
      
      inline def setActions(value: AddSelectedRepoToOrgSecret): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActivity(value: CheckRepoIsStarredByAuthenticatedUser): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setApps(value: AddRepoToInstallation): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: GetGithubActionsBillingOrg): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: Create): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setCodeScanning(value: GetAlert): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      inline def setCodesOfConduct(value: GetAllCodesOfConduct): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: Get): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setGists(value: CheckIsStarred): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      inline def setGit(value: CreateBlob): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitignore(value: GetAllTemplates): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setInteractions(value: GetRestrictionsForOrg): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: AddAssignees): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: GetAllCommonlyUsed): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setMarkdown(value: Render): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Get209): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: CancelImport): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: BlockUser): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: AddCollaborator): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CheckIfMerged): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get319): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: CreateForCommitComment): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: AcceptInvitation): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Code): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: AddOrUpdateMembershipForUserInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: AddEmailForAuthenticated): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
