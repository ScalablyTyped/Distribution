package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryExclude extends StObject {
  
  /** Lists the most recent migrations. */
  var get: ParametersQueryExclude
  
  /** Initiates the generation of a migration archive. */
  var post: RequestBodyContentApplicationjsonExcludeattachments
}
object GetParametersQueryExclude {
  
  inline def apply(get: ParametersQueryExclude, post: RequestBodyContentApplicationjsonExcludeattachments): GetParametersQueryExclude = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryExclude]
  }
  
  extension [Self <: GetParametersQueryExclude](x: Self) {
    
    inline def setGet(value: ParametersQueryExclude): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonExcludeattachments): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
