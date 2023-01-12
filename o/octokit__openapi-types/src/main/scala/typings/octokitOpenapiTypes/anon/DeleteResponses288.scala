package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses288 extends StObject {
  
  var delete: Responses288
  
  var get: Responses200Content286
  
  /** Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)." */
  var post: RequestBodyContent287
  
  /** Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages). */
  var put: RequestBodyContentApplicationjsonBuildtype
}
object DeleteResponses288 {
  
  inline def apply(
    delete: Responses288,
    get: Responses200Content286,
    post: RequestBodyContent287,
    put: RequestBodyContentApplicationjsonBuildtype
  ): DeleteResponses288 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses288]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses288] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses288): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content286): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContent287): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonBuildtype): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
