package typings.octokitRest

import typings.octokitRest.mod.AnyResponse
import typings.octokitRest.mod.ProjectsAddCollaboratorParams
import typings.octokitRest.mod.ProjectsCreateCardParams
import typings.octokitRest.mod.ProjectsCreateCardResponse
import typings.octokitRest.mod.ProjectsCreateColumnParams
import typings.octokitRest.mod.ProjectsCreateColumnResponse
import typings.octokitRest.mod.ProjectsCreateForAuthenticatedUserParams
import typings.octokitRest.mod.ProjectsCreateForAuthenticatedUserResponse
import typings.octokitRest.mod.ProjectsCreateForOrgParams
import typings.octokitRest.mod.ProjectsCreateForOrgResponse
import typings.octokitRest.mod.ProjectsCreateForRepoParams
import typings.octokitRest.mod.ProjectsCreateForRepoResponse
import typings.octokitRest.mod.ProjectsDeleteCardParams
import typings.octokitRest.mod.ProjectsDeleteColumnParams
import typings.octokitRest.mod.ProjectsDeleteParams
import typings.octokitRest.mod.ProjectsGetCardParams
import typings.octokitRest.mod.ProjectsGetCardResponse
import typings.octokitRest.mod.ProjectsGetColumnParams
import typings.octokitRest.mod.ProjectsGetColumnResponse
import typings.octokitRest.mod.ProjectsGetParams
import typings.octokitRest.mod.ProjectsGetResponse
import typings.octokitRest.mod.ProjectsListCardsParams
import typings.octokitRest.mod.ProjectsListCardsResponse
import typings.octokitRest.mod.ProjectsListCollaboratorsParams
import typings.octokitRest.mod.ProjectsListCollaboratorsResponse
import typings.octokitRest.mod.ProjectsListColumnsParams
import typings.octokitRest.mod.ProjectsListColumnsResponse
import typings.octokitRest.mod.ProjectsListForOrgParams
import typings.octokitRest.mod.ProjectsListForOrgResponse
import typings.octokitRest.mod.ProjectsListForRepoParams
import typings.octokitRest.mod.ProjectsListForRepoResponse
import typings.octokitRest.mod.ProjectsListForUserParams
import typings.octokitRest.mod.ProjectsListForUserResponse
import typings.octokitRest.mod.ProjectsMoveCardParams
import typings.octokitRest.mod.ProjectsMoveColumnParams
import typings.octokitRest.mod.ProjectsRemoveCollaboratorParams
import typings.octokitRest.mod.ProjectsReviewUserPermissionLevelParams
import typings.octokitRest.mod.ProjectsReviewUserPermissionLevelResponse
import typings.octokitRest.mod.ProjectsUpdateCardParams
import typings.octokitRest.mod.ProjectsUpdateCardResponse
import typings.octokitRest.mod.ProjectsUpdateColumnParams
import typings.octokitRest.mod.ProjectsUpdateColumnResponse
import typings.octokitRest.mod.ProjectsUpdateParams
import typings.octokitRest.mod.ProjectsUpdateResponse
import typings.octokitRest.mod.RequestOptions
import typings.octokitRest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddCollaborator extends js.Object {
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: AnonEndpointParamsAnyResponseProjectsAddCollaboratorParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("createCard")
  var createCard_Original: AnonEndpointParamsProjectsCreateCardParams = js.native
  @JSName("createColumn")
  var createColumn_Original: AnonEndpointParamsProjectsCreateColumnParams = js.native
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: AnonEndpointParamsProjectsCreateForAuthenticatedUserParams = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForOrg")
  var createForOrg_Original: AnonEndpointParamsProjectsCreateForOrgParams = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForRepo")
  var createForRepo_Original: AnonEndpointParamsProjectsCreateForRepoParams = js.native
  @JSName("deleteCard")
  var deleteCard_Original: AnonEndpointParamsAnyResponseProjectsDeleteCardParams = js.native
  @JSName("deleteColumn")
  var deleteColumn_Original: AnonEndpointParamsAnyResponseProjectsDeleteColumnParams = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  @JSName("delete")
  var delete_Original: AnonEndpointParamsAnyResponseProjectsDeleteParams = js.native
  @JSName("getCard")
  var getCard_Original: AnonEndpointParamsProjectsGetCardParams = js.native
  @JSName("getColumn")
  var getColumn_Original: AnonEndpointParamsProjectsGetColumnParams = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("get")
  var get_Original: AnonEndpointParamsProjectsGetParams = js.native
  @JSName("listCards")
  var listCards_Original: AnonEndpointParamsProjectsListCardsParams = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: AnonEndpointParamsProjectsListCollaboratorsParams = js.native
  @JSName("listColumns")
  var listColumns_Original: AnonEndpointParamsProjectsListColumnsParams = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  @JSName("listForOrg")
  var listForOrg_Original: AnonEndpointParamsProjectsListForOrgParams = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("listForRepo")
  var listForRepo_Original: AnonEndpointParamsProjectsListForRepoParams = js.native
  @JSName("listForUser")
  var listForUser_Original: AnonEndpointParamsProjectsListForUserParams = js.native
  @JSName("moveCard")
  var moveCard_Original: AnonEndpointParamsAnyResponseProjectsMoveCardParams = js.native
  @JSName("moveColumn")
  var moveColumn_Original: AnonEndpointParamsAnyResponseProjectsMoveColumnParams = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  @JSName("removeCollaborator")
  var removeCollaborator_Original: AnonEndpointParamsAnyResponseProjectsRemoveCollaboratorParams = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  @JSName("reviewUserPermissionLevel")
  var reviewUserPermissionLevel_Original: AnonEndpointParamsProjectsReviewUserPermissionLevelParams = js.native
  @JSName("updateCard")
  var updateCard_Original: AnonEndpointParamsProjectsUpdateCardParams = js.native
  @JSName("updateColumn")
  var updateColumn_Original: AnonEndpointParamsProjectsUpdateColumnParams = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("update")
  var update_Original: AnonEndpointParamsProjectsUpdateParams = js.native
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  def addCollaborator(): js.Promise[AnyResponse] = js.native
  def addCollaborator(params: RequestOptions with ProjectsAddCollaboratorParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def createCard(): js.Promise[Response[ProjectsCreateCardResponse]] = js.native
  def createCard(params: RequestOptions with ProjectsCreateCardParams): js.Promise[Response[ProjectsCreateCardResponse]] = js.native
  def createColumn(): js.Promise[Response[ProjectsCreateColumnResponse]] = js.native
  def createColumn(params: RequestOptions with ProjectsCreateColumnParams): js.Promise[Response[ProjectsCreateColumnResponse]] = js.native
  def createForAuthenticatedUser(): js.Promise[Response[ProjectsCreateForAuthenticatedUserResponse]] = js.native
  def createForAuthenticatedUser(params: RequestOptions with ProjectsCreateForAuthenticatedUserParams): js.Promise[Response[ProjectsCreateForAuthenticatedUserResponse]] = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForOrg(): js.Promise[Response[ProjectsCreateForOrgResponse]] = js.native
  def createForOrg(params: RequestOptions with ProjectsCreateForOrgParams): js.Promise[Response[ProjectsCreateForOrgResponse]] = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForRepo(): js.Promise[Response[ProjectsCreateForRepoResponse]] = js.native
  def createForRepo(params: RequestOptions with ProjectsCreateForRepoParams): js.Promise[Response[ProjectsCreateForRepoResponse]] = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: RequestOptions with ProjectsDeleteParams): js.Promise[AnyResponse] = js.native
  def deleteCard(): js.Promise[AnyResponse] = js.native
  def deleteCard(params: RequestOptions with ProjectsDeleteCardParams): js.Promise[AnyResponse] = js.native
  def deleteColumn(): js.Promise[AnyResponse] = js.native
  def deleteColumn(params: RequestOptions with ProjectsDeleteColumnParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def get(): js.Promise[Response[ProjectsGetResponse]] = js.native
  def get(params: RequestOptions with ProjectsGetParams): js.Promise[Response[ProjectsGetResponse]] = js.native
  def getCard(): js.Promise[Response[ProjectsGetCardResponse]] = js.native
  def getCard(params: RequestOptions with ProjectsGetCardParams): js.Promise[Response[ProjectsGetCardResponse]] = js.native
  def getColumn(): js.Promise[Response[ProjectsGetColumnResponse]] = js.native
  def getColumn(params: RequestOptions with ProjectsGetColumnParams): js.Promise[Response[ProjectsGetColumnResponse]] = js.native
  def listCards(): js.Promise[Response[ProjectsListCardsResponse]] = js.native
  def listCards(params: RequestOptions with ProjectsListCardsParams): js.Promise[Response[ProjectsListCardsResponse]] = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  def listCollaborators(): js.Promise[Response[ProjectsListCollaboratorsResponse]] = js.native
  def listCollaborators(params: RequestOptions with ProjectsListCollaboratorsParams): js.Promise[Response[ProjectsListCollaboratorsResponse]] = js.native
  def listColumns(): js.Promise[Response[ProjectsListColumnsResponse]] = js.native
  def listColumns(params: RequestOptions with ProjectsListColumnsParams): js.Promise[Response[ProjectsListColumnsResponse]] = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  def listForOrg(): js.Promise[Response[ProjectsListForOrgResponse]] = js.native
  def listForOrg(params: RequestOptions with ProjectsListForOrgParams): js.Promise[Response[ProjectsListForOrgResponse]] = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def listForRepo(): js.Promise[Response[ProjectsListForRepoResponse]] = js.native
  def listForRepo(params: RequestOptions with ProjectsListForRepoParams): js.Promise[Response[ProjectsListForRepoResponse]] = js.native
  def listForUser(): js.Promise[Response[ProjectsListForUserResponse]] = js.native
  def listForUser(params: RequestOptions with ProjectsListForUserParams): js.Promise[Response[ProjectsListForUserResponse]] = js.native
  def moveCard(): js.Promise[AnyResponse] = js.native
  def moveCard(params: RequestOptions with ProjectsMoveCardParams): js.Promise[AnyResponse] = js.native
  def moveColumn(): js.Promise[AnyResponse] = js.native
  def moveColumn(params: RequestOptions with ProjectsMoveColumnParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  def removeCollaborator(): js.Promise[AnyResponse] = js.native
  def removeCollaborator(params: RequestOptions with ProjectsRemoveCollaboratorParams): js.Promise[AnyResponse] = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  def reviewUserPermissionLevel(): js.Promise[Response[ProjectsReviewUserPermissionLevelResponse]] = js.native
  def reviewUserPermissionLevel(params: RequestOptions with ProjectsReviewUserPermissionLevelParams): js.Promise[Response[ProjectsReviewUserPermissionLevelResponse]] = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def update(): js.Promise[Response[ProjectsUpdateResponse]] = js.native
  def update(params: RequestOptions with ProjectsUpdateParams): js.Promise[Response[ProjectsUpdateResponse]] = js.native
  def updateCard(): js.Promise[Response[ProjectsUpdateCardResponse]] = js.native
  def updateCard(params: RequestOptions with ProjectsUpdateCardParams): js.Promise[Response[ProjectsUpdateCardResponse]] = js.native
  def updateColumn(): js.Promise[Response[ProjectsUpdateColumnResponse]] = js.native
  def updateColumn(params: RequestOptions with ProjectsUpdateColumnParams): js.Promise[Response[ProjectsUpdateColumnResponse]] = js.native
}

