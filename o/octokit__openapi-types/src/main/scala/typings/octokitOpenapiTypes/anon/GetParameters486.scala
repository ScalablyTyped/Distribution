package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters486 extends StObject {
  
  /**
    * Get contextual information for a user
    * @description Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    *
    * ```shell
    *  curl -u username:token
    *   https://api.github.com/users/octocat/hovercard?subject_type=repository&subject_id=1300192
    * ```
    */
  var get: Parameters486
}
object GetParameters486 {
  
  inline def apply(get: Parameters486): GetParameters486 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters486]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters486] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters486): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
