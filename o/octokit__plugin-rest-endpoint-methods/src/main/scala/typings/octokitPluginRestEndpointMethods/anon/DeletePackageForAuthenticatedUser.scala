package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageForAuthenticatedUser extends StObject {
  
  /**
    * Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def deletePackageForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  def deletePackageForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/packages/{package_type}/{package_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("deletePackageForAuthenticatedUser")
  var deletePackageForAuthenticatedUser_Original: `418`
  
  /**
    * Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  def deletePackageForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  def deletePackageForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/packages/{package_type}/{package_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  /**
    * Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  @JSName("deletePackageForOrg")
  var deletePackageForOrg_Original: `419`
  
  /**
    * Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  def deletePackageForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /users/{username}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  def deletePackageForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /users/{username}/packages/{package_type}/{package_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /users/{username}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  /**
    * Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  @JSName("deletePackageForUser")
  var deletePackageForUser_Original: `420`
  
  /**
    * Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def deletePackageVersionForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  def deletePackageVersionForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/packages/{package_type}/{package_name}/versions/{package_version_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("deletePackageVersionForAuthenticatedUser")
  var deletePackageVersionForAuthenticatedUser_Original: `421`
  
  /**
    * Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  def deletePackageVersionForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  def deletePackageVersionForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  @JSName("deletePackageVersionForOrg")
  var deletePackageVersionForOrg_Original: `422`
  
  /**
    * Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  def deletePackageVersionForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  def deletePackageVersionForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  @JSName("deletePackageVersionForUser")
  var deletePackageVersionForUser_Original: `423`
  
  /**
    * Lists package versions for a package owned by an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    * @deprecated octokit.rest.packages.getAllPackageVersionsForAPackageOwnedByAnOrg() has been renamed to octokit.rest.packages.getAllPackageVersionsForPackageOwnedByOrg() (2021-03-24)
    */
  def getAllPackageVersionsForAPackageOwnedByAnOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  def getAllPackageVersionsForAPackageOwnedByAnOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  /**
    * Lists package versions for a package owned by an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    * @deprecated octokit.rest.packages.getAllPackageVersionsForAPackageOwnedByAnOrg() has been renamed to octokit.rest.packages.getAllPackageVersionsForPackageOwnedByOrg() (2021-03-24)
    */
  @JSName("getAllPackageVersionsForAPackageOwnedByAnOrg")
  var getAllPackageVersionsForAPackageOwnedByAnOrg_Original: `424`
  
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    * @deprecated octokit.rest.packages.getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser() has been renamed to octokit.rest.packages.getAllPackageVersionsForPackageOwnedByAuthenticatedUser() (2021-03-24)
    */
  def getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  def getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    * @deprecated octokit.rest.packages.getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser() has been renamed to octokit.rest.packages.getAllPackageVersionsForPackageOwnedByAuthenticatedUser() (2021-03-24)
    */
  @JSName("getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser")
  var getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser_Original: `425`
  
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getAllPackageVersionsForPackageOwnedByAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  def getAllPackageVersionsForPackageOwnedByAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getAllPackageVersionsForPackageOwnedByAuthenticatedUser")
  var getAllPackageVersionsForPackageOwnedByAuthenticatedUser_Original: `425`
  
  /**
    * Lists package versions for a package owned by an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getAllPackageVersionsForPackageOwnedByOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  def getAllPackageVersionsForPackageOwnedByOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  /**
    * Lists package versions for a package owned by an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getAllPackageVersionsForPackageOwnedByOrg")
  var getAllPackageVersionsForPackageOwnedByOrg_Original: `424`
  
  /**
    * Lists package versions for a public package owned by a specified user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getAllPackageVersionsForPackageOwnedByUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  def getAllPackageVersionsForPackageOwnedByUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}/versions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}/versions']['response'] */ js.Any
  ]
  /**
    * Lists package versions for a public package owned by a specified user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getAllPackageVersionsForPackageOwnedByUser")
  var getAllPackageVersionsForPackageOwnedByUser_Original: `426`
  
  /**
    * Gets a specific package for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getPackageForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  def getPackageForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  /**
    * Gets a specific package for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getPackageForAuthenticatedUser")
  var getPackageForAuthenticatedUser_Original: `427`
  
  /**
    * Gets a specific package in an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getPackageForOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  def getPackageForOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  /**
    * Gets a specific package in an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getPackageForOrganization")
  var getPackageForOrganization_Original: `428`
  
  /**
    * Gets a specific package metadata for a public package owned by a user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getPackageForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  def getPackageForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}']['response'] */ js.Any
  ]
  /**
    * Gets a specific package metadata for a public package owned by a user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getPackageForUser")
  var getPackageForUser_Original: `429`
  
  /**
    * Gets a specific package version for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getPackageVersionForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  def getPackageVersionForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions/{package_version_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specific package version for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getPackageVersionForAuthenticatedUser")
  var getPackageVersionForAuthenticatedUser_Original: `430`
  
  /**
    * Gets a specific package version in an organization.
    *
    * You must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getPackageVersionForOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  def getPackageVersionForOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specific package version in an organization.
    *
    * You must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getPackageVersionForOrganization")
  var getPackageVersionForOrganization_Original: `431`
  
  /**
    * Gets a specific package version for a public package owned by a specified user.
    *
    * At this time, to use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def getPackageVersionForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  def getPackageVersionForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specific package version for a public package owned by a specified user.
    *
    * At this time, to use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("getPackageVersionForUser")
  var getPackageVersionForUser_Original: `432`
  
  /**
    * Lists packages owned by the authenticated user within the user's namespace.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def listPackagesForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages']['response'] */ js.Any
  ]
  def listPackagesForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/packages']['response'] */ js.Any
  ]
  /**
    * Lists packages owned by the authenticated user within the user's namespace.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("listPackagesForAuthenticatedUser")
  var listPackagesForAuthenticatedUser_Original: `433`
  
  /**
    * Lists all packages in an organization readable by the user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def listPackagesForOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages']['response'] */ js.Any
  ]
  def listPackagesForOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/packages']['response'] */ js.Any
  ]
  /**
    * Lists all packages in an organization readable by the user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("listPackagesForOrganization")
  var listPackagesForOrganization_Original: `434`
  
  /**
    * Lists all packages in a user's namespace for which the requesting user has access.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def listPackagesForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages']['response'] */ js.Any
  ]
  def listPackagesForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/packages']['response'] */ js.Any
  ]
  /**
    * Lists all packages in a user's namespace for which the requesting user has access.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("listPackagesForUser")
  var listPackagesForUser_Original: `435`
  
  /**
    * Restores a package owned by the authenticated user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def restorePackageForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/packages/{package_type}/{package_name}/restore{?token}']['response'] */ js.Any
  ]
  def restorePackageForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/packages/{package_type}/{package_name}/restore{?token}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/packages/{package_type}/{package_name}/restore{?token}']['response'] */ js.Any
  ]
  /**
    * Restores a package owned by the authenticated user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("restorePackageForAuthenticatedUser")
  var restorePackageForAuthenticatedUser_Original: `436`
  
  /**
    * Restores an entire package in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  def restorePackageForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/packages/{package_type}/{package_name}/restore{?token}']['response'] */ js.Any
  ]
  def restorePackageForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/packages/{package_type}/{package_name}/restore{?token}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/packages/{package_type}/{package_name}/restore{?token}']['response'] */ js.Any
  ]
  /**
    * Restores an entire package in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  @JSName("restorePackageForOrg")
  var restorePackageForOrg_Original: `437`
  
  /**
    * Restores an entire package for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  def restorePackageForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /users/{username}/packages/{package_type}/{package_name}/restore{?token}']['response'] */ js.Any
  ]
  def restorePackageForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /users/{username}/packages/{package_type}/{package_name}/restore{?token}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /users/{username}/packages/{package_type}/{package_name}/restore{?token}']['response'] */ js.Any
  ]
  /**
    * Restores an entire package for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  @JSName("restorePackageForUser")
  var restorePackageForUser_Original: `438`
  
  /**
    * Restores a package version owned by the authenticated user.
    *
    * You can restore a deleted package version under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  def restorePackageVersionForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['response'] */ js.Any
  ]
  def restorePackageVersionForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['response'] */ js.Any
  ]
  /**
    * Restores a package version owned by the authenticated user.
    *
    * You can restore a deleted package version under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  @JSName("restorePackageVersionForAuthenticatedUser")
  var restorePackageVersionForAuthenticatedUser_Original: `439`
  
  /**
    * Restores a specific package version in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  def restorePackageVersionForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['response'] */ js.Any
  ]
  def restorePackageVersionForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['response'] */ js.Any
  ]
  /**
    * Restores a specific package version in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  @JSName("restorePackageVersionForOrg")
  var restorePackageVersionForOrg_Original: `440`
  
  /**
    * Restores a specific package version for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  def restorePackageVersionForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['response'] */ js.Any
  ]
  def restorePackageVersionForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /users/{username}/packages/{package_type}/{package_name}/versions/{package_version_id}/restore']['response'] */ js.Any
  ]
  /**
    * Restores a specific package version for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  @JSName("restorePackageVersionForUser")
  var restorePackageVersionForUser_Original: `441`
}
object DeletePackageForAuthenticatedUser {
  
  inline def apply(
    deletePackageForAuthenticatedUser: `418`,
    deletePackageForOrg: `419`,
    deletePackageForUser: `420`,
    deletePackageVersionForAuthenticatedUser: `421`,
    deletePackageVersionForOrg: `422`,
    deletePackageVersionForUser: `423`,
    getAllPackageVersionsForAPackageOwnedByAnOrg: `424`,
    getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser: `425`,
    getAllPackageVersionsForPackageOwnedByAuthenticatedUser: `425`,
    getAllPackageVersionsForPackageOwnedByOrg: `424`,
    getAllPackageVersionsForPackageOwnedByUser: `426`,
    getPackageForAuthenticatedUser: `427`,
    getPackageForOrganization: `428`,
    getPackageForUser: `429`,
    getPackageVersionForAuthenticatedUser: `430`,
    getPackageVersionForOrganization: `431`,
    getPackageVersionForUser: `432`,
    listPackagesForAuthenticatedUser: `433`,
    listPackagesForOrganization: `434`,
    listPackagesForUser: `435`,
    restorePackageForAuthenticatedUser: `436`,
    restorePackageForOrg: `437`,
    restorePackageForUser: `438`,
    restorePackageVersionForAuthenticatedUser: `439`,
    restorePackageVersionForOrg: `440`,
    restorePackageVersionForUser: `441`
  ): DeletePackageForAuthenticatedUser = {
    val __obj = js.Dynamic.literal(deletePackageForAuthenticatedUser = deletePackageForAuthenticatedUser.asInstanceOf[js.Any], deletePackageForOrg = deletePackageForOrg.asInstanceOf[js.Any], deletePackageForUser = deletePackageForUser.asInstanceOf[js.Any], deletePackageVersionForAuthenticatedUser = deletePackageVersionForAuthenticatedUser.asInstanceOf[js.Any], deletePackageVersionForOrg = deletePackageVersionForOrg.asInstanceOf[js.Any], deletePackageVersionForUser = deletePackageVersionForUser.asInstanceOf[js.Any], getAllPackageVersionsForAPackageOwnedByAnOrg = getAllPackageVersionsForAPackageOwnedByAnOrg.asInstanceOf[js.Any], getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser = getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser.asInstanceOf[js.Any], getAllPackageVersionsForPackageOwnedByAuthenticatedUser = getAllPackageVersionsForPackageOwnedByAuthenticatedUser.asInstanceOf[js.Any], getAllPackageVersionsForPackageOwnedByOrg = getAllPackageVersionsForPackageOwnedByOrg.asInstanceOf[js.Any], getAllPackageVersionsForPackageOwnedByUser = getAllPackageVersionsForPackageOwnedByUser.asInstanceOf[js.Any], getPackageForAuthenticatedUser = getPackageForAuthenticatedUser.asInstanceOf[js.Any], getPackageForOrganization = getPackageForOrganization.asInstanceOf[js.Any], getPackageForUser = getPackageForUser.asInstanceOf[js.Any], getPackageVersionForAuthenticatedUser = getPackageVersionForAuthenticatedUser.asInstanceOf[js.Any], getPackageVersionForOrganization = getPackageVersionForOrganization.asInstanceOf[js.Any], getPackageVersionForUser = getPackageVersionForUser.asInstanceOf[js.Any], listPackagesForAuthenticatedUser = listPackagesForAuthenticatedUser.asInstanceOf[js.Any], listPackagesForOrganization = listPackagesForOrganization.asInstanceOf[js.Any], listPackagesForUser = listPackagesForUser.asInstanceOf[js.Any], restorePackageForAuthenticatedUser = restorePackageForAuthenticatedUser.asInstanceOf[js.Any], restorePackageForOrg = restorePackageForOrg.asInstanceOf[js.Any], restorePackageForUser = restorePackageForUser.asInstanceOf[js.Any], restorePackageVersionForAuthenticatedUser = restorePackageVersionForAuthenticatedUser.asInstanceOf[js.Any], restorePackageVersionForOrg = restorePackageVersionForOrg.asInstanceOf[js.Any], restorePackageVersionForUser = restorePackageVersionForUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageForAuthenticatedUser]
  }
  
  extension [Self <: DeletePackageForAuthenticatedUser](x: Self) {
    
    inline def setDeletePackageForAuthenticatedUser(value: `418`): Self = StObject.set(x, "deletePackageForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageForOrg(value: `419`): Self = StObject.set(x, "deletePackageForOrg", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageForUser(value: `420`): Self = StObject.set(x, "deletePackageForUser", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageVersionForAuthenticatedUser(value: `421`): Self = StObject.set(x, "deletePackageVersionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageVersionForOrg(value: `422`): Self = StObject.set(x, "deletePackageVersionForOrg", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageVersionForUser(value: `423`): Self = StObject.set(x, "deletePackageVersionForUser", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForAPackageOwnedByAnOrg(value: `424`): Self = StObject.set(x, "getAllPackageVersionsForAPackageOwnedByAnOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser(value: `425`): Self = StObject.set(x, "getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForPackageOwnedByAuthenticatedUser(value: `425`): Self = StObject.set(x, "getAllPackageVersionsForPackageOwnedByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForPackageOwnedByOrg(value: `424`): Self = StObject.set(x, "getAllPackageVersionsForPackageOwnedByOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForPackageOwnedByUser(value: `426`): Self = StObject.set(x, "getAllPackageVersionsForPackageOwnedByUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageForAuthenticatedUser(value: `427`): Self = StObject.set(x, "getPackageForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageForOrganization(value: `428`): Self = StObject.set(x, "getPackageForOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetPackageForUser(value: `429`): Self = StObject.set(x, "getPackageForUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageVersionForAuthenticatedUser(value: `430`): Self = StObject.set(x, "getPackageVersionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageVersionForOrganization(value: `431`): Self = StObject.set(x, "getPackageVersionForOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetPackageVersionForUser(value: `432`): Self = StObject.set(x, "getPackageVersionForUser", value.asInstanceOf[js.Any])
    
    inline def setListPackagesForAuthenticatedUser(value: `433`): Self = StObject.set(x, "listPackagesForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListPackagesForOrganization(value: `434`): Self = StObject.set(x, "listPackagesForOrganization", value.asInstanceOf[js.Any])
    
    inline def setListPackagesForUser(value: `435`): Self = StObject.set(x, "listPackagesForUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageForAuthenticatedUser(value: `436`): Self = StObject.set(x, "restorePackageForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageForOrg(value: `437`): Self = StObject.set(x, "restorePackageForOrg", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageForUser(value: `438`): Self = StObject.set(x, "restorePackageForUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageVersionForAuthenticatedUser(value: `439`): Self = StObject.set(x, "restorePackageVersionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageVersionForOrg(value: `440`): Self = StObject.set(x, "restorePackageVersionForOrg", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageVersionForUser(value: `441`): Self = StObject.set(x, "restorePackageVersionForUser", value.asInstanceOf[js.Any])
  }
}
