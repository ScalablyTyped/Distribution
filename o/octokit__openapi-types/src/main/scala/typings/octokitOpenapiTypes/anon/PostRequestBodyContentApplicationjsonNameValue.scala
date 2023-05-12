package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonNameValue extends StObject {
  
  /**
    * List repository variables
    * @description Lists all repository variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  var get: ParametersPathOwnerQuery68
  
  /**
    * Create a repository variable
    * @description Creates a repository variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonNameValue
}
object PostRequestBodyContentApplicationjsonNameValue {
  
  inline def apply(get: ParametersPathOwnerQuery68, post: RequestBodyContentApplicationjsonNameValue): PostRequestBodyContentApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerQuery68): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonNameValue): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
