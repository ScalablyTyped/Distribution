package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPost extends StObject {
  
  /**
    * List gists for the authenticated user
    * @description Lists the authenticated user's gists or if called anonymously, this endpoint returns all public gists:
    */
  var get: ParametersQueryPerpage
  
  /**
    * Create a gist
    * @description Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  var post: RequestBodyContentApplicationjsonDescription
}
object GetPost {
  
  inline def apply(get: ParametersQueryPerpage, post: RequestBodyContentApplicationjsonDescription): GetPost = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPost]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPost] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPerpage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RequestBodyContentApplicationjsonDescription): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
