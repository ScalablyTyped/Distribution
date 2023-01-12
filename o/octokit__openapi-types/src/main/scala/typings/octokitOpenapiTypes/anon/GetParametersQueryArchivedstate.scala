package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryArchivedstate extends StObject {
  
  var get: ParametersQueryArchivedstate
  
  var post: RequestBodyContent129
}
object GetParametersQueryArchivedstate {
  
  inline def apply(get: ParametersQueryArchivedstate, post: RequestBodyContent129): GetParametersQueryArchivedstate = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryArchivedstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryArchivedstate] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryArchivedstate): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent129): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
