package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.AnonAcceptInvitationAddCollaborator
import typings.octokitPluginRestEndpointMethods.AnonAddAssigneesAddLabels
import typings.octokitPluginRestEndpointMethods.AnonAddCollaboratorCreateCard
import typings.octokitPluginRestEndpointMethods.AnonAddEmailsBlock
import typings.octokitPluginRestEndpointMethods.AnonAddMemberAddMemberLegacy
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateMembershipBlockUser
import typings.octokitPluginRestEndpointMethods.AnonAddOrUpdateRestrictionsForOrgAddOrUpdateRestrictionsForRepo
import typings.octokitPluginRestEndpointMethods.AnonAddRepoToInstallationCheckAccountIsAssociatedWithAny
import typings.octokitPluginRestEndpointMethods.AnonCancelImportDeleteArchiveForAuthenticatedUser
import typings.octokitPluginRestEndpointMethods.AnonCancelWorkflowRunCreateOrUpdateSecretForRepo
import typings.octokitPluginRestEndpointMethods.AnonCheckAuthorizationCreateAuthorization
import typings.octokitPluginRestEndpointMethods.AnonCheckIfMergedCreate
import typings.octokitPluginRestEndpointMethods.AnonCheckIsStarredCreate
import typings.octokitPluginRestEndpointMethods.AnonCheckStarringRepoCheckWatchingRepoLegacy
import typings.octokitPluginRestEndpointMethods.AnonCodeCommitsEmailLegacy
import typings.octokitPluginRestEndpointMethods.AnonCreateBlobCreateCommit
import typings.octokitPluginRestEndpointMethods.AnonCreateCreateSuite
import typings.octokitPluginRestEndpointMethods.AnonCreateForCommitCommentCreateForIssue
import typings.octokitPluginRestEndpointMethods.AnonGetAnonEndpointParamsAny
import typings.octokitPluginRestEndpointMethods.AnonGetAnonEndpointParamsAnyAnyResponseEmptyParams
import typings.octokitPluginRestEndpointMethods.AnonGetConductCodeGetForRepo
import typings.octokitPluginRestEndpointMethods.AnonGetGetForRepoList
import typings.octokitPluginRestEndpointMethods.AnonGetTemplateListTemplates
import typings.octokitPluginRestEndpointMethods.AnonRenderRenderRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestEndpointMethods extends js.Object {
  var actions: AnonCancelWorkflowRunCreateOrUpdateSecretForRepo
  var activity: AnonCheckStarringRepoCheckWatchingRepoLegacy
  var apps: AnonAddRepoToInstallationCheckAccountIsAssociatedWithAny
  var checks: AnonCreateCreateSuite
  var codesOfConduct: AnonGetConductCodeGetForRepo
  var emojis: AnonGetAnonEndpointParamsAnyAnyResponseEmptyParams
  var gists: AnonCheckIsStarredCreate
  var git: AnonCreateBlobCreateCommit
  var gitignore: AnonGetTemplateListTemplates
  var interactions: AnonAddOrUpdateRestrictionsForOrgAddOrUpdateRestrictionsForRepo
  var issues: AnonAddAssigneesAddLabels
  var licenses: AnonGetGetForRepoList
  var markdown: AnonRenderRenderRaw
  var meta: AnonGetAnonEndpointParamsAny
  var migrations: AnonCancelImportDeleteArchiveForAuthenticatedUser
  var oauthAuthorizations: AnonCheckAuthorizationCreateAuthorization
  var orgs: AnonAddOrUpdateMembershipBlockUser
  var projects: AnonAddCollaboratorCreateCard
  var pulls: AnonCheckIfMergedCreate
  var rateLimit: AnonGetAnonEndpointParamsAny
  var reactions: AnonCreateForCommitCommentCreateForIssue
  var repos: AnonAcceptInvitationAddCollaborator
  var search: AnonCodeCommitsEmailLegacy
  var teams: AnonAddMemberAddMemberLegacy
  var users: AnonAddEmailsBlock
}

object RestEndpointMethods {
  @scala.inline
  def apply(
    actions: AnonCancelWorkflowRunCreateOrUpdateSecretForRepo,
    activity: AnonCheckStarringRepoCheckWatchingRepoLegacy,
    apps: AnonAddRepoToInstallationCheckAccountIsAssociatedWithAny,
    checks: AnonCreateCreateSuite,
    codesOfConduct: AnonGetConductCodeGetForRepo,
    emojis: AnonGetAnonEndpointParamsAnyAnyResponseEmptyParams,
    gists: AnonCheckIsStarredCreate,
    git: AnonCreateBlobCreateCommit,
    gitignore: AnonGetTemplateListTemplates,
    interactions: AnonAddOrUpdateRestrictionsForOrgAddOrUpdateRestrictionsForRepo,
    issues: AnonAddAssigneesAddLabels,
    licenses: AnonGetGetForRepoList,
    markdown: AnonRenderRenderRaw,
    meta: AnonGetAnonEndpointParamsAny,
    migrations: AnonCancelImportDeleteArchiveForAuthenticatedUser,
    oauthAuthorizations: AnonCheckAuthorizationCreateAuthorization,
    orgs: AnonAddOrUpdateMembershipBlockUser,
    projects: AnonAddCollaboratorCreateCard,
    pulls: AnonCheckIfMergedCreate,
    rateLimit: AnonGetAnonEndpointParamsAny,
    reactions: AnonCreateForCommitCommentCreateForIssue,
    repos: AnonAcceptInvitationAddCollaborator,
    search: AnonCodeCommitsEmailLegacy,
    teams: AnonAddMemberAddMemberLegacy,
    users: AnonAddEmailsBlock
  ): RestEndpointMethods = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], oauthAuthorizations = oauthAuthorizations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestEndpointMethods]
  }
}

