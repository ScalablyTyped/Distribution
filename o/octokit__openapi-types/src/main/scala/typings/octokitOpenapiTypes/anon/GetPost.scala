package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPost extends StObject {
  
  /**
    * Lists all self-hosted runner groups for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var get: ParametersQueryPerpage
  
  /**
    * Creates a new self-hosted runner group for an enterprise.
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonAllowspublicrepositories
}
object GetPost {
  
  inline def apply(get: ParametersQueryPerpage, post: RequestBodyContentApplicationjsonAllowspublicrepositories): GetPost = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPost]
  }
  
  extension [Self <: GetPost](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonAllowspublicrepositories): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
