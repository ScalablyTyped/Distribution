package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnvironmentnameQuery extends StObject {
  
  /**
    * List deployment branch policies
    * @description Lists the deployment branch policies for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathEnvironmentnameQuery
  
  /**
    * Create a deployment branch policy
    * @description Creates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  var post: RequestBodyContent283
}
object GetParametersPathEnvironmentnameQuery {
  
  inline def apply(get: ParametersPathEnvironmentnameQuery, post: RequestBodyContent283): GetParametersPathEnvironmentnameQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnvironmentnameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathEnvironmentnameQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathEnvironmentnameQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent283): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
