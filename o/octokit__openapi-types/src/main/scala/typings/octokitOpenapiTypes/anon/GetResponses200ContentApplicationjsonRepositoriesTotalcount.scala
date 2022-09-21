package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRepositoriesTotalcount extends StObject {
  
  /**
    * Lists the selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var get: Responses200ContentApplicationjsonRepositoriesTotalcount
  
  /**
    * Replaces the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  var put: RequestBodyContentApplicationjsonSelectedrepositoryids
}
object GetResponses200ContentApplicationjsonRepositoriesTotalcount {
  
  inline def apply(
    get: Responses200ContentApplicationjsonRepositoriesTotalcount,
    put: RequestBodyContentApplicationjsonSelectedrepositoryids
  ): GetResponses200ContentApplicationjsonRepositoriesTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRepositoriesTotalcount]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonRepositoriesTotalcount](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonRepositoriesTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
