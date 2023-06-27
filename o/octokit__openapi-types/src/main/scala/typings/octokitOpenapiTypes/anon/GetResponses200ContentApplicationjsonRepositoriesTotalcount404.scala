package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonRepositoriesTotalcount404 extends StObject {
  
  /**
    * List selected repositories for an organization secret
    * @description Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonRepositoriesTotalcount404
  
  /**
    * Set selected repositories for an organization secret
    * @description Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9
}
object GetResponses200ContentApplicationjsonRepositoriesTotalcount404 {
  
  inline def apply(
    get: Responses200ContentApplicationjsonRepositoriesTotalcount404,
    put: RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9
  ): GetResponses200ContentApplicationjsonRepositoriesTotalcount404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonRepositoriesTotalcount404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonRepositoriesTotalcount404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonRepositoriesTotalcount404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonSelectedrepositoryidsResponses9): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
