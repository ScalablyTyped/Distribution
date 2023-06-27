package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath78Query extends StObject {
  
  /**
    * List selected repositories for an organization variable
    * @description Lists all repositories that can access an organization variable that is available to selected repositories. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  var get: ParametersPath78Query
  
  /**
    * Set selected repositories for an organization variable
    * @description Replaces all repositories for an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var put: ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids
}
object GetParametersPath78Query {
  
  inline def apply(
    get: ParametersPath78Query,
    put: ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids
  ): GetParametersPath78Query = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath78Query]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath78Query] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath78Query): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath78RequestBodyContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
