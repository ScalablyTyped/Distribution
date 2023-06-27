package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathGistidQuery extends StObject {
  
  /** List gist comments */
  var get: ParametersPathGistidQuery
  
  /** Create a gist comment */
  var post: RequestBodyContentApplicationjsonBody
}
object GetParametersPathGistidQuery {
  
  inline def apply(get: ParametersPathGistidQuery, post: RequestBodyContentApplicationjsonBody): GetParametersPathGistidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathGistidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathGistidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathGistidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonBody): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
