package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnvironmentnameRepositoryidQuery68 extends StObject {
  
  /**
    * List environment variables
    * @description Lists all environment variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.
    */
  var get: ParametersPathEnvironmentnameRepositoryidQuery68
  
  /**
    * Create an environment variable
    * @description Create an environment variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  var post: Parameters365RequestBodyContentApplicationjsonNameValue
}
object GetParametersPathEnvironmentnameRepositoryidQuery68 {
  
  inline def apply(
    get: ParametersPathEnvironmentnameRepositoryidQuery68,
    post: Parameters365RequestBodyContentApplicationjsonNameValue
  ): GetParametersPathEnvironmentnameRepositoryidQuery68 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnvironmentnameRepositoryidQuery68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathEnvironmentnameRepositoryidQuery68] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathEnvironmentnameRepositoryidQuery68): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Parameters365RequestBodyContentApplicationjsonNameValue): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
