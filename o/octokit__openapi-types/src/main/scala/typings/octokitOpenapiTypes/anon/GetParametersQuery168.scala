package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery168 extends StObject {
  
  /**
    * List all autolinks of a repository
    * @description This returns a list of autolinks configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersQuery168
  
  /**
    * Create an autolink reference for a repository
    * @description Users with admin access to the repository can create an autolink.
    */
  var post: RequestBodyContentApplicationjsonIsalphanumeric
}
object GetParametersQuery168 {
  
  inline def apply(get: ParametersQuery168, post: RequestBodyContentApplicationjsonIsalphanumeric): GetParametersQuery168 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery168]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuery168] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuery168): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
