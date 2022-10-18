package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPerpageSortState extends StObject {
  
  var get: ParametersQueryPerpageSortState
  
  var post: Responses201Content546
}
object GetParametersQueryPerpageSortState {
  
  inline def apply(get: ParametersQueryPerpageSortState, post: Responses201Content546): GetParametersQueryPerpageSortState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPerpageSortState]
  }
  
  extension [Self <: GetParametersQueryPerpageSortState](x: Self) {
    
    inline def setGet(value: ParametersQueryPerpageSortState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content546): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
