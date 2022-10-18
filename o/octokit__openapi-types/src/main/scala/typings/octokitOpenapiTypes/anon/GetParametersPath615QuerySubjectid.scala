package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath615QuerySubjectid extends StObject {
  
  /**
    * Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.
    *
    * The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:
    *
    * ```shell
    *  curl -u username:token
    *   https://api.github.com/users/octocat/hovercard?subject_type=repository&subject_id=1300192
    * ```
    */
  var get: ParametersPath615QuerySubjectid
}
object GetParametersPath615QuerySubjectid {
  
  inline def apply(get: ParametersPath615QuerySubjectid): GetParametersPath615QuerySubjectid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath615QuerySubjectid]
  }
  
  extension [Self <: GetParametersPath615QuerySubjectid](x: Self) {
    
    inline def setGet(value: ParametersPath615QuerySubjectid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
