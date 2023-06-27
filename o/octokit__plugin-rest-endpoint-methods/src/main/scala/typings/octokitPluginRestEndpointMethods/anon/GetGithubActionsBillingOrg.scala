package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGithubActionsBillingOrg extends StObject {
  
  /**
    * Gets the summary of the free and paid GitHub Actions minutes used.
    *
    * Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  def getGithubActionsBillingOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/actions']['response'] */ js.Any
  ]
  def getGithubActionsBillingOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/actions']['response'] */ js.Any
  ]
  /**
    * Gets the summary of the free and paid GitHub Actions minutes used.
    *
    * Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  @JSName("getGithubActionsBillingOrg")
  var getGithubActionsBillingOrg_Original: `191`
  
  /**
    * Gets the summary of the free and paid GitHub Actions minutes used.
    *
    * Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Access tokens must have the `user` scope.
    */
  def getGithubActionsBillingUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/actions']['response'] */ js.Any
  ]
  def getGithubActionsBillingUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/actions']['response'] */ js.Any
  ]
  /**
    * Gets the summary of the free and paid GitHub Actions minutes used.
    *
    * Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Access tokens must have the `user` scope.
    */
  @JSName("getGithubActionsBillingUser")
  var getGithubActionsBillingUser_Original: `192`
  
  /**
    * Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  def getGithubPackagesBillingOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/packages']['response'] */ js.Any
  ]
  def getGithubPackagesBillingOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/packages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/packages']['response'] */ js.Any
  ]
  /**
    * Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  @JSName("getGithubPackagesBillingOrg")
  var getGithubPackagesBillingOrg_Original: `193`
  
  /**
    * Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `user` scope.
    */
  def getGithubPackagesBillingUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/packages']['response'] */ js.Any
  ]
  def getGithubPackagesBillingUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/packages']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/packages']['response'] */ js.Any
  ]
  /**
    * Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `user` scope.
    */
  @JSName("getGithubPackagesBillingUser")
  var getGithubPackagesBillingUser_Original: `194`
  
  /**
    * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  def getSharedStorageBillingOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/shared-storage']['response'] */ js.Any
  ]
  def getSharedStorageBillingOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/shared-storage']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/settings/billing/shared-storage']['response'] */ js.Any
  ]
  /**
    * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  @JSName("getSharedStorageBillingOrg")
  var getSharedStorageBillingOrg_Original: `195`
  
  /**
    * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `user` scope.
    */
  def getSharedStorageBillingUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/shared-storage']['response'] */ js.Any
  ]
  def getSharedStorageBillingUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/shared-storage']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/settings/billing/shared-storage']['response'] */ js.Any
  ]
  /**
    * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `user` scope.
    */
  @JSName("getSharedStorageBillingUser")
  var getSharedStorageBillingUser_Original: `196`
}
object GetGithubActionsBillingOrg {
  
  inline def apply(
    getGithubActionsBillingOrg: `191`,
    getGithubActionsBillingUser: `192`,
    getGithubPackagesBillingOrg: `193`,
    getGithubPackagesBillingUser: `194`,
    getSharedStorageBillingOrg: `195`,
    getSharedStorageBillingUser: `196`
  ): GetGithubActionsBillingOrg = {
    val __obj = js.Dynamic.literal(getGithubActionsBillingOrg = getGithubActionsBillingOrg.asInstanceOf[js.Any], getGithubActionsBillingUser = getGithubActionsBillingUser.asInstanceOf[js.Any], getGithubPackagesBillingOrg = getGithubPackagesBillingOrg.asInstanceOf[js.Any], getGithubPackagesBillingUser = getGithubPackagesBillingUser.asInstanceOf[js.Any], getSharedStorageBillingOrg = getSharedStorageBillingOrg.asInstanceOf[js.Any], getSharedStorageBillingUser = getSharedStorageBillingUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGithubActionsBillingOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGithubActionsBillingOrg] (val x: Self) extends AnyVal {
    
    inline def setGetGithubActionsBillingOrg(value: `191`): Self = StObject.set(x, "getGithubActionsBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsBillingUser(value: `192`): Self = StObject.set(x, "getGithubActionsBillingUser", value.asInstanceOf[js.Any])
    
    inline def setGetGithubPackagesBillingOrg(value: `193`): Self = StObject.set(x, "getGithubPackagesBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetGithubPackagesBillingUser(value: `194`): Self = StObject.set(x, "getGithubPackagesBillingUser", value.asInstanceOf[js.Any])
    
    inline def setGetSharedStorageBillingOrg(value: `195`): Self = StObject.set(x, "getSharedStorageBillingOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSharedStorageBillingUser(value: `196`): Self = StObject.set(x, "getSharedStorageBillingUser", value.asInstanceOf[js.Any])
  }
}
