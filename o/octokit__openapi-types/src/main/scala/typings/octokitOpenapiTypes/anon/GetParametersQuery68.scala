package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery68 extends StObject {
  
  /**
    * List organization variables
    * @description Lists all organization variables. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  var get: ParametersQuery68
  
  /**
    * Create an organization variable
    * @description Creates an organization variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonValue
}
object GetParametersQuery68 {
  
  inline def apply(get: ParametersQuery68, post: RequestBodyContentApplicationjsonValue): GetParametersQuery68 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery68] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery68): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonValue): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
