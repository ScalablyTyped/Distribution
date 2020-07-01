package typings.octokitPluginRestEndpointMethods.methodTypesMod

import typings.octokitPluginRestEndpointMethods.anon.AcceptInvitation
import typings.octokitPluginRestEndpointMethods.anon.AddAssignees
import typings.octokitPluginRestEndpointMethods.anon.AddCollaborator
import typings.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticated
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembership
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembershipForUserInOrg
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateRestrictionsForOrg
import typings.octokitPluginRestEndpointMethods.anon.AddRepoToInstallation
import typings.octokitPluginRestEndpointMethods.anon.AddSelectedRepoToOrgSecret
import typings.octokitPluginRestEndpointMethods.anon.CancelImport
import typings.octokitPluginRestEndpointMethods.anon.CheckIfMerged
import typings.octokitPluginRestEndpointMethods.anon.CheckIsStarred
import typings.octokitPluginRestEndpointMethods.anon.CheckRepoIsStarredByAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Code
import typings.octokitPluginRestEndpointMethods.anon.Create
import typings.octokitPluginRestEndpointMethods.anon.CreateBlob
import typings.octokitPluginRestEndpointMethods.anon.CreateForCommitComment
import typings.octokitPluginRestEndpointMethods.anon.Get
import typings.octokitPluginRestEndpointMethods.anon.Get198
import typings.octokitPluginRestEndpointMethods.anon.Get308
import typings.octokitPluginRestEndpointMethods.anon.GetAlert
import typings.octokitPluginRestEndpointMethods.anon.GetAllCodesOfConduct
import typings.octokitPluginRestEndpointMethods.anon.GetAllCommonlyUsed
import typings.octokitPluginRestEndpointMethods.anon.GetAllTemplates
import typings.octokitPluginRestEndpointMethods.anon.Render
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestEndpointMethods extends js.Object {
  var actions: AddSelectedRepoToOrgSecret
  var activity: CheckRepoIsStarredByAuthenticatedUser
  var apps: AddRepoToInstallation
  var checks: Create
  var codeScanning: GetAlert
  var codesOfConduct: GetAllCodesOfConduct
  var emojis: Get
  var gists: CheckIsStarred
  var git: CreateBlob
  var gitignore: GetAllTemplates
  var interactions: AddOrUpdateRestrictionsForOrg
  var issues: AddAssignees
  var licenses: GetAllCommonlyUsed
  var markdown: Render
  var meta: Get198
  var migrations: CancelImport
  var orgs: AddOrUpdateMembership
  var projects: AddCollaborator
  var pulls: CheckIfMerged
  var rateLimit: Get308
  var reactions: CreateForCommitComment
  var repos: AcceptInvitation
  var search: Code
  var teams: AddOrUpdateMembershipForUserInOrg
  var users: AddEmailForAuthenticated
}

object RestEndpointMethods {
  @scala.inline
  def apply(
    actions: AddSelectedRepoToOrgSecret,
    activity: CheckRepoIsStarredByAuthenticatedUser,
    apps: AddRepoToInstallation,
    checks: Create,
    codeScanning: GetAlert,
    codesOfConduct: GetAllCodesOfConduct,
    emojis: Get,
    gists: CheckIsStarred,
    git: CreateBlob,
    gitignore: GetAllTemplates,
    interactions: AddOrUpdateRestrictionsForOrg,
    issues: AddAssignees,
    licenses: GetAllCommonlyUsed,
    markdown: Render,
    meta: Get198,
    migrations: CancelImport,
    orgs: AddOrUpdateMembership,
    projects: AddCollaborator,
    pulls: CheckIfMerged,
    rateLimit: Get308,
    reactions: CreateForCommitComment,
    repos: AcceptInvitation,
    search: Code,
    teams: AddOrUpdateMembershipForUserInOrg,
    users: AddEmailForAuthenticated
  ): RestEndpointMethods = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestEndpointMethods]
  }
}

