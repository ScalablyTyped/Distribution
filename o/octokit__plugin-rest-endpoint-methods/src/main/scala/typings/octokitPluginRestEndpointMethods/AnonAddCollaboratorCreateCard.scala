package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsAddCollaboratorParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsCreateCardParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsCreateColumnParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsCreateForAuthenticatedUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsCreateForOrgParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsCreateForRepoParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsDeleteCardParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsDeleteColumnParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsDeleteParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsGetCardParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsGetColumnParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsGetParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsListCardsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsListCollaboratorsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsListColumnsParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsListForOrgParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsListForRepoParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsListForUserParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsMoveCardParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsMoveColumnParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsRemoveCollaboratorParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsReviewUserPermissionLevelParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsUpdateCardParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsUpdateColumnParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ProjectsUpdateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddCollaboratorCreateCard extends js.Object {
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: AnonEndpointParamsAnyAnyResponseProjectsAddCollaboratorParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("createCard")
  var createCard_Original: AnonEndpointParamsAnyProjectsCreateCardParams = js.native
  @JSName("createColumn")
  var createColumn_Original: AnonEndpointParamsAnyProjectsCreateColumnParams = js.native
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: AnonEndpointParamsAnyProjectsCreateForAuthenticatedUserParams = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForOrg")
  var createForOrg_Original: AnonEndpointParamsAnyProjectsCreateForOrgParams = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForRepo")
  var createForRepo_Original: AnonEndpointParamsAnyProjectsCreateForRepoParams = js.native
  @JSName("deleteCard")
  var deleteCard_Original: AnonEndpointParamsAnyAnyResponseProjectsDeleteCardParams = js.native
  @JSName("deleteColumn")
  var deleteColumn_Original: AnonEndpointParamsAnyAnyResponseProjectsDeleteColumnParams = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  @JSName("delete")
  var delete_Original: AnonEndpointParamsAnyAnyResponseProjectsDeleteParams = js.native
  @JSName("getCard")
  var getCard_Original: AnonEndpointParamsAnyProjectsGetCardParams = js.native
  @JSName("getColumn")
  var getColumn_Original: AnonEndpointParamsAnyProjectsGetColumnParams = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("get")
  var get_Original: AnonEndpointParamsAnyProjectsGetParams = js.native
  @JSName("listCards")
  var listCards_Original: AnonEndpointParamsAnyProjectsListCardsParams = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: AnonEndpointParamsAnyProjectsListCollaboratorsParams = js.native
  @JSName("listColumns")
  var listColumns_Original: AnonEndpointParamsAnyProjectsListColumnsParams = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  @JSName("listForOrg")
  var listForOrg_Original: AnonEndpointParamsAnyProjectsListForOrgParams = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("listForRepo")
  var listForRepo_Original: AnonEndpointParamsAnyProjectsListForRepoParams = js.native
  @JSName("listForUser")
  var listForUser_Original: AnonEndpointParamsAnyProjectsListForUserParams = js.native
  @JSName("moveCard")
  var moveCard_Original: AnonEndpointParamsAnyAnyResponseProjectsMoveCardParams = js.native
  @JSName("moveColumn")
  var moveColumn_Original: AnonEndpointParamsAnyAnyResponseProjectsMoveColumnParams = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  @JSName("removeCollaborator")
  var removeCollaborator_Original: AnonEndpointParamsAnyAnyResponseProjectsRemoveCollaboratorParams = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  @JSName("reviewUserPermissionLevel")
  var reviewUserPermissionLevel_Original: AnonEndpointParamsAnyProjectsReviewUserPermissionLevelParams = js.native
  @JSName("updateCard")
  var updateCard_Original: AnonEndpointParamsAnyProjectsUpdateCardParams = js.native
  @JSName("updateColumn")
  var updateColumn_Original: AnonEndpointParamsAnyProjectsUpdateColumnParams = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("update")
  var update_Original: AnonEndpointParamsAnyProjectsUpdateParams = js.native
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  def addCollaborator(): js.Promise[AnyResponse] = js.native
  def addCollaborator(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsAddCollaboratorParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def createCard(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateCardResponse> */ _
  ] = js.native
  def createCard(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsCreateCardParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateCardResponse> */ _
  ] = js.native
  def createColumn(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateColumnResponse> */ _
  ] = js.native
  def createColumn(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsCreateColumnParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateColumnResponse> */ _
  ] = js.native
  def createForAuthenticatedUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateForAuthenticatedUserResponse> */ _
  ] = js.native
  def createForAuthenticatedUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsCreateForAuthenticatedUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateForAuthenticatedUserResponse> */ _
  ] = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateForOrgResponse> */ _
  ] = js.native
  def createForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsCreateForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateForOrgResponse> */ _
  ] = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateForRepoResponse> */ _
  ] = js.native
  def createForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsCreateForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsCreateForRepoResponse> */ _
  ] = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsDeleteParams
  ): js.Promise[AnyResponse] = js.native
  def deleteCard(): js.Promise[AnyResponse] = js.native
  def deleteCard(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsDeleteCardParams
  ): js.Promise[AnyResponse] = js.native
  def deleteColumn(): js.Promise[AnyResponse] = js.native
  def deleteColumn(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsDeleteColumnParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def get(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsGetResponse> */ _
  ] = js.native
  def get(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsGetParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsGetResponse> */ _
  ] = js.native
  def getCard(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsGetCardResponse> */ _
  ] = js.native
  def getCard(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsGetCardParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsGetCardResponse> */ _
  ] = js.native
  def getColumn(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsGetColumnResponse> */ _
  ] = js.native
  def getColumn(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsGetColumnParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsGetColumnResponse> */ _
  ] = js.native
  def listCards(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListCardsResponse> */ _
  ] = js.native
  def listCards(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsListCardsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListCardsResponse> */ _
  ] = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  def listCollaborators(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListCollaboratorsResponse> */ _
  ] = js.native
  def listCollaborators(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsListCollaboratorsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListCollaboratorsResponse> */ _
  ] = js.native
  def listColumns(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListColumnsResponse> */ _
  ] = js.native
  def listColumns(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsListColumnsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListColumnsResponse> */ _
  ] = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  def listForOrg(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListForOrgResponse> */ _
  ] = js.native
  def listForOrg(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsListForOrgParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListForOrgResponse> */ _
  ] = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def listForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListForRepoResponse> */ _
  ] = js.native
  def listForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsListForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListForRepoResponse> */ _
  ] = js.native
  def listForUser(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListForUserResponse> */ _
  ] = js.native
  def listForUser(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsListForUserParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsListForUserResponse> */ _
  ] = js.native
  def moveCard(): js.Promise[AnyResponse] = js.native
  def moveCard(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsMoveCardParams
  ): js.Promise[AnyResponse] = js.native
  def moveColumn(): js.Promise[AnyResponse] = js.native
  def moveColumn(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsMoveColumnParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  def removeCollaborator(): js.Promise[AnyResponse] = js.native
  def removeCollaborator(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsRemoveCollaboratorParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  def reviewUserPermissionLevel(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsReviewUserPermissionLevelResponse> */ _
  ] = js.native
  def reviewUserPermissionLevel(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsReviewUserPermissionLevelParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsReviewUserPermissionLevelResponse> */ _
  ] = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def update(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsUpdateResponse> */ _
  ] = js.native
  def update(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsUpdateResponse> */ _
  ] = js.native
  def updateCard(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsUpdateCardResponse> */ _
  ] = js.native
  def updateCard(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsUpdateCardParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsUpdateCardResponse> */ _
  ] = js.native
  def updateColumn(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsUpdateColumnResponse> */ _
  ] = js.native
  def updateColumn(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ProjectsUpdateColumnParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ProjectsUpdateColumnResponse> */ _
  ] = js.native
}

