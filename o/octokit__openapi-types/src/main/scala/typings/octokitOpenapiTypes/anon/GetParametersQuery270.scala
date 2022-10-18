package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery270 extends StObject {
  
  /** Lists the authenticated user's gists or if called anonymously, this endpoint returns all public gists: */
  var get: ParametersQuery270
  
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  var post: Responses201304403404
}
object GetParametersQuery270 {
  
  inline def apply(get: ParametersQuery270, post: Responses201304403404): GetParametersQuery270 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery270]
  }
  
  extension [Self <: GetParametersQuery270](x: Self) {
    
    inline def setGet(value: ParametersQuery270): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses201304403404): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
