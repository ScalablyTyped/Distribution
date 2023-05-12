package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath69QueryPagePerpage extends StObject {
  
  /**
    * List selected repositories for an organization variable
    * @description Lists all repositories that can access an organization variable that is available to selected repositories. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  var get: ParametersPath69QueryPagePerpage
  
  /**
    * Set selected repositories for an organization variable
    * @description Replaces all repositories for an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var put: ParametersPath69RequestBodyContentApplicationjsonSelectedrepositoryids
}
object GetParametersPath69QueryPagePerpage {
  
  inline def apply(
    get: ParametersPath69QueryPagePerpage,
    put: ParametersPath69RequestBodyContentApplicationjsonSelectedrepositoryids
  ): GetParametersPath69QueryPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath69QueryPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath69QueryPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath69QueryPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath69RequestBodyContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
