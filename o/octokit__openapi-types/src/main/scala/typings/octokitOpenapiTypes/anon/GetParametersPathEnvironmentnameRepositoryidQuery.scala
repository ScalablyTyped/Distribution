package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnvironmentnameRepositoryidQuery extends StObject {
  
  /**
    * List environment variables
    * @description Lists all environment variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.
    */
  var get: ParametersPathEnvironmentnameRepositoryidQuery
  
  /**
    * Create an environment variable
    * @description Create an environment variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  var post: Parameters437RequestBodyContentApplicationjsonNameValue
}
object GetParametersPathEnvironmentnameRepositoryidQuery {
  
  inline def apply(
    get: ParametersPathEnvironmentnameRepositoryidQuery,
    post: Parameters437RequestBodyContentApplicationjsonNameValue
  ): GetParametersPathEnvironmentnameRepositoryidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnvironmentnameRepositoryidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathEnvironmentnameRepositoryidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathEnvironmentnameRepositoryidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Parameters437RequestBodyContentApplicationjsonNameValue): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
