package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostRequestBodyContentApplicationjsonLabels extends StObject {
  
  /**
    * Create configuration for a just-in-time runner for an organization
    * @description Generates a configuration that can be passed to the runner application at startup.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var post: RequestBodyContentApplicationjsonLabels
}
object PostRequestBodyContentApplicationjsonLabels {
  
  inline def apply(post: RequestBodyContentApplicationjsonLabels): PostRequestBodyContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostRequestBodyContentApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostRequestBodyContentApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setPost(value: RequestBodyContentApplicationjsonLabels): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
