package typings.octokitPluginRestEndpointMethods.typesMod

import typings.octokitPluginRestEndpointMethods.AnonAcceptInvitation
import typings.octokitPluginRestEndpointMethods.AnonAddAssignees
import typings.octokitPluginRestEndpointMethods.AnonAddCollaborator
import typings.octokitPluginRestEndpointMethods.AnonAddEmails
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateMembership
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateMembershipInOrg
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateRestrictionsForOrg
import typings.octokitPluginRestEndpointMethods.AnonAddRepoToInstallation
import typings.octokitPluginRestEndpointMethods.AnonCancelImport
import typings.octokitPluginRestEndpointMethods.AnonCancelWorkflowRun
import typings.octokitPluginRestEndpointMethods.AnonCheckIfMerged
import typings.octokitPluginRestEndpointMethods.AnonCheckIsStarred
import typings.octokitPluginRestEndpointMethods.AnonCheckRepoIsStarredByAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.AnonCode
import typings.octokitPluginRestEndpointMethods.AnonCreate
import typings.octokitPluginRestEndpointMethods.AnonCreateBlob
import typings.octokitPluginRestEndpointMethods.AnonCreateForCommitComment
import typings.octokitPluginRestEndpointMethods.AnonGet
import typings.octokitPluginRestEndpointMethods.AnonGetAllCodesOfConduct
import typings.octokitPluginRestEndpointMethods.AnonGetAnon25
import typings.octokitPluginRestEndpointMethods.AnonGetForRepo
import typings.octokitPluginRestEndpointMethods.AnonGetTemplate
import typings.octokitPluginRestEndpointMethods.AnonRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestEndpointMethods extends js.Object {
  var actions: AnonCancelWorkflowRun
  var activity: AnonCheckRepoIsStarredByAuthenticatedUser
  var apps: AnonAddRepoToInstallation
  var checks: AnonCreate
  var codesOfConduct: AnonGetAllCodesOfConduct
  var emojis: AnonGet
  var gists: AnonCheckIsStarred
  var git: AnonCreateBlob
  var gitignore: AnonGetTemplate
  var interactions: AnonAddOrUpdateRestrictionsForOrg
  var issues: AnonAddAssignees
  var licenses: AnonGetForRepo
  var markdown: AnonRender
  var meta: AnonGetAnon25
  var migrations: AnonCancelImport
  var orgs: AnonAddOrUpdateMembership
  var projects: AnonAddCollaborator
  var pulls: AnonCheckIfMerged
  var rateLimit: AnonGetAnon25
  var reactions: AnonCreateForCommitComment
  var repos: AnonAcceptInvitation
  var search: AnonCode
  var teams: AnonAddOrUpdateMembershipInOrg
  var users: AnonAddEmails
}

object RestEndpointMethods {
  @scala.inline
  def apply(
    actions: AnonCancelWorkflowRun,
    activity: AnonCheckRepoIsStarredByAuthenticatedUser,
    apps: AnonAddRepoToInstallation,
    checks: AnonCreate,
    codesOfConduct: AnonGetAllCodesOfConduct,
    emojis: AnonGet,
    gists: AnonCheckIsStarred,
    git: AnonCreateBlob,
    gitignore: AnonGetTemplate,
    interactions: AnonAddOrUpdateRestrictionsForOrg,
    issues: AnonAddAssignees,
    licenses: AnonGetForRepo,
    markdown: AnonRender,
    meta: AnonGetAnon25,
    migrations: AnonCancelImport,
    orgs: AnonAddOrUpdateMembership,
    projects: AnonAddCollaborator,
    pulls: AnonCheckIfMerged,
    rateLimit: AnonGetAnon25,
    reactions: AnonCreateForCommitComment,
    repos: AnonAcceptInvitation,
    search: AnonCode,
    teams: AnonAddOrUpdateMembershipInOrg,
    users: AnonAddEmails
  ): RestEndpointMethods = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestEndpointMethods]
  }
}

