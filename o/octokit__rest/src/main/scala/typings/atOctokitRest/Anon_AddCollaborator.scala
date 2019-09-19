package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsAddCollaboratorParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateCardParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateCardResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateColumnParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateColumnResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateForAuthenticatedUserParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateForAuthenticatedUserResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateForOrgParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateForOrgResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateForRepoParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsCreateForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsDeleteCardParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsDeleteColumnParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsDeleteParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsGetCardParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsGetCardResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsGetColumnParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsGetColumnResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsGetParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsGetResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsListCardsParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsListCardsResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsListCollaboratorsParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsListCollaboratorsResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsListColumnsParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsListColumnsResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsListForOrgParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsListForOrgResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsListForRepoParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsListForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsListForUserParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsListForUserResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsMoveCardParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsMoveColumnParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsRemoveCollaboratorParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsReviewUserPermissionLevelParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsReviewUserPermissionLevelResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsUpdateCardParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsUpdateCardResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsUpdateColumnParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsUpdateColumnResponse
import typings.atOctokitRest.atOctokitRestMod.ProjectsUpdateParams
import typings.atOctokitRest.atOctokitRestMod.ProjectsUpdateResponse
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddCollaborator extends js.Object {
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: Anon_EndpointParamsAnyResponseProjectsAddCollaboratorParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("createCard")
  var createCard_Original: Anon_EndpointParamsProjectsCreateCardParams = js.native
  @JSName("createColumn")
  var createColumn_Original: Anon_EndpointParamsProjectsCreateColumnParams = js.native
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: Anon_EndpointParamsProjectsCreateForAuthenticatedUserParams = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForOrg")
  var createForOrg_Original: Anon_EndpointParamsProjectsCreateForOrgParams = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForRepo")
  var createForRepo_Original: Anon_EndpointParamsProjectsCreateForRepoParams = js.native
  @JSName("deleteCard")
  var deleteCard_Original: Anon_EndpointParamsAnyResponseProjectsDeleteCardParams = js.native
  @JSName("deleteColumn")
  var deleteColumn_Original: Anon_EndpointParamsAnyResponseProjectsDeleteColumnParams = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsAnyResponseProjectsDeleteParams = js.native
  @JSName("getCard")
  var getCard_Original: Anon_EndpointParamsProjectsGetCardParams = js.native
  @JSName("getColumn")
  var getColumn_Original: Anon_EndpointParamsProjectsGetColumnParams = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("get")
  var get_Original: Anon_EndpointParamsProjectsGetParams = js.native
  @JSName("listCards")
  var listCards_Original: Anon_EndpointParamsProjectsListCardsParams = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: Anon_EndpointParamsProjectsListCollaboratorsParams = js.native
  @JSName("listColumns")
  var listColumns_Original: Anon_EndpointParamsProjectsListColumnsParams = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  @JSName("listForOrg")
  var listForOrg_Original: Anon_EndpointParamsProjectsListForOrgParams = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("listForRepo")
  var listForRepo_Original: Anon_EndpointParamsProjectsListForRepoParams = js.native
  @JSName("listForUser")
  var listForUser_Original: Anon_EndpointParamsProjectsListForUserParams = js.native
  @JSName("moveCard")
  var moveCard_Original: Anon_EndpointParamsAnyResponseProjectsMoveCardParams = js.native
  @JSName("moveColumn")
  var moveColumn_Original: Anon_EndpointParamsAnyResponseProjectsMoveColumnParams = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  @JSName("removeCollaborator")
  var removeCollaborator_Original: Anon_EndpointParamsAnyResponseProjectsRemoveCollaboratorParams = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  @JSName("reviewUserPermissionLevel")
  var reviewUserPermissionLevel_Original: Anon_EndpointParamsProjectsReviewUserPermissionLevelParams = js.native
  @JSName("updateCard")
  var updateCard_Original: Anon_EndpointParamsProjectsUpdateCardParams = js.native
  @JSName("updateColumn")
  var updateColumn_Original: Anon_EndpointParamsProjectsUpdateColumnParams = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsProjectsUpdateParams = js.native
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  def addCollaborator(): js.Promise[AnyResponse] = js.native
  def addCollaborator(params: ProjectsAddCollaboratorParams): js.Promise[AnyResponse] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def createCard(): js.Promise[Response[ProjectsCreateCardResponse]] = js.native
  def createCard(params: ProjectsCreateCardParams): js.Promise[Response[ProjectsCreateCardResponse]] = js.native
  def createColumn(): js.Promise[Response[ProjectsCreateColumnResponse]] = js.native
  def createColumn(params: ProjectsCreateColumnParams): js.Promise[Response[ProjectsCreateColumnResponse]] = js.native
  def createForAuthenticatedUser(): js.Promise[Response[ProjectsCreateForAuthenticatedUserResponse]] = js.native
  def createForAuthenticatedUser(params: ProjectsCreateForAuthenticatedUserParams): js.Promise[Response[ProjectsCreateForAuthenticatedUserResponse]] = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForOrg(): js.Promise[Response[ProjectsCreateForOrgResponse]] = js.native
  def createForOrg(params: ProjectsCreateForOrgParams): js.Promise[Response[ProjectsCreateForOrgResponse]] = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForRepo(): js.Promise[Response[ProjectsCreateForRepoResponse]] = js.native
  def createForRepo(params: ProjectsCreateForRepoParams): js.Promise[Response[ProjectsCreateForRepoResponse]] = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  def delete(): js.Promise[AnyResponse] = js.native
  def delete(params: ProjectsDeleteParams): js.Promise[AnyResponse] = js.native
  def deleteCard(): js.Promise[AnyResponse] = js.native
  def deleteCard(params: ProjectsDeleteCardParams): js.Promise[AnyResponse] = js.native
  def deleteColumn(): js.Promise[AnyResponse] = js.native
  def deleteColumn(params: ProjectsDeleteColumnParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def get(): js.Promise[Response[ProjectsGetResponse]] = js.native
  def get(params: ProjectsGetParams): js.Promise[Response[ProjectsGetResponse]] = js.native
  def getCard(): js.Promise[Response[ProjectsGetCardResponse]] = js.native
  def getCard(params: ProjectsGetCardParams): js.Promise[Response[ProjectsGetCardResponse]] = js.native
  def getColumn(): js.Promise[Response[ProjectsGetColumnResponse]] = js.native
  def getColumn(params: ProjectsGetColumnParams): js.Promise[Response[ProjectsGetColumnResponse]] = js.native
  def listCards(): js.Promise[Response[ProjectsListCardsResponse]] = js.native
  def listCards(params: ProjectsListCardsParams): js.Promise[Response[ProjectsListCardsResponse]] = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  def listCollaborators(): js.Promise[Response[ProjectsListCollaboratorsResponse]] = js.native
  def listCollaborators(params: ProjectsListCollaboratorsParams): js.Promise[Response[ProjectsListCollaboratorsResponse]] = js.native
  def listColumns(): js.Promise[Response[ProjectsListColumnsResponse]] = js.native
  def listColumns(params: ProjectsListColumnsParams): js.Promise[Response[ProjectsListColumnsResponse]] = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  def listForOrg(): js.Promise[Response[ProjectsListForOrgResponse]] = js.native
  def listForOrg(params: ProjectsListForOrgParams): js.Promise[Response[ProjectsListForOrgResponse]] = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def listForRepo(): js.Promise[Response[ProjectsListForRepoResponse]] = js.native
  def listForRepo(params: ProjectsListForRepoParams): js.Promise[Response[ProjectsListForRepoResponse]] = js.native
  def listForUser(): js.Promise[Response[ProjectsListForUserResponse]] = js.native
  def listForUser(params: ProjectsListForUserParams): js.Promise[Response[ProjectsListForUserResponse]] = js.native
  def moveCard(): js.Promise[AnyResponse] = js.native
  def moveCard(params: ProjectsMoveCardParams): js.Promise[AnyResponse] = js.native
  def moveColumn(): js.Promise[AnyResponse] = js.native
  def moveColumn(params: ProjectsMoveColumnParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  def removeCollaborator(): js.Promise[AnyResponse] = js.native
  def removeCollaborator(params: ProjectsRemoveCollaboratorParams): js.Promise[AnyResponse] = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  def reviewUserPermissionLevel(): js.Promise[Response[ProjectsReviewUserPermissionLevelResponse]] = js.native
  def reviewUserPermissionLevel(params: ProjectsReviewUserPermissionLevelParams): js.Promise[Response[ProjectsReviewUserPermissionLevelResponse]] = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def update(): js.Promise[Response[ProjectsUpdateResponse]] = js.native
  def update(params: ProjectsUpdateParams): js.Promise[Response[ProjectsUpdateResponse]] = js.native
  def updateCard(): js.Promise[Response[ProjectsUpdateCardResponse]] = js.native
  def updateCard(params: ProjectsUpdateCardParams): js.Promise[Response[ProjectsUpdateCardResponse]] = js.native
  def updateColumn(): js.Promise[Response[ProjectsUpdateColumnResponse]] = js.native
  def updateColumn(params: ProjectsUpdateColumnParams): js.Promise[Response[ProjectsUpdateColumnResponse]] = js.native
}

