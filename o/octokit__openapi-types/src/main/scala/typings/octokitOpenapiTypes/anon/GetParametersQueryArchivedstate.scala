package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryArchivedstate extends StObject {
  
  var get: ParametersQueryArchivedstate
  
  var post: RequestBodyContent138
}
object GetParametersQueryArchivedstate {
  
  inline def apply(get: ParametersQueryArchivedstate, post: RequestBodyContent138): GetParametersQueryArchivedstate = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryArchivedstate]
  }
  
  extension [Self <: GetParametersQueryArchivedstate](x: Self) {
    
    inline def setGet(value: ParametersQueryArchivedstate): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent138): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
