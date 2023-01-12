package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuerySortState extends StObject {
  
  var get: ParametersQuerySortState
  
  var post: RequestBodyContentApplicationjsonDueon
}
object GetParametersQuerySortState {
  
  inline def apply(get: ParametersQuerySortState, post: RequestBodyContentApplicationjsonDueon): GetParametersQuerySortState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuerySortState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQuerySortState] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQuerySortState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonDueon): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
