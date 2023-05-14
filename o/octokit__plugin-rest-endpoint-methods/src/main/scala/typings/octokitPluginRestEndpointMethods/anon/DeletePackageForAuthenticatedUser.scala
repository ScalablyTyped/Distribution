package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackageForAuthenticatedUser extends StObject {
  
  /**
    * Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes.
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes.
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("deletePackageForAuthenticatedUser")
  var deletePackageForAuthenticatedUser_Original: `464`
  
  /**
    * Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("deletePackageForOrg")
  var deletePackageForOrg_Original: `465`
  
  /**
    * Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("deletePackageForUser")
  var deletePackageForUser_Original: `466`
  
  /**
    * Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes.
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes.
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("deletePackageVersionForAuthenticatedUser")
  var deletePackageVersionForAuthenticatedUser_Original: `467`
  
  /**
    * Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("deletePackageVersionForOrg")
  var deletePackageVersionForOrg_Original: `468`
  
  /**
    * Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("deletePackageVersionForUser")
  var deletePackageVersionForUser_Original: `469`
  
  /**
    * Lists package versions for a package owned by an organization.
    *
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * @deprecated octokit.rest.packages.getAllPackageVersionsForAPackageOwnedByAnOrg() has been renamed to octokit.rest.packages.getAllPackageVersionsForPackageOwnedByOrg() (2021-03-24)
    */
  @JSName("getAllPackageVersionsForAPackageOwnedByAnOrg")
  var getAllPackageVersionsForAPackageOwnedByAnOrg_Original: `470`
  
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * @deprecated octokit.rest.packages.getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser() has been renamed to octokit.rest.packages.getAllPackageVersionsForPackageOwnedByAuthenticatedUser() (2021-03-24)
    */
  @JSName("getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser")
  var getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser_Original: `471`
  
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getAllPackageVersionsForPackageOwnedByAuthenticatedUser")
  var getAllPackageVersionsForPackageOwnedByAuthenticatedUser_Original: `471`
  
  /**
    * Lists package versions for a package owned by an organization.
    *
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getAllPackageVersionsForPackageOwnedByOrg")
  var getAllPackageVersionsForPackageOwnedByOrg_Original: `470`
  
  /**
    * Lists package versions for a public package owned by a specified user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getAllPackageVersionsForPackageOwnedByUser")
  var getAllPackageVersionsForPackageOwnedByUser_Original: `472`
  
  /**
    * Gets a specific package for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getPackageForAuthenticatedUser")
  var getPackageForAuthenticatedUser_Original: `473`
  
  /**
    * Gets a specific package in an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getPackageForOrganization")
  var getPackageForOrganization_Original: `474`
  
  /**
    * Gets a specific package metadata for a public package owned by a user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getPackageForUser")
  var getPackageForUser_Original: `475`
  
  /**
    * Gets a specific package version for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getPackageVersionForAuthenticatedUser")
  var getPackageVersionForAuthenticatedUser_Original: `476`
  
  /**
    * Gets a specific package version in an organization.
    *
    * You must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * You must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getPackageVersionForOrganization")
  var getPackageVersionForOrganization_Original: `477`
  
  /**
    * Gets a specific package version for a public package owned by a specified user.
    *
    * At this time, to use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * At this time, to use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("getPackageVersionForUser")
  var getPackageVersionForUser_Original: `478`
  
  /**
    * Lists all packages that are owned by the authenticated user within the user's namespace, and that encountered a conflict during a Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  def listDockerMigrationConflictingPackagesForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/docker/conflicts']['response'] */ js.Any
  ]
  def listDockerMigrationConflictingPackagesForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/docker/conflicts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/docker/conflicts']['response'] */ js.Any
  ]
  /**
    * Lists all packages that are owned by the authenticated user within the user's namespace, and that encountered a conflict during a Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  @JSName("listDockerMigrationConflictingPackagesForAuthenticatedUser")
  var listDockerMigrationConflictingPackagesForAuthenticatedUser_Original: `479`
  
  /**
    * Lists all packages that are in a specific organization, are readable by the requesting user, and that encountered a conflict during a Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  def listDockerMigrationConflictingPackagesForOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/docker/conflicts']['response'] */ js.Any
  ]
  def listDockerMigrationConflictingPackagesForOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/docker/conflicts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/docker/conflicts']['response'] */ js.Any
  ]
  /**
    * Lists all packages that are in a specific organization, are readable by the requesting user, and that encountered a conflict during a Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  @JSName("listDockerMigrationConflictingPackagesForOrganization")
  var listDockerMigrationConflictingPackagesForOrganization_Original: `480`
  
  /**
    * Lists all packages that are in a specific user's namespace, that the requesting user has access to, and that encountered a conflict during Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  def listDockerMigrationConflictingPackagesForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/docker/conflicts']['response'] */ js.Any
  ]
  def listDockerMigrationConflictingPackagesForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/docker/conflicts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/docker/conflicts']['response'] */ js.Any
  ]
  /**
    * Lists all packages that are in a specific user's namespace, that the requesting user has access to, and that encountered a conflict during Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  @JSName("listDockerMigrationConflictingPackagesForUser")
  var listDockerMigrationConflictingPackagesForUser_Original: `481`
  
  /**
    * Lists packages owned by the authenticated user within the user's namespace.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("listPackagesForAuthenticatedUser")
  var listPackagesForAuthenticatedUser_Original: `482`
  
  /**
    * Lists packages in an organization readable by the user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * Lists packages in an organization readable by the user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("listPackagesForOrganization")
  var listPackagesForOrganization_Original: `483`
  
  /**
    * Lists all packages in a user's namespace for which the requesting user has access.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("listPackagesForUser")
  var listPackagesForUser_Original: `484`
  
  /**
    * Restores a package owned by the authenticated user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("restorePackageForAuthenticatedUser")
  var restorePackageForAuthenticatedUser_Original: `485`
  
  /**
    * Restores an entire package in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("restorePackageForOrg")
  var restorePackageForOrg_Original: `486`
  
  /**
    * Restores an entire package for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("restorePackageForUser")
  var restorePackageForUser_Original: `487`
  
  /**
    * Restores a package version owned by the authenticated user.
    *
    * You can restore a deleted package version under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  @JSName("restorePackageVersionForAuthenticatedUser")
  var restorePackageVersionForAuthenticatedUser_Original: `488`
  
  /**
    * Restores a specific package version in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("restorePackageVersionForOrg")
  var restorePackageVersionForOrg_Original: `489`
  
  /**
    * Restores a specific package version for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  @JSName("restorePackageVersionForUser")
  var restorePackageVersionForUser_Original: `490`
}
object DeletePackageForAuthenticatedUser {
  
  inline def apply(
    deletePackageForAuthenticatedUser: `464`,
    deletePackageForOrg: `465`,
    deletePackageForUser: `466`,
    deletePackageVersionForAuthenticatedUser: `467`,
    deletePackageVersionForOrg: `468`,
    deletePackageVersionForUser: `469`,
    getAllPackageVersionsForAPackageOwnedByAnOrg: `470`,
    getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser: `471`,
    getAllPackageVersionsForPackageOwnedByAuthenticatedUser: `471`,
    getAllPackageVersionsForPackageOwnedByOrg: `470`,
    getAllPackageVersionsForPackageOwnedByUser: `472`,
    getPackageForAuthenticatedUser: `473`,
    getPackageForOrganization: `474`,
    getPackageForUser: `475`,
    getPackageVersionForAuthenticatedUser: `476`,
    getPackageVersionForOrganization: `477`,
    getPackageVersionForUser: `478`,
    listDockerMigrationConflictingPackagesForAuthenticatedUser: `479`,
    listDockerMigrationConflictingPackagesForOrganization: `480`,
    listDockerMigrationConflictingPackagesForUser: `481`,
    listPackagesForAuthenticatedUser: `482`,
    listPackagesForOrganization: `483`,
    listPackagesForUser: `484`,
    restorePackageForAuthenticatedUser: `485`,
    restorePackageForOrg: `486`,
    restorePackageForUser: `487`,
    restorePackageVersionForAuthenticatedUser: `488`,
    restorePackageVersionForOrg: `489`,
    restorePackageVersionForUser: `490`
  ): DeletePackageForAuthenticatedUser = {
    val __obj = js.Dynamic.literal(deletePackageForAuthenticatedUser = deletePackageForAuthenticatedUser.asInstanceOf[js.Any], deletePackageForOrg = deletePackageForOrg.asInstanceOf[js.Any], deletePackageForUser = deletePackageForUser.asInstanceOf[js.Any], deletePackageVersionForAuthenticatedUser = deletePackageVersionForAuthenticatedUser.asInstanceOf[js.Any], deletePackageVersionForOrg = deletePackageVersionForOrg.asInstanceOf[js.Any], deletePackageVersionForUser = deletePackageVersionForUser.asInstanceOf[js.Any], getAllPackageVersionsForAPackageOwnedByAnOrg = getAllPackageVersionsForAPackageOwnedByAnOrg.asInstanceOf[js.Any], getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser = getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser.asInstanceOf[js.Any], getAllPackageVersionsForPackageOwnedByAuthenticatedUser = getAllPackageVersionsForPackageOwnedByAuthenticatedUser.asInstanceOf[js.Any], getAllPackageVersionsForPackageOwnedByOrg = getAllPackageVersionsForPackageOwnedByOrg.asInstanceOf[js.Any], getAllPackageVersionsForPackageOwnedByUser = getAllPackageVersionsForPackageOwnedByUser.asInstanceOf[js.Any], getPackageForAuthenticatedUser = getPackageForAuthenticatedUser.asInstanceOf[js.Any], getPackageForOrganization = getPackageForOrganization.asInstanceOf[js.Any], getPackageForUser = getPackageForUser.asInstanceOf[js.Any], getPackageVersionForAuthenticatedUser = getPackageVersionForAuthenticatedUser.asInstanceOf[js.Any], getPackageVersionForOrganization = getPackageVersionForOrganization.asInstanceOf[js.Any], getPackageVersionForUser = getPackageVersionForUser.asInstanceOf[js.Any], listDockerMigrationConflictingPackagesForAuthenticatedUser = listDockerMigrationConflictingPackagesForAuthenticatedUser.asInstanceOf[js.Any], listDockerMigrationConflictingPackagesForOrganization = listDockerMigrationConflictingPackagesForOrganization.asInstanceOf[js.Any], listDockerMigrationConflictingPackagesForUser = listDockerMigrationConflictingPackagesForUser.asInstanceOf[js.Any], listPackagesForAuthenticatedUser = listPackagesForAuthenticatedUser.asInstanceOf[js.Any], listPackagesForOrganization = listPackagesForOrganization.asInstanceOf[js.Any], listPackagesForUser = listPackagesForUser.asInstanceOf[js.Any], restorePackageForAuthenticatedUser = restorePackageForAuthenticatedUser.asInstanceOf[js.Any], restorePackageForOrg = restorePackageForOrg.asInstanceOf[js.Any], restorePackageForUser = restorePackageForUser.asInstanceOf[js.Any], restorePackageVersionForAuthenticatedUser = restorePackageVersionForAuthenticatedUser.asInstanceOf[js.Any], restorePackageVersionForOrg = restorePackageVersionForOrg.asInstanceOf[js.Any], restorePackageVersionForUser = restorePackageVersionForUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackageForAuthenticatedUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePackageForAuthenticatedUser] (val x: Self) extends AnyVal {
    
    inline def setDeletePackageForAuthenticatedUser(value: `464`): Self = StObject.set(x, "deletePackageForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageForOrg(value: `465`): Self = StObject.set(x, "deletePackageForOrg", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageForUser(value: `466`): Self = StObject.set(x, "deletePackageForUser", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageVersionForAuthenticatedUser(value: `467`): Self = StObject.set(x, "deletePackageVersionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageVersionForOrg(value: `468`): Self = StObject.set(x, "deletePackageVersionForOrg", value.asInstanceOf[js.Any])
    
    inline def setDeletePackageVersionForUser(value: `469`): Self = StObject.set(x, "deletePackageVersionForUser", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForAPackageOwnedByAnOrg(value: `470`): Self = StObject.set(x, "getAllPackageVersionsForAPackageOwnedByAnOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser(value: `471`): Self = StObject.set(x, "getAllPackageVersionsForAPackageOwnedByTheAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForPackageOwnedByAuthenticatedUser(value: `471`): Self = StObject.set(x, "getAllPackageVersionsForPackageOwnedByAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForPackageOwnedByOrg(value: `470`): Self = StObject.set(x, "getAllPackageVersionsForPackageOwnedByOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllPackageVersionsForPackageOwnedByUser(value: `472`): Self = StObject.set(x, "getAllPackageVersionsForPackageOwnedByUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageForAuthenticatedUser(value: `473`): Self = StObject.set(x, "getPackageForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageForOrganization(value: `474`): Self = StObject.set(x, "getPackageForOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetPackageForUser(value: `475`): Self = StObject.set(x, "getPackageForUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageVersionForAuthenticatedUser(value: `476`): Self = StObject.set(x, "getPackageVersionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetPackageVersionForOrganization(value: `477`): Self = StObject.set(x, "getPackageVersionForOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetPackageVersionForUser(value: `478`): Self = StObject.set(x, "getPackageVersionForUser", value.asInstanceOf[js.Any])
    
    inline def setListDockerMigrationConflictingPackagesForAuthenticatedUser(value: `479`): Self = StObject.set(x, "listDockerMigrationConflictingPackagesForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListDockerMigrationConflictingPackagesForOrganization(value: `480`): Self = StObject.set(x, "listDockerMigrationConflictingPackagesForOrganization", value.asInstanceOf[js.Any])
    
    inline def setListDockerMigrationConflictingPackagesForUser(value: `481`): Self = StObject.set(x, "listDockerMigrationConflictingPackagesForUser", value.asInstanceOf[js.Any])
    
    inline def setListPackagesForAuthenticatedUser(value: `482`): Self = StObject.set(x, "listPackagesForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListPackagesForOrganization(value: `483`): Self = StObject.set(x, "listPackagesForOrganization", value.asInstanceOf[js.Any])
    
    inline def setListPackagesForUser(value: `484`): Self = StObject.set(x, "listPackagesForUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageForAuthenticatedUser(value: `485`): Self = StObject.set(x, "restorePackageForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageForOrg(value: `486`): Self = StObject.set(x, "restorePackageForOrg", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageForUser(value: `487`): Self = StObject.set(x, "restorePackageForUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageVersionForAuthenticatedUser(value: `488`): Self = StObject.set(x, "restorePackageVersionForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageVersionForOrg(value: `489`): Self = StObject.set(x, "restorePackageVersionForOrg", value.asInstanceOf[js.Any])
    
    inline def setRestorePackageVersionForUser(value: `490`): Self = StObject.set(x, "restorePackageVersionForUser", value.asInstanceOf[js.Any])
  }
}
