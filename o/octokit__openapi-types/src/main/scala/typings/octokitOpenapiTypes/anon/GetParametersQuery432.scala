package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery432 extends StObject {
  
  /**
    * This returns a list of autolinks configured for the given repository.
    *
    * Information about autolinks are only available to repository administrators.
    */
  var get: ParametersQuery432
  
  /** Users with admin access to the repository can create an autolink. */
  var post: Responses201Content434
}
object GetParametersQuery432 {
  
  inline def apply(get: ParametersQuery432, post: Responses201Content434): GetParametersQuery432 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery432]
  }
  
  extension [Self <: GetParametersQuery432](x: Self) {
    
    inline def setGet(value: ParametersQuery432): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content434): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
