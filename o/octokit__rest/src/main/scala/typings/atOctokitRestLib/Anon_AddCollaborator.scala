package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddCollaborator extends js.Object {
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: Anon_EndpointParamsProjectsAddCollaboratorParams = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  @JSName("createCard")
  var createCard_Original: Anon_EndpointParamsProjectsCreateCardParams = js.native
  @JSName("createColumn")
  var createColumn_Original: Anon_EndpointParamsAnyResponseProjectsCreateColumnParams = js.native
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
  var deleteCard_Original: Anon_EndpointParamsProjectsDeleteCardParams = js.native
  @JSName("deleteColumn")
  var deleteColumn_Original: Anon_EndpointParamsProjectsDeleteColumnParams = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  @JSName("delete")
  var delete_Original: Anon_EndpointParamsAnyResponseProjectsDeleteParams = js.native
  @JSName("getCard")
  var getCard_Original: Anon_EndpointParamsAnyResponseProjectsGetCardParams = js.native
  @JSName("getColumn")
  var getColumn_Original: Anon_EndpointParamsAnyResponseProjectsGetColumnParams = js.native
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
  var moveCard_Original: Anon_EndpointParamsProjectsMoveCardParams = js.native
  @JSName("moveColumn")
  var moveColumn_Original: Anon_EndpointParamsProjectsMoveColumnParams = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  @JSName("removeCollaborator")
  var removeCollaborator_Original: Anon_EndpointParamsProjectsRemoveCollaboratorParams = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  @JSName("reviewUserPermissionLevel")
  var reviewUserPermissionLevel_Original: Anon_EndpointParamsProjectsReviewUserPermissionLevelParams = js.native
  @JSName("updateCard")
  var updateCard_Original: Anon_EndpointParamsAnyResponseProjectsUpdateCardParams = js.native
  @JSName("updateColumn")
  var updateColumn_Original: Anon_EndpointParamsAnyResponseProjectsUpdateColumnParams = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("update")
  var update_Original: Anon_EndpointParamsProjectsUpdateParams = js.native
  /**
    * Adds a collaborator to a an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  def addCollaborator(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsAddCollaboratorResponse]
  ] = js.native
  def addCollaborator(params: atOctokitRestLib.atOctokitRestMod.ProjectsAddCollaboratorParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsAddCollaboratorResponse]
  ] = js.native
  /**
    * **Note**: GitHub's REST API v3 considers every pull request an issue, but not every issue is a pull request. For this reason, "Issues" endpoints may return both issues and pull requests in the response. You can identify pull requests by the `pull_request` key.
    *
    * Be aware that the `id` of a pull request returned from "Issues" endpoints will be an _issue id_. To find out the pull request id, use the "[List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests)" endpoint.
    */
  def createCard(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateCardResponse]
  ] = js.native
  def createCard(params: atOctokitRestLib.atOctokitRestMod.ProjectsCreateCardParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateCardResponse]
  ] = js.native
  def createColumn(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def createColumn(params: atOctokitRestLib.atOctokitRestMod.ProjectsCreateColumnParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def createForAuthenticatedUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateForAuthenticatedUserResponse]
  ] = js.native
  def createForAuthenticatedUser(params: atOctokitRestLib.atOctokitRestMod.ProjectsCreateForAuthenticatedUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateForAuthenticatedUserResponse]
  ] = js.native
  /**
    * Creates an organization project board. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateForOrgResponse]
  ] = js.native
  def createForOrg(params: atOctokitRestLib.atOctokitRestMod.ProjectsCreateForOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateForOrgResponse]
  ] = js.native
  /**
    * Creates a repository project board. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateForRepoResponse]
  ] = js.native
  def createForRepo(params: atOctokitRestLib.atOctokitRestMod.ProjectsCreateForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsCreateForRepoResponse]
  ] = js.native
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  def delete(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def delete(params: atOctokitRestLib.atOctokitRestMod.ProjectsDeleteParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def deleteCard(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsDeleteCardResponse]
  ] = js.native
  def deleteCard(params: atOctokitRestLib.atOctokitRestMod.ProjectsDeleteCardParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsDeleteCardResponse]
  ] = js.native
  def deleteColumn(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsDeleteColumnResponse]
  ] = js.native
  def deleteColumn(params: atOctokitRestLib.atOctokitRestMod.ProjectsDeleteColumnParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsDeleteColumnResponse]
  ] = js.native
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def get(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsGetResponse]
  ] = js.native
  def get(params: atOctokitRestLib.atOctokitRestMod.ProjectsGetParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsGetResponse]
  ] = js.native
  def getCard(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getCard(params: atOctokitRestLib.atOctokitRestMod.ProjectsGetCardParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getColumn(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def getColumn(params: atOctokitRestLib.atOctokitRestMod.ProjectsGetColumnParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def listCards(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListCardsResponse]
  ] = js.native
  def listCards(params: atOctokitRestLib.atOctokitRestMod.ProjectsListCardsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListCardsResponse]
  ] = js.native
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  def listCollaborators(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListCollaboratorsResponse]
  ] = js.native
  def listCollaborators(params: atOctokitRestLib.atOctokitRestMod.ProjectsListCollaboratorsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListCollaboratorsResponse]
  ] = js.native
  def listColumns(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListColumnsResponse]
  ] = js.native
  def listColumns(params: atOctokitRestLib.atOctokitRestMod.ProjectsListColumnsParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListColumnsResponse]
  ] = js.native
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    *
    * s
    */
  def listForOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListForOrgResponse]
  ] = js.native
  def listForOrg(params: atOctokitRestLib.atOctokitRestMod.ProjectsListForOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListForOrgResponse]
  ] = js.native
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def listForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListForRepoResponse]
  ] = js.native
  def listForRepo(params: atOctokitRestLib.atOctokitRestMod.ProjectsListForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListForRepoResponse]
  ] = js.native
  def listForUser(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListForUserResponse]
  ] = js.native
  def listForUser(params: atOctokitRestLib.atOctokitRestMod.ProjectsListForUserParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsListForUserResponse]
  ] = js.native
  def moveCard(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsMoveCardResponse]
  ] = js.native
  def moveCard(params: atOctokitRestLib.atOctokitRestMod.ProjectsMoveCardParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsMoveCardResponse]
  ] = js.native
  def moveColumn(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsMoveColumnResponse]
  ] = js.native
  def moveColumn(params: atOctokitRestLib.atOctokitRestMod.ProjectsMoveColumnParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsMoveColumnResponse]
  ] = js.native
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  def removeCollaborator(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsRemoveCollaboratorResponse]
  ] = js.native
  def removeCollaborator(params: atOctokitRestLib.atOctokitRestMod.ProjectsRemoveCollaboratorParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsRemoveCollaboratorResponse]
  ] = js.native
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  def reviewUserPermissionLevel(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsReviewUserPermissionLevelResponse]
  ] = js.native
  def reviewUserPermissionLevel(params: atOctokitRestLib.atOctokitRestMod.ProjectsReviewUserPermissionLevelParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsReviewUserPermissionLevelResponse]
  ] = js.native
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def update(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsUpdateResponse]
  ] = js.native
  def update(params: atOctokitRestLib.atOctokitRestMod.ProjectsUpdateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.ProjectsUpdateResponse]
  ] = js.native
  def updateCard(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def updateCard(params: atOctokitRestLib.atOctokitRestMod.ProjectsUpdateCardParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def updateColumn(): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
  def updateColumn(params: atOctokitRestLib.atOctokitRestMod.ProjectsUpdateColumnParams): js.Promise[atOctokitRestLib.atOctokitRestMod.AnyResponse] = js.native
}

