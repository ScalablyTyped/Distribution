package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryExcludePagePerpage extends StObject {
  
  /** Lists the most recent migrations. */
  var get: ParametersQueryExcludePagePerpage
  
  /** Initiates the generation of a migration archive. */
  var post: Responses201Content347
}
object GetParametersQueryExcludePagePerpage {
  
  inline def apply(get: ParametersQueryExcludePagePerpage, post: Responses201Content347): GetParametersQueryExcludePagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryExcludePagePerpage]
  }
  
  extension [Self <: GetParametersQueryExcludePagePerpage](x: Self) {
    
    inline def setGet(value: ParametersQueryExcludePagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201Content347): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
