package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathGistidQueryPage extends StObject {
  
  var get: ParametersPathGistidQueryPage
  
  var post: RequestBodyContentApplicationjsonBody
}
object GetParametersPathGistidQueryPage {
  
  inline def apply(get: ParametersPathGistidQueryPage, post: RequestBodyContentApplicationjsonBody): GetParametersPathGistidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathGistidQueryPage]
  }
  
  extension [Self <: GetParametersPathGistidQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathGistidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonBody): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
