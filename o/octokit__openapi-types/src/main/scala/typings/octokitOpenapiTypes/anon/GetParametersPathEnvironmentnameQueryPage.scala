package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEnvironmentnameQueryPage extends StObject {
  
  /**
    * Lists the deployment branch policies for an environment.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathEnvironmentnameQueryPage
  
  /**
    * Creates a deployment branch policy for an environment.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration:write` permission for the repository to use this endpoint.
    */
  var post: RequestBodyContent234
}
object GetParametersPathEnvironmentnameQueryPage {
  
  inline def apply(get: ParametersPathEnvironmentnameQueryPage, post: RequestBodyContent234): GetParametersPathEnvironmentnameQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEnvironmentnameQueryPage]
  }
  
  extension [Self <: GetParametersPathEnvironmentnameQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathEnvironmentnameQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent234): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
