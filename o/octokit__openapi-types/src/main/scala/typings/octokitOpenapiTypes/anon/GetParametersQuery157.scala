package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery157 extends StObject {
  
  /**
    * This returns a list of autolinks configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersQuery157
  
  /** Users with admin access to the repository can create an autolink. */
  var post: RequestBodyContentApplicationjsonIsalphanumeric
}
object GetParametersQuery157 {
  
  inline def apply(get: ParametersQuery157, post: RequestBodyContentApplicationjsonIsalphanumeric): GetParametersQuery157 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery157]
  }
  
  extension [Self <: GetParametersQuery157](x: Self) {
    
    inline def setGet(value: ParametersQuery157): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
