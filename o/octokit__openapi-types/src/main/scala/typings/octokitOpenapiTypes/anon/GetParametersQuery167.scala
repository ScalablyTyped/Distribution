package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery167 extends StObject {
  
  /**
    * This returns a list of autolinks configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersQuery167
  
  /** Users with admin access to the repository can create an autolink. */
  var post: RequestBodyContentApplicationjsonIsalphanumeric
}
object GetParametersQuery167 {
  
  inline def apply(get: ParametersQuery167, post: RequestBodyContentApplicationjsonIsalphanumeric): GetParametersQuery167 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery167]
  }
  
  extension [Self <: GetParametersQuery167](x: Self) {
    
    inline def setGet(value: ParametersQuery167): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
