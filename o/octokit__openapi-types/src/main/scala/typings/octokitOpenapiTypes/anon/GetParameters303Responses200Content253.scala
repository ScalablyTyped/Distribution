package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters303Responses200Content253 extends StObject {
  
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization,
    * as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: Parameters303Responses200Content253
  
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization, and sets if GitHub Actions
    * can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: Parameters303RequestBodyContent254
}
object GetParameters303Responses200Content253 {
  
  inline def apply(get: Parameters303Responses200Content253, put: Parameters303RequestBodyContent254): GetParameters303Responses200Content253 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters303Responses200Content253]
  }
  
  extension [Self <: GetParameters303Responses200Content253](x: Self) {
    
    inline def setGet(value: Parameters303Responses200Content253): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters303RequestBodyContent254): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
