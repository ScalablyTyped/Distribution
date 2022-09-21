package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgResponses200Content18 extends StObject {
  
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization,
    * as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: ParametersPathOrgResponses200Content18
  
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization, and sets if GitHub Actions
    * can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: Responses409Unknown
}
object GetParametersPathOrgResponses200Content18 {
  
  inline def apply(get: ParametersPathOrgResponses200Content18, put: Responses409Unknown): GetParametersPathOrgResponses200Content18 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgResponses200Content18]
  }
  
  extension [Self <: GetParametersPathOrgResponses200Content18](x: Self) {
    
    inline def setGet(value: ParametersPathOrgResponses200Content18): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses409Unknown): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
