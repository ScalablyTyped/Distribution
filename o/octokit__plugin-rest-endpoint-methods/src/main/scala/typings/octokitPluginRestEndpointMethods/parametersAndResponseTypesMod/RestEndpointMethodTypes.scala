package typings.octokitPluginRestEndpointMethods.parametersAndResponseTypesMod

import typings.octokitPluginRestEndpointMethods.anon.AddDeployKey
import typings.octokitPluginRestEndpointMethods.anon.AddLabels
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateProjectInOrg
import typings.octokitPluginRestEndpointMethods.anon.AddOrUpdateRestrictionsForRepo
import typings.octokitPluginRestEndpointMethods.anon.Block
import typings.octokitPluginRestEndpointMethods.anon.BlockUser
import typings.octokitPluginRestEndpointMethods.anon.CancelWorkflowRun
import typings.octokitPluginRestEndpointMethods.anon.CheckAccountIsAssociatedWithAny
import typings.octokitPluginRestEndpointMethods.anon.CheckStarringRepo
import typings.octokitPluginRestEndpointMethods.anon.Commits
import typings.octokitPluginRestEndpointMethods.anon.CreateCard
import typings.octokitPluginRestEndpointMethods.anon.CreateComment
import typings.octokitPluginRestEndpointMethods.anon.CreateCommit
import typings.octokitPluginRestEndpointMethods.anon.CreateForIssue
import typings.octokitPluginRestEndpointMethods.anon.CreateReview
import typings.octokitPluginRestEndpointMethods.anon.CreateSuite
import typings.octokitPluginRestEndpointMethods.anon.DeleteArchiveForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.anon.Get657
import typings.octokitPluginRestEndpointMethods.anon.Get743
import typings.octokitPluginRestEndpointMethods.anon.Get853
import typings.octokitPluginRestEndpointMethods.anon.GetConductCode
import typings.octokitPluginRestEndpointMethods.anon.ListAlertsForRepo
import typings.octokitPluginRestEndpointMethods.anon.ListCommonlyUsed
import typings.octokitPluginRestEndpointMethods.anon.ListTemplates
import typings.octokitPluginRestEndpointMethods.anon.RenderRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestEndpointMethodTypes extends js.Object {
  var actions: CancelWorkflowRun
  var activity: CheckStarringRepo
  var apps: CheckAccountIsAssociatedWithAny
  var checks: CreateSuite
  var codeScanning: ListAlertsForRepo
  var codesOfConduct: GetConductCode
  var emojis: Get657
  var gists: CreateComment
  var git: CreateCommit
  var gitignore: ListTemplates
  var interactions: AddOrUpdateRestrictionsForRepo
  var issues: AddLabels
  var licenses: ListCommonlyUsed
  var markdown: RenderRaw
  var meta: Get743
  var migrations: DeleteArchiveForAuthenticatedUser
  var orgs: BlockUser
  var projects: CreateCard
  var pulls: CreateReview
  var rateLimit: Get853
  var reactions: CreateForIssue
  var repos: AddDeployKey
  var search: Commits
  var teams: AddOrUpdateProjectInOrg
  var users: Block
}

object RestEndpointMethodTypes {
  @scala.inline
  def apply(
    actions: CancelWorkflowRun,
    activity: CheckStarringRepo,
    apps: CheckAccountIsAssociatedWithAny,
    checks: CreateSuite,
    codeScanning: ListAlertsForRepo,
    codesOfConduct: GetConductCode,
    emojis: Get657,
    gists: CreateComment,
    git: CreateCommit,
    gitignore: ListTemplates,
    interactions: AddOrUpdateRestrictionsForRepo,
    issues: AddLabels,
    licenses: ListCommonlyUsed,
    markdown: RenderRaw,
    meta: Get743,
    migrations: DeleteArchiveForAuthenticatedUser,
    orgs: BlockUser,
    projects: CreateCard,
    pulls: CreateReview,
    rateLimit: Get853,
    reactions: CreateForIssue,
    repos: AddDeployKey,
    search: Commits,
    teams: AddOrUpdateProjectInOrg,
    users: Block
  ): RestEndpointMethodTypes = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestEndpointMethodTypes]
  }
}

