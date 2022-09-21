package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses90 extends StObject {
  
  var delete: Responses90
  
  var get: Responses200Content292
  
  /** Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)." */
  var post: RequestBodyContent293
  
  /** Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages). */
  var put: RequestBodyContentApplicationjsonBuildtype
}
object DeleteResponses90 {
  
  inline def apply(
    delete: Responses90,
    get: Responses200Content292,
    post: RequestBodyContent293,
    put: RequestBodyContentApplicationjsonBuildtype
  ): DeleteResponses90 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses90]
  }
  
  extension [Self <: DeleteResponses90](x: Self) {
    
    inline def setDelete(value: Responses90): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content292): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent293): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonBuildtype): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
