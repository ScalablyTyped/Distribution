package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content66 extends StObject {
  
  /**
    * Get default workflow permissions for an organization
    * @description Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization,
    * as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: Responses200Content66
  
  /**
    * Set default workflow permissions for an organization
    * @description Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization, and sets if GitHub Actions
    * can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: Parameters55RequestBodyResponses
}
object GetResponses200Content66 {
  
  inline def apply(get: Responses200Content66, put: Parameters55RequestBodyResponses): GetResponses200Content66 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content66]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content66] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content66): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters55RequestBodyResponses): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
