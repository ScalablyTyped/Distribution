package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses552 extends StObject {
  
  var delete: Responses552
  
  var get: Responses200Content551
  
  /** Configures a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages)." */
  var post: Responses201409422
  
  /** Updates information for a GitHub Pages site. For more information, see "[About GitHub Pages](/github/working-with-github-pages/about-github-pages). */
  var put: Responses400409422
}
object DeleteResponses552 {
  
  inline def apply(
    delete: Responses552,
    get: Responses200Content551,
    post: Responses201409422,
    put: Responses400409422
  ): DeleteResponses552 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses552]
  }
  
  extension [Self <: DeleteResponses552](x: Self) {
    
    inline def setDelete(value: Responses552): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content551): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201409422): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses400409422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
