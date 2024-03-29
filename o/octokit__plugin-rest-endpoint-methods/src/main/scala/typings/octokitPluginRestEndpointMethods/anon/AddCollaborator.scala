package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCollaborator extends StObject {
  
  /**
    * Adds a collaborator to an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  def addCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /projects/{project_id}/collaborators/{username}']['response'] */ js.Any
  ]
  def addCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /projects/{project_id}/collaborators/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /projects/{project_id}/collaborators/{username}']['response'] */ js.Any
  ]
  /**
    * Adds a collaborator to an organization project and sets their permission level. You must be an organization owner or a project `admin` to add a collaborator.
    */
  @JSName("addCollaborator")
  var addCollaborator_Original: `493`
  
  def createCard(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/{column_id}/cards']['response'] */ js.Any
  ]
  def createCard(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/{column_id}/cards']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/{column_id}/cards']['response'] */ js.Any
  ]
  @JSName("createCard")
  var createCard_Original: `494`
  
  /**
    * Creates a new project column.
    */
  def createColumn(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/{project_id}/columns']['response'] */ js.Any
  ]
  def createColumn(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/{project_id}/columns']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/{project_id}/columns']['response'] */ js.Any
  ]
  /**
    * Creates a new project column.
    */
  @JSName("createColumn")
  var createColumn_Original: `495`
  
  /**
    * Creates a user project board. Returns a `410 Gone` status if the user does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/projects']['response'] */ js.Any
  ]
  def createForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/projects']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/projects']['response'] */ js.Any
  ]
  /**
    * Creates a user project board. Returns a `410 Gone` status if the user does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: `496`
  
  /**
    * Creates an organization project board. Returns a `410 Gone` status if projects are disabled in the organization or if the organization does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/projects']['response'] */ js.Any
  ]
  def createForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/projects']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/projects']['response'] */ js.Any
  ]
  /**
    * Creates an organization project board. Returns a `410 Gone` status if projects are disabled in the organization or if the organization does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForOrg")
  var createForOrg_Original: `497`
  
  /**
    * Creates a repository project board. Returns a `410 Gone` status if projects are disabled in the repository or if the repository does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def createForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/projects']['response'] */ js.Any
  ]
  def createForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/projects']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/projects']['response'] */ js.Any
  ]
  /**
    * Creates a repository project board. Returns a `410 Gone` status if projects are disabled in the repository or if the repository does not have existing classic projects. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("createForRepo")
  var createForRepo_Original: `498`
  
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  def delete(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/{project_id}']['response'] */ js.Any
  ]
  def delete(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/{project_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/{project_id}']['response'] */ js.Any
  ]
  
  /**
    * Deletes a project card
    */
  def deleteCard(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/columns/cards/{card_id}']['response'] */ js.Any
  ]
  def deleteCard(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/columns/cards/{card_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/columns/cards/{card_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a project card
    */
  @JSName("deleteCard")
  var deleteCard_Original: `500`
  
  /**
    * Deletes a project column.
    */
  def deleteColumn(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/columns/{column_id}']['response'] */ js.Any
  ]
  def deleteColumn(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/columns/{column_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/columns/{column_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a project column.
    */
  @JSName("deleteColumn")
  var deleteColumn_Original: `501`
  
  /**
    * Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  @JSName("delete")
  var delete_Original: `499`
  
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}']['response'] */ js.Any
  ]
  
  /**
    * Gets information about a project card.
    */
  def getCard(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/cards/{card_id}']['response'] */ js.Any
  ]
  def getCard(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/cards/{card_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/cards/{card_id}']['response'] */ js.Any
  ]
  /**
    * Gets information about a project card.
    */
  @JSName("getCard")
  var getCard_Original: `503`
  
  /**
    * Gets information about a project column.
    */
  def getColumn(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/{column_id}']['response'] */ js.Any
  ]
  def getColumn(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/{column_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/{column_id}']['response'] */ js.Any
  ]
  /**
    * Gets information about a project column.
    */
  @JSName("getColumn")
  var getColumn_Original: `504`
  
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  def getPermissionForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/collaborators/{username}/permission']['response'] */ js.Any
  ]
  def getPermissionForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/collaborators/{username}/permission']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/collaborators/{username}/permission']['response'] */ js.Any
  ]
  /**
    * Returns the collaborator's permission level for an organization project. Possible values for the `permission` key: `admin`, `write`, `read`, `none`. You must be an organization owner or a project `admin` to review a user's permission level.
    */
  @JSName("getPermissionForUser")
  var getPermissionForUser_Original: `505`
  
  /**
    * Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("get")
  var get_Original: `502`
  
  /**
    * Lists the project cards in a project.
    */
  def listCards(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/{column_id}/cards']['response'] */ js.Any
  ]
  def listCards(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/{column_id}/cards']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/columns/{column_id}/cards']['response'] */ js.Any
  ]
  /**
    * Lists the project cards in a project.
    */
  @JSName("listCards")
  var listCards_Original: `506`
  
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  def listCollaborators(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/collaborators']['response'] */ js.Any
  ]
  def listCollaborators(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/collaborators']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/collaborators']['response'] */ js.Any
  ]
  /**
    * Lists the collaborators for an organization project. For a project, the list of collaborators includes outside collaborators, organization members that are direct collaborators, organization members with access through team memberships, organization members with access through default organization permissions, and organization owners. You must be an organization owner or a project `admin` to list collaborators.
    */
  @JSName("listCollaborators")
  var listCollaborators_Original: `507`
  
  /**
    * Lists the project columns in a project.
    */
  def listColumns(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/columns']['response'] */ js.Any
  ]
  def listColumns(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/columns']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /projects/{project_id}/columns']['response'] */ js.Any
  ]
  /**
    * Lists the project columns in a project.
    */
  @JSName("listColumns")
  var listColumns_Original: `508`
  
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def listForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/projects']['response'] */ js.Any
  ]
  def listForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/projects']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/projects']['response'] */ js.Any
  ]
  /**
    * Lists the projects in an organization. Returns a `404 Not Found` status if projects are disabled in the organization. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("listForOrg")
  var listForOrg_Original: `509`
  
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def listForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/projects']['response'] */ js.Any
  ]
  def listForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/projects']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/projects']['response'] */ js.Any
  ]
  /**
    * Lists the projects in a repository. Returns a `404 Not Found` status if projects are disabled in the repository. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("listForRepo")
  var listForRepo_Original: `510`
  
  /**
    * Lists projects for a user.
    */
  def listForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/projects']['response'] */ js.Any
  ]
  def listForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/projects']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/projects']['response'] */ js.Any
  ]
  /**
    * Lists projects for a user.
    */
  @JSName("listForUser")
  var listForUser_Original: `511`
  
  def moveCard(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/cards/{card_id}/moves']['response'] */ js.Any
  ]
  def moveCard(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/cards/{card_id}/moves']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/cards/{card_id}/moves']['response'] */ js.Any
  ]
  @JSName("moveCard")
  var moveCard_Original: `512`
  
  def moveColumn(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/{column_id}/moves']['response'] */ js.Any
  ]
  def moveColumn(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/{column_id}/moves']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /projects/columns/{column_id}/moves']['response'] */ js.Any
  ]
  @JSName("moveColumn")
  var moveColumn_Original: `513`
  
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  def removeCollaborator(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/{project_id}/collaborators/{username}']['response'] */ js.Any
  ]
  def removeCollaborator(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/{project_id}/collaborators/{username}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /projects/{project_id}/collaborators/{username}']['response'] */ js.Any
  ]
  /**
    * Removes a collaborator from an organization project. You must be an organization owner or a project `admin` to remove a collaborator.
    */
  @JSName("removeCollaborator")
  var removeCollaborator_Original: `514`
  
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/{project_id}']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/{project_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/{project_id}']['response'] */ js.Any
  ]
  
  def updateCard(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/columns/cards/{card_id}']['response'] */ js.Any
  ]
  def updateCard(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/columns/cards/{card_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/columns/cards/{card_id}']['response'] */ js.Any
  ]
  @JSName("updateCard")
  var updateCard_Original: `516`
  
  def updateColumn(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/columns/{column_id}']['response'] */ js.Any
  ]
  def updateColumn(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/columns/{column_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /projects/columns/{column_id}']['response'] */ js.Any
  ]
  @JSName("updateColumn")
  var updateColumn_Original: `517`
  
  /**
    * Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  @JSName("update")
  var update_Original: `515`
}
object AddCollaborator {
  
  inline def apply(
    addCollaborator: `493`,
    createCard: `494`,
    createColumn: `495`,
    createForAuthenticatedUser: `496`,
    createForOrg: `497`,
    createForRepo: `498`,
    delete: `499`,
    deleteCard: `500`,
    deleteColumn: `501`,
    get: `502`,
    getCard: `503`,
    getColumn: `504`,
    getPermissionForUser: `505`,
    listCards: `506`,
    listCollaborators: `507`,
    listColumns: `508`,
    listForOrg: `509`,
    listForRepo: `510`,
    listForUser: `511`,
    moveCard: `512`,
    moveColumn: `513`,
    removeCollaborator: `514`,
    update: `515`,
    updateCard: `516`,
    updateColumn: `517`
  ): AddCollaborator = {
    val __obj = js.Dynamic.literal(addCollaborator = addCollaborator.asInstanceOf[js.Any], createCard = createCard.asInstanceOf[js.Any], createColumn = createColumn.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createForOrg = createForOrg.asInstanceOf[js.Any], createForRepo = createForRepo.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteCard = deleteCard.asInstanceOf[js.Any], deleteColumn = deleteColumn.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getCard = getCard.asInstanceOf[js.Any], getColumn = getColumn.asInstanceOf[js.Any], getPermissionForUser = getPermissionForUser.asInstanceOf[js.Any], listCards = listCards.asInstanceOf[js.Any], listCollaborators = listCollaborators.asInstanceOf[js.Any], listColumns = listColumns.asInstanceOf[js.Any], listForOrg = listForOrg.asInstanceOf[js.Any], listForRepo = listForRepo.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], moveCard = moveCard.asInstanceOf[js.Any], moveColumn = moveColumn.asInstanceOf[js.Any], removeCollaborator = removeCollaborator.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateCard = updateCard.asInstanceOf[js.Any], updateColumn = updateColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCollaborator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCollaborator] (val x: Self) extends AnyVal {
    
    inline def setAddCollaborator(value: `493`): Self = StObject.set(x, "addCollaborator", value.asInstanceOf[js.Any])
    
    inline def setCreateCard(value: `494`): Self = StObject.set(x, "createCard", value.asInstanceOf[js.Any])
    
    inline def setCreateColumn(value: `495`): Self = StObject.set(x, "createColumn", value.asInstanceOf[js.Any])
    
    inline def setCreateForAuthenticatedUser(value: `496`): Self = StObject.set(x, "createForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateForOrg(value: `497`): Self = StObject.set(x, "createForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateForRepo(value: `498`): Self = StObject.set(x, "createForRepo", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: `499`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteCard(value: `500`): Self = StObject.set(x, "deleteCard", value.asInstanceOf[js.Any])
    
    inline def setDeleteColumn(value: `501`): Self = StObject.set(x, "deleteColumn", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `502`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetCard(value: `503`): Self = StObject.set(x, "getCard", value.asInstanceOf[js.Any])
    
    inline def setGetColumn(value: `504`): Self = StObject.set(x, "getColumn", value.asInstanceOf[js.Any])
    
    inline def setGetPermissionForUser(value: `505`): Self = StObject.set(x, "getPermissionForUser", value.asInstanceOf[js.Any])
    
    inline def setListCards(value: `506`): Self = StObject.set(x, "listCards", value.asInstanceOf[js.Any])
    
    inline def setListCollaborators(value: `507`): Self = StObject.set(x, "listCollaborators", value.asInstanceOf[js.Any])
    
    inline def setListColumns(value: `508`): Self = StObject.set(x, "listColumns", value.asInstanceOf[js.Any])
    
    inline def setListForOrg(value: `509`): Self = StObject.set(x, "listForOrg", value.asInstanceOf[js.Any])
    
    inline def setListForRepo(value: `510`): Self = StObject.set(x, "listForRepo", value.asInstanceOf[js.Any])
    
    inline def setListForUser(value: `511`): Self = StObject.set(x, "listForUser", value.asInstanceOf[js.Any])
    
    inline def setMoveCard(value: `512`): Self = StObject.set(x, "moveCard", value.asInstanceOf[js.Any])
    
    inline def setMoveColumn(value: `513`): Self = StObject.set(x, "moveColumn", value.asInstanceOf[js.Any])
    
    inline def setRemoveCollaborator(value: `514`): Self = StObject.set(x, "removeCollaborator", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `515`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateCard(value: `516`): Self = StObject.set(x, "updateCard", value.asInstanceOf[js.Any])
    
    inline def setUpdateColumn(value: `517`): Self = StObject.set(x, "updateColumn", value.asInstanceOf[js.Any])
  }
}
