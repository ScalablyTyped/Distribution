package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryContentPagePerpage extends StObject {
  
  /**
    * List reactions for a release
    * @description List the reactions to a [release](https://docs.github.com/rest/reference/repos#releases).
    */
  var get: ParametersQueryContentPagePerpage
  
  /**
    * Create reaction for a release
    * @description Create a reaction to a [release](https://docs.github.com/rest/reference/repos#releases). A response with a `Status: 200 OK` means that you already added the reaction type to this release.
    */
  var post: RequestBodyContentApplicationjson335
}
object GetParametersQueryContentPagePerpage {
  
  inline def apply(get: ParametersQueryContentPagePerpage, post: RequestBodyContentApplicationjson335): GetParametersQueryContentPagePerpage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryContentPagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryContentPagePerpage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryContentPagePerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjson335): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
